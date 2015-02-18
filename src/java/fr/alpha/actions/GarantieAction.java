/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.dao.GarantieDAO;
import fr.alpha.dao.ModelDAO;
import fr.alpha.dao.UtilisateurHasGarantieDAO;
import fr.alpha.interceptors.UserAware;
import fr.alpha.model.Garantie;
import fr.alpha.model.Modele;
import fr.alpha.model.Utilisateur;
import fr.alpha.model.UtilisateurHasGarantie;
import fr.alpha.model.UtilisateurHasGarantieId;
import fr.alpha.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class GarantieAction extends ActionSupport implements UserAware, SessionAware {

    private Garantie garantie;
    private GarantieDAO garantieDAO;

    private UtilisateurHasGarantieDAO utilisateurHasGarantieDAO;
    private UtilisateurHasGarantie utilisateurHasGarantie;

    private String message_garantie = "";
    private Map<String, Object> session;
    List<Garantie> garanties;

    private int yourModelgarantie;
    private ModelDAO modelDAO;
    private List<Modele> models;

    private Utilisateur utilisateur;

    private int yourGarantieId;

    public int getYourGarantieId() {
        return yourGarantieId;
    }

    public void setYourGarantieId(int yourGarantieId) {
        this.yourGarantieId = yourGarantieId;
    }

    public GarantieAction() {
        garantieDAO = new GarantieDAO();
        modelDAO = new ModelDAO();
        utilisateurHasGarantieDAO = new UtilisateurHasGarantieDAO();

    }

    public List<Garantie> getGaranties() {
        return garanties;
    }

    public void setGaranties(List<Garantie> garanties) {
        this.garanties = garanties;
    }

    public int getYourModelgarantie() {
        return yourModelgarantie;
    }

    public void setYourModelgarantie(int yourModelgarantie) {
        this.yourModelgarantie = yourModelgarantie;
    }

    public ModelDAO getModelDAO() {
        return modelDAO;
    }

    public void setModelDAO(ModelDAO modelDAO) {
        this.modelDAO = modelDAO;
    }

    public List<Modele> getModels() {
        return models;
    }

    public void setModels(List<Modele> models) {
        this.models = models;
    }

    public String listGaranties() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        garantieDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        garanties = garantieDAO.findByCode(yourModelgarantie);
        //tx.commit();

        return INPUT;
    }

    public String listModels() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        modelDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        models = modelDAO.findAll();
        tx.commit();

        return INPUT;
    }

    public String recapitulatifGarantie() {
        SessionFactory factory = HibernateUtil.createSessionFactory();
        garantieDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        garantie = garantieDAO.find(yourGarantieId);
        session.put("garantie", garantie);

        return SUCCESS;
    }

    public String addGarantie() {

        garantie = (Garantie) session.get("garantie");

        utilisateurHasGarantie = new UtilisateurHasGarantie();
        utilisateurHasGarantie.setUtilisateur(utilisateur);
        utilisateurHasGarantie.setGarantie(garantie);
        utilisateurHasGarantie.setDateDebut(new Date(2015, 3, 15));

        UtilisateurHasGarantieId utilHasGarantieId = new UtilisateurHasGarantieId(utilisateur.getIdutilisateur(),
                garantie.getIdgarantie());
        utilisateurHasGarantie.setId(utilHasGarantieId);
        
        SessionFactory factory = HibernateUtil.createSessionFactory();
        utilisateurHasGarantieDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();

        utilisateurHasGarantieDAO.save(utilisateurHasGarantie);

        tx.commit();

        return SUCCESS;
    }

    public UtilisateurHasGarantieDAO getUtilisateurHasGarantieDAO() {
        return utilisateurHasGarantieDAO;
    }

    public void setUtilisateurHasGarantieDAO(UtilisateurHasGarantieDAO utilisateurHasGarantieDAO) {
        this.utilisateurHasGarantieDAO = utilisateurHasGarantieDAO;
    }

    public UtilisateurHasGarantie getUtilisateurHasGarantie() {
        return utilisateurHasGarantie;
    }

    public void setUtilisateurHasGarantie(UtilisateurHasGarantie utilisateurHasGarantie) {
        this.utilisateurHasGarantie = utilisateurHasGarantie;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public GarantieDAO getGarantieDAO() {
        return garantieDAO;
    }

    public void setGarantieDAO(GarantieDAO garantieDAO) {
        this.garantieDAO = garantieDAO;
    }

    public String getMessage_garantie() {
        return message_garantie;
    }

    public void setMessage_garantie(String message_garantie) {
        this.message_garantie = message_garantie;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> map) {
        session = map;
    }

    @Override
    public void setUser(Utilisateur user) {
        utilisateur = user;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

}
