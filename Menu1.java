/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import preguntasrepuestas.ManejadorArchivos;

/**
 *
 * @author Paulina
 */
public class Menu1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public Menu1() {
        initComponents();
    }
    ManejadorArchivos archivos = new ManejadorArchivos();
    public Menu() {
        initComponents();        
        ObtenerConfig();

    }
    
    public void ObtenerConfig()
    {
        String[] linea = archivos.Configuracion().split(",");        
        txtNoPreguntas.setText(linea[0]);
        txtNoRepuesta.setText(linea[1]);        
    }
           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngenerarpreguntas = new javax.swing.JButton();
        btnrespuestas = new javax.swing.JButton();
        btnpreguntas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoPreguntas = new javax.swing.JTextField();
        txtNoRepuesta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngenerarpreguntas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btngenerarpreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario.png"))); // NOI18N
        btngenerarpreguntas.setText("Solucionario");
        btngenerarpreguntas.setToolTipText("INGRESE PELICULA");
        btngenerarpreguntas.setContentAreaFilled(false);
        btngenerarpreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarpreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(btngenerarpreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 180, 60));

        btnrespuestas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnrespuestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrevista.png"))); // NOI18N
        btnrespuestas.setText("Respuestas");
        btnrespuestas.setToolTipText("INGRESE PELICULA");
        btnrespuestas.setContentAreaFilled(false);
        btnrespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrespuestasActionPerformed(evt);
            }
        });
        getContentPane().add(btnrespuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, 60));

        btnpreguntas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnpreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/solucion.png"))); // NOI18N
        btnpreguntas.setText("Preguntas");
        btnpreguntas.setToolTipText("INGRESE PELICULA");
        btnpreguntas.setContentAreaFilled(false);
        btnpreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(btnpreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Total de Preguntas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Total de Repuestas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 76, -1, -1));

        txtNoPreguntas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNoPreguntas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNoPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 15, 43, 34));

        txtNoRepuesta.setEditable(false);
        txtNoRepuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNoRepuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoRepuestaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNoRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 67, 43, 34));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 119, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo soluciones.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 370));

        jMenu1.setText("Opciones ");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Salir");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        setVisible(false);
        Interfaz inter = new Interfaz();
        inter.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void txtNoRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoRepuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoRepuestaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String numeroPregunta = txtNoPreguntas.getText();
        archivos.AgregarConfiguracion(numeroPregunta+","+numeroPregunta);
        ObtenerConfig();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnpreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreguntasActionPerformed
        Preguntas ventanaPregunta = new Preguntas();
        ventanaPregunta.setVisible(true);
    }//GEN-LAST:event_btnpreguntasActionPerformed

    private void btnrespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrespuestasActionPerformed
        Repuestas ventanaRepuesta = new Repuestas();
        ventanaRepuesta.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnrespuestasActionPerformed

    private void btngenerarpreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarpreguntasActionPerformed
        GenerarPregunta ventanaGenerar = new GenerarPregunta();
        ventanaGenerar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btngenerarpreguntasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerarpreguntas;
    private javax.swing.JButton btnpreguntas;
    private javax.swing.JButton btnrespuestas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField txtNoPreguntas;
    private javax.swing.JTextField txtNoRepuesta;
    // End of variables declaration//GEN-END:variables
}
