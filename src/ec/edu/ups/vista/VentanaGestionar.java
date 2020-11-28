/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorUsuario;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VentanaGestionar extends javax.swing.JInternalFrame {

    private ControladorUsuario ctrlUsuario;
    private VentanaPrincipal venPrin;

    /**
     * Creates new form VentanaGestionar
     */
    public VentanaGestionar(ControladorUsuario ctrlUsuario, VentanaPrincipal venPrin) {
        initComponents();
        this.ctrlUsuario = ctrlUsuario;
        this.venPrin = venPrin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLCeremonia = new javax.swing.JTextField();
        btncasar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTextigo = new javax.swing.JTextField();
        txtTextigo2 = new javax.swing.JTextField();
        txtJuez = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtanio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPareja = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Lugar de la Ceremonia");

        jLabel2.setText("Fecha de la Ceremonia");

        btncasar.setText("Casar");
        btncasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncasarActionPerformed(evt);
            }
        });

        jLabel3.setText("Testigo 1");

        jLabel4.setText("Testigo 2");

        jLabel5.setText("Juez");

        btnBuscar.setText("Verificar y Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDia.setText("01");
        txtDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaMouseClicked(evt);
            }
        });

        txtMes.setText("01");
        txtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMesMouseClicked(evt);
            }
        });

        txtanio.setText("1999");
        txtanio.setToolTipText("");
        txtanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtanioMouseClicked(evt);
            }
        });

        jLabel6.setText("Pareja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btncasar)
                                    .addGap(42, 42, 42)
                                    .addComponent(btnBuscar))
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(55, 55, 55)
                                    .addComponent(txtLCeremonia, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTextigo)
                                        .addComponent(txtTextigo2)
                                        .addComponent(txtPareja, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addComponent(txtJuez)))))
                        .addContainerGap(66, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLCeremonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPareja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJuez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncasar)
                    .addComponent(btnBuscar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String lCeremonia = txtLCeremonia.getText();
        int dia = Integer.valueOf(txtDia.getText());
        int mes = Integer.valueOf(txtMes.getText());
        int anio = Integer.valueOf(txtanio.getText());
        String p2 = txtPareja.getText();
        String t1 = txtTextigo.getText();
        String t2 = txtTextigo2.getText();
        String j = txtJuez.getText();
        Date fechaB = new Date(anio - 1900, mes, dia);

        if (!lCeremonia.isBlank() || !txtDia.getText().isBlank() || !txtMes.getText().isBlank() || !txtanio.getText().isBlank() || p2.isBlank() || !t1.isBlank() || !t2.isBlank() || !j.isBlank()) {
            var p = ctrlUsuario.readNombre(p2);
            var n1 = ctrlUsuario.readNombre(t1);
            var n2 = ctrlUsuario.readNombre(t2);
            var n3 = ctrlUsuario.readNombre(j);
            if (n1 != null && n2 != null && n3 != null && p != null) {
                JOptionPane.showMessageDialog(this, "Ya se pueden casar");
                btncasar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Revise si ingreso los datos correctos o esas personas no fueron registradas");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacios");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaMouseClicked
        // TODO add your handling code here:
        txtDia.setText("");

    }//GEN-LAST:event_txtDiaMouseClicked

    private void txtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMesMouseClicked
        // TODO add your handling code here:
        txtMes.setText("");
    }//GEN-LAST:event_txtMesMouseClicked

    private void txtanioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtanioMouseClicked
        // TODO add your handling code here:
        txtanio.setText("");
    }//GEN-LAST:event_txtanioMouseClicked

    private void btncasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncasarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Se han casado");
        int dia = Integer.valueOf(txtDia.getText());
        int mes = Integer.valueOf(txtMes.getText());
        int anio = Integer.valueOf(txtanio.getText());
        Date fechaB = new Date(anio - 1900, mes, dia);
        System.out.println(txtLCeremonia.getText());
//        ctrlUsuario.getSesionIniciada().setLugarBoda(txtLCeremonia.getText());
//        ctrlUsuario.getSesionIniciada().setFechaBoda(fechaB);
//        
//        ctrlUsuario.readNombre(txtPareja.getText()).setLugarBoda(txtLCeremonia.getText());
//        ctrlUsuario.readNombre(txtPareja.getText()).setFechaBoda(fechaB);
//        
//        ctrlUsuario.readNombre(txtTextigo.getText()).setLugarBoda(txtLCeremonia.getText());
//        ctrlUsuario.readNombre(txtTextigo.getText()).setFechaBoda(fechaB);
//        
//        ctrlUsuario.readNombre(txtTextigo2.getText()).setLugarBoda(txtLCeremonia.getText());
//        ctrlUsuario.readNombre(txtTextigo2.getText()).setFechaBoda(fechaB);
//
//        ctrlUsuario.readNombre(txtJuez.getText()).setLugarBoda(txtLCeremonia.getText());
//        ctrlUsuario.readNombre(txtJuez.getText()).setFechaBoda(fechaB);
        
        System.out.println(ctrlUsuario.findAll2());
    }//GEN-LAST:event_btncasarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        btncasar.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btncasar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtJuez;
    private javax.swing.JTextField txtLCeremonia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPareja;
    private javax.swing.JTextField txtTextigo;
    private javax.swing.JTextField txtTextigo2;
    private javax.swing.JTextField txtanio;
    // End of variables declaration//GEN-END:variables
}
