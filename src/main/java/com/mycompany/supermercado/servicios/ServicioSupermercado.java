/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.model.Producto;
import java.util.Date;

/**
 *
 * @author Jorge Alejandro V
 */
public class ServicioSupermercado implements IServicioSupermercado{

    @Override
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
