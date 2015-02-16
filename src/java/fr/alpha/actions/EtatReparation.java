/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.dao.InfosReparationDAO;
import fr.alpha.dao.ProduitDAO;
import fr.alpha.interceptors.UserAware;
import fr.alpha.model.InfosReparation;
import fr.alpha.model.Produit;
import fr.alpha.model.Utilisateur;
import fr.alpha.util.HibernateUtil;
import static java.util.Collections.list;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class EtatReparation extends ActionSupport implements UserAware {

    private List<Produit> produits;
    private Utilisateur utilisateur;
    private ProduitDAO produitDAO;

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }



  

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ProduitDAO getProduitDAO() {
        return produitDAO;
    }

    public void setProduitDAO(ProduitDAO produitDAO) {
        this.produitDAO = produitDAO;
    }


    @Override
    public String execute() {
        produitDAO = new ProduitDAO();
        SessionFactory factory = HibernateUtil.createSessionFactory();
        produitDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        produits = produitDAO.findByidUser(utilisateur.getIdutilisateur());
        return SUCCESS;
    }

    @Override
    public void setUser(Utilisateur user) {
        utilisateur = user;
    }

}
