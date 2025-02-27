/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.exceptions.ProductoException;
import com.mycompany.supermercado.model.NoPerecedero;
import com.mycompany.supermercado.model.Perecedero;
import com.mycompany.supermercado.model.Producto;
import com.mycompany.supermercado.view.GUIAdicionarNoPerecedero;
import com.mycompany.supermercado.view.GUIAdicionarPerecedero;
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
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, String categoria, boolean garantia) {
        Producto noPerecedero;
        try {
            noPerecedero = new NoPerecedero(nombre, codigo, precio, cantidad, categoria, garantia);
        } catch (ProductoException e) {
            GUIAdicionarNoPerecedero guiNoPerecedero = new GUIAdicionarNoPerecedero();
            guiNoPerecedero.mostrarMensajeError(e.getMessage());
            return null;
        }
        return noPerecedero;
    }

    @Override
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, String caducidad, double pesoUnidad) {
        Producto perecedero;
        try {
            perecedero = new Perecedero(nombre, codigo, precio, cantidad, caducidad, pesoUnidad);
        } catch (ProductoException e) {
            GUIAdicionarPerecedero guiPerecedero = new GUIAdicionarPerecedero();
            guiPerecedero.mostrarMensajeError(e.getMessage());
            return null;
        }
        return perecedero;
    }

    @Override
    public String buscarPerecedero(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto.toString();
            }
        }
        return null;
    }

    @Override
    public String buscarNoPerecedero(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto.toString();
            }
        }
        return null;
    }

    @Override
    public void calcularPerecedero(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularNoPerecedero(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List <Producto> listarPerecedero() {
        return productos;
    }

    @Override
    public List <Producto> listarNoPerecedero() {
        return productos;
    }

    @Override
    public void eliminarPerecedero(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(this);
            }
        }
    }

    @Override
    public void eliminarNoPerecedero(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(this);
            }
        }
    }

    

    
}
