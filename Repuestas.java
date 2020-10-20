/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import preguntasrepuestas.ManejadorArchivos;

/**
 *
 * @author cmsanchez
 */
public class Repuestas extends javax.swing.JFrame {


    ManejadorArchivos archivos = new ManejadorArchivos();
    DefaultListModel modeloLista;
    String[] linea;
    public Repuestas() {
        initComponents();
        
        modeloLista = new DefaultListModel();
        listaRepuestas.setModel(modeloLista);       

        llenarLista();
       
    }
    
    public void Validar()
    {
        linea = archivos.Configuracion().split(",");
        int total = Integer.parseInt(linea[1]);
        int totalLista = modeloLista.size();
        
        if(total == totalLista)
        {
            btnAgregarRepuesta.setEnabled(false);
            txtRepuesta.setEnabled(false);
        }
        else
        {
            btnAgregarRepuesta.setEnabled(true);
            txtRepuesta.setEnabled(true);
        }
    }
    
    public void llenarLista()
    {        
               
        ArrayList<String> repuestas = archivos.Repuestas();
        modeloLista.removeAllElements();
        
        for(String item:repuestas)
        {
            modeloLista.addElement(item);
        }
        Validar();
        txtTotalRepuesta.setText(repuestas.size()+"/"+linea[1]);
        
    }
    
    public void agregarRepuestas()
    {
        String repuesta = txtRepuesta.getText();
        
        if(!repuesta.equals(""))
        {
            modeloLista.addElement(repuesta);
            archivos.AgregarRepuesta(listaRepuestas.getModel());
            
            llenarLista();
        }
        
 
    }
    
    public void eliminarRepuestas()
    {
        
        int item = listaRepuestas.getSelectedIndex();      
            
        if(item >= 0)
        {                
            int opcion = JOptionPane.showConfirmDialog(null,"Desea eliminar la repuesta seleccionada?");
            
            if(opcion == 0)
            {           
              modeloLista.remove(item);
             archivos.AgregarRepuesta(listaRepuestas.getModel());
             llenarLista();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPregunta = new javax.swing.JList<>();
        txtPreguntas = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpRepuestas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRepuestas = new javax.swing.JList<>();
        txtRepuesta = new javax.swing.JTextField();
        btnAgregarRepuesta = new javax.swing.JButton();
        btnEliminarRepuesta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalRepuesta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preguntas");

        jScrollPane1.setViewportView(listaPregunta);

        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnAgregar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnAgregar.setPreferredSize(new java.awt.Dimension(69, 23));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpRepuestas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(listaRepuestas);

        jpRepuestas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, 796, 216));
        jpRepuestas.add(txtRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 597, 31));

        btnAgregarRepuesta.setText("Agregar");
        btnAgregarRepuesta.setMaximumSize(new java.awt.Dimension(69, 23));
        btnAgregarRepuesta.setMinimumSize(new java.awt.Dimension(69, 23));
        btnAgregarRepuesta.setPreferredSize(new java.awt.Dimension(69, 23));
        btnAgregarRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRepuestaActionPerformed(evt);
            }
        });
        jpRepuestas.add(btnAgregarRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 122, 87, 36));

        btnEliminarRepuesta.setText("Eliminar");
        btnEliminarRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRepuestaActionPerformed(evt);
            }
        });
        jpRepuestas.add(btnEliminarRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 121, 81, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Repuestas");
        jpRepuestas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 796, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total de Repuestas:");
        jpRepuestas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, -1, -1));

        txtTotalRepuesta.setEditable(false);
        txtTotalRepuesta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalRepuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpRepuestas.add(txtTotalRepuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 78, 69, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondomatematicas.jpg"))); // NOI18N
        jpRepuestas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 420));

        getContentPane().add(jpRepuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 8, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRepuestaActionPerformed
        // TODO add your handling code here:
        eliminarRepuestas();
        Validar();
    }//GEN-LAST:event_btnEliminarRepuestaActionPerformed

    private void btnAgregarRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRepuestaActionPerformed
        // TODO add your handling code here:
        agregarRepuestas();
        txtRepuesta.setText("");
    }//GEN-LAST:event_btnAgregarRepuestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarRepuesta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarRepuesta;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpRepuestas;
    private javax.swing.JList<String> listaPregunta;
    private javax.swing.JList<String> listaRepuestas;
    private javax.swing.JTextField txtPreguntas;
    private javax.swing.JTextField txtRepuesta;
    private javax.swing.JTextField txtTotalRepuesta;
    // End of variables declaration//GEN-END:variables
}
