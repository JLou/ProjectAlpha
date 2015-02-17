/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.Search;
import fr.alpha.model.Garantie;
import java.util.List;

/**
 *
 * @author INTI
 */
public class GarantieDAO extends GenericDAOImpl<Garantie, Long>{

    
    
    public List<Garantie> findByCode(int idmodele) {
        Search s = new Search(Garantie.class);
        s.addFilter(Filter.equal("idmodele", idmodele));
        return search(s);
    }
    
    
}
