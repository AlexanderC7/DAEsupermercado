/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.model;

import com.mycompany.supermercado.exceptions.ProductoException;
import java.util.Date;

/**
 *
 * @author Jorge Alejandro V
 */
public class Perecedero extends Producto{
    
    private Date caducidad;
    private double pesoUnidad;
    
    public Perecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad) throws ProductoException {
        super(nombre, codigo, precio, cantidad);
        setCaducidad(caducidad);
        setPesoUnidad(pesoUnidad);
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

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) throws ProductoException {
        if (caducidad == null) {
            throw new ProductoException("error asignando fecha de caducidad");
            
        }
        this.caducidad = caducidad;
    }

    public double getPesoUnidad() {
        return pesoUnidad;
    }

    public void setPesoUnidad(double pesoUnidad) throws ProductoException {
         if (pesoUnidad <= 0) {
            throw new ProductoException("error asignando peso unidad");
         }      
        this.pesoUnidad = pesoUnidad;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal  = 0.0;
        double porcentajeGanancia = 0.08;
        
        precioFinal = getPrecio() * getCantidad();
        precioFinal += precioFinal*porcentajeGanancia;
        
        return precioFinal;
    }
    

    @Override
    public String toString() {
        return "Resultado:{" + "nombre=" + getNombre() + "codigo=" + getCodigo() + "precio=" + getPrecio() + "cantidad=" + getCantidad() + "caducidad=" + getCaducidad() + ", pesoUnidad=" + getPesoUnidad() + '}';
    }

    
    
}
