/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import preguntasrepuestas.ManejadorArchivos;

/**
 *
 * @author cmsanchez
 */
public class GenerarPregunta extends javax.swing.JFrame {

    /**
     * Creates new form GenerarPregunta
     */
    
    ManejadorArchivos archivos = new ManejadorArchivos();
    ArrayList<String> preguntas;
    ArrayList<String> repuestas;
    int index = 0;
    String[] linea;
    public GenerarPregunta() {
        initComponents();
        
       preguntas = archivos.Preguntas();
       repuestas = archivos.Repuestas();
       Validar();
        
    }

    public void Validar()
    {
        if(archivos.existenPregunta())
        {
            btnGenerarPregunta.setEnabled(false);
            btnMostrarRepuesta.setEnabled(false);
        }
        else
        {
            btnGenerarPregunta.setEnabled(true);
            btnMostrarRepuesta.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JTextField();
        txtRepuesta = new javax.swing.JTextField();
        btnGenerarPregunta = new javax.swing.JButton();
        btnMostrarRepuesta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generar Pregunta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 508, -1));

        txtPregunta.setEditable(false);
        jPanel1.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 103, 396, 30));

        txtRepuesta.setEditable(false);
        jPanel1.add(txtRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, 396, 30));

        btnGenerarPregunta.setText("Generar Pregunta");
        btnGenerarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 103, -1, 30));

        btnMostrarRepuesta.setText("Mostrar Repuesta");
        btnMostrarRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRepuestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 186, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pregunta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Repuesta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondomatematicas.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 590, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPreguntaActionPerformed
        // TODO add your handling code here:        
        int totalPregunta = preguntas.size();
        int totalRepuesta = repuestas.size();
        
        if(totalPregunta != totalRepuesta)
        {
            JOptionPane.showMessageDialog(this, "Debe tener la misma cantidad de repuestas y de preguntas","Error",JOptionPane.ERROR_MESSAGE);
        }else
        {
            Random random = new Random();        
            index = random.nextInt(preguntas.size());                   
            String pregunta = preguntas.get(index);
            txtPregunta.setText(pregunta);
            txtRepuesta.setText("");
            btnMostrarRepuesta.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnGenerarPreguntaActionPerformed

    private void btnMostrarRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRepuestaActionPerformed
        // TODO add your handling code here:
        
        String pregunta = repuestas.get(index);
        txtRepuesta.setText(pregunta);
        
        
    }//GEN-LAST:event_btnMostrarRepuestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPregunta;
    private javax.swing.JButton btnMostrarRepuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextField txtRepuesta;
    // End of variables declaration//GEN-END:variables
}
