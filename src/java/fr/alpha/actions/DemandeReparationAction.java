/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.dao.CategorieDAO;
import fr.alpha.dao.ForfaitDAO;
import fr.alpha.dao.ModelDAO;
import fr.alpha.dao.VendeurDAO;
import fr.alpha.interceptors.UserAware;
import fr.alpha.model.Categorie;
import fr.alpha.model.DemandeReparation;
import fr.alpha.model.Forfait;
import fr.alpha.model.Modele;
import fr.alpha.model.Vendeur;
import fr.alpha.model.Utilisateur;
import fr.alpha.util.HibernateUtil;
import fr.alpha.util.Locations;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class DemandeReparationAction extends ActionSupport implements UserAware, SessionAware {

    List<Categorie> categories;
    private List<Modele> models;
    private List<Forfait> forfaits;
    private Forfait forfait;

    private int yourCategory;
    private int yourModel;
    private int yourForfait;

    private CategorieDAO categorieDAO;
    private ModelDAO modelDAO;
    private ForfaitDAO forfaitDAO;

    private Vendeur vendeurs;
    private int yourVendeur;
    private VendeurDAO vendeurDAO;

    //Fiche Rep
    private String description;
    private int ville;

    private Utilisateur utilisateur;
    private Map<String, Object> session;

    
    public List<Categorie> getCategories() {
        return categories;
    }

    public List<Forfait> getForfaits() {
        return forfaits;
    }

    public void setForfaits(List<Forfait> forfaits) {
        this.forfaits = forfaits;
    }

    public int getYourForfait() {
        return yourForfait;
    }

    public void setYourForfait(int yourForfait) {
        this.yourForfait = yourForfait;
    }

    public ForfaitDAO getForfaitDAO() {
        return forfaitDAO;
    }

    public void setForfaitDAO(ForfaitDAO forfaitDAO) {
        this.forfaitDAO = forfaitDAO;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public int getYourCategory() {
        return yourCategory;
    }

    public void setYourCategory(int yourCategory) {
        this.yourCategory = yourCategory;
    }

    public DemandeReparationAction() {
        categorieDAO = new CategorieDAO();
        modelDAO = new ModelDAO();
        forfaitDAO = new ForfaitDAO();

        vendeurDAO = new VendeurDAO();
    }

    public String listCategories() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        categorieDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        categories = categorieDAO.findAll();
        //tx.commit();
        return INPUT;
    }

    public String listModels() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        modelDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        models = modelDAO.findByCategory(yourCategory);
        tx.commit();

        return INPUT;
    }

    public String listForfaits() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        forfaitDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        forfaits = forfaitDAO.findByCategory(yourCategory);
        tx.commit();

        System.out.println(forfaits);

        return INPUT;
    }

    public String listVendeurs() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        vendeurDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        vendeurs = vendeurDAO.findByCode(863752);
        tx.commit();
        return INPUT;
    }

    public String recapitulatif() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        forfaitDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        forfait = forfaitDAO.find(yourForfait);
        modelDAO.setSessionFactory(factory);
        Modele modele = modelDAO.find(yourModel);
        
        session.put("demande", new DemandeReparation(modele, forfait, description, ville));

        return SUCCESS;
    }

    public String ficheReparation() {

        return INPUT;
    }
    
    public String paiement(){
        return SUCCESS;
    }

    public Forfait getForfait() {
        return forfait;
    }

    public void setForfait(Forfait forfait) {
        this.forfait = forfait;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Modele> getModels() {
        return models;

    }

    public void setModels(List<Modele> models) {
        this.models = models;
    }

    public int getYourModel() {
        return yourModel;
    }

    public void setYourModel(int yourModel) {
        this.yourModel = yourModel;
    }

    public CategorieDAO getCategorieDAO() {
        return categorieDAO;
    }

    public void setCategorieDAO(CategorieDAO categorieDAO) {
        this.categorieDAO = categorieDAO;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVille() {
        return ville;
    }

    public void setVille(int ville) {
        this.ville = ville;
    }

    public ModelDAO getModelDAO() {
        return modelDAO;
    }

    public void setModelDAO(ModelDAO modelDAO) {
        this.modelDAO = modelDAO;
    }

    @Override
    public void setUser(Utilisateur user) {
        utilisateur = user;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }

    public Map<Integer, String> getTowns() {
        return Locations.towns;
    }

}
