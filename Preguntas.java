/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import preguntasrepuestas.ManejadorArchivos;

/**
 *
 * @author cmsanchez
 */
public class Preguntas extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    ManejadorArchivos archivos = new ManejadorArchivos();
    DefaultListModel modeloLista;
    String linea[];
    public Preguntas() {
        initComponents();
        
        modeloLista = new DefaultListModel();
        listaPregunta.setModel(modeloLista);
        llenarLista(); 
   
    }
    
    public void Validar()
    {
        linea = archivos.Configuracion().split(",");
        int total = Integer.parseInt(linea[0]);
        int totalLista = modeloLista.size();

        if(total == totalLista)
        {
            btnAgregar.setEnabled(false);
            txtPreguntas.setEnabled(false);
        }
        else
        {
            btnAgregar.setEnabled(true);
            txtPreguntas.setEnabled(true);
        }
    }
    
    public void llenarLista()
    {
        ArrayList<String> preguntas = archivos.Preguntas();
        modeloLista.removeAllElements();
        for(String item:preguntas)
        {
            modeloLista.addElement(item);
        }
        Validar();
        txtTotalPreguntas.setText(preguntas.size()+"/"+linea[0]);
        
    }
    
    public void agregarPregunta()
    {
        String pregunta = txtPreguntas.getText();
        
        if(!pregunta.equals(""))
        {
            modeloLista.addElement(pregunta);
            archivos.AgregarPregunta(listaPregunta.getModel());
            
            llenarLista();
        }       
 
    }
    
    public void eliminarPregunta()
    {      
        int item = listaPregunta.getSelectedIndex(); 
            
        if(item >= 0)
        {         
            int opcion = JOptionPane.showConfirmDialog(null,"Desea eliminar la pregunta seleccionada?");
        
            if(opcion == 0)
            {
                modeloLista.remove(item);
                archivos.AgregarPregunta(listaPregunta.getModel());
                llenarLista();
                Validar();
            }
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPregunta = new javax.swing.JList<>();
        txtPreguntas = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotalPreguntas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preguntas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 820, 29));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(listaPregunta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 630, 323));
        jPanel2.add(txtPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 630, 31));

        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnAgregar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnAgregar.setPreferredSize(new java.awt.Dimension(69, 23));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 87, 36));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 90, 38));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total de Preguntas:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 19, -1, -1));

        txtTotalPreguntas.setEditable(false);
        txtTotalPreguntas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPreguntas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTotalPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 13, 69, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondomatematicas.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarPregunta();
        txtPreguntas.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarPregunta();
    }//GEN-LAST:event_btnEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPregunta;
    private javax.swing.JTextField txtPreguntas;
    private javax.swing.JTextField txtTotalPreguntas;
    // End of variables declaration//GEN-END:variables
}
