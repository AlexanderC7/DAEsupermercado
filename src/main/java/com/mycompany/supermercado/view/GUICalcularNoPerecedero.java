/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import com.mycompany.supermercado.servicios.ServicioSupermercado;

/**
 *
 * @author Alexander
 */
public class GUICalcularNoPerecedero extends javax.swing.JFrame {

    private ServicioSupermercado servicioSupermercado;
    
    /**
     * Creates new form GUICalcularNoPerecedero
     */
    public GUICalcularNoPerecedero(ServicioSupermercado servicio) {
        this.servicioSupermercado = servicio;
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblInformacionGanancia = new javax.swing.JLabel();
        lblTotalPrecios = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblStaticPorcentaje = new javax.swing.JLabel();
        ftxtTotalPrecios = new javax.swing.JFormattedTextField();
        btnCalcular = new javax.swing.JButton();
        ftxtIVA = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculo Balance No Perecedero");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("BALANCE DE CUENTAS");

        lblInformacion.setText("Sumatoria de precios de todos los productos con el IVA agregado");

        lblInformacionGanancia.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblInformacionGanancia.setForeground(new java.awt.Color(51, 153, 255));
        lblInformacionGanancia.setText("Ganancias incorporadas en cada producto: 12%");

        lblTotalPrecios.setText("Total de precios:");

        lblIVA.setText("IVA a aplicar:");

        lblStaticPorcentaje.setText("%");

        ftxtTotalPrecios.setEditable(false);
        ftxtTotalPrecios.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        ftxtTotalPrecios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ftxtTotalPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTotalPreciosActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(255, 153, 51));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        ftxtIVA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftxtIVA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtIVAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ftxtTotalPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftxtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStaticPorcentaje)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInformacionGanancia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblTotalPrecios)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformacionGanancia)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA)
                    .addComponent(ftxtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStaticPorcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(lblTotalPrecios)
                .addGap(25, 25, 25)
                .addComponent(ftxtTotalPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtTotalPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTotalPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTotalPreciosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double IVA = 0.0;
        double resultado = 0.0;

        IVA = Double.parseDouble(ftxtIVA.getValue().toString().replace(',', '.'));
        resultado = servicioSupermercado.calcularNoPerecedero(IVA);

        ftxtTotalPrecios.setValue(resultado);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void ftxtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtIVAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JFormattedTextField ftxtIVA;
    private javax.swing.JFormattedTextField ftxtTotalPrecios;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblInformacionGanancia;
    private javax.swing.JLabel lblStaticPorcentaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalPrecios;
    // End of variables declaration//GEN-END:variables
}
