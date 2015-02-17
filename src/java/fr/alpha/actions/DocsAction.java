/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.dao.ProduitDAO;
import fr.alpha.model.Produit;
import fr.alpha.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author INTI
 */
public class DocsAction extends ActionSupport {

    private int type;
    private int id;
    private Produit produit;

    private static final int BON_ENVOI = 1;
    private static final int BON_RETOUR = 2;
    private static final int FICHE_REPARATION = 3;

    @Override
    public String execute() throws Exception {
        ProduitDAO pDAO = new ProduitDAO();
        SessionFactory factory = HibernateUtil.createSessionFactory();
        pDAO.setSessionFactory(factory);
        Transaction tx = factory.getCurrentSession().beginTransaction();
        
        pDAO.setSessionFactory(factory);

        produit = pDAO.find(id);

        switch (type) {
            case BON_ENVOI:
                return "bonenvoi";
            case BON_RETOUR:
                return "bonretour";
            case FICHE_REPARATION:
                return "fiche";
            default:
                return ERROR;
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
