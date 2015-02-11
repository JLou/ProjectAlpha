/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.bdd;

import fr.alpha.bo.Utilisateur;

/**
 *
 * @author INTI
 */
public class UtilisateurGestion {
    
    public boolean isValid(String pIdentifiant, String pMdp){
        DataUtilisateur data = new DataUtilisateur();
        for (Utilisateur utilisateur : data) {
            if (utilisateur.getIdentifiant().equals(pIdentifiant) && utilisateur.getMdp().equals(pMdp)) {
                return true;
            }
        }
        return false;
    }

   
    
}
