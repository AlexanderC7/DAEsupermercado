/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.exceptions.ProductoException;
import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.NoPerecedero;
import com.mycompany.supermercado.model.Perecedero;
import com.mycompany.supermercado.model.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jorge Alejandro V
 */
public class ServicioSupermercado implements IServicioSupermercado{
    
    private static List<NoPerecedero> productosNoPerecederos = new ArrayList();
    private static List<Perecedero> productosPerecederos = new ArrayList();

    @Override
    public NoPerecedero adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, String categoria, boolean garantia) {
        NoPerecedero noPerecedero;
        try {
            noPerecedero = new NoPerecedero(nombre, codigo, precio, cantidad, categoria, garantia);
            productosNoPerecederos.add(noPerecedero);
        } catch (ProductoException e) {
            System.out.println("[Error]: " + e.getMessage());
            return null;
        }
        return noPerecedero;
    }

    @Override
    public Perecedero adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, String caducidad, double pesoUnidad) {
        Perecedero perecedero;
        try {
            perecedero = new Perecedero(nombre, codigo, precio, cantidad, caducidad, pesoUnidad);
            productosPerecederos.add(perecedero);
        } catch (ProductoException e) {
            System.out.println("[Error]: " + e.getMessage());
            return null;
        }
        return perecedero;
    }

    @Override
    public Perecedero buscarPerecedero(String nombre) {
        for (Perecedero producto : productosPerecederos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        return null;
    }

    @Override
    public NoPerecedero buscarNoPerecedero(String nombre) {
        for (NoPerecedero producto : productosNoPerecederos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
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
    public List <Perecedero> listarPerecedero() {
        return productosPerecederos;
    }

    @Override
    public List <NoPerecedero> listarNoPerecedero() {
        return productosNoPerecederos;
    }

    @Override
    public void eliminarPerecedero(String nombre) throws ServicioException {
        Iterator<Perecedero> iterator = productosPerecederos.iterator();
        boolean productoEncontrado = false;
        
        while (iterator.hasNext()) {
            Perecedero producto = iterator.next();
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto instanceof Perecedero) {
                    iterator.remove();
                    productoEncontrado = true;
                    return;
                }
            }
        }
        
        if (!productoEncontrado) {
            throw new ServicioException("Producto no encontrado");
        }
    }

    @Override
    public void eliminarNoPerecedero(String nombre) throws ServicioException {
        Iterator<NoPerecedero> iterator = productosNoPerecederos.iterator();
        boolean productoEncontrado = false;
        
        while (iterator.hasNext()) {
            NoPerecedero producto = iterator.next();
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto instanceof NoPerecedero) {
                    iterator.remove();
                    productoEncontrado = true;
                    return;
                }
            }
        }
        
        if (!productoEncontrado) {
            throw new ServicioException("Producto no encontrado");
        }
    }


    

    
}
