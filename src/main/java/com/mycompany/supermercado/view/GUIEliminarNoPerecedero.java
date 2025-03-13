/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import com.mycompany.supermercado.exceptions.ServicioException;
import com.mycompany.supermercado.model.NoPerecedero;
import com.mycompany.supermercado.servicios.ServicioSupermercado;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class GUIEliminarNoPerecedero extends javax.swing.JFrame implements IActualizacion{

    private ServicioSupermercado servicioSupermercado;
    
    private boolean encontrado = false;
            
    /**
     * Creates new form GUIEliminarPerecedero
     */
    public GUIEliminarNoPerecedero(ServicioSupermercado servicio) {
        this.servicioSupermercado = servicio;
        servicioSupermercado.registrarGUI(this);
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
        txtEliminar = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
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
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblGarantia = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Producto no Perecedero");
        setPreferredSize(new java.awt.Dimension(440, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEliminar.setToolTipText("Ingrese nombre del producto");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        lblEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEliminar.setText("Eliminar producto NO PERECEDERO por  nombre");

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

        btnConsultar.setBackground(new java.awt.Color(51, 153, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

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

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("Categoría");

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        lblGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGarantia.setText("Garantía");

        txtGarantia.setEditable(false);
        txtGarantia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelResultadoEncontradoLayout = new javax.swing.GroupLayout(panelResultadoEncontrado);
        panelResultadoEncontrado.setLayout(panelResultadoEncontradoLayout);
        panelResultadoEncontradoLayout.setHorizontalGroup(
            panelResultadoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoEncontradoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelResultadoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCategoria)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(lblCodigo)
                    .addComponent(ftxtCodigo)
                    .addComponent(lblPrecio)
                    .addComponent(ftxtPrecio)
                    .addComponent(lblCantidad)
                    .addComponent(ftxtCantidad)
                    .addComponent(lblGarantia)
                    .addComponent(txtCategoria)
                    .addComponent(txtGarantia))
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
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblGarantia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblEstadoConsulta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addComponent(lblEliminar)
                                .addGap(0, 98, Short.MAX_VALUE))
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEliminar))))
                .addContainerGap())
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelResultadoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
                servicioSupermercado.eliminarNoPerecedero(nombre);
                txtEliminar.setText(null);
                txtNombre.setText(null);
                ftxtCodigo.setValue(null);
                ftxtPrecio.setValue(null);
                ftxtCantidad.setValue(null);
                txtCategoria.setText(null);
                txtGarantia.setText(null);
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
        NoPerecedero resultado;
        
        nombre = txtEliminar.getText();
        
        if (nombre != null) {
            resultado = servicioSupermercado.buscarNoPerecedero(nombre);
            
            if (resultado != null) {
                txtNombre.setText(resultado.getNombre());
                ftxtCodigo.setValue(resultado.getCodigo());
                ftxtPrecio.setValue(resultado.getPrecio());
                ftxtCantidad.setValue(resultado.getCantidad());
                txtCategoria.setText(resultado.getCategoria());
                if (resultado.getGarantia()) {
                    txtGarantia.setText("SI");
                } else {
                    txtGarantia.setText("NO");
                }
                lblEstadoConsulta.setText(null);
                encontrado = true;
            } else {
                txtEliminar.setText(null);
                txtNombre.setText(null);
                ftxtCodigo.setValue(null);
                ftxtPrecio.setValue(null);
                ftxtCantidad.setValue(null);
                txtCategoria.setText(null);
                txtGarantia.setText(null);
                encontrado = false;
                lblEstadoConsulta.setText("Producto no existe");
                JOptionPane.showMessageDialog(this, "No se encontraron coincidencias", "Sin resultados", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        servicioSupermercado.desregistrarGUI(this);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JFormattedTextField ftxtCantidad;
    private javax.swing.JFormattedTextField ftxtCodigo;
    private javax.swing.JFormattedTextField ftxtPrecio;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEstadoConsulta;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelResultadoEncontrado;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarGUI() {
        //
    }
}
