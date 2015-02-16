/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.model;

/**
 *
 * @author INTI
 */
public class DemandeReparation {
    private Modele modele;
    private Forfait forfait;

    public DemandeReparation(Modele produit, Forfait forfait) {
        this.modele = produit;
        this.forfait = forfait;
    }

    
    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele produit) {
        this.modele = produit;
    }

    public Forfait getForfait() {
        return forfait;
    }

    public void setForfait(Forfait forfait) {
        this.forfait = forfait;
    }    
}
