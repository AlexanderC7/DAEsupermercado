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
public interface IServicioSupermercado {
    public void crearProductos();
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad);
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad);
    public void buscarPerecedero();
    public void buscarNoPerecedero(Producto pro);
    public void calcularPerecedero(Producto pro);
    public void calcularNoPerecedero(Producto pro);
    public void listarPerecedero(Producto pro);
    public void listarNoPerecedero(Producto pro);
    public void eliminarPerecedero(Producto pro);
    public void eliminarNoPerecedero(Producto pro);
    
    
    
}
