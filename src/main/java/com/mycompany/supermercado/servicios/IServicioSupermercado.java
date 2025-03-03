/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.Producto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jorge Alejandro V
 */
public interface IServicioSupermercado {
    public void adicionarProductos(Producto pro);
    public Producto adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, String caducidad, double pesoUnidad);
    public Producto adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, String categoria, boolean garantia);
    public String buscarPerecedero(String nombre);
    public String buscarNoPerecedero(String nombre);
    public void calcularPerecedero(int codigo);
    public void calcularNoPerecedero(int codigo);
    public List <Producto> listarPerecedero();
    public List <Producto> listarNoPerecedero();
    public void eliminarPerecedero(String nombre) throws ServicioException;
    public void eliminarNoPerecedero(String nombre) throws ServicioException;
    
    
}
