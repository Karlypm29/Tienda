package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author karly
 */
@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_credito")
    private long idCredito;  //id_credito
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
    
    
}
