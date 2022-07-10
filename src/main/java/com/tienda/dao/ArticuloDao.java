
package com.tienda.dao;

import com.tienda.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Karly
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
