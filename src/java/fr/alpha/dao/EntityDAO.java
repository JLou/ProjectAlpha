/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import fr.alpha.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author INTI
 * @param <T>
 */
public class EntityDAO<T> extends HibernateUtil {

    private Class<T> type;

    public EntityDAO(Class<T> type) {
        this.type = type;
    }
    
    
    //For adding items in the Items table.
    public T add(T t) {
        Session session = HibernateUtil.createSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        return t;
    }

    public T delete(int id) {
        Session session = HibernateUtil.createSessionFactory().getCurrentSession();
        session.beginTransaction();
        T t = (T) session.load(type, id);
        if (null != t) {
            session.delete(t);
        }
        session.getTransaction().commit();
        return t;
    }

    public List<T> list() {

        Session session = HibernateUtil.createSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<T> items = null;
        try {
            items = (List<T>) session.createQuery("from " + type.getSimpleName()).list();

        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return items;
    }

    
    
}
