/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.Perecedero;
import com.mycompany.supermercado.model.Producto;
import com.mycompany.supermercado.servicios.ServicioSupermercado;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class GUIActualizarPerecedero extends javax.swing.JFrame {

    private ServicioSupermercado servicioSupermercado;
    
    private boolean encontrado = false;
    
    /**
     * Creates new form GUIActualizarPerecedero
     */
    public GUIActualizarPerecedero(ServicioSupermercado servicio) {
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

        panelBusqueda = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
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
        dateCaducidad = new com.toedter.calendar.JDateChooser();
        lblPeso = new javax.swing.JLabel();
        ftxtPeso = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar producto Perecedero");

        panelBusqueda.setPreferredSize(new java.awt.Dimension(450, 169));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("ACTUALIZACIÓN DE PRODUCTO PERECEDERO");

        lblProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProducto.setText("Nombre del producto a actualizar");

        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProducto.setToolTipText("Ingrese nombre del producto a actualizar");
        txtProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(51, 153, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 153, 102));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBusquedaLayout.createSequentialGroup()
                                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(lblProducto)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelResultadoEncontrado.setPreferredSize(new java.awt.Dimension(400, 600));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre del producto");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Nombre del producto");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Código");

        ftxtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("Precio unidad");

        ftxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        ftxtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad");

        ftxtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCaducidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaducidad.setText("Caducidad");

        dateCaducidad.setToolTipText("Fecha de caducidad");
        dateCaducidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPeso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPeso.setText("Peso (Kg)");

        ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftxtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                    .addComponent(ftxtPeso)
                    .addComponent(dateCaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(dateCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String nombre;
        Perecedero resultado;
        
        nombre = txtProducto.getText();
        
        if (nombre != null) {
            resultado = servicioSupermercado.buscarPerecedero(nombre);
            
            if (resultado != null) {
                txtNombre.setText(resultado.getNombre());
                ftxtCodigo.setValue(resultado.getCodigo());
                ftxtPrecio.setValue(resultado.getPrecio());
                ftxtCantidad.setValue(resultado.getCantidad());
                dateCaducidad.setDate(resultado.getCaducidad());
                ftxtPeso.setValue(resultado.getPesoUnidad());
                encontrado = true;
            } else {
                txtProducto.setText(null);
                txtNombre.setText(null);
                ftxtCodigo.setValue(null);
                ftxtPrecio.setValue(null);
                ftxtCantidad.setValue(null);
                dateCaducidad.setDate(null);
                ftxtPeso.setValue(null);
                encontrado = false;
                JOptionPane.showMessageDialog(this, "No se encontraron coincidencias", "Sin resultados", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Producto    producto;
        String      nombre;
        int         codigo;
        double      precio;
        int         cantidad;
        Date        caducidad;
        double      peso;
        
        if (txtProducto.getText() != null) {
            nombre = txtProducto.getText();
            codigo = Integer.parseInt(ftxtCodigo.getText());
            precio = Double.parseDouble(ftxtPrecio.getText().replace(",", "."));
            cantidad = Integer.parseInt(ftxtCantidad.getText());
            caducidad = dateCaducidad.getDate();
            peso = Double.parseDouble(ftxtPeso.getText().replace(",", "."));

            try {
                servicioSupermercado.eliminarPerecedero(nombre);
                
                producto = servicioSupermercado.adicionarPerecedero(nombre, codigo, precio, cantidad, caducidad, peso);

                if (producto != null) {
                    txtNombre.setText(null);
                    ftxtCodigo.setText(null);
                    ftxtCantidad.setText(null);
                    ftxtPrecio.setText(null);
                    dateCaducidad.setDate(null);
                    ftxtPeso.setText(null);
                    JOptionPane.showMessageDialog(this, "Producto actualizado");
                }
            } catch (ServicioException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de actualización", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private com.toedter.calendar.JDateChooser dateCaducidad;
    private javax.swing.JFormattedTextField ftxtCantidad;
    private javax.swing.JFormattedTextField ftxtCodigo;
    private javax.swing.JFormattedTextField ftxtPeso;
    private javax.swing.JFormattedTextField ftxtPrecio;
    private javax.swing.JLabel lblCaducidad;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelResultadoEncontrado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
