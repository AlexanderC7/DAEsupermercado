/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.model;

import com.mycompany.supermercado.exceptions.ProductoException;

/**
 *
 * @author Jorge Alejandro V
 */
public class Desecho {
    private String motivo;
    private int cantidad;
    
    public Desecho(String motivo, int cantidad) throws ProductoException {
        setMotivo(motivo);
        setCantidad(cantidad);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws ProductoException {
        if (motivo == null) {
            throw new ProductoException("error asignando motivo");
            
        }
        this.motivo = motivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws ProductoException {
        if (cantidad <=0) {
            throw new ProductoException("error asigando cantidad");
            
        }
        this.cantidad = cantidad;
    }
    
    
}
