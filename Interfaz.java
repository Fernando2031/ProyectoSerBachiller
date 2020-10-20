/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;


import clases.preguntas;
import clases.respuestas;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Formulario.Preguntas;
import Formulario.Repuestas;
import Formulario.Menu;
import Formulario.GenerarPregunta;
import javax.swing.JPanel;

/**
 *
 * @author Paulina
 */
public class Interfaz extends javax.swing.JFrame {
  
    
    
    
ObjectContainer BASE;
int count=0;
int incremental=0;
int incrementalres=0;
int matematicas=1;
int lengua=2;
int historia=3;
int ciencias=4;
int i=0;
int puntaje=0;
//int matematicas=5;
    public Interfaz() {
        BASE = Db4o.openFile("DB\\Preguntas.yap");
        initComponents();
        interfaz.setVisible(true);

        
       panelmatematicas.setVisible(false);
       panellenguaje.setVisible(false);
       panelciencias.setVisible(false);
       panelhistoria.setVisible(false);
       panelcrear.setVisible(false);
    
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        interfaz = new javax.swing.JPanel();
        btbmatematicas = new javax.swing.JButton();
        btbhistoria = new javax.swing.JButton();
        btbciencias = new javax.swing.JButton();
        btbsalir = new javax.swing.JButton();
        btblenguaje = new javax.swing.JButton();
        btnagregpregunta = new javax.swing.JButton();
        panelcrear = new javax.swing.JPanel();
        txtingresarpregunta = new javax.swing.JTextField();
        txtcorrecta = new javax.swing.JTextField();
        txtincorrecta1 = new javax.swing.JTextField();
        txtincorrecta2 = new javax.swing.JTextField();
        txtincorrecta3 = new javax.swing.JTextField();
        btnguardarp = new javax.swing.JButton();
        combomaterias = new javax.swing.JComboBox<>();
        regresaramenu = new javax.swing.JButton();
        txtcodigopregunta = new javax.swing.JTextField();
        panelhistoria = new javax.swing.JPanel();
        btbregresar4 = new javax.swing.JButton();
        pregunta10H = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        btbverificar2 = new javax.swing.JButton();
        pregunta9H = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        btncontinuar28 = new javax.swing.JButton();
        pregunta8H = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        btncontinuar27 = new javax.swing.JButton();
        pregunta7H = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        btncontinuar30 = new javax.swing.JButton();
        pregunta6H = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        btncontinuar25 = new javax.swing.JButton();
        pregunta5H = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        btncontinuar24 = new javax.swing.JButton();
        pregunta4H = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        btncontinuar23 = new javax.swing.JButton();
        pregunta3H = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        btncontinuar22 = new javax.swing.JButton();
        pregunta2H = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        btncontinuar21 = new javax.swing.JButton();
        pregunta1H = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        btncontinuar20 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        panelciencias = new javax.swing.JPanel();
        btbregrsar2 = new javax.swing.JButton();
        pregunta10C = new javax.swing.JPanel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea41 = new javax.swing.JTextArea();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        btbverificar3 = new javax.swing.JButton();
        pregunta9C = new javax.swing.JPanel();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea40 = new javax.swing.JTextArea();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        btncontinuar38 = new javax.swing.JButton();
        pregunta8C = new javax.swing.JPanel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea39 = new javax.swing.JTextArea();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        btncontinuar37 = new javax.swing.JButton();
        pregunta7C = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea38 = new javax.swing.JTextArea();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        btncontinuar36 = new javax.swing.JButton();
        pregunta6C = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea37 = new javax.swing.JTextArea();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        btncontinuar35 = new javax.swing.JButton();
        pregunta5C = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea36 = new javax.swing.JTextArea();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        btncontinuar34 = new javax.swing.JButton();
        pregunta4C = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextArea35 = new javax.swing.JTextArea();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        btncontinuar33 = new javax.swing.JButton();
        pregunta3C = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextArea34 = new javax.swing.JTextArea();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        btncontinuar32 = new javax.swing.JButton();
        pregunta2C = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextArea33 = new javax.swing.JTextArea();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        btncontinuar31 = new javax.swing.JButton();
        pregunta1C = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        btncontinuar26 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        panellenguaje = new javax.swing.JPanel();
        btbregrear1 = new javax.swing.JButton();
        pregunta10L = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        btbverificar1 = new javax.swing.JButton();
        pregunta9L = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        btncontinuar18 = new javax.swing.JButton();
        pregunta8L = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        btncontinuar17 = new javax.swing.JButton();
        pregunta7L = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        btncontinuar16 = new javax.swing.JButton();
        pregunta6L = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        btncontinuar15 = new javax.swing.JButton();
        pregunta5L = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        btncontinuar12 = new javax.swing.JButton();
        pregunta4L = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        btncontinuar14 = new javax.swing.JButton();
        pregunta3L = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        btncontinuar13 = new javax.swing.JButton();
        pregunta2L = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        btncontinuar11 = new javax.swing.JButton();
        pregunta1L = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        btncontinuar10 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        panelmatematicas = new javax.swing.JPanel();
        btbregresar = new javax.swing.JButton();
        pregunta10 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        btbverificar = new javax.swing.JButton();
        pregunta9 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        btncontinuar9 = new javax.swing.JButton();
        pregunta8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        btncontinuar8 = new javax.swing.JButton();
        pregunta7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        btncontinuar7 = new javax.swing.JButton();
        pregunta6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        btncontinuar6 = new javax.swing.JButton();
        pregunta5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btncontinuar5 = new javax.swing.JButton();
        pregunta4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btncontinuar4 = new javax.swing.JButton();
        pregunta3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btncontinuar3 = new javax.swing.JButton();
        pregunta2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btncontinuar2 = new javax.swing.JButton();
        pregunta1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btncontinuar1 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        titulo11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        interfaz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbmatematicas.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btbmatematicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/algebra.png"))); // NOI18N
        btbmatematicas.setText("Matemáticas");
        btbmatematicas.setBorder(null);
        btbmatematicas.setBorderPainted(false);
        btbmatematicas.setContentAreaFilled(false);
        btbmatematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbmatematicasActionPerformed(evt);
            }
        });
        interfaz.add(btbmatematicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        btbhistoria.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btbhistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia.png"))); // NOI18N
        btbhistoria.setText("Historia");
        btbhistoria.setBorder(null);
        btbhistoria.setBorderPainted(false);
        btbhistoria.setContentAreaFilled(false);
        btbhistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbhistoriaActionPerformed(evt);
            }
        });
        interfaz.add(btbhistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 191, -1));

        btbciencias.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btbciencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciencias.png"))); // NOI18N
        btbciencias.setText("Ciencias Naturales");
        btbciencias.setBorder(null);
        btbciencias.setBorderPainted(false);
        btbciencias.setContentAreaFilled(false);
        btbciencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbcienciasActionPerformed(evt);
            }
        });
        interfaz.add(btbciencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        btbsalir.setText("Salir");
        btbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbsalirActionPerformed(evt);
            }
        });
        interfaz.add(btbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 100, -1));

        btblenguaje.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btblenguaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trilogia.png"))); // NOI18N
        btblenguaje.setText("Lenguaje");
        btblenguaje.setBorder(null);
        btblenguaje.setBorderPainted(false);
        btblenguaje.setContentAreaFilled(false);
        btblenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btblenguajeActionPerformed(evt);
            }
        });
        interfaz.add(btblenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 179, 52));

        btnagregpregunta.setText("Solucionario");
        btnagregpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregpreguntaActionPerformed(evt);
            }
        });
        interfaz.add(btnagregpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        getContentPane().add(interfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 760, 460));

        panelcrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtingresarpregunta.setText("Ingrese aqui la pregunta");
        txtingresarpregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtingresarpreguntaMouseClicked(evt);
            }
        });
        txtingresarpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingresarpreguntaActionPerformed(evt);
            }
        });
        panelcrear.add(txtingresarpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 85, 309, -1));

        txtcorrecta.setText("Respuesta Correcta aqui");
        txtcorrecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcorrectaMouseClicked(evt);
            }
        });
        panelcrear.add(txtcorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 155, 309, -1));

        txtincorrecta1.setText("Respuesta incorrecta 1 aqui");
        txtincorrecta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtincorrecta1MouseClicked(evt);
            }
        });
        panelcrear.add(txtincorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 195, 309, -1));

        txtincorrecta2.setText("Respuesta incorrecta 2 aqui");
        txtincorrecta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtincorrecta2MouseClicked(evt);
            }
        });
        panelcrear.add(txtincorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 235, 309, -1));

        txtincorrecta3.setText("Respuesta incorrecta 3 aqui");
        txtincorrecta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtincorrecta3MouseClicked(evt);
            }
        });
        panelcrear.add(txtincorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 275, 309, -1));

        btnguardarp.setText("Guardar");
        btnguardarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarpActionPerformed(evt);
            }
        });
        panelcrear.add(btnguardarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 392, -1, -1));

        combomaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Historia", "Ciencias", "Lenguaje", "Matematicas" }));
        panelcrear.add(combomaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 344, 309, -1));

        regresaramenu.setText("Regresar");
        regresaramenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaramenuActionPerformed(evt);
            }
        });
        panelcrear.add(regresaramenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 392, -1, -1));

        txtcodigopregunta.setText("Codigo de pregunta");
        txtcodigopregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigopreguntaActionPerformed(evt);
            }
        });
        panelcrear.add(txtcodigopregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 45, 121, -1));

        getContentPane().add(panelcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 760, 470));

        panelhistoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbregresar4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btbregresar4.setText("Regresar");
        btbregresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbregresar4ActionPerformed(evt);
            }
        });
        panelhistoria.add(btbregresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        pregunta10H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea31.setEditable(false);
        jTextArea31.setColumns(20);
        jTextArea31.setRows(5);
        jTextArea31.setText("1)Seleccione las consecuencias, en el Ecuador, de la migración interna campo-ciudad.\n \n1)Las personas temen a la persecución política y abandonan su lugar de origen para residir en otro lugar\n2)Se elevan las tasas de desempleo y de subempleo en las áreas urbanas de nuestro país\n3)La zona rural queda prácticamente abandonada, disminuyendo las actividades agrícolas\n4)Las grandes catástrofes naturales y sociales provocan el desplazamiento forzoso de muchas poblaciones \n5)Surgen nuevas necesidades de infraestructura urbana como vivienda, transporte y salud\n");
        jScrollPane31.setViewportView(jTextArea31);

        pregunta10H.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton117.setText("1,2");
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });
        pregunta10H.add(jButton117, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, 20));

        jButton118.setText("1,4");
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });
        pregunta10H.add(jButton118, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, -1));

        jButton119.setText("2,3");
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });
        pregunta10H.add(jButton119, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 110, -1));

        jButton120.setText("2,5");
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });
        pregunta10H.add(jButton120, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 110, -1));

        btbverificar2.setText("Verificar");
        btbverificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbverificar2ActionPerformed(evt);
            }
        });
        pregunta10H.add(btbverificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        panelhistoria.add(pregunta10H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta9H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea30.setEditable(false);
        jTextArea30.setColumns(20);
        jTextArea30.setRows(5);
        jTextArea30.setText("9)Complete el párrafo.\n \nLa segunda mitad del siglo XIX y el primer tercio del siglo XX se \ncaracterizaron por una _______ de los imperios coloniales, como Gran \nBretaña, que buscaba el control de rutas comerciales, así como el control\n de la producción en territorios bajo condiciones de dependencia; y \nEstados Unidos, que creó las primeras empresas transnacionales para \nabastecer de materia prima a la producción en cadena para la _______. \nEste desarrollo influyó en las jóvenes naciones latinoamericanas en muchos\n niveles. Ecuador, en este contexto, se insertó a la economía mundial como\n país _______.\n");
        jScrollPane30.setViewportView(jTextArea30);

        pregunta9H.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton113.setText("absorción - fabricación - importador");
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });
        pregunta9H.add(jButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 290, -1));

        jButton114.setText("contención - importación - manufacturero");
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });
        pregunta9H.add(jButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 290, -1));

        jButton115.setText("consolidación - exportación - petrolero ");
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });
        pregunta9H.add(jButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 290, -1));

        jButton116.setText("expansión - industrialización - agroexportador");
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });
        pregunta9H.add(jButton116, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        btncontinuar28.setText("Siguiente");
        btncontinuar28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar28ActionPerformed(evt);
            }
        });
        pregunta9H.add(btncontinuar28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, 30));

        panelhistoria.add(pregunta9H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta8H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea29.setEditable(false);
        jTextArea29.setColumns(20);
        jTextArea29.setRows(5);
        jTextArea29.setText("8)Lea el texto y responda.\n \nLa crisis del cacao ecuatoriano\nAl caer el mercado europeo, las exportaciones de cacao desde Ecuador\n hacia Europa sufrieron una fuerte caída, generando una grave inflación\n que, sumada a las plagas de la ‘monilia’ y la ‘escoba de bruja’ que\n arruinaron las plantaciones, produjo la devaluación de la moneda y la \npérdida de trabajo de miles de personas.\n \nModificado con fines pedagógicos. Recuperado el 03 de septiembre de 2015 en http://www.andes.info.ec/es/noticias/i-guerra-mundial-crisis-cacao-ecuatoriano.html  \n¿Qué proceso histórico mundial produjo estos efectos en Ecuador?\n\n\n\n\n");
        jScrollPane29.setViewportView(jTextArea29);

        pregunta8H.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 90));

        jButton109.setText("Guerra Fría");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });
        pregunta8H.add(jButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 240, -1));

        jButton110.setText("Guerra de los Treinta Años");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });
        pregunta8H.add(jButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 240, -1));

        jButton111.setText("Primera Guerra Mundial");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });
        pregunta8H.add(jButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 240, -1));

        jButton112.setText("Segunda Guerra Mundial");
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });
        pregunta8H.add(jButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 240, -1));

        btncontinuar27.setText("Siguiente");
        btncontinuar27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar27ActionPerformed(evt);
            }
        });
        pregunta8H.add(btncontinuar27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panelhistoria.add(pregunta8H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta7H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea32.setEditable(false);
        jTextArea32.setColumns(20);
        jTextArea32.setRows(5);
        jTextArea32.setText("7)Elija las causas sociales de la desertificación.\n \n1.Desarrollo de guerras y conflictos armados\n2.Desplazamiento forzoso de grupos humanos\n3.Expansión relevante de la frontera ganadera\n4.Explotación excesiva de recursos madereros\n5.Establecimiento de la soberanía alimentaria\n");
        jScrollPane32.setViewportView(jTextArea32);

        pregunta7H.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton121.setText("1,2");
        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });
        pregunta7H.add(jButton121, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, -1));

        jButton122.setText("2,3");
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });
        pregunta7H.add(jButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, -1));

        jButton123.setText("3,4");
        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });
        pregunta7H.add(jButton123, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, -1));

        jButton124.setText("1,3");
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });
        pregunta7H.add(jButton124, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 240, -1));

        btncontinuar30.setText("Siguiente");
        btncontinuar30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar30ActionPerformed(evt);
            }
        });
        pregunta7H.add(btncontinuar30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, 30));

        panelhistoria.add(pregunta7H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta6H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea27.setEditable(false);
        jTextArea27.setColumns(20);
        jTextArea27.setRows(5);
        jTextArea27.setText("6)\tLucha por los derechos\nNelson Mandela representa un ícono de la lucha por los derechos humanos, \nprincipalmente en torno a la defensa de las libertades de su pueblo. Su \nlucha contra el apartheid se resume en sus declaraciones “he luchado \ncontra la dominación blanca y he luchado contra la dominación negra. He \nabrigado el ideal de una sociedad libre y democrática en que todas las\n personas vivan unidas en armonía y con las mismas oportunidades. Es un \nideal por el que espero vivir y que espero conseguir. Pero es un ideal \npor el que estoy preparado para morir, si es necesario”.\n \nRecuperado el 17 de febrero de 2017 en http://www.youthforhumanrights.org/es_ES/voices-for-human-rights/champions/nelson-mandela.html\n \nSeleccione los derechos por los que luchó el personaje mencionado en el texto.\n \n1.Todos los humanos nacen libres e iguales en dignidad y derechos\n2.Toda persona tiene derecho a una nacionalidad y derecho a cambiarla\n3.Nadie estará sometido a la esclavitud, servidumbre o trata de personas\n4.Toda persona tiene derechos y libertades sin distinción de raza\n");
        jScrollPane27.setViewportView(jTextArea27);

        pregunta6H.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton101.setText("1,2");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        pregunta6H.add(jButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, -1));

        jButton102.setText("1,4");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });
        pregunta6H.add(jButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, -1));

        jButton103.setText("2,3");
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });
        pregunta6H.add(jButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, -1));

        jButton104.setText("3,4");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });
        pregunta6H.add(jButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 240, -1));

        btncontinuar25.setText("Siguiente");
        btncontinuar25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar25ActionPerformed(evt);
            }
        });
        pregunta6H.add(btncontinuar25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panelhistoria.add(pregunta6H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta5H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea26.setEditable(false);
        jTextArea26.setColumns(20);
        jTextArea26.setRows(5);
        jTextArea26.setText("\n5)Hoy en día es utilizado un sistema de numeración posicional en el que las \ncantidades son representadas utilizando diez cifras diferentes ,pero para \nque este sistema pueda funcionar , es necesario que el numero ”cero”\n indique la ausencia de cantidad.\n-Seleccione las civilizaciones que aportaron al mundo los conceptos matemáticos descritos en el texto.\n1. Musulmana.\n2. China\n3. Sumeria.\n4. Hindú. ");
        jScrollPane26.setViewportView(jTextArea26);

        pregunta5H.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton97.setText("2,4");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        pregunta5H.add(jButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, -1));

        jButton98.setText("1,4");
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        pregunta5H.add(jButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, -1));

        jButton99.setText("2,3");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        pregunta5H.add(jButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, -1));

        jButton100.setText("1,3");
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        pregunta5H.add(jButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 240, -1));

        btncontinuar24.setText("Siguiente");
        btncontinuar24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar24ActionPerformed(evt);
            }
        });
        pregunta5H.add(btncontinuar24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panelhistoria.add(pregunta5H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta4H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea25.setEditable(false);
        jTextArea25.setColumns(20);
        jTextArea25.setRows(5);
        jTextArea25.setText("4)Con base en  el texto, elija las iniciativas que promueven el ejercicio\n del derecho mencionado.\n \nDerecho a la igualdad de género\nLas prácticas que promueven los derechos relacionados con la igualdad de \ngénero, tienen por objetivo equiparar las relaciones entre hombres y\n mujeres. En los últimos años, se han diseñado estrategias que buscan \nalcanzar la paridad en estas relaciones tanto en la esfera privada como\n pública.\n \n1.Creación de leyes específicas sobre la violencia contra la mujer, que \nabarque sanciones contra actos físicos y psicológicos\n2.Mayor representación de las mujeres en la economía informal y de baja\n productividad\n3.Protección especial contra cualquier forma de explotación laboral o \neconómica\n4.Reconocimiento de la maternidad como función exclusiva de la mujer\n dentro de la sociedad \n5.Acceso a servicios adecuados de atención médica, información, asesoramiento y servicios sobre la planificación familiar\n");
        jScrollPane25.setViewportView(jTextArea25);

        pregunta4H.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton93.setText("1,2");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        pregunta4H.add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, -1));

        jButton94.setText("1,5");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        pregunta4H.add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 240, -1));

        jButton95.setText("2,4");
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        pregunta4H.add(jButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, -1));

        jButton96.setText("3,4");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        pregunta4H.add(jButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 240, -1));

        btncontinuar23.setText("Siguiente");
        btncontinuar23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar23ActionPerformed(evt);
            }
        });
        pregunta4H.add(btncontinuar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, 30));

        panelhistoria.add(pregunta4H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta3H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea24.setEditable(false);
        jTextArea24.setColumns(20);
        jTextArea24.setRows(5);
        jTextArea24.setText("3)Plan Nacional del Buen Vivir :\nDe acuerdo al artículo 1 de la Constitución, Ecuador es un Estado de \nderechos y justicia, cuyo fin es la protección y la garantía de los \nderechos; el artículo 3, numeral 8, dice que uno de los fines del Estado \nes garantizar el derecho a una cultura de paz y seguridad integral. \nPor esta razón, el acceso a una justicia imparcial e independiente y la \nvida en un entorno libre de amenazas, violencia y temor, son necesarios\n para alcanzar el desarrollo de las personas, mejorar su calidad de vida\n y lograr el ejercicio pleno de sus derechos y libertades democráticas.\n\nSeleccione las acciones que permiten el ejercicio de estos derechos humanos.\n \n1.Fortalecimiento del mecanismo de control y penalización al contrabando\n y a la evasión tributaria\n2.Creación de unidades judiciales en el país, especializadas en familia,\n mujer, niñez y adolescencia\n3.Promoción del pluralismo jurídico que reside en la consolidación de la\n justicia indígena y de paz\n4.Auspiciar la igualdad, la cohesión, la inclusión y la equidad social y \nterritorial, en la diversidad.\n");
        jScrollPane24.setViewportView(jTextArea24);

        pregunta3H.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton89.setText("1,3");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        pregunta3H.add(jButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 240, -1));

        jButton90.setText("1,4");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        pregunta3H.add(jButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 240, -1));

        jButton91.setText("2,3");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        pregunta3H.add(jButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, -1));

        jButton92.setText("2,4");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        pregunta3H.add(jButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 240, -1));

        btncontinuar22.setText("Siguiente");
        btncontinuar22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar22ActionPerformed(evt);
            }
        });
        pregunta3H.add(btncontinuar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panelhistoria.add(pregunta3H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta2H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea23.setEditable(false);
        jTextArea23.setColumns(20);
        jTextArea23.setRows(5);
        jTextArea23.setText("2)Complete el enunciado.\n \nEl nivel de organización ecológica _______ se define como el _______ de \npoblaciones en un mismo _______.\n");
        jScrollPane23.setViewportView(jTextArea23);

        pregunta2H.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton85.setText("ecosistema - grupo - hábitat");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        pregunta2H.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 240, -1));

        jButton86.setText("comunidad - conjunto - hábitat");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        pregunta2H.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, -1));

        jButton87.setText("comunidad - conjunto - nicho");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        pregunta2H.add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, -1));

        jButton88.setText("ecosistema - grupo - nicho");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        pregunta2H.add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 240, -1));

        btncontinuar21.setText("Siguiente");
        btncontinuar21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar21ActionPerformed(evt);
            }
        });
        pregunta2H.add(btncontinuar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panelhistoria.add(pregunta2H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta1H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea22.setEditable(false);
        jTextArea22.setColumns(20);
        jTextArea22.setRows(5);
        jTextArea22.setText("1)¿A qué región geopolítica hace referencia el texto?\n \nLogros de la integración geopolítica\nEn el año 2014, este bloque económico surgido de la idea de integrar a \nesta región geopolítica sudamericana, festejó un proyecto regional y \npopular, orientado al desarrollo inclusivo y a la promoción de la \nparticipación política de la ciudadanía regional. Los logros del proceso\n de integración regional dan un saldo altamente favorable para la \nsociedad y la ciudadanía con la creación de un Parlamento regional, la \naprobación del Código Aduanero Común, la consolidación de las cumbres\n sociales, los trabajos de un instituto social y la creación del Fondo\n para la Convergencia Estructural.\n");
        jScrollPane22.setViewportView(jTextArea22);

        pregunta1H.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 130));

        jButton81.setText("Cono Sur");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        pregunta1H.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton82.setText("America Andina");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        pregunta1H.add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton83.setText("Vertiente del Pacifico");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        pregunta1H.add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton84.setText("Comunidad Suramericana de Naciones ");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        pregunta1H.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar20.setText("Siguiente");
        btncontinuar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar20ActionPerformed(evt);
            }
        });
        pregunta1H.add(btncontinuar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelhistoria.add(pregunta1H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia_1.png"))); // NOI18N
        panelhistoria.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, 671));

        getContentPane().add(panelhistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 450));

        panelciencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbregrsar2.setText("Regresar");
        btbregrsar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbregrsar2ActionPerformed(evt);
            }
        });
        panelciencias.add(btbregrsar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        pregunta10C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea41.setEditable(false);
        jTextArea41.setColumns(20);
        jTextArea41.setRows(5);
        jTextArea41.setText("10)Todos son mecanismos del cuerpo humano que son parte de la defensa \ninmunológica adquirida, excepto:\n");
        jScrollPane41.setViewportView(jTextArea41);

        pregunta10C.add(jScrollPane41, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 80));

        jButton157.setText("epidermis");
        jButton157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton157ActionPerformed(evt);
            }
        });
        pregunta10C.add(jButton157, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton158.setText("anticuerpos");
        jButton158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton158ActionPerformed(evt);
            }
        });
        pregunta10C.add(jButton158, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton159.setText("linfocitos B");
        jButton159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton159ActionPerformed(evt);
            }
        });
        pregunta10C.add(jButton159, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton160.setText("linfocitos T");
        jButton160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton160ActionPerformed(evt);
            }
        });
        pregunta10C.add(jButton160, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btbverificar3.setText("Verificar");
        btbverificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbverificar3ActionPerformed(evt);
            }
        });
        pregunta10C.add(btbverificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        panelciencias.add(pregunta10C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta9C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea40.setEditable(false);
        jTextArea40.setColumns(20);
        jTextArea40.setRows(5);
        jTextArea40.setText("9)Seleccione las prácticas que contribuyen a la conservación de los recursos naturales.\n1)Utilizar productos que contengan sustancias con clorofluorocarbonos\n2)Implementar la ordenanza del pico y placa en las grandes ciudades\n3)Utilizar cocinas de inducción para la cocción de los alimentos\n4)Quemar los residuos vegetales como fuente de energía en los ingenios azucareros\n5)Realizar los surcos para la siembra de plantas en dirección opuesta a la pendiente\n");
        jScrollPane40.setViewportView(jTextArea40);

        pregunta9C.add(jScrollPane40, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton153.setText("1,2");
        jButton153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton153ActionPerformed(evt);
            }
        });
        pregunta9C.add(jButton153, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton154.setText("1,3");
        jButton154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton154ActionPerformed(evt);
            }
        });
        pregunta9C.add(jButton154, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton155.setText("2,3");
        jButton155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton155ActionPerformed(evt);
            }
        });
        pregunta9C.add(jButton155, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton156.setText("2,4");
        jButton156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton156ActionPerformed(evt);
            }
        });
        pregunta9C.add(jButton156, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar38.setText("Siguiente");
        btncontinuar38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar38ActionPerformed(evt);
            }
        });
        pregunta9C.add(btncontinuar38, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta9C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta8C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea39.setEditable(false);
        jTextArea39.setColumns(20);
        jTextArea39.setRows(5);
        jTextArea39.setText("8)Son prácticas que contribuyen a la conservación de la biodiversidad, \nexcepto:");
        jScrollPane39.setViewportView(jTextArea39);

        pregunta8C.add(jScrollPane39, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 130));

        jButton149.setText("1)\timplementar un banco de germoplasma");
        jButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton149ActionPerformed(evt);
            }
        });
        pregunta8C.add(jButton149, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 280, -1));

        jButton150.setText("2)\tfomentar la reforestación con especies nativas");
        jButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton150ActionPerformed(evt);
            }
        });
        pregunta8C.add(jButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 330, -1));

        jButton151.setText("3)\tconstruir varios jardines botánicos");
        jButton151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton151ActionPerformed(evt);
            }
        });
        pregunta8C.add(jButton151, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton152.setText("4)\tpromover la fragmentación de hábitats");
        jButton152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton152ActionPerformed(evt);
            }
        });
        pregunta8C.add(jButton152, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar37.setText("Siguiente");
        btncontinuar37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar37ActionPerformed(evt);
            }
        });
        pregunta8C.add(btncontinuar37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta8C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta7C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea38.setEditable(false);
        jTextArea38.setColumns(20);
        jTextArea38.setRows(5);
        jTextArea38.setText("7)El calentamiento global es un fenómeno que principalmente se produce por\n las emisiones de CO2, causadas durante las actividades productivas industria\nles en las que se queman combustibles fósiles para generar energía, o al \ntalar árboles para obtener madera. \nTodos son efectos generados por este fenómeno, excepto:\n");
        jScrollPane38.setViewportView(jTextArea38);

        pregunta7C.add(jScrollPane38, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 130));

        jButton145.setText("1)\tmareas altas en el mar");
        jButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton145ActionPerformed(evt);
            }
        });
        pregunta7C.add(jButton145, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton146.setText("2)\tincremento del nivel de lluvias");
        jButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton146ActionPerformed(evt);
            }
        });
        pregunta7C.add(jButton146, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton147.setText("3)\tdisminución de los glaciares");
        jButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton147ActionPerformed(evt);
            }
        });
        pregunta7C.add(jButton147, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton148.setText("4)\tcambios en las estaciones");
        jButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton148ActionPerformed(evt);
            }
        });
        pregunta7C.add(jButton148, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar36.setText("Siguiente");
        btncontinuar36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar36ActionPerformed(evt);
            }
        });
        pregunta7C.add(btncontinuar36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta6C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea37.setEditable(false);
        jTextArea37.setColumns(20);
        jTextArea37.setRows(5);
        jTextArea37.setText("6)¿A qué interacción se refiere el enunciado?\n \nEs la responsable de mantener unidos a los nucleones (protones y neutrones\n) que coexisten en el núcleo atómico. Los efectos de esta fuerza solo se\n aprecian a distancias muy pequeñas (del tamaño de los núcleos atómicos).\n");
        jScrollPane37.setViewportView(jTextArea37);

        pregunta6C.add(jScrollPane37, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton141.setText("1)\tNuclear débil");
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });
        pregunta6C.add(jButton141, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton142.setText("2)\tNuclear fuerte");
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });
        pregunta6C.add(jButton142, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton143.setText("3)\tElectromagnética");
        jButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton143ActionPerformed(evt);
            }
        });
        pregunta6C.add(jButton143, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton144.setText("4)\tEléctrica");
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });
        pregunta6C.add(jButton144, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar35.setText("Siguiente");
        btncontinuar35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar35ActionPerformed(evt);
            }
        });
        pregunta6C.add(btncontinuar35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta6C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta5C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea36.setEditable(false);
        jTextArea36.setColumns(20);
        jTextArea36.setRows(5);
        jTextArea36.setText("65)\tCuando los seres humanos se infectan de varicela y luego se r\necuperan, el tipo de virus que les causó la enfermedad generalmente no \nvuelve a enfermarlos. ¿Por qué sucede esto?\n");
        jScrollPane36.setViewportView(jTextArea36);

        pregunta5C.add(jScrollPane36, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 90));

        jButton137.setText("El cuerpo mata a todos los virus que pueden causar el mismo tipo de enfermedad");
        jButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton137ActionPerformed(evt);
            }
        });
        pregunta5C.add(jButton137, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 530, -1));

        jButton138.setText("Los glóbulos rojos matan a todos los virus que pueden causar el mismo tipo de enfermedad");
        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });
        pregunta5C.add(jButton138, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 560, -1));

        jButton139.setText("Los glóbulos rojos capturan y se deshacen de este tipo de virus en el cuerpo");
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });
        pregunta5C.add(jButton139, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 530, -1));

        jButton140.setText("El cuerpo genera anticuerpos que matan a este tipo de virus antes de que sigan  multiplicándose ");
        jButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton140ActionPerformed(evt);
            }
        });
        pregunta5C.add(jButton140, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 610, -1));

        btncontinuar34.setText("Siguiente");
        btncontinuar34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar34ActionPerformed(evt);
            }
        });
        pregunta5C.add(btncontinuar34, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta4C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea35.setEditable(false);
        jTextArea35.setColumns(20);
        jTextArea35.setRows(5);
        jTextArea35.setText("4)La meteorización es la alteración y desintegración de una roca \nin situ en la superficie terrestre, debido a varios factores, lo que da\nlugar a la formación del suelo. \nTodos son factores físicos que influyen en este proceso, excepto:\n");
        jScrollPane35.setViewportView(jTextArea35);

        pregunta4C.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 90));

        jButton133.setText("Oxidacion");
        jButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton133ActionPerformed(evt);
            }
        });
        pregunta4C.add(jButton133, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton134.setText("congelación");
        jButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton134ActionPerformed(evt);
            }
        });
        pregunta4C.add(jButton134, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton135.setText("insolación");
        jButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton135ActionPerformed(evt);
            }
        });
        pregunta4C.add(jButton135, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton136.setText("dilatación");
        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });
        pregunta4C.add(jButton136, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar33.setText("Siguiente");
        btncontinuar33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar33ActionPerformed(evt);
            }
        });
        pregunta4C.add(btncontinuar33, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta3C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea34.setEditable(false);
        jTextArea34.setColumns(20);
        jTextArea34.setRows(5);
        jTextArea34.setText("3)Identifique la consecuencia de la liberación de dióxido de carbono en la\n atmósfera, producida por la combustión de gasolina, petróleo, carbón y \nemisiones de fábricas.\n");
        jScrollPane34.setViewportView(jTextArea34);

        pregunta3C.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 80));

        jButton129.setText("Lluvia ácida");
        jButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton129ActionPerformed(evt);
            }
        });
        pregunta3C.add(jButton129, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, -1));

        jButton130.setText("Deterioro del ozono");
        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });
        pregunta3C.add(jButton130, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 260, -1));

        jButton131.setText("Lixiviación");
        jButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton131ActionPerformed(evt);
            }
        });
        pregunta3C.add(jButton131, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, -1));

        jButton132.setText("Efecto invernadero");
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });
        pregunta3C.add(jButton132, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, -1));

        btncontinuar32.setText("Siguiente");
        btncontinuar32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar32ActionPerformed(evt);
            }
        });
        pregunta3C.add(btncontinuar32, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta2C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea33.setEditable(false);
        jTextArea33.setColumns(20);
        jTextArea33.setRows(5);
        jTextArea33.setText("2)¿Qué ocurre con las moléculas de un líquido cuando disminuye la \ntemperatura?");
        jScrollPane33.setViewportView(jTextArea33);

        pregunta2C.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 80));

        jButton125.setText("Permanecen muy distantes y sereducen");
        jButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton125ActionPerformed(evt);
            }
        });
        pregunta2C.add(jButton125, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 280, -1));

        jButton126.setText("Se alejan unas de otras y se desordenan");
        jButton126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton126ActionPerformed(evt);
            }
        });
        pregunta2C.add(jButton126, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 280, -1));

        jButton127.setText("Se deslizan unas sobre otras y se separan");
        jButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton127ActionPerformed(evt);
            }
        });
        pregunta2C.add(jButton127, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 280, -1));

        jButton128.setText("Permanecen muy juntas y se ordenan");
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });
        pregunta2C.add(jButton128, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 280, -1));

        btncontinuar31.setText("Siguiente");
        btncontinuar31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar31ActionPerformed(evt);
            }
        });
        pregunta2C.add(btncontinuar31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        pregunta1C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea28.setEditable(false);
        jTextArea28.setColumns(20);
        jTextArea28.setRows(5);
        jTextArea28.setText("1)Relacione la teoría del origen de la vida con el postulado.\n \nTeoría\t \tPostulado\n1.\nQuimiosintética\t a)\tLos primeros compuestos orgánicos se formaron en una \natmósfera primitiva\n2.Panspermia\t b)\tLa vida se formó por una fuerza divina superior\n3.Abiogénesis\t c)\tLas primeras formas vivientes llegaron a nuestro planeta desde el espacio exterior\n4.Creacionismo\t d)\tLa vida surge a partir de cualquier materia no viviente o inerte\n");
        jScrollPane28.setViewportView(jTextArea28);

        pregunta1C.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 130));

        jButton105.setText("1a, 2c, 3d, 4b");
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });
        pregunta1C.add(jButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));

        jButton106.setText("1b, 2c, 3d, 4a");
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });
        pregunta1C.add(jButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        jButton107.setText("1c, 2d, 3a, 4b");
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });
        pregunta1C.add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        jButton108.setText("1d, 2a, 3b, 4c");
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });
        pregunta1C.add(jButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        btncontinuar26.setText("Siguiente");
        btncontinuar26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar26ActionPerformed(evt);
            }
        });
        pregunta1C.add(btncontinuar26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 120, 30));

        panelciencias.add(pregunta1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, 370));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciencias_1.png"))); // NOI18N
        panelciencias.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panelciencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, 440));

        panellenguaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbregrear1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btbregrear1.setText("Regresar");
        btbregrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbregrear1ActionPerformed(evt);
            }
        });
        panellenguaje.add(btbregrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        pregunta10L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea21.setEditable(false);
        jTextArea21.setColumns(20);
        jTextArea21.setRows(5);
        jTextArea21.setText("10)Identifique el sinónimo de la palabra en mayusculas.\n \nEn revisión detallada del pasado y examen precario del presente, me\n despertó un RARO pensamiento.\n");
        jScrollPane21.setViewportView(jTextArea21);

        pregunta10L.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton77.setText("Usual");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        pregunta10L.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, -1));

        jButton78.setText("Inusitado");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        pregunta10L.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 90, -1));

        jButton79.setText("Normal");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        pregunta10L.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 90, 30));

        jButton80.setText("Habitual");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        pregunta10L.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, -1));

        btbverificar1.setText("Verificar");
        btbverificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbverificar1ActionPerformed(evt);
            }
        });
        pregunta10L.add(btbverificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        panellenguaje.add(pregunta10L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta9L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea20.setEditable(false);
        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        jTextArea20.setText("9)Identifique la palabra que contiene un prefijo.\n \nEl directorde la biblioteca recibió una calurosa felicitación por su \npuntualidad.\n");
        jScrollPane20.setViewportView(jTextArea20);

        pregunta9L.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton73.setText("Felicitación");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        pregunta9L.add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));

        jButton74.setText("Director");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        pregunta9L.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, -1));

        jButton75.setText("Biblioteca");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        pregunta9L.add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, -1));

        jButton76.setText("puntualidad");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        pregunta9L.add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 100, -1));

        btncontinuar18.setText("Siguiente");
        btncontinuar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar18ActionPerformed(evt);
            }
        });
        pregunta9L.add(btncontinuar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 30));

        panellenguaje.add(pregunta9L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta8L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea19.setEditable(false);
        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jTextArea19.setText("8)Son oraciones que cumplen con las reglas de concordancia nominal y verbal, \nexcepto:");
        jScrollPane19.setViewportView(jTextArea19);

        pregunta8L.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 590, 70));

        jButton69.setText("las piñas, limas, peras y manzanas verdes son las preferidas de Juan");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        pregunta8L.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 470, -1));

        jButton70.setText("le informaron que: Manuel, Sandra, Lorena y Gonzalo saldrán del país");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        pregunta8L.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, -1));

        jButton71.setText("el sueño, el anhelo y el vuelo imaginario es descartado por los pragmáticos ");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        pregunta8L.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 470, -1));

        jButton72.setText("la montaña y el volcán congelados; mientras el imponente Sol derretía al día");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        pregunta8L.add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btncontinuar17.setText("Siguiente");
        btncontinuar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar17ActionPerformed(evt);
            }
        });
        pregunta8L.add(btncontinuar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, 30));

        panellenguaje.add(pregunta8L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta7L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea18.setEditable(false);
        jTextArea18.setColumns(20);
        jTextArea18.setRows(5);
        jTextArea18.setText("7)Con base en el texto, identifique el sinónimo de la palabra en mayusculas.\n \n[...] Para un empleado de cubículo existe un pálpito excitante, y es el \nPRESAGIO de que el viernes se acerca. Algo así como un anuncio novedoso del paso de un cometa.\n");
        jScrollPane18.setViewportView(jTextArea18);

        pregunta7L.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        jButton65.setText("Deseo");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        pregunta7L.add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 120, -1));

        jButton66.setText("Presentimiento");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        pregunta7L.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, -1));

        jButton67.setText("Recuerdo");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        pregunta7L.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 120, -1));

        jButton68.setText("Delirio");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        pregunta7L.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 120, -1));

        btncontinuar16.setText("Siguiente");
        btncontinuar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar16ActionPerformed(evt);
            }
        });
        pregunta7L.add(btncontinuar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 30));

        panellenguaje.add(pregunta7L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta6L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea17.setEditable(false);
        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jTextArea17.setText("28)\tSeleccione las oraciones que utilizan correctamente la b y la v.\n \n1)El profesor afirmó, furibundo, que absolutamente todos los conejos eran\n herbívoros\n2)No creía ser un hervíboro, por lo que se puso furivundo cuando vió que \nsolo había ensalada\n3)Pusimos a herbir el té y cortamos el pan para los bocaditos. Era la \nfiesta para el anciano más longebo del pueblo\n4)No pensó ser tan longevo, reflexionó mucho al respecto mientras ponía\n a hervir el agua para prepararse un café\n");
        jScrollPane17.setViewportView(jTextArea17);

        pregunta6L.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        jButton61.setText("1,2");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        pregunta6L.add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jButton62.setText("1,4");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        pregunta6L.add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jButton63.setText("2,3");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        pregunta6L.add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jButton64.setText("3,4");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        pregunta6L.add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        btncontinuar15.setText("Siguiente");
        btncontinuar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar15ActionPerformed(evt);
            }
        });
        pregunta6L.add(btncontinuar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panellenguaje.add(pregunta6L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta5L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea14.setEditable(false);
        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setText("27)\tIdentifique al receptor del texto.\n\nEl debate entre corazón y mente se ha extendido por varios años y ha \ngenerado una gran controversia. Catalina opina que lo más importante es\n el corazón, por eso siempre se basa en las emociones a la hora de tomar\n decisiones. Miguel considera que para él es más importante la mente y \npensar bien las cosas. Liliana cree que lo mejor es que haya un \nequilibrio entre mente y emociones. Felipe, ¿qué piensas?\n");
        jScrollPane14.setViewportView(jTextArea14);

        pregunta5L.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 150));

        jButton49.setText("Catalina");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        pregunta5L.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jButton50.setText("Felipe");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        pregunta5L.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, -1));

        jButton51.setText("Liliana");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        pregunta5L.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, -1));

        jButton52.setText("Miguel");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        pregunta5L.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, -1));

        btncontinuar12.setText("Siguiente");
        btncontinuar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar12ActionPerformed(evt);
            }
        });
        pregunta5L.add(btncontinuar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panellenguaje.add(pregunta5L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta4L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea16.setEditable(false);
        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jTextArea16.setText("4)Con base en el enunciado, identifique el antónimo de la palabra en \nmayusculas.\n \nNo hay animal MANSO que atado no se irrite.\n");
        jScrollPane16.setViewportView(jTextArea16);

        pregunta4L.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 600, 100));

        jButton57.setText("Bondadoso");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        pregunta4L.add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 100, -1));

        jButton58.setText("Mansurrón");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        pregunta4L.add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, -1));

        jButton59.setText("Domado");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        pregunta4L.add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 100, -1));

        jButton60.setText("Salvaje");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        pregunta4L.add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 100, -1));

        btncontinuar14.setText("Siguiente");
        btncontinuar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar14ActionPerformed(evt);
            }
        });
        pregunta4L.add(btncontinuar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panellenguaje.add(pregunta4L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta3L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea15.setEditable(false);
        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.setText("3)Identifique el significado adecuado del término en mayusculas.\n \nUn lento caminar, cabizbajo iba con la lluvia, solamente podría decirse \nque sus ojos REZUMBAN tristeza.\n");
        jScrollPane15.setViewportView(jTextArea15);

        pregunta3L.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 600, -1));

        jButton53.setText("Dicho de un líquido: salir al exterior en gotas a través de los poros de un cuerpo");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        pregunta3L.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jButton54.setText("Manifestar o dejar traslucir una cualidad o sentimiento");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        pregunta3L.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jButton55.setText("Dicho de algunas cosas como trabajos, desgracias: venir, caer sobre alguien con  abundancia ");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        pregunta3L.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jButton56.setText("Ocasionar un daño a las cosas, desmejorándolas o desluciéndolas");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        pregunta3L.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        btncontinuar13.setText("Siguiente");
        btncontinuar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar13ActionPerformed(evt);
            }
        });
        pregunta3L.add(btncontinuar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panellenguaje.add(pregunta3L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta2L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("2)Con base en el enunciado, identifique la frase que reproduzca la misma idea en otras \npalabras.\n \nMuy poco adelantarás si vuelves la cara atrás.\n");
        jScrollPane13.setViewportView(jTextArea13);

        pregunta2L.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 110));

        jButton45.setText("Mirar atrás implica recordar para no volver a equivocarse");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        pregunta2L.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 410, -1));

        jButton46.setText("Es conveniente concentrarse en el pasado para mejorar");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        pregunta2L.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 410, -1));

        jButton47.setText("Es conveniente concentrarse en el futuro antes que en el pasado");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        pregunta2L.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 410, -1));

        jButton48.setText("Mirar a adelante implica avanzar y hacer planes para el futuro");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        pregunta2L.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 410, -1));

        btncontinuar11.setText("Siguiente");
        btncontinuar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar11ActionPerformed(evt);
            }
        });
        pregunta2L.add(btncontinuar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panellenguaje.add(pregunta2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        pregunta1L.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("1)El Diccionario de la Real Academia Española indica que una paráfrasis es\n una: \"Frase que, imitando en su estructura otra conocida, se formula con\n palabras diferentes.\" \nCon base en esta definición, identifique la paráfrasis correcta de la\n cita.\n");
        jScrollPane12.setViewportView(jTextArea12);

        pregunta1L.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 620, 110));

        jButton41.setText("La música despierta el corazón");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        pregunta1L.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 240, -1));

        jButton42.setText("El corazón necesita de la música");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        pregunta1L.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 240, -1));

        jButton43.setText("La música es el centro de la vida");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        pregunta1L.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, -1));

        jButton44.setText("El corazón late al ritmo de la música");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        pregunta1L.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        btncontinuar10.setText("Siguiente");
        btncontinuar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar10ActionPerformed(evt);
            }
        });
        pregunta1L.add(btncontinuar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 30));

        panellenguaje.add(pregunta1L, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 650, 330));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondolenguaje.jpg"))); // NOI18N
        jLabel40.setText("Regresare");
        panellenguaje.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, 400));

        getContentPane().add(panellenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 760, 440));

        panelmatematicas.setBackground(new java.awt.Color(154, 248, 240));
        panelmatematicas.setForeground(new java.awt.Color(0, 255, 255));
        panelmatematicas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbregresar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btbregresar.setText("Regresar");
        btbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbregresarActionPerformed(evt);
            }
        });
        panelmatematicas.add(btbregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        pregunta10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("10)Para recorrer dos puntos que distan entre sí 150 m, un móvil se d\nesplaza a una rapidez constante de 25 m/s . Si se duplica su rapidez para \ncubrir la misma distancia, ¿cuántos segundos utilizará?\n");
        jScrollPane11.setViewportView(jTextArea11);

        pregunta10.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton37.setText("3");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        pregunta10.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton38.setText("6");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        pregunta10.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton39.setText("8");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        pregunta10.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton40.setText("12");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        pregunta10.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btbverificar.setText("Verificar");
        btbverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbverificarActionPerformed(evt);
            }
        });
        pregunta10.add(btbverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        panelmatematicas.add(pregunta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("9)¿Cuántos puntos de dos coordenadas (x, y), se pueden generar con \n los dígitos 0, 1, 2, 3, 4, 6, teniendo en cuenta que no es posible repetir \nlos números?");
        jScrollPane10.setViewportView(jTextArea10);

        pregunta9.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton33.setText("12");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        pregunta9.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton34.setText("15");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        pregunta9.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton35.setText("42");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        pregunta9.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton36.setText("36");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        pregunta9.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar9.setText("Siguiente");
        btncontinuar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar9ActionPerformed(evt);
            }
        });
        pregunta9.add(btncontinuar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 30));

        panelmatematicas.add(pregunta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("8)Si se debe realizar con los números del 1 al 5, códigos de dos\n dígitos para una tienda de ropa sin que se repitan sus dígitos, \n¿cuántos códigos se puede formar?");
        jScrollPane9.setViewportView(jTextArea9);

        pregunta8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 80));

        jButton29.setText("10");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        pregunta8.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton30.setText("20");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        pregunta8.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton31.setText("60");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        pregunta8.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton32.setText("120");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        pregunta8.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar8.setText("Siguiente");
        btncontinuar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar8ActionPerformed(evt);
            }
        });
        pregunta8.add(btncontinuar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 30));

        panelmatematicas.add(pregunta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("7)En el cuerpo humano habitan aproximadamente 100 000 000 de bacterias\n por mm2. Si al tomar un baño se pierde el 10 % de estas, y si al usar un\n jabón antibacteriano se pierde un 10 % adicional, ¿qué porcentaje de\n bacterias se conserva en el cuerpo?\n");
        jScrollPane8.setViewportView(jTextArea8);

        pregunta7.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton25.setText("19");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        pregunta7.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton26.setText("20");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        pregunta7.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton27.setText("80");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        pregunta7.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton28.setText("81");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        pregunta7.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar7.setText("Siguiente");
        btncontinuar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar7ActionPerformed(evt);
            }
        });
        pregunta7.add(btncontinuar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("6)Tres obreros cavan en 24 horas una zanja de 12 m. ¿Cuántos metros \ncavarán en 12 horas 9 obreros?\n\n");
        jScrollPane7.setViewportView(jTextArea7);

        pregunta6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton21.setText("2");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        pregunta6.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton22.setText("6");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        pregunta6.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton23.setText("18");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        pregunta6.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton24.setText("72");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        pregunta6.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar6.setText("Siguiente");
        btncontinuar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar6ActionPerformed(evt);
            }
        });
        pregunta6.add(btncontinuar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("6)En la tabla se observan las prendas que tiene Nancy en su armario. \nSi se escoge una prenda al azar, ¿cuál es la probabilidad de que sea \nuna blusa color rojo?\n \nNúmero\tPrenda\tColor\n5\tBlusas\tRojo\n2\tBlusas\tAzul\n4\tPantalones\tNegro\n3\tPantalones\tPlomo\n1\tFalda\tRosado\n6\tChaquetas\tNegro\n");
        jScrollPane6.setViewportView(jTextArea6);

        pregunta5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 150));

        jButton17.setText("1/21");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        pregunta5.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton18.setText("2/21");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        pregunta5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton19.setText("5/21");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        pregunta5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton20.setText("6/21");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        pregunta5.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar5.setText("Siguiente");
        btncontinuar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar5ActionPerformed(evt);
            }
        });
        pregunta5.add(btncontinuar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("4)Micaela es 18 años menor que Víctor Hugo y si se suman las dos edades \nel resultado es menor que 74. ¿Cuál es la edad que puede tener Víctor Hugo?\n");
        jScrollPane5.setViewportView(jTextArea5);

        pregunta4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 90));

        jButton13.setText("1)< 28");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        pregunta4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton14.setText("2)> 28");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        pregunta4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton15.setText("3)< 46");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        pregunta4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton16.setText("4)> 46");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        pregunta4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar4.setText("Siguiente");
        btncontinuar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar4ActionPerformed(evt);
            }
        });
        pregunta4.add(btncontinuar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("3)Identifique el elemento que sigue en la secuencia.\n  \n4/6; 6/5; 8/10; 26;17; 44;90; ?/?\n\n");
        jScrollPane4.setViewportView(jTextArea4);

        pregunta3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        jButton9.setText("62/109");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pregunta3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton10.setText("88180");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pregunta3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton11.setText("346/125");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        pregunta3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton12.setText("720");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        pregunta3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, 60, -1));

        btncontinuar3.setText("Siguiente");
        btncontinuar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar3ActionPerformed(evt);
            }
        });
        pregunta3.add(btncontinuar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("2)Si hay 6 puntos no colineales marcados en un papel, ¿cuál es el \nnúmero de triángulos que se pueden trazar?\n");
        jScrollPane3.setViewportView(jTextArea3);

        pregunta2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        jButton5.setText("216");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pregunta2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton6.setText("20");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pregunta2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton7.setText("18");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pregunta2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton8.setText("720");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pregunta2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar2.setText("Siguiente");
        btncontinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar2ActionPerformed(evt);
            }
        });
        pregunta2.add(btncontinuar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        pregunta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1)Una persona olvidó el último código de su caja fuerte, pero recuerda \nhaber ingresado la siguiente sucesión de números:\n \n2,5; 5; 7,5; 10; 12,5; ...\n \nSi el último código que necesita la persona está ubicado en la octava\n posición, ¿cuál es este código?\n");
        jScrollPane1.setViewportView(jTextArea1);

        pregunta1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        jButton1.setText("15");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pregunta1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 235, -1, -1));

        jButton2.setText("20");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pregunta1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jButton3.setText("13");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pregunta1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 235, -1, -1));

        jButton4.setText("14");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pregunta1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 235, -1, -1));

        btncontinuar1.setText("Siguiente");
        btncontinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuar1ActionPerformed(evt);
            }
        });
        pregunta1.add(btncontinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        panelmatematicas.add(pregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 330));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondomate.png"))); // NOI18N
        panelmatematicas.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("2)Si hay 6 puntos no colineales marcados en un papel, ¿cuál es el núme de triángulos que se pueden \ntrazar?\n");
        jScrollPane2.setViewportView(jTextArea2);

        panelmatematicas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 614, 126));

        getContentPane().add(panelmatematicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 760, 450));

        titulo11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/personitalogo.png"))); // NOI18N
        jLabel31.setText(" Ser Bachiller");

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel32.setText("Simulador");

        javax.swing.GroupLayout titulo11Layout = new javax.swing.GroupLayout(titulo11);
        titulo11.setLayout(titulo11Layout);
        titulo11Layout.setHorizontalGroup(
            titulo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titulo11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        titulo11Layout.setVerticalGroup(
            titulo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo11Layout.createSequentialGroup()
                .addGroup(titulo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titulo11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32))
                    .addComponent(jLabel31))
                .addGap(536, 536, 536))
        );

        getContentPane().add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 750, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btblenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btblenguajeActionPerformed
        panellenguaje.setVisible(true);
        interfaz.setVisible(false);
        pregunta1L.setVisible(true);
        pregunta2L.setVisible(false);
        pregunta3L.setVisible(false);
        pregunta4L.setVisible(false);
        pregunta5L.setVisible(false);
        pregunta6L.setVisible(false);
        pregunta7L.setVisible(false);
        pregunta8L.setVisible(false);
        pregunta9L.setVisible(false);
        pregunta10L.setVisible(false);
        count=0;
        jButton41.setBackground(Color.white);
        jButton42.setBackground(Color.white);
        jButton43.setBackground(Color.white);
        jButton44.setBackground(Color.white);
        jButton45.setBackground(Color.white);
        jButton46.setBackground(Color.white);
        jButton47.setBackground(Color.white);
        jButton48.setBackground(Color.white);
        jButton49.setBackground(Color.white);
        jButton50.setBackground(Color.white);
        jButton51.setBackground(Color.white);
        jButton52.setBackground(Color.white);
        jButton53.setBackground(Color.white);
        jButton54.setBackground(Color.white);
        jButton55.setBackground(Color.white);
        jButton56.setBackground(Color.white);
        jButton57.setBackground(Color.white);
        jButton58.setBackground(Color.white);
        jButton59.setBackground(Color.white);
        jButton60.setBackground(Color.white);
        jButton61.setBackground(Color.white);
        jButton62.setBackground(Color.white);
        jButton63.setBackground(Color.white);
        jButton64.setBackground(Color.white);
        jButton65.setBackground(Color.white);
        jButton66.setBackground(Color.white);
        jButton67.setBackground(Color.white);
        jButton68.setBackground(Color.white);
        jButton69.setBackground(Color.white);
        jButton70.setBackground(Color.white);
        jButton71.setBackground(Color.white);
        jButton72.setBackground(Color.white);
        jButton73.setBackground(Color.white);
        jButton74.setBackground(Color.white);
        jButton75.setBackground(Color.white);
        jButton76.setBackground(Color.white);
        jButton77.setBackground(Color.white);
        jButton78.setBackground(Color.white);
        jButton79.setBackground(Color.white);
        jButton80.setBackground(Color.white);
    }//GEN-LAST:event_btblenguajeActionPerformed

    private void btbmatematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbmatematicasActionPerformed
       
        panelmatematicas.setVisible(true);
        pregunta1.setVisible(true);
        pregunta2.setVisible(false);
        pregunta3.setVisible(false);
        pregunta4.setVisible(false);
        pregunta5.setVisible(false);
        pregunta6.setVisible(false);
        pregunta7.setVisible(false);
        pregunta8.setVisible(false);
        pregunta9.setVisible(false);
        pregunta10.setVisible(false);
        
        interfaz.setVisible(false);
        count=0;
        jButton1.setBackground(Color.white);
        jButton2.setBackground(Color.white);
        jButton3.setBackground(Color.white);
        jButton4.setBackground(Color.white);
        jButton5.setBackground(Color.white);
        jButton6.setBackground(Color.white);
        jButton7.setBackground(Color.white);
        jButton8.setBackground(Color.white);
        jButton9.setBackground(Color.white);
        jButton10.setBackground(Color.white);
        jButton11.setBackground(Color.white);
        jButton12.setBackground(Color.white);
        jButton13.setBackground(Color.white);
        jButton14.setBackground(Color.white);
        jButton15.setBackground(Color.white);
        jButton16.setBackground(Color.white);
        jButton17.setBackground(Color.white);
        jButton18.setBackground(Color.white);
        jButton19.setBackground(Color.white);
        jButton20.setBackground(Color.white);
        jButton21.setBackground(Color.white);
        jButton22.setBackground(Color.white);
        jButton23.setBackground(Color.white);
        jButton24.setBackground(Color.white);
        jButton25.setBackground(Color.white);
        jButton26.setBackground(Color.white);
        jButton27.setBackground(Color.white);
        jButton28.setBackground(Color.white);
        jButton29.setBackground(Color.white);
        jButton30.setBackground(Color.white);
        jButton31.setBackground(Color.white);
        jButton32.setBackground(Color.white);
        jButton33.setBackground(Color.white);
        jButton34.setBackground(Color.white);
        jButton35.setBackground(Color.white);
        jButton36.setBackground(Color.white);
        jButton37.setBackground(Color.white);
        jButton38.setBackground(Color.white);
        jButton39.setBackground(Color.white);
        jButton40.setBackground(Color.white);
    }//GEN-LAST:event_btbmatematicasActionPerformed

    private void btbhistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbhistoriaActionPerformed
       panelhistoria.setVisible(true);
       interfaz.setVisible(false);
       pregunta1H.setVisible(true);
       pregunta2H.setVisible(false);
       pregunta3H.setVisible(false);
       pregunta4H.setVisible(false);
       pregunta5H.setVisible(false);
       pregunta6H.setVisible(false);
       pregunta7H.setVisible(false);
       pregunta8H.setVisible(false);
       pregunta9H.setVisible(false);
       pregunta10H.setVisible(false);
       count=0;
        jButton81.setBackground(Color.white);
        jButton82.setBackground(Color.white);
        jButton83.setBackground(Color.white);
        jButton84.setBackground(Color.white);
        jButton85.setBackground(Color.white);
        jButton86.setBackground(Color.white);
        jButton87.setBackground(Color.white);
        jButton87.setBackground(Color.white);
        jButton89.setBackground(Color.white);
        jButton90.setBackground(Color.white);
        jButton91.setBackground(Color.white);
        jButton92.setBackground(Color.white);
        jButton93.setBackground(Color.white);
        jButton94.setBackground(Color.white);
        jButton95.setBackground(Color.white);
        jButton96.setBackground(Color.white);
        jButton97.setBackground(Color.white);
        jButton98.setBackground(Color.white);
        jButton99.setBackground(Color.white);
        jButton100.setBackground(Color.white);
        jButton101.setBackground(Color.white);
        jButton102.setBackground(Color.white);
        jButton103.setBackground(Color.white);
        jButton104.setBackground(Color.white);
        jButton105.setBackground(Color.white);
        jButton106.setBackground(Color.white);
        jButton107.setBackground(Color.white);
        jButton108.setBackground(Color.white);
        jButton109.setBackground(Color.white);
        jButton110.setBackground(Color.white);
        jButton111.setBackground(Color.white);
        jButton112.setBackground(Color.white);
        jButton113.setBackground(Color.white);
        jButton114.setBackground(Color.white);
        jButton115.setBackground(Color.white);
        jButton116.setBackground(Color.white);
        jButton117.setBackground(Color.white);
        jButton118.setBackground(Color.white);
        jButton119.setBackground(Color.white);
        jButton120.setBackground(Color.white);
       
    }//GEN-LAST:event_btbhistoriaActionPerformed

    private void btbcienciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbcienciasActionPerformed
        panelciencias.setVisible(true);
        interfaz.setVisible(false);
        pregunta1C.setVisible(true);
        pregunta2C.setVisible(false);
        pregunta3C.setVisible(false);
        pregunta4C.setVisible(false);
        pregunta5C.setVisible(false);
        pregunta6C.setVisible(false);
        pregunta7C.setVisible(false);
        pregunta8C.setVisible(false);
        pregunta9C.setVisible(false);
        pregunta10C.setVisible(false);
        
        count=0;
        jButton121.setBackground(Color.white);
        jButton122.setBackground(Color.white);
        jButton123.setBackground(Color.white);
        jButton124.setBackground(Color.white);
        jButton125.setBackground(Color.white);
        jButton126.setBackground(Color.white);
        jButton127.setBackground(Color.white);
        jButton128.setBackground(Color.white);
        jButton129.setBackground(Color.white);
        jButton130.setBackground(Color.white);
        jButton131.setBackground(Color.white);
        jButton132.setBackground(Color.white);
        jButton133.setBackground(Color.white);
        jButton134.setBackground(Color.white);
        jButton135.setBackground(Color.white);
        jButton136.setBackground(Color.white);
        jButton137.setBackground(Color.white);
        jButton138.setBackground(Color.white);
        jButton139.setBackground(Color.white);
        jButton140.setBackground(Color.white);
        jButton141.setBackground(Color.white);
        jButton142.setBackground(Color.white);
        jButton143.setBackground(Color.white);
        jButton144.setBackground(Color.white);
        jButton145.setBackground(Color.white);
        jButton146.setBackground(Color.white);
        jButton147.setBackground(Color.white);
        jButton148.setBackground(Color.white);
        jButton149.setBackground(Color.white);
        jButton150.setBackground(Color.white);
        jButton151.setBackground(Color.white);
        jButton152.setBackground(Color.white);
        jButton153.setBackground(Color.white);
        jButton154.setBackground(Color.white);
        jButton155.setBackground(Color.white);
        jButton156.setBackground(Color.white);
        jButton157.setBackground(Color.white);
        jButton158.setBackground(Color.white);
        jButton159.setBackground(Color.white);
        jButton160.setBackground(Color.white);
        
    }//GEN-LAST:event_btbcienciasActionPerformed

    private void btbregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbregresarActionPerformed
 panelmatematicas.setVisible(false);
       panellenguaje.setVisible(false);
       panelciencias.setVisible(false);
       panelhistoria.setVisible(false);   
       interfaz.setVisible(true);
       
    }//GEN-LAST:event_btbregresarActionPerformed

    private void btbregrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbregrear1ActionPerformed
         panelmatematicas.setVisible(false);
       panellenguaje.setVisible(false);
       panelciencias.setVisible(false);
       panelhistoria.setVisible(false);
       interfaz.setVisible(true);
       count=0;
    }//GEN-LAST:event_btbregrear1ActionPerformed

    private void btbregrsar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbregrsar2ActionPerformed
         panelmatematicas.setVisible(false);
       panellenguaje.setVisible(false);
       panelciencias.setVisible(false);
       panelhistoria.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_btbregrsar2ActionPerformed

    private void btbregresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbregresar4ActionPerformed
        panelmatematicas.setVisible(false);
       panellenguaje.setVisible(false);
       panelciencias.setVisible(false);
       panelhistoria.setVisible(false);
       interfaz.setVisible(true);
    }//GEN-LAST:event_btbregresar4ActionPerformed

    private void btnguardarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarpActionPerformed
        if(validar()){
        if(combomaterias.getSelectedItem().toString().equalsIgnoreCase("matematicas"))
        {
            
            preguntas p1=new preguntas();
            p1.setId_pregunta(txtcodigopregunta.getText());
            p1.setDescripcion(txtingresarpregunta.getText());
            p1.setId_simulador(Integer.toString(matematicas));
            respuestas r1=new respuestas();
            r1.setId_respuesta(txtcodigopregunta.getText());
            r1.setId_categoria(Integer.toString(matematicas));
            r1.setRes_correcta(txtcorrecta.getText());
            r1.setRes_falsa1(txtincorrecta1.getText());
            r1.setRes_falsa2(txtincorrecta2.getText());
            r1.setRes_falsa3(txtincorrecta3.getText());
          
            
            clases.PRINCIPAL.CREARPREGUNTA(BASE, p1.getId_pregunta(), p1.getDescripcion(), p1.getId_simulador());
            clases.PRINCIPAL.CREARRESPUESTA(BASE, r1.getId_respuesta(), r1.getId_categoria(), p1.getId_pregunta(), r1.getRes_correcta(), r1.getRes_falsa1(), r1.getRes_falsa2(), r1.getRes_falsa3(), r1.getRes_falsa4());
            System.out.println(p1.toString()+"\n"+r1.toString());
            
            txtcodigopregunta.setText("");
            txtingresarpregunta.setText("");
            txtcorrecta.setText("");
            txtincorrecta1.setText("");
            txtincorrecta2.setText("");
            txtincorrecta3.setText("");
           
            combomaterias.setSelectedIndex(0);
        }
        if(combomaterias.getSelectedItem().toString().equalsIgnoreCase("lengua"))
        {
            
            preguntas p1=new preguntas();
            p1.setId_pregunta(Integer.toString(incremental));
            p1.setDescripcion(txtingresarpregunta.getText());
            p1.setId_simulador(Integer.toString(lengua));
            respuestas r1=new respuestas();
            r1.setId_categoria(Integer.toString(incrementalres));
            r1.setId_categoria(Integer.toString(lengua));
            r1.setRes_correcta(txtcorrecta.getText());
            r1.setRes_falsa1(txtincorrecta1.getText());
            r1.setRes_falsa2(txtincorrecta2.getText());
            r1.setRes_falsa3(txtincorrecta3.getText());
            clases.PRINCIPAL.CREARPREGUNTA(BASE, p1.getId_pregunta(), p1.getDescripcion(), p1.getId_simulador());
            clases.PRINCIPAL.CREARRESPUESTA(BASE, r1.getId_respuesta(), r1.getId_categoria(), p1.getId_pregunta(), r1.getRes_correcta(), r1.getRes_falsa1(), r1.getRes_falsa2(), r1.getRes_falsa3(), r1.getRes_falsa4());
        
            txtcodigopregunta.setText("");
            txtingresarpregunta.setText("");
            txtcorrecta.setText("");
            txtincorrecta1.setText("");
            txtincorrecta2.setText("");
            txtincorrecta3.setText("");
          
            combomaterias.setSelectedIndex(0);
            
        }
        if(combomaterias.getSelectedItem().toString().equalsIgnoreCase("historia"))
        {
            preguntas p1=new preguntas();
            p1.setId_pregunta(Integer.toString(incremental));
            p1.setDescripcion(txtingresarpregunta.getText());
            p1.setId_simulador(Integer.toString(historia));
            respuestas r1=new respuestas();
            r1.setId_categoria(Integer.toString(incrementalres));
            r1.setId_categoria(Integer.toString(historia));
            r1.setRes_correcta(txtcorrecta.getText());
            r1.setRes_falsa1(txtincorrecta1.getText());
            r1.setRes_falsa2(txtincorrecta2.getText());
            r1.setRes_falsa3(txtincorrecta3.getText());
            clases.PRINCIPAL.CREARPREGUNTA(BASE, p1.getId_pregunta(), p1.getDescripcion(), p1.getId_simulador());
            clases.PRINCIPAL.CREARRESPUESTA(BASE, r1.getId_respuesta(), r1.getId_categoria(), p1.getId_pregunta(), r1.getRes_correcta(), r1.getRes_falsa1(), r1.getRes_falsa2(), r1.getRes_falsa3(), r1.getRes_falsa4());
        
            txtcodigopregunta.setText("");
            txtingresarpregunta.setText("");
            txtcorrecta.setText("");
            txtincorrecta1.setText("");
            txtincorrecta2.setText("");
            txtincorrecta3.setText("");
           
            combomaterias.setSelectedIndex(0);
        
        }
        if(combomaterias.getSelectedItem().toString().equalsIgnoreCase("ciencias"))
        {
            incremental++;
            incrementalres++;
            preguntas p1=new preguntas();
            p1.setId_pregunta(Integer.toString(incremental));
            p1.setDescripcion(txtingresarpregunta.getText());
            p1.setId_simulador(Integer.toString(ciencias));
            respuestas r1=new respuestas();
            r1.setId_categoria(Integer.toString(incrementalres));
            r1.setId_categoria(Integer.toString(ciencias));
            r1.setRes_correcta(txtcorrecta.getText());
            r1.setRes_falsa1(txtincorrecta1.getText());
            r1.setRes_falsa2(txtincorrecta2.getText());
            r1.setRes_falsa3(txtincorrecta3.getText());
            clases.PRINCIPAL.CREARPREGUNTA(BASE, p1.getId_pregunta(), p1.getDescripcion(), p1.getId_simulador());
            clases.PRINCIPAL.CREARRESPUESTA(BASE, r1.getId_respuesta(), r1.getId_categoria(), p1.getId_pregunta(), r1.getRes_correcta(), r1.getRes_falsa1(), r1.getRes_falsa2(), r1.getRes_falsa3(), r1.getRes_falsa4());
        
            txtcodigopregunta.setText("");
            txtingresarpregunta.setText("");
            txtcorrecta.setText("");
            txtincorrecta1.setText("");
            txtincorrecta2.setText("");
            txtincorrecta3.setText("");
           
            combomaterias.setSelectedIndex(0);
        
        
        }
        if(combomaterias.getSelectedItem().toString().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }
        }else{
        JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");}
    }//GEN-LAST:event_btnguardarpActionPerformed

   
    
    
    
    private void btncontinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar1ActionPerformed
     pregunta1.setVisible(false);
     pregunta2.setVisible(true);
     pregunta3.setVisible(false);
     
        
        
    }//GEN-LAST:event_btncontinuar1ActionPerformed

    private void btnagregpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregpreguntaActionPerformed
panelcrear.setVisible(false);
interfaz.setVisible(true);
panelciencias.setVisible(false);
panelhistoria.setVisible(false);
panellenguaje.setVisible(false);
panelmatematicas.setVisible(false);
btbciencias.setVisible(true);
btbhistoria.setVisible(true);
btblenguaje.setVisible(true);
btbmatematicas.setVisible(true);
btnagregpregunta.setVisible(true);
btbsalir.setVisible(false);
Menu men = new Menu();
men.setVisible(true);



    }//GEN-LAST:event_btnagregpreguntaActionPerformed

    private void btbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbsalirActionPerformed
BASE.close();
System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_btbsalirActionPerformed

    private void regresaramenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaramenuActionPerformed
panelcrear.setVisible(false);
btbciencias.setVisible(true);
btbhistoria.setVisible(true);
btblenguaje.setVisible(true);
btbmatematicas.setVisible(true);
btnagregpregunta.setVisible(true);
interfaz.setVisible(true);
btbsalir.setVisible(true);
    }//GEN-LAST:event_regresaramenuActionPerformed

    private void txtcorrectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorrectaMouseClicked
txtcorrecta.setText("");
    }//GEN-LAST:event_txtcorrectaMouseClicked

    private void txtincorrecta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtincorrecta1MouseClicked
txtincorrecta1.setText("");
    }//GEN-LAST:event_txtincorrecta1MouseClicked

    private void txtincorrecta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtincorrecta2MouseClicked
txtincorrecta2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtincorrecta2MouseClicked

    private void txtincorrecta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtincorrecta3MouseClicked
txtincorrecta3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtincorrecta3MouseClicked

    private void txtingresarpreguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarpreguntaMouseClicked
txtingresarpregunta.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresarpreguntaMouseClicked

    private void txtingresarpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresarpreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresarpreguntaActionPerformed

    private void txtcodigopreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigopreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigopreguntaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jButton1.setBackground(Color.green);
        if(jButton1.getText().equals("15")){
            count=count+1;
           jButton1.setBackground(Color.green);
             
             
       }else{
           jButton2.setBackground(Color.red);
           jButton3.setBackground(Color.red);
           jButton4.setBackground(Color.red);
      
        
       }System.out.println(count);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setBackground(Color.red);
        if(jButton2.isSelected()){
           jButton2.setBackground(Color.red);
       }else{
           jButton1.setBackground(Color.green);
           jButton3.setBackground(Color.red);
           jButton4.setBackground(Color.red);
        
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton3.setBackground(Color.red);
        if(jButton3.isSelected()){
           jButton3.setBackground(Color.red);
       }else{
           jButton1.setBackground(Color.green);
           jButton2.setBackground(Color.red);
           jButton4.setBackground(Color.red);
        
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     jButton4.setBackground(Color.red);
        if(jButton4.isSelected()){
           jButton4.setBackground(Color.red);
       }else{
           jButton1.setBackground(Color.green);
           jButton3.setBackground(Color.red);
           jButton2.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jButton5.setBackground(Color.red);
        if(jButton5.isSelected()){
           jButton5.setBackground(Color.red);
       }else{
           jButton6.setBackground(Color.green);
           jButton7.setBackground(Color.red);
           jButton8.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
        jButton6.setBackground(Color.green);
        if(jButton6.getText().equals("20")){
            count=count+1;
           jButton6.setBackground(Color.green);
            
            
       }else{
           jButton5.setBackground(Color.red);
           jButton7.setBackground(Color.red);
           jButton8.setBackground(Color.red);
        
       }   System.out.println(count); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setBackground(Color.red);
        if(jButton7.isSelected()){
           jButton7.setBackground(Color.red);
       }else{
           jButton5.setBackground(Color.red);
           jButton6.setBackground(Color.green);
           jButton8.setBackground(Color.red);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jButton8.setBackground(Color.red);
        if(jButton8.isSelected()){
           jButton8.setBackground(Color.red);
       }else{
           jButton5.setBackground(Color.red);
           jButton7.setBackground(Color.red);
           jButton6.setBackground(Color.green);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btncontinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar2ActionPerformed
pregunta1.setVisible(false);
pregunta2.setVisible(false);// TODO add your handling code here:
pregunta3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     jButton9.setBackground(Color.red);
        if(jButton9.isSelected()){
           jButton9.setBackground(Color.red);
       }else{
           jButton11.setBackground(Color.green);
           jButton10.setBackground(Color.red);
           jButton12.setBackground(Color.red);
        
       }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setBackground(Color.red);
        if(jButton10.isSelected()){
           jButton10.setBackground(Color.red);
       }else{
           jButton11.setBackground(Color.green);
           jButton9.setBackground(Color.red);
           jButton12.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 jButton11.setBackground(Color.green);
        if(jButton11.getText().equals("346/125")){
           jButton11.setBackground(Color.green);
             count=count+1;
       }else{
           jButton9.setBackground(Color.red);
           jButton10.setBackground(Color.red);
           jButton12.setBackground(Color.red);
        
       }   System.out.println(count);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         jButton12.setBackground(Color.red);
        if(jButton12.isSelected()){
           jButton12.setBackground(Color.red);
       }else{
           jButton11.setBackground(Color.green);
           jButton10.setBackground(Color.red);
           jButton9.setBackground(Color.red);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btncontinuar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar3ActionPerformed
pregunta3.setVisible(false);        // TODO add your handling code here:
pregunta4.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      jButton14.setBackground(Color.red);
        if(jButton14.isSelected()){
           jButton14.setBackground(Color.red);
       }else{
           jButton16.setBackground(Color.green);
           jButton14.setBackground(Color.red);
           jButton15.setBackground(Color.red);
        
       }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       jButton14.setBackground(Color.red);
        if(jButton14.isSelected()){
           jButton14.setBackground(Color.red);
       }else{
           jButton13.setBackground(Color.red);
           jButton16.setBackground(Color.green);
           jButton15.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       jButton15.setBackground(Color.red);
        if(jButton15.isSelected()){
           jButton15.setBackground(Color.red);
       }else{
           jButton13.setBackground(Color.red);
           jButton14.setBackground(Color.red);
           jButton16.setBackground(Color.green);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
 jButton16.setBackground(Color.green);
        if(jButton16.getText().equals("4)> 46")){
           jButton16.setBackground(Color.green);
             count=count+1;
       }else{
           jButton13.setBackground(Color.red);
           jButton14.setBackground(Color.red);
           jButton15.setBackground(Color.red);
        
       }    System.out.println(count);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btncontinuar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar4ActionPerformed
pregunta4.setVisible(false);      // TODO add your handling code here:
pregunta5.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         jButton17.setBackground(Color.red);
        if(jButton17.isSelected()){
           jButton17.setBackground(Color.red);
       }else{
           jButton20.setBackground(Color.green);
           jButton18.setBackground(Color.red);
           jButton19.setBackground(Color.red);
        
       }  
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setBackground(Color.red);
        if(jButton18.isSelected()){
           jButton18.setBackground(Color.red);
       }else{
           jButton17.setBackground(Color.red);
           jButton20.setBackground(Color.green);
           jButton19.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
     jButton19.setBackground(Color.red);
        if(jButton19.isSelected()){
           jButton19.setBackground(Color.red);
       }else{
           jButton17.setBackground(Color.red);
           jButton18.setBackground(Color.red);
           jButton20.setBackground(Color.green);
        
       }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
     jButton20.setBackground(Color.green);
        if(jButton20.getText().equals("6/21")){
           jButton20.setBackground(Color.green);
           count=count+1;
       }else{
           jButton17.setBackground(Color.red);
           jButton18.setBackground(Color.red);
           jButton19.setBackground(Color.red);
        
       }     System.out.println(count);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void btncontinuar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar5ActionPerformed
pregunta5.setVisible(false);    
pregunta6.setVisible(true);        
    }//GEN-LAST:event_btncontinuar5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      jButton21.setBackground(Color.red);
        if(jButton21.isSelected()){
           jButton21.setBackground(Color.red);
       }else{
           jButton23.setBackground(Color.green);
           jButton22.setBackground(Color.red);
           jButton24.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setBackground(Color.red);
        if(jButton22.isSelected()){
           jButton22.setBackground(Color.red);
       }else{
           jButton21.setBackground(Color.red);
           jButton23.setBackground(Color.green);
           jButton24.setBackground(Color.red);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
jButton23.setBackground(Color.green);
        if(jButton23.getText().equals("18")){
           jButton23.setBackground(Color.green);
            count=count+1;
       }else{
           jButton21.setBackground(Color.red);
           jButton22.setBackground(Color.red);
           jButton24.setBackground(Color.red);
        
       }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
     jButton24.setBackground(Color.red);
        if(jButton24.isSelected()){
           jButton24.setBackground(Color.red);
       }else{
           jButton21.setBackground(Color.red);
           jButton22.setBackground(Color.red);
           jButton23.setBackground(Color.green);
        
       }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void btncontinuar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar6ActionPerformed
pregunta6.setVisible(false);        // TODO add your handling code here:
pregunta7.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar6ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
      jButton25.setBackground(Color.red);
        if(jButton25.isSelected()){
           jButton25.setBackground(Color.red);
       }else{
           jButton28.setBackground(Color.green);
           jButton26.setBackground(Color.red);
           jButton27.setBackground(Color.red);
        
       }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
      jButton26.setBackground(Color.red);
        if(jButton26.isSelected()){
           jButton26.setBackground(Color.red);
       }else{
           jButton25.setBackground(Color.red);
           jButton28.setBackground(Color.green);
           jButton27.setBackground(Color.red);
        
       }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       jButton27.setBackground(Color.red);
        if(jButton27.isSelected()){
           jButton27.setBackground(Color.red);
       }else{
           jButton25.setBackground(Color.red);
           jButton26.setBackground(Color.red);
           jButton28.setBackground(Color.green);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
jButton28.setBackground(Color.green);
        if(jButton28.getText().equals("81")){
           jButton28.setBackground(Color.green);
            count=count+1;
       }else{
           jButton25.setBackground(Color.red);
           jButton26.setBackground(Color.red);
           jButton27.setBackground(Color.red);
        
       }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void btncontinuar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar7ActionPerformed
pregunta7.setVisible(false);        // TODO add your handling code here:
pregunta8.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar7ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
      jButton29.setBackground(Color.red);
        if(jButton29.isSelected()){
           jButton29.setBackground(Color.red);
       }else{
           jButton30.setBackground(Color.green);
           jButton31.setBackground(Color.red);
           jButton32.setBackground(Color.red);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
jButton30.setBackground(Color.green);
        if(jButton30.getText().equals("20")){
           jButton30.setBackground(Color.green);
           count=count+1;
       }else{
           jButton29.setBackground(Color.red);
           jButton31.setBackground(Color.red);
           jButton32.setBackground(Color.red);
        
       }     
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
       jButton31.setBackground(Color.red);
        if(jButton31.isSelected()){
           jButton31.setBackground(Color.red);
       }else{
           jButton30.setBackground(Color.red);
           jButton31.setBackground(Color.green);
           jButton32.setBackground(Color.red);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jButton32.setBackground(Color.red);
        if(jButton32.isSelected()){
           jButton32.setBackground(Color.red);
       }else{
           jButton30.setBackground(Color.red);
           jButton31.setBackground(Color.red);
           jButton29.setBackground(Color.green);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void btncontinuar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar8ActionPerformed
pregunta8.setVisible(false);        // TODO add your handling code here:
pregunta9.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar8ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
       jButton33.setBackground(Color.red);
        if(jButton33.isSelected()){
           jButton33.setBackground(Color.red);
       }else{
           jButton35.setBackground(Color.green);
           jButton34.setBackground(Color.red);
           jButton36.setBackground(Color.red);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
       jButton34.setBackground(Color.red);
        if(jButton34.isSelected()){
           jButton34.setBackground(Color.red);
       }else{
           jButton33.setBackground(Color.red);
           jButton35.setBackground(Color.green);
           jButton36.setBackground(Color.red);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
  jButton35.setBackground(Color.green);
        if(jButton35.getText().equals("42")){
           jButton35.setBackground(Color.green);
           count=count+1;
       }else{
           jButton33.setBackground(Color.red);
           jButton34.setBackground(Color.red);
           jButton36.setBackground(Color.red);
        
       }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
      jButton36.setBackground(Color.red);
        if(jButton36.isSelected()){
           jButton36.setBackground(Color.red);
       }else{
           jButton33.setBackground(Color.red);
           jButton34.setBackground(Color.red);
           jButton35.setBackground(Color.green);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void btncontinuar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar9ActionPerformed
pregunta9.setVisible(false);        // TODO add your handling code here:
pregunta10.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar9ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
       jButton37.setBackground(Color.green);
        if(jButton37.getText().equals("3")){
           jButton37.setBackground(Color.green);
           count=count+1;
       }else{
           jButton38.setBackground(Color.red);
           jButton39.setBackground(Color.red);
           jButton40.setBackground(Color.red);
        
       
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jButton38.setBackground(Color.red);
        if(jButton38.isSelected()){
           jButton38.setBackground(Color.red);
       }else{
           jButton37.setBackground(Color.green);
           jButton39.setBackground(Color.red);
           jButton40.setBackground(Color.red);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
         jButton39.setBackground(Color.red);
        if(jButton39.isSelected()){
           jButton39.setBackground(Color.red);
       }else{
           jButton37.setBackground(Color.green);
           jButton38.setBackground(Color.red);
           jButton40.setBackground(Color.red);
        
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jButton40.setBackground(Color.red);
        if(jButton40.isSelected()){
           jButton40.setBackground(Color.red);
       }else{
           jButton37.setBackground(Color.green);
           jButton39.setBackground(Color.red);
           jButton38.setBackground(Color.red);
        
       }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed


    private void btbverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbverificarActionPerformed
JOptionPane.showMessageDialog(null, "Su calificacion es:"+count);       // TODO add your handling code here:
    }//GEN-LAST:event_btbverificarActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
     jButton41.setBackground(Color.red);
        if(jButton41.isSelected()){
           jButton41.setBackground(Color.red);
       }else{
           jButton43.setBackground(Color.green);
           jButton42.setBackground(Color.red);
           jButton44.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
       jButton42.setBackground(Color.red);
        if(jButton42.isSelected()){
           jButton42.setBackground(Color.red);
       }else{
           jButton41.setBackground(Color.red);
           jButton43.setBackground(Color.green);
           jButton44.setBackground(Color.red); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
  jButton43.setBackground(Color.green);
        if(jButton43.getText().equals("La música es el centro de la vida")){
            count=count+1;
           jButton43.setBackground(Color.green);
       }else{
           jButton41.setBackground(Color.red);
           jButton42.setBackground(Color.red);
           jButton44.setBackground(Color.red); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
      jButton44.setBackground(Color.red);
        if(jButton44.isSelected()){
           jButton44.setBackground(Color.red);
       }else{
           jButton41.setBackground(Color.red);
           jButton42.setBackground(Color.red);
           jButton43.setBackground(Color.green); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void btncontinuar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar10ActionPerformed
pregunta1L.setVisible(false);        // TODO add your handling code here:
pregunta2L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar10ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
       jButton45.setBackground(Color.red);
        if(jButton45.isSelected()){
           jButton45.setBackground(Color.red);
       }else{
           jButton47.setBackground(Color.green);
           jButton46.setBackground(Color.red);
           jButton48.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jButton46.setBackground(Color.red);
        if(jButton46.isSelected()){
           jButton46.setBackground(Color.red);
       }else{
           jButton45.setBackground(Color.red);
           jButton47.setBackground(Color.green);
           jButton48.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
 jButton47.setBackground(Color.green);
        if(jButton47.getText().equals("Es conveniente concentrarse en el futuro antes que en el pasado")){
            count=count+1;
           jButton47.setBackground(Color.green);
       }else{
           jButton45.setBackground(Color.red);
           jButton46.setBackground(Color.red);
           jButton48.setBackground(Color.red); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
       jButton48.setBackground(Color.red);
        if(jButton48.isSelected()){
           jButton48.setBackground(Color.red);
       }else{
           jButton45.setBackground(Color.red);
           jButton46.setBackground(Color.red);
           jButton47.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void btncontinuar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar11ActionPerformed
pregunta2L.setVisible(false);        // TODO add your handling code here:
pregunta3L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar11ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
       jButton49.setBackground(Color.red);
        if(jButton49.isSelected()){
           jButton49.setBackground(Color.red);
       }else{
           jButton50.setBackground(Color.green);
           jButton51.setBackground(Color.red);
           jButton52.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
jButton50.setBackground(Color.green);
        if(jButton50.getText().equals("Felipe")){
            count=count+1;
           jButton50.setBackground(Color.green);
       }else{
           jButton49.setBackground(Color.red);
           jButton51.setBackground(Color.red);
           jButton52.setBackground(Color.red); 
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
     jButton51.setBackground(Color.red);
        if(jButton51.isSelected()){
           jButton51.setBackground(Color.red);
       }else{
           jButton49.setBackground(Color.red);
           jButton50.setBackground(Color.green);
           jButton52.setBackground(Color.red); 
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
     jButton52.setBackground(Color.red);
        if(jButton52.isSelected()){
           jButton52.setBackground(Color.red);
       }else{
           jButton49.setBackground(Color.red);
           jButton51.setBackground(Color.red);
           jButton50.setBackground(Color.green); 
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void btncontinuar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar12ActionPerformed
pregunta5L.setVisible(false);        // TODO add your handling code here:
pregunta6L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar12ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
      jButton53.setBackground(Color.red);
        if(jButton53.isSelected()){
           jButton53.setBackground(Color.red);
       }else{
           jButton54.setBackground(Color.green);
           jButton55.setBackground(Color.red);
           jButton56.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
 jButton54.setBackground(Color.green);
        if(jButton54.getText().equals("Manifestar o dejar traslucir una cualidad o sentimiento")){
            count=count+1;
           jButton54.setBackground(Color.green);
       }else{
           jButton53.setBackground(Color.red);
           jButton55.setBackground(Color.red);
           jButton56.setBackground(Color.red); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
     jButton55.setBackground(Color.red);
        if(jButton55.isSelected()){
           jButton55.setBackground(Color.red);
       }else{
           jButton53.setBackground(Color.red);
           jButton54.setBackground(Color.green);
           jButton56.setBackground(Color.red); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
     jButton56.setBackground(Color.red);
        if(jButton56.isSelected()){
           jButton56.setBackground(Color.red);
       }else{
           jButton53.setBackground(Color.red);
           jButton55.setBackground(Color.red);
           jButton54.setBackground(Color.green); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void btncontinuar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar13ActionPerformed
pregunta3L.setVisible(false);        // TODO add your handling code here:
pregunta4L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar13ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
     jButton57.setBackground(Color.red);
        if(jButton57.isSelected()){
           jButton57.setBackground(Color.red);
       }else{
           jButton60.setBackground(Color.green);
           jButton58.setBackground(Color.red);
           jButton59.setBackground(Color.red); 
        }  
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
    jButton58.setBackground(Color.red);
        if(jButton58.isSelected()){
           jButton58.setBackground(Color.red);
       }else{
           jButton57.setBackground(Color.red);
           jButton60.setBackground(Color.green);
           jButton59.setBackground(Color.red); 
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
       jButton59.setBackground(Color.red);
        if(jButton59.isSelected()){
           jButton59.setBackground(Color.red);
       }else{
           jButton57.setBackground(Color.red);
           jButton58.setBackground(Color.red);
           jButton60.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
jButton60.setBackground(Color.green);
        if(jButton60.getText().equals("Salvaje")){
            count=count+1;
           jButton60.setBackground(Color.green);
       }else{
           jButton57.setBackground(Color.red);
           jButton58.setBackground(Color.red);
           jButton59.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void btncontinuar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar14ActionPerformed
pregunta4L.setVisible(false);        // TODO add your handling code here:
pregunta5L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar14ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
       jButton61.setBackground(Color.red);
        if(jButton61.isSelected()){
           jButton61.setBackground(Color.red);
       }else{
           jButton62.setBackground(Color.green);
           jButton63.setBackground(Color.red);
           jButton64.setBackground(Color.red); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
jButton62.setBackground(Color.green);
        if(jButton62.getText().equals("1,4")){
            count=count+1;
           jButton62.setBackground(Color.green);
       }else{
           jButton61.setBackground(Color.red);
           jButton63.setBackground(Color.red);
           jButton64.setBackground(Color.red); 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
       jButton63.setBackground(Color.red);
        if(jButton63.isSelected()){
           jButton63.setBackground(Color.red);
       }else{
           jButton61.setBackground(Color.red);
           jButton62.setBackground(Color.green);
           jButton64.setBackground(Color.red); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
       jButton64.setBackground(Color.red);
        if(jButton64.isSelected()){
           jButton64.setBackground(Color.red);
       }else{
           jButton61.setBackground(Color.red);
           jButton63.setBackground(Color.red);
           jButton62.setBackground(Color.green); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void btncontinuar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar15ActionPerformed
pregunta6L.setVisible(false);        // TODO add your handling code here:
pregunta7L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar15ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
       jButton65.setBackground(Color.red);
        if(jButton65.isSelected()){
           jButton65.setBackground(Color.red);
       }else{
           jButton66.setBackground(Color.green);
           jButton67.setBackground(Color.red);
           jButton68.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
 jButton66.setBackground(Color.green);
        if(jButton66.getText().equals("Presentimiento")){
            count=count+1;
           jButton66.setBackground(Color.green);
       }else{
           jButton65.setBackground(Color.red);
           jButton67.setBackground(Color.red);
           jButton68.setBackground(Color.red); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
       jButton67.setBackground(Color.red);
        if(jButton67.isSelected()){
           jButton67.setBackground(Color.red);
       }else{
           jButton65.setBackground(Color.red);
           jButton66.setBackground(Color.green);
           jButton68.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
     jButton68.setBackground(Color.red);
        if(jButton68.isSelected()){
           jButton68.setBackground(Color.red);
       }else{
           jButton65.setBackground(Color.red);
           jButton67.setBackground(Color.red);
           jButton66.setBackground(Color.green); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void btncontinuar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar16ActionPerformed
pregunta7L.setVisible(false);        // TODO add your handling code here:
pregunta8L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar16ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
      jButton69.setBackground(Color.red);
        if(jButton69.isSelected()){
           jButton69.setBackground(Color.red);
       }else{
           jButton71.setBackground(Color.green);
           jButton70.setBackground(Color.red);
           jButton72.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
       jButton70.setBackground(Color.red);
        if(jButton70.isSelected()){
           jButton70.setBackground(Color.red);
       }else{
           jButton69.setBackground(Color.red);
           jButton71.setBackground(Color.green);
           jButton72.setBackground(Color.red); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
 jButton71.setBackground(Color.green);
        if(jButton71.getText().equals("el sueño, el anhelo y el vuelo imaginario es descartado por los pragmáticos ")){
            count=count+1;
           jButton71.setBackground(Color.green);
       }else{
           jButton69.setBackground(Color.red);
           jButton70.setBackground(Color.red);
           jButton72.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
     jButton72.setBackground(Color.red);
        if(jButton72.isSelected()){
           jButton72.setBackground(Color.red);
       }else{
           jButton69.setBackground(Color.red);
           jButton70.setBackground(Color.red);
           jButton71.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton72ActionPerformed

    private void btncontinuar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar17ActionPerformed
pregunta8L.setVisible(false);        // TODO add your handling code here:
pregunta9L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar17ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
     jButton73.setBackground(Color.red);
        if(jButton73.isSelected()){
           jButton73.setBackground(Color.red);
       }else{
           jButton75.setBackground(Color.green);
           jButton74.setBackground(Color.red);
           jButton76.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
       jButton74.setBackground(Color.red);
        if(jButton74.isSelected()){
           jButton74.setBackground(Color.red);
       }else{
           jButton73.setBackground(Color.red);
           jButton75.setBackground(Color.green);
           jButton76.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
  jButton75.setBackground(Color.green);
        if(jButton75.getText().equals("Biblioteca")){
            count=count+1;
           jButton75.setBackground(Color.green);
       }else{
           jButton73.setBackground(Color.red);
           jButton74.setBackground(Color.red);
           jButton76.setBackground(Color.red); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
     jButton76.setBackground(Color.red);
        if(jButton76.isSelected()){
           jButton76.setBackground(Color.red);
       }else{
           jButton73.setBackground(Color.red);
           jButton74.setBackground(Color.red);
           jButton75.setBackground(Color.green); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void btncontinuar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar18ActionPerformed
pregunta9L.setVisible(false);        // TODO add your handling code here:
pregunta10L.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar18ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        jButton77.setBackground(Color.red);
        if(jButton77.isSelected()){
           jButton77.setBackground(Color.red);
       }else{
           jButton78.setBackground(Color.green);
           jButton79.setBackground(Color.red);
           jButton80.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
 jButton78.setBackground(Color.green);
        if(jButton78.getText().equals("Inusitado"))
        {
            count=count+1;
           jButton78.setBackground(Color.green);
       }else{
           jButton77.setBackground(Color.red);
           jButton79.setBackground(Color.red);
           jButton80.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        jButton79.setBackground(Color.red);
        if(jButton79.isSelected()){
           jButton79.setBackground(Color.red);
       }else{
           jButton77.setBackground(Color.red);
           jButton78.setBackground(Color.green);
           jButton80.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
       jButton80.setBackground(Color.red);
        if(jButton80.isSelected()){
           jButton80.setBackground(Color.red);
       }else{
           jButton77.setBackground(Color.red);
           jButton79.setBackground(Color.red);
           jButton78.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        jButton81.setBackground(Color.green);
        if(jButton81.getText().equals("Cono Sur")){
            count=count+1;
           jButton81.setBackground(Color.green);
       }else{
           jButton82.setBackground(Color.red);
           jButton83.setBackground(Color.red);
           jButton84.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
       jButton82.setBackground(Color.red);
        if(jButton82.isSelected()){
           jButton82.setBackground(Color.red);
       }else{
           jButton81.setBackground(Color.green);
           jButton83.setBackground(Color.red);
           jButton84.setBackground(Color.red); 
        }   // TODO add your handling code gree:
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
       jButton83.setBackground(Color.green);
        if(jButton83.isSelected()){
           jButton83.setBackground(Color.green);
       }else{
           jButton82.setBackground(Color.red);
           jButton81.setBackground(Color.red);
           jButton84.setBackground(Color.red); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        jButton84.setBackground(Color.green);
        if(jButton84.isSelected()){
           jButton84.setBackground(Color.green);
       }else{
           jButton82.setBackground(Color.red);
           jButton83.setBackground(Color.red);
           jButton81.setBackground(Color.red); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton84ActionPerformed

    private void btncontinuar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar20ActionPerformed
pregunta1H.setVisible(false);        // TODO add your handling code here:
pregunta2H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar20ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
       jButton85.setBackground(Color.red);
        if(jButton85.isSelected()){
           jButton85.setBackground(Color.red);
       }else{
           jButton86.setBackground(Color.green);
           jButton87.setBackground(Color.red);
           jButton88.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
 jButton86.setBackground(Color.green);
        if(jButton86.getText().equals("comunidad - conjunto - hábitat")){
            count=count+1;
           jButton86.setBackground(Color.green);
       }else{
           jButton85.setBackground(Color.red);
           jButton87.setBackground(Color.red);
           jButton88.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
     jButton87.setBackground(Color.red);
        if(jButton87.isSelected()){
           jButton87.setBackground(Color.red);
       }else{
           jButton85.setBackground(Color.red);
           jButton86.setBackground(Color.green);
           jButton88.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
       jButton88.setBackground(Color.red);
        if(jButton88.isSelected()){
           jButton88.setBackground(Color.red);
       }else{
           jButton85.setBackground(Color.red);
           jButton87.setBackground(Color.red);
           jButton86.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton88ActionPerformed

    private void btncontinuar21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar21ActionPerformed
pregunta2H.setVisible(false);
pregunta3H.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar21ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
         jButton89.setBackground(Color.red);
        if(jButton89.isSelected()){
           jButton89.setBackground(Color.red);
       }else{
           jButton90.setBackground(Color.green);
           jButton91.setBackground(Color.red);
           jButton92.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
  jButton90.setBackground(Color.green);
        if(jButton90.getText().equals("1,4")){
            count=count+1;
           jButton90.setBackground(Color.green);
       }else{
           jButton89.setBackground(Color.red);
           jButton91.setBackground(Color.red);
           jButton92.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
       jButton91.setBackground(Color.red);
        if(jButton91.isSelected()){
           jButton91.setBackground(Color.red);
       }else{
           jButton89.setBackground(Color.red);
           jButton90.setBackground(Color.green);
           jButton92.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        jButton92.setBackground(Color.red);
        if(jButton92.isSelected()){
           jButton92.setBackground(Color.red);
       }else{
           jButton89.setBackground(Color.red);
           jButton91.setBackground(Color.red);
           jButton90.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton92ActionPerformed

    private void btncontinuar22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar22ActionPerformed
pregunta3H.setVisible(false);        // TODO add your handling code here:
pregunta4H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar22ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
     jButton93.setBackground(Color.red);
        if(jButton93.isSelected()){
           jButton93.setBackground(Color.red);
       }else{
           jButton94.setBackground(Color.green);
           jButton95.setBackground(Color.red);
           jButton96.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
 jButton94.setBackground(Color.green);
        if(jButton94.getText().equals("1,5")){
            count=count+1;
           jButton94.setBackground(Color.green);
       }else{
           jButton93.setBackground(Color.red);
           jButton95.setBackground(Color.red);
           jButton96.setBackground(Color.red); 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
       jButton95.setBackground(Color.red);
        if(jButton95.isSelected()){
           jButton95.setBackground(Color.red);
       }else{
           jButton93.setBackground(Color.red);
           jButton94.setBackground(Color.green);
           jButton96.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
      jButton96.setBackground(Color.red);
        if(jButton96.isSelected()){
           jButton96.setBackground(Color.red);
       }else{
           jButton93.setBackground(Color.red);
           jButton95.setBackground(Color.red);
           jButton94.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton96ActionPerformed

    private void btncontinuar23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar23ActionPerformed
pregunta4H.setVisible(false);        // TODO add your handling code here:
pregunta5H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar23ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
     jButton97.setBackground(Color.green);
        if(jButton97.getText().equals("2,4")){
            count=count+1;
           jButton97.setBackground(Color.green);
       }else{
           jButton98.setBackground(Color.red);
           jButton99.setBackground(Color.red);
           jButton100.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
      jButton98.setBackground(Color.red);
        if(jButton98.isSelected()){
           jButton98.setBackground(Color.red);
       }else{
           jButton97.setBackground(Color.green);
           jButton99.setBackground(Color.red);
           jButton100.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
     jButton99.setBackground(Color.red);
        if(jButton99.isSelected()){
           jButton99.setBackground(Color.red);
       }else{
           jButton98.setBackground(Color.red);
           jButton97.setBackground(Color.green);
           jButton100.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
     jButton100.setBackground(Color.red);
        if(jButton100.isSelected()){
           jButton100.setBackground(Color.red);
       }else{
           jButton98.setBackground(Color.red);
           jButton99.setBackground(Color.red);
           jButton97.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton100ActionPerformed

    private void btncontinuar24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar24ActionPerformed
pregunta5H.setVisible(false);        // TODO add your handling code here:
pregunta6H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar24ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
       jButton101.setBackground(Color.red);
        if(jButton101.isSelected()){
           jButton101.setBackground(Color.red);
       }else{
           jButton102.setBackground(Color.green);
           jButton103.setBackground(Color.red);
           jButton104.setBackground(Color.red); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
jButton102.setBackground(Color.green);
        if(jButton102.getText().equals("1,4")){
            count=count+1;
           jButton102.setBackground(Color.green);
       }else{
           jButton101.setBackground(Color.red);
           jButton103.setBackground(Color.red);
           jButton104.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
      jButton103.setBackground(Color.red);
        if(jButton103.isSelected()){
           jButton103.setBackground(Color.red);
       }else{
           jButton101.setBackground(Color.red);
           jButton102.setBackground(Color.green);
           jButton104.setBackground(Color.red); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
     jButton104.setBackground(Color.red);
        if(jButton104.isSelected()){
           jButton104.setBackground(Color.red);
       }else{
           jButton101.setBackground(Color.red);
           jButton103.setBackground(Color.red);
           jButton102.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton104ActionPerformed

    private void btncontinuar25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar25ActionPerformed
pregunta6H.setVisible(false);        // TODO add your handling code here:
pregunta7H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar25ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
    jButton109.setBackground(Color.red);
        if(jButton109.isSelected()){
           jButton109.setBackground(Color.red);
       }else{
           jButton111.setBackground(Color.green);
           jButton110.setBackground(Color.red);
           jButton112.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
       jButton110.setBackground(Color.red);
        if(jButton110.isSelected()){
           jButton110.setBackground(Color.red);
       }else{
           jButton109.setBackground(Color.red);
           jButton111.setBackground(Color.green);
           jButton112.setBackground(Color.red); 
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
 jButton111.setBackground(Color.green);
        if(jButton111.getText().equals("Primera Guerra Mundial")){
            count=count+1;
           jButton111.setBackground(Color.green);
       }else{
           jButton109.setBackground(Color.red);
           jButton110.setBackground(Color.red);
           jButton112.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
       jButton112.setBackground(Color.red);
        if(jButton112.isSelected()){
           jButton112.setBackground(Color.red);
       }else{
           jButton109.setBackground(Color.red);
           jButton110.setBackground(Color.red);
           jButton111.setBackground(Color.green); 
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton112ActionPerformed

    private void btncontinuar27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar27ActionPerformed
pregunta8H.setVisible(false);        // TODO add your handling code here:
pregunta9H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar27ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
      jButton113.setBackground(Color.red);
        if(jButton113.isSelected()){
           jButton113.setBackground(Color.red);
       }else{
           jButton116.setBackground(Color.green);
           jButton114.setBackground(Color.red);
           jButton115.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
     jButton114.setBackground(Color.red);
        if(jButton114.isSelected()){
           jButton114.setBackground(Color.red);
       }else{
           jButton113.setBackground(Color.red);
           jButton116.setBackground(Color.green);
           jButton115.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
      jButton115.setBackground(Color.red);
        if(jButton115.isSelected()){
           jButton115.setBackground(Color.red);
       }else{
           jButton113.setBackground(Color.red);
           jButton114.setBackground(Color.red);
           jButton116.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
  jButton116.setBackground(Color.green);
        if(jButton116.getText().equals("expansión - industrialización - agroexportador")){
            count=count+1;
           jButton116.setBackground(Color.green);
       }else{
           jButton113.setBackground(Color.red);
           jButton114.setBackground(Color.red);
           jButton115.setBackground(Color.red); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton116ActionPerformed

    private void btncontinuar28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar28ActionPerformed
pregunta9H.setVisible(false);        // TODO add your handling code here:
pregunta10H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar28ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
      jButton117.setBackground(Color.red);
        if(jButton117.isSelected()){
           jButton117.setBackground(Color.red);
       }else{
           jButton118.setBackground(Color.green);
           jButton119.setBackground(Color.red);
           jButton120.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
jButton118.setBackground(Color.green);
        if(jButton118.getText().equals("1,4")){
            count=count+1;
           jButton118.setBackground(Color.green);
       }else{
           jButton117.setBackground(Color.red);
           jButton119.setBackground(Color.red);
           jButton120.setBackground(Color.red); 
        }         
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
     jButton119.setBackground(Color.red);
        if(jButton119.isSelected()){
           jButton119.setBackground(Color.red);
       }else{
           jButton117.setBackground(Color.red);
           jButton118.setBackground(Color.green);
           jButton120.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
       jButton120.setBackground(Color.red);
        if(jButton120.isSelected()){
           jButton120.setBackground(Color.red);
       }else{
           jButton117.setBackground(Color.red);
           jButton118.setBackground(Color.green);
           jButton119.setBackground(Color.red); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
      jButton121.setBackground(Color.red);
        if(jButton121.isSelected()){
           jButton121.setBackground(Color.red);
       }else{
           jButton124.setBackground(Color.green);
           jButton122.setBackground(Color.red);
           jButton123.setBackground(Color.red); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton121ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
       jButton122.setBackground(Color.red);
        if(jButton122.isSelected()){
           jButton122.setBackground(Color.red);
       }else{
           jButton121.setBackground(Color.red);
           jButton124.setBackground(Color.green);
           jButton123.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
      jButton123.setBackground(Color.red);
        if(jButton123.isSelected()){
           jButton123.setBackground(Color.red);
       }else{
           jButton121.setBackground(Color.red);
           jButton122.setBackground(Color.red);
           jButton124.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
 jButton124.setBackground(Color.green);
        if(jButton124.getText().equals("1,3")){
            count=count+1;
           jButton124.setBackground(Color.green);
       }else{
           jButton121.setBackground(Color.red);
           jButton122.setBackground(Color.red);
           jButton123.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton124ActionPerformed

    private void btncontinuar30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar30ActionPerformed
pregunta7H.setVisible(false);        // TODO add your handling code here:
pregunta8H.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar30ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
      jButton105.setBackground(Color.green);
        if(jButton105.getText().equals("1a, 2c, 3d, 4b")){
            count=count+1;
           jButton105.setBackground(Color.green);
       }else{
           jButton106.setBackground(Color.red);
           jButton107.setBackground(Color.red);
           jButton108.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
         jButton106.setBackground(Color.red);
        if(jButton106.isSelected()){
           jButton106.setBackground(Color.red);
       }else{
           jButton105.setBackground(Color.green);
           jButton107.setBackground(Color.red);
           jButton108.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
         jButton107.setBackground(Color.red);
        if(jButton107.isSelected()){
           jButton107.setBackground(Color.red);
       }else{
           jButton106.setBackground(Color.red);
           jButton105.setBackground(Color.green);
           jButton108.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
         jButton108.setBackground(Color.red);
        if(jButton108.isSelected()){
           jButton108.setBackground(Color.red);
       }else{
           jButton106.setBackground(Color.red);
           jButton107.setBackground(Color.red);
           jButton105.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton108ActionPerformed

    private void btncontinuar26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar26ActionPerformed
pregunta1C.setVisible(false);        // TODO add your handling code here:
pregunta2C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar26ActionPerformed

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton125ActionPerformed
       jButton125.setBackground(Color.red);
        if(jButton125.isSelected()){
           jButton125.setBackground(Color.red);
       }else{
           jButton128.setBackground(Color.green);
           jButton126.setBackground(Color.red);
           jButton127.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton125ActionPerformed

    private void jButton126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton126ActionPerformed
      jButton126.setBackground(Color.red);
        if(jButton126.isSelected()){
           jButton126.setBackground(Color.red);
       }else{
           jButton125.setBackground(Color.red);
           jButton128.setBackground(Color.green);
           jButton127.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton126ActionPerformed

    private void jButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton127ActionPerformed
      jButton127.setBackground(Color.red);
        if(jButton127.isSelected()){
           jButton127.setBackground(Color.red);
       }else{
           jButton125.setBackground(Color.red);
           jButton126.setBackground(Color.red);
           jButton128.setBackground(Color.green); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton127ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
  jButton128.setBackground(Color.green);
        if(jButton128.getText().equals("Permanecen muy juntas y se ordenan")){
            count=count+1;
           jButton128.setBackground(Color.green);
       }else{
           jButton125.setBackground(Color.red);
           jButton126.setBackground(Color.red);
           jButton127.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton128ActionPerformed

    private void btncontinuar31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar31ActionPerformed
pregunta2C.setVisible(false);        // TODO add your handling code here:
pregunta3C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar31ActionPerformed

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton129ActionPerformed
      jButton129.setBackground(Color.red);
        if(jButton129.isSelected()){
           jButton129.setBackground(Color.red);
       }else{
           jButton132.setBackground(Color.green);
           jButton130.setBackground(Color.red);
           jButton131.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton129ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
jButton130.setBackground(Color.red);
        if(jButton130.isSelected()){
           jButton130.setBackground(Color.red);
       }else{
           jButton129.setBackground(Color.red);
           jButton132.setBackground(Color.green);
           jButton131.setBackground(Color.red); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton130ActionPerformed

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton131ActionPerformed
      jButton131.setBackground(Color.red);
        if(jButton131.isSelected()){
           jButton131.setBackground(Color.red);
       }else{
           jButton129.setBackground(Color.red);
           jButton130.setBackground(Color.red);
           jButton132.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton131ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
jButton132.setBackground(Color.green);
        if(jButton132.getText().equals("Efecto invernadero")){
            count=count+1;
            
           jButton132.setBackground(Color.green);
       }else{
           jButton129.setBackground(Color.red);
           jButton130.setBackground(Color.red);
           jButton131.setBackground(Color.red); 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton132ActionPerformed

    private void btncontinuar32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar32ActionPerformed
pregunta3C.setVisible(false);        // TODO add your handling code here:
pregunta4C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar32ActionPerformed

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton133ActionPerformed
      jButton133.setBackground(Color.green);
        if(jButton133.getText().equals("Oxidacion")){
            count=count+1;
           jButton133.setBackground(Color.green);
       }else{
           jButton34.setBackground(Color.red);
           jButton135.setBackground(Color.red);
           jButton136.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton133ActionPerformed

    private void jButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton134ActionPerformed
         jButton134.setBackground(Color.red);
        if(jButton134.isSelected()){
           jButton134.setBackground(Color.red);
       }else{
           jButton133.setBackground(Color.green);
           jButton135.setBackground(Color.red);
           jButton136.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton134ActionPerformed

    private void jButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton135ActionPerformed
        jButton135.setBackground(Color.red);
        if(jButton135.isSelected()){
           jButton135.setBackground(Color.red);
       }else{
           jButton133.setBackground(Color.red);
           jButton133.setBackground(Color.green);
           jButton136.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton135ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
         jButton136.setBackground(Color.red);
        if(jButton136.isSelected()){
           jButton136.setBackground(Color.red);
       }else{
           jButton133.setBackground(Color.red);
           jButton135.setBackground(Color.red);
           jButton132.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton136ActionPerformed

    private void btncontinuar33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar33ActionPerformed
pregunta4C.setVisible(false);        // TODO add your handling code here:
pregunta5C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar33ActionPerformed

    private void jButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton137ActionPerformed
     jButton137.setBackground(Color.red);
        if(jButton137.isSelected()){
           jButton137.setBackground(Color.red);
       }else{
           jButton140.setBackground(Color.green);
           jButton138.setBackground(Color.red);
           jButton139.setBackground(Color.red); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton137ActionPerformed

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed
        jButton138.setBackground(Color.red);
        if(jButton138.isSelected()){
           jButton138.setBackground(Color.red);
       }else{
           jButton137.setBackground(Color.red);
           jButton140.setBackground(Color.green);
           jButton139.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        jButton139.setBackground(Color.red);
        if(jButton139.isSelected()){
           jButton139.setBackground(Color.red);
       }else{
           jButton137.setBackground(Color.red);
           jButton138.setBackground(Color.red);
           jButton140.setBackground(Color.green); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton140ActionPerformed
    jButton140.setBackground(Color.green);
        if(jButton140.getText().equals("El cuerpo genera anticuerpos que matan a este tipo de virus antes de que sigan  multiplicándose ")){
            count=count+1;
           jButton140.setBackground(Color.green);
       }else{
           jButton137.setBackground(Color.red);
           jButton138.setBackground(Color.red);
           jButton139.setBackground(Color.red); 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton140ActionPerformed

    private void btncontinuar34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar34ActionPerformed
pregunta5C.setVisible(false);        // TODO add your handling code here:
pregunta6C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar34ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
     jButton141.setBackground(Color.red);
        if(jButton141.isSelected()){
           jButton141.setBackground(Color.red);
       }else{
           jButton142.setBackground(Color.green);
           jButton143.setBackground(Color.red);
           jButton144.setBackground(Color.red); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton141ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
jButton142.setBackground(Color.green);
        if(jButton142.getText().equals("2)	Nuclear fuerte")){
            count=count+1;
           jButton142.setBackground(Color.green);
       }else{
           jButton141.setBackground(Color.red);
           jButton143.setBackground(Color.red);
           jButton144.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton143ActionPerformed
      jButton143.setBackground(Color.red);
        if(jButton143.isSelected()){
           jButton143.setBackground(Color.red);
       }else{
           jButton141.setBackground(Color.red);
           jButton142.setBackground(Color.green);
           jButton144.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton143ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
     jButton144.setBackground(Color.red);
        if(jButton144.isSelected()){
           jButton144.setBackground(Color.red);
       }else{
           jButton141.setBackground(Color.red);
           jButton143.setBackground(Color.red);
           jButton142.setBackground(Color.green); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton144ActionPerformed

    private void btncontinuar35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar35ActionPerformed
pregunta6C.setVisible(false);        // TODO add your handling code here:
pregunta7C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar35ActionPerformed

    private void jButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton145ActionPerformed
         jButton145.setBackground(Color.green);
        if(jButton145.getText().equals("1)	mareas altas en el mar")){
            count=count+1;
           jButton145.setBackground(Color.green);
       }else{
           jButton146.setBackground(Color.red);
           jButton147.setBackground(Color.red);
           jButton148.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton145ActionPerformed

    private void jButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton146ActionPerformed
         jButton146.setBackground(Color.red);
        if(jButton146.isSelected()){
           jButton146.setBackground(Color.red);
       }else{
           jButton145.setBackground(Color.green);
           jButton147.setBackground(Color.red);
           jButton148.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton146ActionPerformed

    private void jButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton147ActionPerformed
         jButton147.setBackground(Color.red);
        if(jButton147.isSelected()){
           jButton147.setBackground(Color.red);
       }else{
           jButton146.setBackground(Color.red);
           jButton145.setBackground(Color.green);
           jButton148.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton147ActionPerformed

    private void jButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton148ActionPerformed
          jButton148.setBackground(Color.red);
        if(jButton148.isSelected()){
           jButton148.setBackground(Color.red);
       }else{
           jButton146.setBackground(Color.red);
           jButton147.setBackground(Color.red);
           jButton145.setBackground(Color.green); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton148ActionPerformed

    private void btncontinuar36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar36ActionPerformed
pregunta7C.setVisible(false);        // TODO add your handling code here:
pregunta8C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar36ActionPerformed

    private void jButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton149ActionPerformed
      jButton149.setBackground(Color.red);
        if(jButton149.isSelected()){
           jButton149.setBackground(Color.red);
       }else{
           jButton152.setBackground(Color.green);
           jButton150.setBackground(Color.red);
           jButton151.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton149ActionPerformed

    private void jButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton150ActionPerformed
      jButton150.setBackground(Color.red);
        if(jButton150.isSelected()){
           jButton150.setBackground(Color.red);
       }else{
           jButton149.setBackground(Color.red);
           jButton152.setBackground(Color.green);
           jButton151.setBackground(Color.red); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton150ActionPerformed

    private void jButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton151ActionPerformed
      jButton151.setBackground(Color.red);
        if(jButton151.isSelected()){
           jButton151.setBackground(Color.red);
       }else{
           jButton149.setBackground(Color.red);
           jButton150.setBackground(Color.red);
           jButton152.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton151ActionPerformed

    private void jButton152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton152ActionPerformed
jButton152.setBackground(Color.green);
        if(jButton152.getText().equals("4)	promover la fragmentación de hábitats")){
            count=count+1;
           jButton152.setBackground(Color.green);
       }else{
           jButton149.setBackground(Color.red);
           jButton150.setBackground(Color.red);
           jButton151.setBackground(Color.red); 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton152ActionPerformed

    private void btncontinuar37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar37ActionPerformed
pregunta8C.setVisible(false);        // TODO add your handling code here:
pregunta9C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar37ActionPerformed

    private void jButton153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton153ActionPerformed
       jButton153.setBackground(Color.red);
        if(jButton153.isSelected()){
           jButton153.setBackground(Color.red);
       }else{
           jButton155.setBackground(Color.green);
           jButton154.setBackground(Color.red);
           jButton156.setBackground(Color.red); 
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton153ActionPerformed

    private void jButton154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton154ActionPerformed
      jButton154.setBackground(Color.red);
        if(jButton154.isSelected()){
           jButton154.setBackground(Color.red);
       }else{
           jButton153.setBackground(Color.red);
           jButton155.setBackground(Color.green);
           jButton156.setBackground(Color.red); 
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton154ActionPerformed

    private void jButton155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton155ActionPerformed
jButton155.setBackground(Color.green);
        if(jButton155.getText().equals("2,3")){
            count=count+1;
           jButton155.setBackground(Color.green);
       }else{
           jButton153.setBackground(Color.red);
           jButton154.setBackground(Color.red);
           jButton156.setBackground(Color.red); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton155ActionPerformed

    private void jButton156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton156ActionPerformed
     jButton156.setBackground(Color.red);
        if(jButton156.isSelected()){
           jButton156.setBackground(Color.red);
       }else{
           jButton153.setBackground(Color.red);
           jButton154.setBackground(Color.red);
           jButton155.setBackground(Color.green); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton156ActionPerformed

    private void btncontinuar38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuar38ActionPerformed
pregunta9C.setVisible(false);        // TODO add your handling code here:
pregunta10C.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinuar38ActionPerformed

    private void jButton157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton157ActionPerformed
       jButton157.setBackground(Color.green);
        if(jButton157.getText().equals("epidermis")){
            count=count+1;
           jButton157.setBackground(Color.green);
       }else{
           jButton158.setBackground(Color.red);
           jButton159.setBackground(Color.red);
           jButton160.setBackground(Color.red); 
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton157ActionPerformed

    private void jButton158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton158ActionPerformed
        jButton158.setBackground(Color.red);
        if(jButton158.isSelected()){
           jButton158.setBackground(Color.red);
       }else{
           jButton157.setBackground(Color.green);
           jButton159.setBackground(Color.red);
           jButton160.setBackground(Color.red); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton158ActionPerformed

    private void jButton159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton159ActionPerformed
        jButton159.setBackground(Color.red);
        if(jButton159.isSelected()){
           jButton159.setBackground(Color.red);
       }else{
           jButton158.setBackground(Color.red);
           jButton157.setBackground(Color.green);
           jButton160.setBackground(Color.red); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton159ActionPerformed

    private void jButton160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton160ActionPerformed
        jButton160.setBackground(Color.red);
        if(jButton160.isSelected()){
           jButton160.setBackground(Color.red);
       }else{
           jButton158.setBackground(Color.red);
           jButton159.setBackground(Color.red);
           jButton157.setBackground(Color.green); 
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton160ActionPerformed

    private void btbverificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbverificar2ActionPerformed
JOptionPane.showMessageDialog(null, "Su calificacion es:"+count);          // TODO add your handling code here:
    }//GEN-LAST:event_btbverificar2ActionPerformed

    private void btbverificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbverificar1ActionPerformed
JOptionPane.showMessageDialog(null, "Su calificacion es:"+count);          // TODO add your handling code here:
    }//GEN-LAST:event_btbverificar1ActionPerformed

    private void btbverificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbverificar3ActionPerformed
JOptionPane.showMessageDialog(null, "Su calificacion es:"+count);          // TODO add your handling code here:
    }//GEN-LAST:event_btbverificar3ActionPerformed

    public void llenarmate(preguntas p, respuestas r){
    ObjectSet resul=BASE.get(p);
    ObjectSet resul1=BASE.get(r);
 
    
    }
    
     public void llenarlengua(preguntas p, respuestas r){
    ObjectSet resul=BASE.get(p);
    ObjectSet resul1=BASE.get(r);

    
    }
    
    
    public boolean seleccioncorrecta(String ob, respuestas r){
    if(ob.equalsIgnoreCase(r.getRes_correcta()))
    {
    return true;
    }else{
    return false;}
    }
    
    public boolean validar(){
    if(txtcodigopregunta.getText().length()>0&&txtcorrecta.getText().length()>0&&txtincorrecta1.getText().length()>0&&txtincorrecta2.getText().length()>0&&txtincorrecta3.getText().length()>0&&txtingresarpregunta.getText().length()>0){
    return true;}else{
            return false;}
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbciencias;
    private javax.swing.JButton btbhistoria;
    private javax.swing.JButton btblenguaje;
    private javax.swing.JButton btbmatematicas;
    private javax.swing.JButton btbregrear1;
    private javax.swing.JButton btbregresar;
    private javax.swing.JButton btbregresar4;
    private javax.swing.JButton btbregrsar2;
    private javax.swing.JButton btbsalir;
    private javax.swing.JButton btbverificar;
    private javax.swing.JButton btbverificar1;
    private javax.swing.JButton btbverificar2;
    private javax.swing.JButton btbverificar3;
    private javax.swing.JButton btnagregpregunta;
    private javax.swing.JButton btncontinuar1;
    private javax.swing.JButton btncontinuar10;
    private javax.swing.JButton btncontinuar11;
    private javax.swing.JButton btncontinuar12;
    private javax.swing.JButton btncontinuar13;
    private javax.swing.JButton btncontinuar14;
    private javax.swing.JButton btncontinuar15;
    private javax.swing.JButton btncontinuar16;
    private javax.swing.JButton btncontinuar17;
    private javax.swing.JButton btncontinuar18;
    private javax.swing.JButton btncontinuar2;
    private javax.swing.JButton btncontinuar20;
    private javax.swing.JButton btncontinuar21;
    private javax.swing.JButton btncontinuar22;
    private javax.swing.JButton btncontinuar23;
    private javax.swing.JButton btncontinuar24;
    private javax.swing.JButton btncontinuar25;
    private javax.swing.JButton btncontinuar26;
    private javax.swing.JButton btncontinuar27;
    private javax.swing.JButton btncontinuar28;
    private javax.swing.JButton btncontinuar3;
    private javax.swing.JButton btncontinuar30;
    private javax.swing.JButton btncontinuar31;
    private javax.swing.JButton btncontinuar32;
    private javax.swing.JButton btncontinuar33;
    private javax.swing.JButton btncontinuar34;
    private javax.swing.JButton btncontinuar35;
    private javax.swing.JButton btncontinuar36;
    private javax.swing.JButton btncontinuar37;
    private javax.swing.JButton btncontinuar38;
    private javax.swing.JButton btncontinuar4;
    private javax.swing.JButton btncontinuar5;
    private javax.swing.JButton btncontinuar6;
    private javax.swing.JButton btncontinuar7;
    private javax.swing.JButton btncontinuar8;
    private javax.swing.JButton btncontinuar9;
    private javax.swing.JButton btnguardarp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combomaterias;
    private javax.swing.JPanel interfaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton159;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea33;
    private javax.swing.JTextArea jTextArea34;
    private javax.swing.JTextArea jTextArea35;
    private javax.swing.JTextArea jTextArea36;
    private javax.swing.JTextArea jTextArea37;
    private javax.swing.JTextArea jTextArea38;
    private javax.swing.JTextArea jTextArea39;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea40;
    private javax.swing.JTextArea jTextArea41;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel panelciencias;
    private javax.swing.JPanel panelcrear;
    private javax.swing.JPanel panelhistoria;
    private javax.swing.JPanel panellenguaje;
    private javax.swing.JPanel panelmatematicas;
    private javax.swing.JPanel pregunta1;
    private javax.swing.JPanel pregunta10;
    private javax.swing.JPanel pregunta10C;
    private javax.swing.JPanel pregunta10H;
    private javax.swing.JPanel pregunta10L;
    private javax.swing.JPanel pregunta1C;
    private javax.swing.JPanel pregunta1H;
    private javax.swing.JPanel pregunta1L;
    private javax.swing.JPanel pregunta2;
    private javax.swing.JPanel pregunta2C;
    private javax.swing.JPanel pregunta2H;
    private javax.swing.JPanel pregunta2L;
    private javax.swing.JPanel pregunta3;
    private javax.swing.JPanel pregunta3C;
    private javax.swing.JPanel pregunta3H;
    private javax.swing.JPanel pregunta3L;
    private javax.swing.JPanel pregunta4;
    private javax.swing.JPanel pregunta4C;
    private javax.swing.JPanel pregunta4H;
    private javax.swing.JPanel pregunta4L;
    private javax.swing.JPanel pregunta5;
    private javax.swing.JPanel pregunta5C;
    private javax.swing.JPanel pregunta5H;
    private javax.swing.JPanel pregunta5L;
    private javax.swing.JPanel pregunta6;
    private javax.swing.JPanel pregunta6C;
    private javax.swing.JPanel pregunta6H;
    private javax.swing.JPanel pregunta6L;
    private javax.swing.JPanel pregunta7;
    private javax.swing.JPanel pregunta7C;
    private javax.swing.JPanel pregunta7H;
    private javax.swing.JPanel pregunta7L;
    private javax.swing.JPanel pregunta8;
    private javax.swing.JPanel pregunta8C;
    private javax.swing.JPanel pregunta8H;
    private javax.swing.JPanel pregunta8L;
    private javax.swing.JPanel pregunta9;
    private javax.swing.JPanel pregunta9C;
    private javax.swing.JPanel pregunta9H;
    private javax.swing.JPanel pregunta9L;
    private javax.swing.JButton regresaramenu;
    private javax.swing.JPanel titulo11;
    private javax.swing.JTextField txtcodigopregunta;
    private javax.swing.JTextField txtcorrecta;
    private javax.swing.JTextField txtincorrecta1;
    private javax.swing.JTextField txtincorrecta2;
    private javax.swing.JTextField txtincorrecta3;
    private javax.swing.JTextField txtingresarpregunta;
    // End of variables declaration//GEN-END:variables
}
