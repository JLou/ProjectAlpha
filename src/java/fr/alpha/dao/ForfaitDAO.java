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
import fr.alpha.model.Forfait;
import java.util.List;

/**
 *
 * @author INTI
 */
public class ForfaitDAO extends GenericDAOImpl<Forfait, Long>{

    public List<Forfait> findByCategory(int categoryId) {
        
        Search s = new Search(Forfait.class);
        s.addFilterSome("categorie", Filter.equal("idcategorie", categoryId));
        return search(s);
    }
    
}
