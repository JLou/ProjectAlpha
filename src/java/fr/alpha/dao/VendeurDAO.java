/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import fr.alpha.model.Vendeur;

/**
 *
 * @author INTI
 */
public class VendeurDAO extends GenericDAOImpl<Vendeur, Long>{
    
    public Vendeur findByCode(int codeVendeur) {
        Search s = new Search(Vendeur.class);
        s.addFilterEqual("codeVendeur", codeVendeur);
        return searchUnique(s);
    }
    
}
