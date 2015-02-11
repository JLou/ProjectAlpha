/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.bo;

/**
 *
 * @author INTI
 */
public class Utilisateur {
    private String identifiant;
    private String mdp;

    public Utilisateur() {
    }

    public Utilisateur(String identifiant, String mdp) {
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
}
