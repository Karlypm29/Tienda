package com.tienda.service;

import com.tienda.domain.Carrito;

/**
 *
 * @author karly
 */
public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(long idCliente);
}
