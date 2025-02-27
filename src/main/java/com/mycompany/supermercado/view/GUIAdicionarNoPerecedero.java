/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado.view;

import com.mycompany.supermercado.model.Producto;
import com.mycompany.supermercado.servicios.ServicioSupermercado;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class GUIAdicionarNoPerecedero extends javax.swing.JFrame {

    private ServicioSupermercado servicioSupermercado;
    
    /**
     * Creates new form GUIAdicionarNoPerecedero
     */
    public GUIAdicionarNoPerecedero(ServicioSupermercado servicio) {
        this.servicioSupermercado = servicio;
        initComponents();
        setLocationRelativeTo(null);
    }

    public void mostrarMensajeError(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage, "Error al crear", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearNoPerecedero = new javax.swing.JButton();
        scrollPanelCrear = new javax.swing.JScrollPane();
        panelCrear = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        ftxtCodigo = new javax.swing.JFormattedTextField();
        lblPrecio = new javax.swing.JLabel();
        ftxtPrecio = new javax.swing.JFormattedTextField();
        lblCantidad = new javax.swing.JLabel();
        ftxtCantidad = new javax.swing.JFormattedTextField();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblGarantia = new javax.swing.JLabel();
        chkGarantia = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Producto No Perecedero");
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);

        btnCrearNoPerecedero.setBackground(new java.awt.Color(255, 153, 102));
        btnCrearNoPerecedero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearNoPerecedero.setText("Crear");
        btnCrearNoPerecedero.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCrearNoPerecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNoPerecederoActionPerformed(evt);
            }
        });

        scrollPanelCrear.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelCrear.setPreferredSize(new java.awt.Dimension(400, 620));

        panelCrear.setPreferredSize(new java.awt.Dimension(400, 600));

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

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("Categoría");

        cmbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos No Perecederos", "Artículos de Cocina", "Baterías y Pilas", "Herramientas y Ferretería", "Hogar y Decoración", "Papel y Desechables", "Productos de Aseo Personal", "Productos de Limpieza", "Productos para Mascotas", "Útiles de Oficina y Escolar" }));

        lblGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGarantia.setText("Garantía");

        chkGarantia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkGarantia.setText("Tiene garantía");
        chkGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkGarantia)
                    .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCategoria)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre)
                        .addComponent(lblCodigo)
                        .addComponent(ftxtCodigo)
                        .addComponent(lblPrecio)
                        .addComponent(ftxtPrecio)
                        .addComponent(lblCantidad)
                        .addComponent(ftxtCantidad)
                        .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGarantia)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
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
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGarantia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        scrollPanelCrear.setViewportView(panelCrear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(btnCrearNoPerecedero, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCrearNoPerecedero)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearNoPerecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNoPerecederoActionPerformed
        Producto producto;
        String  nombre;
        int     codigo;
        double  precio;
        int     cantidad;
        String  categoria;
        boolean garantia;
        
        nombre = txtNombre.getText();
        codigo = Integer.parseInt(ftxtCodigo.getText());
        precio = Double.parseDouble(ftxtPrecio.getText().replace(",", "."));
        cantidad = Integer.parseInt(ftxtCantidad.getText());
        categoria = (String) cmbCategoria.getSelectedItem();
        garantia = chkGarantia.isSelected();
        
        producto = servicioSupermercado.adicionarNoPerecedero(nombre, codigo, precio, cantidad, categoria, garantia);
        
        if (producto != null) {
            servicioSupermercado.adicionarProductos(producto);
            txtNombre.setText(null);
            ftxtCodigo.setText(null);
            ftxtCantidad.setText(null);
            ftxtPrecio.setText(null);
            chkGarantia.setSelected(false);
            JOptionPane.showMessageDialog(this, "Producto creado con éxito");
            
        }
    }//GEN-LAST:event_btnCrearNoPerecederoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void chkGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNoPerecedero;
    private javax.swing.JCheckBox chkGarantia;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JFormattedTextField ftxtCantidad;
    private javax.swing.JFormattedTextField ftxtCodigo;
    private javax.swing.JFormattedTextField ftxtPrecio;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JScrollPane scrollPanelCrear;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
