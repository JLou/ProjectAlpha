/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.model.Utilisateur;
import fr.alpha.bdd.UtilisateurGestion;
import fr.alpha.dao.UtilisateurDAO;
import fr.alpha.util.HibernateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UtilisateurAction extends ActionSupport {

    private Utilisateur utilisateur;
    private UtilisateurDAO userDAO;
    private boolean valid;
    private String message = "";

    private Map<Integer, String> towns;
    private List<String> towns2;

    public List<String> getTowns2() {
        return towns2;
    }

    public void setTowns2(List<String> towns2) {
        this.towns2 = towns2;
    }

    public UtilisateurAction() {
        this.userDAO = new UtilisateurDAO();
        towns = new HashMap<>();

        towns.put(1, "Paris");
        towns.put(2, "LENSOIS");
        towns.put(3, "Caen");

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String isValidUser() {

        SessionFactory factory = HibernateUtil.createSessionFactory();
        userDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        //models = modelDAO.findByCategory(yourCategory);
        Utilisateur utilisateurBase = userDAO.findByEmail(utilisateur.getMail());

        if (utilisateurBase != null) {

            if (!utilisateur.getMail().equals("") && !utilisateur.getMdp().equals("")) {
                if (utilisateurBase.getMdp().equals(utilisateur.getMdp())) {

                    Map sessionMap = ActionContext.getContext().getSession();
                    sessionMap.put("user_login", utilisateur.getMail());
                    sessionMap.put("user_mdp", utilisateur.getMdp());
                    sessionMap.put("isLogged", "true");

                    return SUCCESS;

                } else {
                    setMessage("champs invalides");
                    return ERROR;
                }

            } else {
                setMessage("champs vides");
                return INPUT;

            }

        }
        setMessage("email incorrect");
        return ERROR;

    }

    public Map<Integer, String> getTowns() {
        return towns;
    }

    public void setTowns(Map<Integer, String> towns) {
        this.towns = towns;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    Utilisateur user;
    UtilisateurDAO uDao = new UtilisateurDAO();

    public String enregistrerEnBase() {

        if (user != null && !user.getNom().equals("")
                && !user.getMail().equals("") && !user.getPrenom().equals("") && !user.getMdp().equals("")) {
            SessionFactory factory = HibernateUtil.createSessionFactory();
            uDao.setSessionFactory(factory);
            Transaction tx = factory.getCurrentSession().beginTransaction();

            uDao.save(user);
            tx.commit();
            return SUCCESS;
        }
        return INPUT;

    }


private boolean isValidEmail(String emailAddress)
{
    
Pattern pattern=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(user.getMail());
return matcher.matches();
     
}
    public void validate() {
        if (user != null) {
            
            if (user.getNom() == null || user.getNom().trim().equals("")) {
                addFieldError("user.nom", "le nom est necessaire !");                
                
            }
            if (user.getMail()== null || user.getMail().trim().equals("")) {
                addFieldError("user.mail", "le mail est necessaire !");
                
            }        
            else if (!isValidEmail(user.getMail()))  {
               
                addFieldError("user.mail", "le mail est incorrect !");
                
            }
            if (user.getMdp()== null || user.getMdp().trim().equals("")) {
                addFieldError("user.mdp", "le mot de passe est necessaire !");
            }
            if (user.getPrenom()== null || user.getPrenom().trim().equals("")) {
                addFieldError("user.prenom", "le prenom est necessaire !");
            }
            
        }
    }

    public UtilisateurDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UtilisateurDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UtilisateurDAO getuDao() {
        return uDao;
    }

    public void setuDao(UtilisateurDAO uDao) {
        this.uDao = uDao;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

}
