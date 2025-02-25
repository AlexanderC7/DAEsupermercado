/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.model.NoPerecedero;
import com.mycompany.supermercado.model.Perecedero;
import com.mycompany.supermercado.model.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jorge Alejandro V
 */
public class ServicioSupermercado implements IServicioSupermercado{
    
    private static List<Producto> productos = new ArrayList();

    @Override
    public void adicionarProductos(Producto pro) {
        if (pro != null) {
            productos.add(pro);
        }
    }

    
    @Override
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad) {
        Producto noPerecedero;
        try {
            noPerecedero = new NoPerecedero(nombre, codigo, precio, cantidad, nombre, codigo);
        } catch (Exception e) {
            return null;
        }
        return noPerecedero;
    }

    @Override
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad) {
        Producto perecedero;
        try {
            perecedero = new Perecedero(nombre, codigo, precio, cantidad, caducidad, pesoUnidad);
        } catch (Exception e) {
            return null;
        }
        return perecedero;
    }

    @Override
    public void listarNoPerecedero(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarPerecedero(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
