/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.dao.jpa.GeneralDAOImpl;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.Search;
import fr.alpha.model.Utilisateur;
import fr.alpha.model.Modele;
import fr.alpha.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author INTI
 */
public class UtilisateurDAO extends GenericDAOImpl<Utilisateur, Long>{

    public Utilisateur findByEmail(String mail) {
        Search s = new Search(Utilisateur.class);
        s.addFilterEqual("mail", mail);
        return searchUnique(s);
    }

    
}
