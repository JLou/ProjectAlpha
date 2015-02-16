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
    private String desc;
    private int adresseDeRetour;

    public DemandeReparation(Modele modele, Forfait forfait, String desc, int adresseDeRetour) {
        this.modele = modele;
        this.forfait = forfait;
        this.desc = desc;
        this.adresseDeRetour = adresseDeRetour;
        System.out.println("-------------------------------------------------");
        System.out.println(desc);
        System.out.println(adresseDeRetour);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAdresseDeRetour() {
        return adresseDeRetour;
    }

    public void setAdresseDeRetour(int adresseDeRetour) {
        this.adresseDeRetour = adresseDeRetour;
    }

    public DemandeReparation(Modele modele, Forfait forfait) {
        this.modele = modele;
        this.forfait = forfait;
    }

    
    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public Forfait getForfait() {
        return forfait;
    }

    public void setForfait(Forfait forfait) {
        this.forfait = forfait;
    }    
}
