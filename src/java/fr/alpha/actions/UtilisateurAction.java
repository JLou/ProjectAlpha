/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.bo.Utilisateur;
import fr.alpha.bdd.UtilisateurGestion;
import java.util.Map;

public class UtilisateurAction extends ActionSupport {

    private Utilisateur utilisateur;
    private boolean valid;
    private String message = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String isValidUser() {

        if (utilisateur != null) {

            if (!utilisateur.getIdentifiant().equals("") && !utilisateur.getMdp().equals("")) {
                if (new UtilisateurGestion().isValid(utilisateur.getIdentifiant(), utilisateur.getMdp())) {
                 
                    Map sessionMap = ActionContext.getContext().getSession();
                    sessionMap.put("user_login", utilisateur.getIdentifiant());
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
