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

public abstract class Producto {
    private String nombre;
    private int codigo;
    private double precio;
    private int cantidad;

    public Producto(String nombre, int codigo, double precio, int cantidad) throws ProductoException {
        setNombre(nombre);
        setCodigo(codigo);
        setPrecio(precio);
        setCantidad(cantidad);
        
 
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ProductoException {
        if (nombre == null){
            throw new ProductoException("error asignando nombre de producto");
        }
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ProductoException {
        if (codigo <= 0){
            throw new ProductoException("error asignando codigo");
        }
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws ProductoException {
        if (precio <= 0){
            throw new ProductoException("error asignando precio");
        }
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws ProductoException{
        if (cantidad <= 0){
            throw new ProductoException("error asignando cantidad");
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre:" + nombre + ", codigo:" + codigo + ", precio:" + precio + ", cantidad:" + cantidad + '}';
    }
    
    
    
}