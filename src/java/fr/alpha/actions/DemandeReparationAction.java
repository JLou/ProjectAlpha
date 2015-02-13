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
import fr.alpha.model.Categorie;
import fr.alpha.model.Forfait;
import fr.alpha.model.Modele;
import fr.alpha.util.HibernateUtil;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class DemandeReparationAction extends ActionSupport {
    
    List<Categorie> categories;
    private List<Modele> models;
    private List<Forfait> forfaits;
    
    private int yourCategory;
    private int yourModel;
    private int yourForfait;
    
    private CategorieDAO categorieDAO;
    private ModelDAO modelDAO;
    private ForfaitDAO forfaitDAO;

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

    public ModelDAO getModelDAO() {
        return modelDAO;
    }

    public void setModelDAO(ModelDAO modelDAO) {
        this.modelDAO = modelDAO;
    }
    
}
