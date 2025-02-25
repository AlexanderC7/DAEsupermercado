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
    public void adicionarProductos(Producto pro);
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad);
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, Date caducidad, double pesoUnidad);
    public void buscarPerecedero();
    public void buscarNoPerecedero(int codigo);
    public void calcularPerecedero(int codigo);
    public void calcularNoPerecedero(int codigo);
    public void listarPerecedero(int codigo);
    public void listarNoPerecedero(int codigo);
    public void eliminarPerecedero(int codigo);
    public void eliminarNoPerecedero(int codigo);
    
    
}
