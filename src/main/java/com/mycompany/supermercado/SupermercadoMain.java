/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

import com.mycompany.supermercado.model.Supermercado;
import com.mycompany.supermercado.view.GUIPrincipal;

/**
 *
 * @author Jorge Alejandro V
 */
public class SupermercadoMain {

    public static void main(String[] args) {
        Supermercado mercado = Supermercado.getInstance();
        
        GUIPrincipal gui = new GUIPrincipal();
        gui.setVisible(true);
    }
}
