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
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UtilisateurAction extends ActionSupport {

    private Utilisateur utilisateur;
    private UtilisateurDAO userDAO;
    private boolean valid;
    private String message = "";

    public UtilisateurAction() {
        this.userDAO = new UtilisateurDAO();
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
                    
                }else{
                    setMessage("champs invalides");
                    return ERROR;
                }
                
                
            } else {
                setMessage("champs vides");
                return INPUT;

            }

        }
        
        return ERROR;

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
    
}
