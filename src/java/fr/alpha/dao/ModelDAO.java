/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.Search;
import fr.alpha.model.Categorie;
import fr.alpha.model.Modele;
import java.util.List;

/**
 *
 * @author INTI
 */
public class ModelDAO extends GenericDAOImpl<Modele, Long>{
    
    public List<Modele> findByCategory(int categoryId) {
        
        Search s = new Search(Modele.class);
        s.addFilterSome("categorie", Filter.equal("idcategorie", categoryId));
        return search(s);
    }
    
    public List<Modele> findByCategory(Categorie c) {
        
        Search s = new Search(Modele.class);
        s.addFilterSome("categories", Filter.equal(Filter.ROOT_ENTITY, c));
        return search(s);
    }
}
