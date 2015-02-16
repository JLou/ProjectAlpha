/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.Search;
import fr.alpha.model.InfosReparation;
import fr.alpha.model.Produit;
import java.util.List;

/**
 *
 * @author INTI
 */
public class ProduitDAO extends GenericDAOImpl<Produit, Long>{
    
        public List<Produit> findByidUser(int idutilisateur) {
        
        Search s = new Search(Produit.class);
        s.addFilterSome("utilisateur", Filter.equal("idutilisateur", idutilisateur));
        s.addFetch("infosReparations");
        return search(s);
    }
    
    
}
