/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import java.awt.event.WindowEvent;

/**
 *
 * @author Alexander
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemArchivoSalir = new javax.swing.JMenuItem();
        menuPerecedero = new javax.swing.JMenu();
        itemPerecederoAdicionar = new javax.swing.JMenuItem();
        itemPerecederoBuscar = new javax.swing.JMenuItem();
        itemPerecederoCalcular = new javax.swing.JMenuItem();
        itemPerecederoEliminar = new javax.swing.JMenuItem();
        itemPerecederoListar = new javax.swing.JMenuItem();
        menuNoPerecedero = new javax.swing.JMenu();
        itemNoPerecederoAdicionar = new javax.swing.JMenuItem();
        itemNoPerecederoBuscar = new javax.swing.JMenuItem();
        itemNoPerecederoCalcular = new javax.swing.JMenuItem();
        itemNoPerecederoEliminar = new javax.swing.JMenuItem();
        itemNoPerecederoListar = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAyudaAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        itemArchivoSalir.setText("Salir");
        itemArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemArchivoSalir);

        menuBarPrincipal.add(menuArchivo);

        menuPerecedero.setText("No Perecedero");

        itemPerecederoAdicionar.setText("Adicionar producto");
        menuPerecedero.add(itemPerecederoAdicionar);

        itemPerecederoBuscar.setText("Buscar producto");
        menuPerecedero.add(itemPerecederoBuscar);

        itemPerecederoCalcular.setText("Calcular producto");
        menuPerecedero.add(itemPerecederoCalcular);

        itemPerecederoEliminar.setText("Eliminar producto");
        menuPerecedero.add(itemPerecederoEliminar);

        itemPerecederoListar.setText("Listar productos");
        menuPerecedero.add(itemPerecederoListar);

        menuBarPrincipal.add(menuPerecedero);

        menuNoPerecedero.setText("Perecedero");

        itemNoPerecederoAdicionar.setText("Adicionar producto");
        menuNoPerecedero.add(itemNoPerecederoAdicionar);

        itemNoPerecederoBuscar.setText("Buscar producto");
        menuNoPerecedero.add(itemNoPerecederoBuscar);

        itemNoPerecederoCalcular.setText("Calcular producto");
        menuNoPerecedero.add(itemNoPerecederoCalcular);

        itemNoPerecederoEliminar.setText("Eliminar producto");
        menuNoPerecedero.add(itemNoPerecederoEliminar);

        itemNoPerecederoListar.setText("Listar productos");
        menuNoPerecedero.add(itemNoPerecederoListar);

        menuBarPrincipal.add(menuNoPerecedero);

        menuAyuda.setText("Ayuda");

        itemAyudaAcerca.setText("Acerca de...");
        menuAyuda.add(itemAyudaAcerca);

        menuBarPrincipal.add(menuAyuda);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArchivoSalirActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_itemArchivoSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemArchivoSalir;
    private javax.swing.JMenuItem itemAyudaAcerca;
    private javax.swing.JMenuItem itemNoPerecederoAdicionar;
    private javax.swing.JMenuItem itemNoPerecederoBuscar;
    private javax.swing.JMenuItem itemNoPerecederoCalcular;
    private javax.swing.JMenuItem itemNoPerecederoEliminar;
    private javax.swing.JMenuItem itemNoPerecederoListar;
    private javax.swing.JMenuItem itemPerecederoAdicionar;
    private javax.swing.JMenuItem itemPerecederoBuscar;
    private javax.swing.JMenuItem itemPerecederoCalcular;
    private javax.swing.JMenuItem itemPerecederoEliminar;
    private javax.swing.JMenuItem itemPerecederoListar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuNoPerecedero;
    private javax.swing.JMenu menuPerecedero;
    // End of variables declaration//GEN-END:variables
}
