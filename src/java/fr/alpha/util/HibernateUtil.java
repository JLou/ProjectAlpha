/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.util;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author INTI
 */
 
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory createSessionFactory() {
    
        Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
	applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
        return factory;
    }

}
