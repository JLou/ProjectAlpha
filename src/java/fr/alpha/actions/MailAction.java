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
import fr.alpha.mails.EnvoiMail;
import fr.alpha.model.DemandeReparation;
import fr.alpha.model.InfosReparation;
import fr.alpha.model.Produit;
import fr.alpha.model.Utilisateur;
import fr.alpha.util.HibernateUtil;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class MailAction extends ActionSupport implements SessionAware, UserAware {

    private Map<String, Object> session;
    private Utilisateur user;

    @Override
    public String execute() throws Exception {

        Produit p = new Produit();
        DemandeReparation dr = (DemandeReparation) session.get("demande");
        if(dr == null)
            return ERROR;
        p.setModele(dr.getModele());
        p.setUtilisateur(user);
        
        InfosReparation ir = new InfosReparation();
        ir.setAdresse(dr.getAdresseRetour());
        ir.setDescritpion(dr.getDesc());
        ir.setProduit(p);
        ir.setEtat("En transit");

        ProduitDAO pDAO = new ProduitDAO();
        SessionFactory factory = HibernateUtil.createSessionFactory();
        Transaction tx = factory.getCurrentSession().beginTransaction();
        pDAO.setSessionFactory(factory);
        
        InfosReparationDAO irDAO = new InfosReparationDAO();
        irDAO.setSessionFactory(factory);
        irDAO.save(ir);
        p.setInfosReparation(ir);
        pDAO.save(p);
        
        tx.commit();

        
        
        sendMail();
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
    
    private void sendMail() {
        EnvoiMail em = new EnvoiMail();
        
        String subject = "Informations Reparations";
        String message = "<html>\n"
                + "    <head>\n"
                + "        <title>TODO supply a title</title>\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        Bonjour Mr/Mme " + user.getNom() + "\n"
                + "        <div><a href=\"http://localhost:8080/ProjectAlpha/\">\nVoici un lien vers notre site</a></div>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        System.out.println("----------------");
        String from = "no-reply@alpha.fr";
        try {
            em.sendMail(user.getMail(), subject, message, from);
            System.out.println("mail envoyé !!!");

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Override
    public void setUser(Utilisateur user) {
        this.user = user;
    }

}
