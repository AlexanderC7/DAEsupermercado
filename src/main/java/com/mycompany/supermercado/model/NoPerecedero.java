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
public class NoPerecedero extends Producto{
    
    private String categoria;
    private int stock;
    
    public NoPerecedero(String nombre, int codigo, double precio, int cantidad, String categoria, int stock) throws ProductoException {
        super(nombre, codigo, precio, cantidad);
        setCategoria(categoria);
        setStock(stock);
    }

    @Override
    public void setCantidad(int cantidad) throws ProductoException {
        super.setCantidad(cantidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCantidad() {
        return super.getCantidad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPrecio(double precio) throws ProductoException {
        super.setPrecio(precio); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCodigo(int codigo) throws ProductoException {
        super.setCodigo(codigo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCodigo() {
        return super.getCodigo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) throws ProductoException {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws ProductoException {
        if (categoria == null) {
            throw new ProductoException("error asgindando categoria");
            
        }
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws ProductoException {
        if (stock <= 0) {
            throw new ProductoException("error asignando stock");
            
        }
        this.stock = stock;
    }
    
    
    
    
}
