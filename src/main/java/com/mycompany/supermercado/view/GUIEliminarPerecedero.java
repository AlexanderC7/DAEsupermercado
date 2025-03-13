/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.Perecedero;
import com.mycompany.supermercado.servicios.ServicioSupermercado;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class GUIEliminarPerecedero extends javax.swing.JFrame {

    private ServicioSupermercado servicioSupermercado;
    
    private boolean encontrado = false;
            
    /**
     * Creates new form GUIEliminarPerecedero
     */
    public GUIEliminarPerecedero(ServicioSupermercado servicio) {
        this.servicioSupermercado = servicio;
        initComponents();
        setLocationRelativeTo(null);
        lblEstadoConsulta.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblEstadoConsulta = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        panelResultadoEncontrado = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        ftxtCodigo = new javax.swing.JFormattedTextField();
        lblPrecio = new javax.swing.JLabel();
        ftxtPrecio = new javax.swing.JFormattedTextField();
        lblCantidad = new javax.swing.JLabel();
        ftxtCantidad = new javax.swing.JFormattedTextField();
        lblCaducidad = new javax.swing.JLabel();
        ftxtCaducidad = new javax.swing.JFormattedTextField();
        lblPeso = new javax.swing.JLabel();
        ftxtPeso = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Producto Perecedero");
        setPreferredSize(new java.awt.Dimension(440, 680));
        setResizable(false);

        lblEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEliminar.setText("Eliminar producto PERECEDERO por  nombre");

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEliminar.setToolTipText("Ingrese nombre del producto");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblEstadoConsulta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblEstadoConsulta.setForeground(new java.awt.Color(204, 0, 0));
        lblEstadoConsulta.setText("Producto no encontrado");

        btnConsultar.setBackground(new java.awt.Color(102, 153, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblEstadoConsulta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEliminar)
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addComponent(lblEliminar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar)
                .addGap(18, 18, 18)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(27, 27, 27))
        );

        panelResultadoEncontrado.setPreferredSize(new java.awt.Dimension(400, 600));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre del producto");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Nombre del producto");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Código");

        ftxtCodigo.setEditable(false);
        ftxtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("Precio unidad");

        ftxtPrecio.setEditable(false);
        ftxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        ftxtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad");

        ftxtCantidad.setEditable(false);
        ftxtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCaducidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaducidad.setText("Caducidad");

        ftxtCaducidad.setEditable(false);
        ftxtCaducidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblPeso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPeso.setText("Peso (Kg)");

        ftxtPeso.setEditable(false);
        ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout panelResultadoEncontradoLayout = new javax.swing.GroupLayout(panelResultadoEncontrado);
        panelResultadoEncontrado.setLayout(panelResultadoEncontradoLayout);
        panelResultadoEncontradoLayout.setHorizontalGroup(
            panelResultadoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoEncontradoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelResultadoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCaducidad)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(lblCodigo)
                    .addComponent(ftxtCodigo)
                    .addComponent(lblPrecio)
                    .addComponent(ftxtPrecio)
                    .addComponent(lblCantidad)
                    .addComponent(ftxtCantidad)
                    .addComponent(lblPeso)
                    .addComponent(ftxtCaducidad)
                    .addComponent(ftxtPeso))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        panelResultadoEncontradoLayout.setVerticalGroup(
            panelResultadoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoEncontradoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCaducidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre;
        
        nombre = txtEliminar.getText();
        
        //Función eliminar elemento encontrado
        
        if (!txtEliminar.getText().isBlank() && encontrado) {
            try {
                servicioSupermercado.eliminarPerecedero(nombre);
                txtEliminar.setText(null);
                txtNombre.setText(null);
                ftxtCodigo.setValue(null);
                ftxtPrecio.setValue(null);
                ftxtCantidad.setValue(null);
                ftxtCaducidad.setValue(null);
                ftxtPeso.setValue(null);
                JOptionPane.showMessageDialog(this, "Producto eliminado con éxito.");
                
            } catch (ServicioException ex) {
                lblEstadoConsulta.setText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String nombre;
        Perecedero resultado;
        
        nombre = txtEliminar.getText();
        
        if (nombre != null) {
            resultado = servicioSupermercado.buscarPerecedero(nombre);
            
            if (resultado != null) {
                txtNombre.setText(resultado.getNombre());
                ftxtCodigo.setValue(resultado.getCodigo());
                ftxtPrecio.setValue(resultado.getPrecio());
                ftxtCantidad.setValue(resultado.getCantidad());
                ftxtCaducidad.setValue(resultado.getCaducidad());
                ftxtPeso.setValue(resultado.getPesoUnidad());
                encontrado = true;
                lblEstadoConsulta.setText(null);
            } else {
                txtEliminar.setText(null);
                txtNombre.setText(null);
                ftxtCodigo.setValue(null);
                ftxtPrecio.setValue(null);
                ftxtCantidad.setValue(null);
                ftxtCaducidad.setValue(null);
                ftxtPeso.setValue(null);
                encontrado = false;
                lblEstadoConsulta.setText("Producto no existe");
                JOptionPane.showMessageDialog(this, "No se encontraron coincidencias", "Sin resultados", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JFormattedTextField ftxtCaducidad;
    private javax.swing.JFormattedTextField ftxtCantidad;
    private javax.swing.JFormattedTextField ftxtCodigo;
    private javax.swing.JFormattedTextField ftxtPeso;
    private javax.swing.JFormattedTextField ftxtPrecio;
    private javax.swing.JLabel lblCaducidad;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEstadoConsulta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelResultadoEncontrado;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
