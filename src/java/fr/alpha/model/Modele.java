package fr.alpha.model;
// Generated 11 f�vr. 2015 15:14:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Modele generated by hbm2java
 */
public class Modele  implements java.io.Serializable {


     private Integer idmodele;
     private Categorie categorie;
     private Marque marque;
     private String nom;
     private int idcategorie;
     private boolean transportable;
     private Integer idmarque;
     private Set<Produit> produits = new HashSet<Produit>(0);

    public Modele() {
    }

	
    public Modele(Categorie categorie, Marque marque, String nom, int idcategorie, boolean transportable) {
        this.categorie = categorie;
        this.marque = marque;
        this.nom = nom;
        this.idcategorie = idcategorie;
        this.transportable = transportable;
    }
    public Modele(Categorie categorie, Marque marque, String nom, int idcategorie, boolean transportable, Integer idmarque, Set<Produit> produits) {
       this.categorie = categorie;
       this.marque = marque;
       this.nom = nom;
       this.idcategorie = idcategorie;
       this.transportable = transportable;
       this.idmarque = idmarque;
       this.produits = produits;
    }
   
    public Integer getIdmodele() {
        return this.idmodele;
    }
    
    public void setIdmodele(Integer idmodele) {
        this.idmodele = idmodele;
    }
    public Categorie getCategorie() {
        return this.categorie;
    }
    
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public Marque getMarque() {
        return this.marque;
    }
    
    public void setMarque(Marque marque) {
        this.marque = marque;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getIdcategorie() {
        return this.idcategorie;
    }
    
    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }
    public boolean isTransportable() {
        return this.transportable;
    }
    
    public void setTransportable(boolean transportable) {
        this.transportable = transportable;
    }
    public Integer getIdmarque() {
        return this.idmarque;
    }
    
    public void setIdmarque(Integer idmarque) {
        this.idmarque = idmarque;
    }
    public Set<Produit> getProduits() {
        return this.produits;
    }
    
    public void setProduits(Set<Produit> produits) {
        this.produits = produits;
    }




}


