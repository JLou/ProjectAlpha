package fr.alpha.model;
// Generated 11 f�vr. 2015 15:14:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marque generated by hbm2java
 */
public class Marque  implements java.io.Serializable {


     private Integer idmarque;
     private String nom;
     private Set<Modele> modeles = new HashSet<Modele>(0);
     private Set<Reparateur> reparateurs = new HashSet<Reparateur>(0);

    public Marque() {
    }

	
    public Marque(String nom) {
        this.nom = nom;
    }
    public Marque(String nom, Set<Modele> modeles, Set<Reparateur> reparateurs) {
       this.nom = nom;
       this.modeles = modeles;
       this.reparateurs = reparateurs;
    }
   
    public Integer getIdmarque() {
        return this.idmarque;
    }
    
    public void setIdmarque(Integer idmarque) {
        this.idmarque = idmarque;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set<Modele> getModeles() {
        return this.modeles;
    }
    
    public void setModeles(Set<Modele> modeles) {
        this.modeles = modeles;
    }
    public Set<Reparateur> getReparateurs() {
        return this.reparateurs;
    }
    
    public void setReparateurs(Set<Reparateur> reparateurs) {
        this.reparateurs = reparateurs;
    }




}


