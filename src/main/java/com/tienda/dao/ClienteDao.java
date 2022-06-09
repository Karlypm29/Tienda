
package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Karly
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
