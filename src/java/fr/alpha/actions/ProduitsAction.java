/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.alpha.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author INTI
 */
public class ProduitsAction extends ActionSupport {

    private List<ProduitsAction> itemList;
    
    public ProduitsAction() {
    }

    @Override
    public String execute() throws Exception {
        
        this.itemList = list();
        if(itemList.size() <= 0)
            return ERROR;
        return ERROR;
    }

    public List<ProduitsAction> list() {

        Session session = HibernateUtil.createSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<ProduitsAction> items = null;
        try {
            items = (List<ProduitsAction>) session.createQuery("from Produit").list();

        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return items;
    }
}
