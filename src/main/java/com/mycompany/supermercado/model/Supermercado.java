/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado.model;

/**
 *
 * @author Alexander
 */
public class Supermercado {
    private int NIT;
    private String razonSocial;
    
    private static Supermercado supermercado;

    private Supermercado() {
    }
    
    public static Supermercado getInstance() {
        if (supermercado != null) {
            supermercado = new Supermercado();
        }
        return supermercado;
    }
    
}
