/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.dao.VendeurDAO;
import fr.alpha.model.Utilisateur;
import fr.alpha.model.Vendeur;
import fr.alpha.util.HibernateUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class VendeurAction extends ActionSupport implements SessionAware {

    private Utilisateur user;
    private VendeurDAO vendeurDAO;
    private boolean valid;
    private Vendeur vendeur;
    private String message_vendeur = "";
    private Map<String, Object> session;
    private Map<Integer, String> towns;

    public VendeurAction() {
        this.vendeurDAO = new VendeurDAO();
        
        towns = new HashMap<>();

        towns.put(1, "Paris");
        towns.put(2, "Lens");
        towns.put(3, "Caen");
        
    }

    public String isValidVendeur() {
        
        try {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        vendeurDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();

        Vendeur vendeurBase = vendeurDAO.findByCode(vendeur.getCodeVendeur());

        if (vendeurBase != null) {

            if (vendeurBase.getMdpVendeur().equals(vendeur.getMdpVendeur())) {

                Map sessionMap = ActionContext.getContext().getSession();
                sessionMap.put("Vendeur", vendeurBase);
                sessionMap.put("isLogged", "true");

                return SUCCESS;

            } else {
                setMessage_vendeur("champs invalides");
                return ERROR;
            }

        }
        setMessage_vendeur("Code vendeur incorrect");
        return INPUT;
        } catch(Exception e) {
            e.printStackTrace();
            return ERROR;
        }

    }

    public String addUser() {
        if (user != null && !user.getNom().equals("")
                && !user.getMail().equals("") && !user.getPrenom().equals("") && !user.getMdp().equals("")) {

            session.put("USER", user);

            return SUCCESS;
        }
        return INPUT;
    }

    public void isValidUser() {
        if (user != null) {

            if (user.getNom() == null || user.getNom().trim().equals("")) {
                addFieldError("user.nom", "le nom est necessaire !");

            }
            if (user.getMail() == null || user.getMail().trim().equals("")) {
                addFieldError("user.mail", "le mail est necessaire !");

            } else if (!isValidEmail(user.getMail())) {

                addFieldError("user.mail", "le mail est incorrect !");

            }
            if (user.getMdp() == null || user.getMdp().trim().equals("")) {
                addFieldError("user.mdp", "le mot de passe est necessaire !");
            }
            if (user.getPrenom() == null || user.getPrenom().trim().equals("")) {
                addFieldError("user.prenom", "le prenom est necessaire !");
            }

        }
    }

    private boolean isValidEmail(String emailAddress) {

        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getMail());
        return matcher.matches();

    }
    
    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public Map<Integer, String> getTowns() {
        return towns;
    }

    public void setTowns(Map<Integer, String> towns) {
        this.towns = towns;
    }
    
    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    public String getMessage_vendeur() {
        return message_vendeur;
    }

    public void setMessage_vendeur(String message_vendeur) {
        this.message_vendeur = message_vendeur;
    }

    public VendeurDAO getVendeurDAO() {
        return vendeurDAO;
    }

    public void setVendeurDAO(VendeurDAO vendeurDAO) {
        this.vendeurDAO = vendeurDAO;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }

}
