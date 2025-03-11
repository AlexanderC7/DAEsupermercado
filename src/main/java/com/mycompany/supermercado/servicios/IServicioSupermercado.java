/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.servicios;

import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.NoPerecedero;
import com.mycompany.supermercado.model.Perecedero;
import java.util.List;

/**
 *
 * @author Jorge Alejandro V
 */
public interface IServicioSupermercado {
    public Perecedero adicionarPerecedero(String nombre, int codigo, double precio, int cantidad, String caducidad, double pesoUnidad);
    public NoPerecedero adicionarNoPerecedero(String nombre, int codigo, double precio, int cantidad, String categoria, boolean garantia);
    public Perecedero buscarPerecedero(String nombre);
    public NoPerecedero buscarNoPerecedero(String nombre);
    public void calcularPerecedero(int codigo);
    public void calcularNoPerecedero(int codigo);
    public List <Perecedero> listarPerecedero();
    public List <NoPerecedero> listarNoPerecedero();
    public void eliminarPerecedero(String nombre) throws ServicioException;
    public void eliminarNoPerecedero(String nombre) throws ServicioException;
    
    
}
