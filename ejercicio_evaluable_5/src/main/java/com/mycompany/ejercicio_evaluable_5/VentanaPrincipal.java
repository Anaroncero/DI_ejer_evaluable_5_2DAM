/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicio_evaluable_5;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.ejercicio_evaluable_5.Libro.EstadoLibro;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Ana
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Biblioteca biblioteca;
    private DefaultListModel<String> modeloLibros;

    private File imageFile;

    public VentanaPrincipal() {
        initComponents();
        biblioteca = new Biblioteca();
        modeloLibros = new DefaultListModel<>();
        jListaBiblioteca.setModel(modeloLibros);

        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/29809.png"));
        portadaAdd.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDialog1 = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_Inicio = new javax.swing.JPanel();
        espacio1 = new javax.swing.JPanel();
        espacio2 = new javax.swing.JPanel();
        espacio3 = new javax.swing.JPanel();
        espacio4 = new javax.swing.JPanel();
        jPanel_num_libros = new javax.swing.JPanel();
        jLabelEnunciadoNum = new javax.swing.JLabel();
        jLabelNumLibros = new javax.swing.JLabel();
        espacio5 = new javax.swing.JPanel();
        espacio6 = new javax.swing.JPanel();
        espacio7 = new javax.swing.JPanel();
        espacio8 = new javax.swing.JPanel();
        jPanel2_Biblioteca = new javax.swing.JPanel();
        jPanel_enunciadoPag = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_lista1 = new javax.swing.JPanel();
        jScrollPane_listaLibros1 = new javax.swing.JScrollPane();
        jListaBiblioteca = new javax.swing.JList<>();
        jPanel3_portada1 = new javax.swing.JPanel();
        jPanel1_portada1 = new javax.swing.JPanel();
        portadaLibro = new javax.swing.JLabel();
        jPanel1_info1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextFieldBiblioTitulo = new javax.swing.JTextField();
        jTextFieldBiblioAutor = new javax.swing.JTextField();
        jTextFieldBiblioGenero = new javax.swing.JTextField();
        jTextFieldBiblioEditorial = new javax.swing.JTextField();
        jComboBoxBiblioEstado = new javax.swing.JComboBox<>();
        jTextFieldBiblioComienzo = new javax.swing.JTextField();
        jTextFieldBiblioFin = new javax.swing.JTextField();
        jPanel_info_prin1 = new javax.swing.JPanel();
        jPanel_Sipnosis1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBiblioSinopsis = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanel2_Add = new javax.swing.JPanel();
        jPanel1_enunciadoPag = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1_info2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jTextFieldEditorial = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldComienzo = new javax.swing.JTextField();
        jTextFieldFin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1_portada2 = new javax.swing.JPanel();
        portadaAdd = new javax.swing.JLabel();
        selectImage = new javax.swing.JPanel();
        Seleccionar = new javax.swing.JLabel();
        jTextFieldRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonImagePortadaAdd = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel_Sipnosis2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        espacio = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 820));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 820));

        jPanel6.setBackground(new java.awt.Color(13, 13, 13));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setBackground(new java.awt.Color(166, 86, 160));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jPanel_Inicio.setBackground(new java.awt.Color(166, 86, 160));
        jPanel_Inicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_Inicio.setForeground(new java.awt.Color(166, 86, 160));
        jPanel_Inicio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel_Inicio.setMinimumSize(new java.awt.Dimension(1000, 750));
        jPanel_Inicio.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel_Inicio.setLayout(new java.awt.GridLayout(3, 3));

        espacio1.setBackground(new java.awt.Color(166, 86, 160));

        javax.swing.GroupLayout espacio1Layout = new javax.swing.GroupLayout(espacio1);
        espacio1.setLayout(espacio1Layout);
        espacio1Layout.setHorizontalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio1Layout.setVerticalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio1);

        espacio2.setBackground(new java.awt.Color(166, 86, 160));
        espacio2.setMaximumSize(new java.awt.Dimension(333, 750));
        espacio2.setMinimumSize(new java.awt.Dimension(333, 750));
        espacio2.setName(""); // NOI18N
        espacio2.setRequestFocusEnabled(false);
        espacio2.setLayout(null);
        jPanel_Inicio.add(espacio2);

        espacio3.setBackground(new java.awt.Color(166, 86, 160));

        javax.swing.GroupLayout espacio3Layout = new javax.swing.GroupLayout(espacio3);
        espacio3.setLayout(espacio3Layout);
        espacio3Layout.setHorizontalGroup(
            espacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio3Layout.setVerticalGroup(
            espacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio3);

        espacio4.setBackground(new java.awt.Color(166, 86, 160));
        espacio4.setMaximumSize(new java.awt.Dimension(333, 750));
        espacio4.setMinimumSize(new java.awt.Dimension(333, 750));
        espacio4.setName(""); // NOI18N
        espacio4.setPreferredSize(new java.awt.Dimension(333, 750));
        espacio4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout espacio4Layout = new javax.swing.GroupLayout(espacio4);
        espacio4.setLayout(espacio4Layout);
        espacio4Layout.setHorizontalGroup(
            espacio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio4Layout.setVerticalGroup(
            espacio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio4);

        jPanel_num_libros.setBackground(new java.awt.Color(250, 250, 250));
        jPanel_num_libros.setMaximumSize(new java.awt.Dimension(333, 750));
        jPanel_num_libros.setMinimumSize(new java.awt.Dimension(333, 750));
        jPanel_num_libros.setName(""); // NOI18N
        jPanel_num_libros.setRequestFocusEnabled(false);
        jPanel_num_libros.setLayout(new java.awt.GridBagLayout());

        jLabelEnunciadoNum.setBackground(new java.awt.Color(250, 250, 250));
        jLabelEnunciadoNum.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelEnunciadoNum.setForeground(new java.awt.Color(166, 86, 160));
        jLabelEnunciadoNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEnunciadoNum.setText("Número de libros");
        jLabelEnunciadoNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 86, 160)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        jPanel_num_libros.add(jLabelEnunciadoNum, gridBagConstraints);

        jLabelNumLibros.setBackground(new java.awt.Color(250, 250, 250));
        jLabelNumLibros.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabelNumLibros.setForeground(new java.awt.Color(166, 86, 160));
        jLabelNumLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumLibros.setText("00");
        jLabelNumLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 86, 160)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        jPanel_num_libros.add(jLabelNumLibros, gridBagConstraints);

        jPanel_Inicio.add(jPanel_num_libros);

        espacio5.setBackground(new java.awt.Color(166, 86, 160));

        javax.swing.GroupLayout espacio5Layout = new javax.swing.GroupLayout(espacio5);
        espacio5.setLayout(espacio5Layout);
        espacio5Layout.setHorizontalGroup(
            espacio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio5Layout.setVerticalGroup(
            espacio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio5);

        espacio6.setBackground(new java.awt.Color(166, 86, 160));
        espacio6.setMaximumSize(new java.awt.Dimension(333, 750));
        espacio6.setMinimumSize(new java.awt.Dimension(333, 750));
        espacio6.setName(""); // NOI18N
        espacio6.setRequestFocusEnabled(false);

        javax.swing.GroupLayout espacio6Layout = new javax.swing.GroupLayout(espacio6);
        espacio6.setLayout(espacio6Layout);
        espacio6Layout.setHorizontalGroup(
            espacio6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio6Layout.setVerticalGroup(
            espacio6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio6);

        espacio7.setBackground(new java.awt.Color(166, 86, 160));

        javax.swing.GroupLayout espacio7Layout = new javax.swing.GroupLayout(espacio7);
        espacio7.setLayout(espacio7Layout);
        espacio7Layout.setHorizontalGroup(
            espacio7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio7Layout.setVerticalGroup(
            espacio7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio7);

        espacio8.setBackground(new java.awt.Color(166, 86, 160));

        javax.swing.GroupLayout espacio8Layout = new javax.swing.GroupLayout(espacio8);
        espacio8.setLayout(espacio8Layout);
        espacio8Layout.setHorizontalGroup(
            espacio8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        espacio8Layout.setVerticalGroup(
            espacio8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jPanel_Inicio.add(espacio8);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/house.png")), jPanel_Inicio); // NOI18N

        jPanel2_Biblioteca.setBackground(new java.awt.Color(166, 86, 160));
        jPanel2_Biblioteca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2_Biblioteca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2_Biblioteca.setMinimumSize(new java.awt.Dimension(1000, 750));
        jPanel2_Biblioteca.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel2_Biblioteca.setLayout(new java.awt.GridBagLayout());

        jPanel_enunciadoPag.setBackground(new java.awt.Color(166, 86, 160));
        jPanel_enunciadoPag.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIBLIOTECA");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1));
        jPanel_enunciadoPag.add(jLabel2, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2_Biblioteca.add(jPanel_enunciadoPag, gridBagConstraints);

        jPanel_lista1.setBackground(new java.awt.Color(166, 86, 160));
        jPanel_lista1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(113, 2, 115), 2, true));
        jPanel_lista1.setMaximumSize(new java.awt.Dimension(333, 750));
        jPanel_lista1.setMinimumSize(new java.awt.Dimension(333, 750));
        jPanel_lista1.setName(""); // NOI18N
        jPanel_lista1.setRequestFocusEnabled(false);

        jListaBiblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jListaBiblioteca.setMaximumSize(new java.awt.Dimension(343, 200));
        jListaBiblioteca.setMinimumSize(new java.awt.Dimension(343, 200));
        jListaBiblioteca.setPreferredSize(new java.awt.Dimension(343, 200));
        jListaBiblioteca.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaBibliotecaValueChanged(evt);
            }
        });
        jScrollPane_listaLibros1.setViewportView(jListaBiblioteca);

        javax.swing.GroupLayout jPanel_lista1Layout = new javax.swing.GroupLayout(jPanel_lista1);
        jPanel_lista1.setLayout(jPanel_lista1Layout);
        jPanel_lista1Layout.setHorizontalGroup(
            jPanel_lista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_listaLibros1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );
        jPanel_lista1Layout.setVerticalGroup(
            jPanel_lista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_listaLibros1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2_Biblioteca.add(jPanel_lista1, gridBagConstraints);

        jPanel3_portada1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(113, 2, 115), 2, true));
        jPanel3_portada1.setMaximumSize(new java.awt.Dimension(333, 750));
        jPanel3_portada1.setMinimumSize(new java.awt.Dimension(333, 750));
        jPanel3_portada1.setPreferredSize(new java.awt.Dimension(333, 750));
        jPanel3_portada1.setLayout(new java.awt.GridBagLayout());

        jPanel1_portada1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel1_portada1.setMaximumSize(new java.awt.Dimension(100, 200));
        jPanel1_portada1.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel1_portada1.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel1_portada1.setLayout(new java.awt.CardLayout());

        portadaLibro.setBackground(new java.awt.Color(255, 255, 255));
        portadaLibro.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        portadaLibro.setForeground(new java.awt.Color(113, 2, 115));
        portadaLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portadaLibro.setMaximumSize(new java.awt.Dimension(150, 200));
        portadaLibro.setMinimumSize(new java.awt.Dimension(150, 200));
        portadaLibro.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel1_portada1.add(portadaLibro, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        jPanel3_portada1.add(jPanel1_portada1, gridBagConstraints);

        jPanel1_info1.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        jPanel9.setLayout(new java.awt.GridLayout(7, 1, 10, 10));

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(113, 2, 115));
        jLabel11.setText("Título");
        jLabel11.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel11);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 2, 115));
        jLabel4.setText("Autor");
        jLabel4.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel4);

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(113, 2, 115));
        jLabel22.setText("Género");
        jLabel22.setMaximumSize(new java.awt.Dimension(38, 16));
        jLabel22.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel22.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(113, 2, 115));
        jLabel23.setText("Editorial");
        jLabel23.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel23.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel23.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel23);

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(113, 2, 115));
        jLabel27.setText("Estado");
        jLabel27.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel27.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel27.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel27);

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(113, 2, 115));
        jLabel29.setText("<html>Comienzo<br>lectura</html>");
        jLabel29.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel29.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel29.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(113, 2, 115));
        jLabel30.setText("<html>Fin<br>lectura</html>");
        jLabel30.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel30.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel30.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel9.add(jLabel30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        jPanel1_info1.add(jPanel9, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        jPanel10.setLayout(new java.awt.GridLayout(7, 1, 10, 10));

        jTextFieldBiblioTitulo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioTitulo.setForeground(new java.awt.Color(255, 102, 255));
        jTextFieldBiblioTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldBiblioTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBiblioTituloActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldBiblioTitulo);

        jTextFieldBiblioAutor.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioAutor.setForeground(new java.awt.Color(255, 102, 255));
        jTextFieldBiblioAutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel10.add(jTextFieldBiblioAutor);

        jTextFieldBiblioGenero.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioGenero.setForeground(new java.awt.Color(255, 102, 255));
        jPanel10.add(jTextFieldBiblioGenero);

        jTextFieldBiblioEditorial.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioEditorial.setForeground(new java.awt.Color(255, 102, 255));
        jTextFieldBiblioEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBiblioEditorialActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldBiblioEditorial);

        jComboBoxBiblioEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEIDO", "NO_LEIDO", "EN_CURSO", "ABANDONADO" }));
        jComboBoxBiblioEstado.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBoxBiblioEstadoComponentAdded(evt);
            }
        });
        jComboBoxBiblioEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBiblioEstadoActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxBiblioEstado);

        jTextFieldBiblioComienzo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioComienzo.setForeground(new java.awt.Color(255, 102, 255));
        jTextFieldBiblioComienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBiblioComienzoActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldBiblioComienzo);

        jTextFieldBiblioFin.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldBiblioFin.setForeground(new java.awt.Color(255, 102, 255));
        jTextFieldBiblioFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBiblioFinActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldBiblioFin);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        jPanel1_info1.add(jPanel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3_portada1.add(jPanel1_info1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2_Biblioteca.add(jPanel3_portada1, gridBagConstraints);

        jPanel_info_prin1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(113, 2, 115), 2, true));
        jPanel_info_prin1.setMaximumSize(new java.awt.Dimension(333, 750));
        jPanel_info_prin1.setMinimumSize(new java.awt.Dimension(333, 750));
        jPanel_info_prin1.setName(""); // NOI18N
        jPanel_info_prin1.setPreferredSize(new java.awt.Dimension(333, 750));
        jPanel_info_prin1.setLayout(new java.awt.GridBagLayout());

        jPanel_Sipnosis1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel_Sipnosis1.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel_Sipnosis1.setLayout(new java.awt.GridBagLayout());

        jTextAreaBiblioSinopsis.setColumns(10);
        jTextAreaBiblioSinopsis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextAreaBiblioSinopsis.setForeground(new java.awt.Color(255, 102, 255));
        jTextAreaBiblioSinopsis.setLineWrap(true);
        jTextAreaBiblioSinopsis.setRows(5);
        jTextAreaBiblioSinopsis.setWrapStyleWord(true);
        jTextAreaBiblioSinopsis.setPreferredSize(new java.awt.Dimension(232, 134));
        jScrollPane2.setViewportView(jTextAreaBiblioSinopsis);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        jPanel_Sipnosis1.add(jScrollPane2, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(113, 2, 115));
        jLabel26.setText("Sinopsis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        jPanel_Sipnosis1.add(jLabel26, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel_info_prin1.add(jPanel_Sipnosis1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2_Biblioteca.add(jPanel_info_prin1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(166, 86, 160));

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardar);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEliminar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2_Biblioteca.add(jPanel4, gridBagConstraints);

        jTabbedPane1.addTab("Biblioteca", new javax.swing.ImageIcon(getClass().getResource("/images/library.png")), jPanel2_Biblioteca); // NOI18N

        jPanel2_Add.setBackground(new java.awt.Color(166, 86, 160));
        jPanel2_Add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2_Add.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2_Add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel2_Add.setMinimumSize(new java.awt.Dimension(1000, 750));
        jPanel2_Add.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel2_Add.setLayout(new java.awt.GridBagLayout());

        jPanel1_enunciadoPag.setBackground(new java.awt.Color(166, 86, 160));
        jPanel1_enunciadoPag.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Añadir libro");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1));
        jPanel1_enunciadoPag.add(jLabel3, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2_Add.add(jPanel1_enunciadoPag, gridBagConstraints);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(113, 2, 115), 2, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(333, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(333, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(333, 750));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1_info2.setLayout(new java.awt.GridBagLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        jPanel13.setLayout(new java.awt.GridLayout(7, 1, 30, 30));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(113, 2, 115));
        jLabel18.setText("Título");
        jLabel18.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel18.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel18.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(113, 2, 115));
        jLabel19.setText("Autor");
        jLabel19.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel19.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel19);

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(113, 2, 115));
        jLabel24.setText("Género");
        jLabel24.setMaximumSize(new java.awt.Dimension(38, 16));
        jLabel24.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel24.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(113, 2, 115));
        jLabel25.setText("Editorial");
        jLabel25.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel25.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel25.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel25);

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(113, 2, 115));
        jLabel31.setText("Estado");
        jLabel31.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel31.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel31.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(113, 2, 115));
        jLabel32.setText("<html>Comienzo<br>lectura</html>");
        jLabel32.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel32.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel32.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(113, 2, 115));
        jLabel33.setText("<html>Fin<br>lectura</html>");
        jLabel33.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel33.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel33.setPreferredSize(new java.awt.Dimension(48, 20));
        jPanel13.add(jLabel33);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        jPanel1_info2.add(jPanel13, gridBagConstraints);

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        jPanel14.setLayout(new java.awt.GridLayout(7, 1, 30, 30));

        jTextFieldTitulo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel14.add(jTextFieldTitulo);

        jTextFieldAutor.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldAutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel14.add(jTextFieldAutor);

        jTextFieldGenero.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jPanel14.add(jTextFieldGenero);

        jTextFieldEditorial.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditorialActionPerformed(evt);
            }
        });
        jPanel14.add(jTextFieldEditorial);

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEIDO", "NO_LEIDO", "EN_CURSO", "ABANDONADO" }));
        jPanel14.add(jComboBoxEstado);

        jTextFieldComienzo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldComienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComienzoActionPerformed(evt);
            }
        });
        jPanel14.add(jTextFieldComienzo);

        jTextFieldFin.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextFieldFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinActionPerformed(evt);
            }
        });
        jPanel14.add(jTextFieldFin);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        jPanel1_info2.add(jPanel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(40, 40, 40, 40);
        jPanel1.add(jPanel1_info2, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1_portada2.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel1_portada2.setMaximumSize(new java.awt.Dimension(100, 200));
        jPanel1_portada2.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel1_portada2.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel1_portada2.setLayout(new java.awt.CardLayout());

        portadaAdd.setBackground(new java.awt.Color(255, 255, 255));
        portadaAdd.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        portadaAdd.setForeground(new java.awt.Color(113, 2, 115));
        portadaAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portadaAdd.setMaximumSize(new java.awt.Dimension(150, 200));
        portadaAdd.setMinimumSize(new java.awt.Dimension(150, 200));
        portadaAdd.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel1_portada2.add(portadaAdd, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 40);
        jPanel2.add(jPanel1_portada2, gridBagConstraints);

        selectImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 10));
        selectImage.setLayout(new java.awt.GridBagLayout());

        Seleccionar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Seleccionar.setForeground(new java.awt.Color(113, 2, 115));
        Seleccionar.setText("Seleccionar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.4;
        selectImage.add(Seleccionar, gridBagConstraints);

        jTextFieldRuta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRuta.setEnabled(false);
        jTextFieldRuta.setPreferredSize(new java.awt.Dimension(50, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        selectImage.add(jTextFieldRuta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.4;
        selectImage.add(jLabel1, gridBagConstraints);

        jButtonImagePortadaAdd.setText("...");
        jButtonImagePortadaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagePortadaAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        selectImage.add(jButtonImagePortadaAdd, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(selectImage, gridBagConstraints);

        jPanel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        jPanel_Sipnosis2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel_Sipnosis2.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel_Sipnosis2.setLayout(new java.awt.GridBagLayout());

        jTextAreaSinopsis.setColumns(10);
        jTextAreaSinopsis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextAreaSinopsis.setLineWrap(true);
        jTextAreaSinopsis.setRows(5);
        jTextAreaSinopsis.setWrapStyleWord(true);
        jTextAreaSinopsis.setPreferredSize(new java.awt.Dimension(232, 134));
        jScrollPane3.setViewportView(jTextAreaSinopsis);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        jPanel_Sipnosis2.add(jScrollPane3, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(113, 2, 115));
        jLabel28.setText("Sinopsis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        jPanel_Sipnosis2.add(jLabel28, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel25.add(jPanel_Sipnosis2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        jPanel2.add(jPanel25, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel27.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));

        jButtonAdd.setText("Guardar");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel27.add(jButtonAdd);
        jPanel27.add(espacio);

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel27.add(jButtonCancel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel27, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(40, 40, 40, 40);
        jPanel2_Add.add(jPanel1, gridBagConstraints);

        jTabbedPane1.addTab("Añadir ", new javax.swing.ImageIcon(getClass().getResource("/images/book-plus.png")), jPanel2_Add); // NOI18N

        jPanel6.add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBiblioEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBiblioEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBiblioEditorialActionPerformed

    private void jTextFieldBiblioComienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBiblioComienzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBiblioComienzoActionPerformed

    private void jTextFieldBiblioFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBiblioFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBiblioFinActionPerformed

    private void jTextFieldEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditorialActionPerformed

    private void jTextFieldComienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComienzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComienzoActionPerformed

    private void jTextFieldFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFinActionPerformed

    private void jComboBoxBiblioEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBiblioEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxBiblioEstadoActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (biblioteca == null) {
            JOptionPane.showMessageDialog(this, "La biblioteca no está inicializada.");
            return;
        }

        //coger lo introducido en jtextfield y jcombobox
        String titulo = jTextFieldTitulo.getText().toUpperCase(); //para que el titulo se guarde en mayuscula
        String autor = jTextFieldAutor.getText();
        String genero = jTextFieldGenero.getText();
        String editorial = jTextFieldEditorial.getText();
        String comienzo = jTextFieldComienzo.getText();
        String fin = jTextFieldFin.getText();
        String sinopsis = jTextAreaSinopsis.getText();
        String estado = (String) jComboBoxEstado.getSelectedItem();

        //que los campos no estén vacíos
        if (titulo.isEmpty() && autor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Almenos inserte el titulo y el Autor del libro.");
            return;
        }

        String rutaImagen = this.imageFile != null ? this.imageFile.getAbsolutePath() : null;

        //Crear el nuevo libro
        Libro nuevoLibro = new Libro(titulo, autor, genero, editorial, EstadoLibro.valueOf(estado.toUpperCase()), comienzo, fin, sinopsis, rutaImagen);

        System.out.println(nuevoLibro.getTitulo() + nuevoLibro.getEstado() + nuevoLibro.getGenero() + nuevoLibro.getEditorial() + nuevoLibro.getEstado());

        // Agregarlo a la biblioteca
        biblioteca.agregarLibro(nuevoLibro);

        //Agregar el libro al JList como String
        String libroString = nuevoLibro.getTitulo() + " - " + nuevoLibro.getAutor();
        modeloLibros.addElement(libroString);

        //ACTUALIZAR CONTADOR
        int contadorLibros = biblioteca.getContador();
        jLabelNumLibros.setText(contadorLibros + "");

        //Limpiar los campos de texto
        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldGenero.setText("");
        jTextFieldEditorial.setText("");
        jComboBoxEstado.setSelectedIndex(0);

        //Limpiar los campos de texto despues de añadir el libro
        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldGenero.setText("");
        jTextFieldEditorial.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldComienzo.setText("");
        jTextAreaSinopsis.setText("");
        jTextFieldFin.setText("");
        jTextFieldRuta.setText("");

        //Imagen predeterminada
        ImageIcon imagenPredeterminada = new ImageIcon(getClass().getResource("/images/29809.png"));
        portadaAdd.setIcon(imagenPredeterminada);
        this.imageFile = null;


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jListaBibliotecaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaBibliotecaValueChanged
        //CAMPOS DESABILITADOS PARA PODER VER INFORMACION PERO NO EDITARLA
        jTextFieldBiblioTitulo.setEnabled(false);
        jTextFieldBiblioAutor.setEnabled(false);
        jTextFieldBiblioGenero.setEnabled(false);
        jTextFieldBiblioEditorial.setEnabled(false);
        jComboBoxBiblioEstado.setEnabled(false);
        jTextFieldBiblioComienzo.setEnabled(false);
        jTextAreaBiblioSinopsis.setEnabled(false);
        jTextFieldBiblioFin.setEnabled(false);

        if (!evt.getValueIsAdjusting()) {

            String seleccionado = jListaBiblioteca.getSelectedValue();

            if (seleccionado != null) {

                String[] partes = seleccionado.split(" - ");
                String tituloSeleccionado = partes[0].trim();
                String autorSeleccionado = partes[1].trim();

                //Buscar el libro en la biblioteca
                Libro libroEncontrado = biblioteca.buscarLibro(tituloSeleccionado, autorSeleccionado);

                if (libroEncontrado != null) {
                    //Si encontramos el libro, mostrar en la ventana biblioteca la informacion del libro
                    jTextFieldBiblioTitulo.setText(libroEncontrado.getTitulo());
                    jTextFieldBiblioAutor.setText(libroEncontrado.getAutor());
                    jTextFieldBiblioGenero.setText(libroEncontrado.getGenero());
                    jTextFieldBiblioEditorial.setText(libroEncontrado.getEditorial());
                    jComboBoxBiblioEstado.setSelectedItem(libroEncontrado.getEstado().toString());
                    jTextFieldBiblioComienzo.setText(libroEncontrado.getFechaInicio());
                    jTextAreaBiblioSinopsis.setText(libroEncontrado.getSinopsis());
                    jTextFieldBiblioFin.setText(libroEncontrado.getFechaFin());

                    // Mostrar la imagen del libro
                    String rutaPortada = libroEncontrado.getRutaImagen();
                    if (rutaPortada != null && !rutaPortada.isEmpty()) {
                        mostrarPortada(rutaPortada);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Libro no encontrado.");
                }
            }
        }

    }//GEN-LAST:event_jListaBibliotecaValueChanged

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldGenero.setText("");
        jTextFieldEditorial.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldComienzo.setText("");
        jTextAreaSinopsis.setText("");
        jTextFieldFin.setText("");
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldBiblioTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBiblioTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBiblioTituloActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Verificar que un libro esté seleccionado
        String seleccionado = jListaBiblioteca.getSelectedValue();

        if (seleccionado != null) {
            //Habilitar para poder editarlo
            jTextFieldBiblioTitulo.setEnabled(true);
            jTextFieldBiblioAutor.setEnabled(true);
            jTextFieldBiblioGenero.setEnabled(true);
            jTextFieldBiblioEditorial.setEnabled(true);
            jComboBoxBiblioEstado.setEnabled(true);
            jTextFieldBiblioComienzo.setEnabled(true);
            jTextAreaBiblioSinopsis.setEnabled(true);
            jTextFieldBiblioFin.setEnabled(true);

            //Habilitar el botón"Guardar para poder guardar una vez se edite
            jButtonGuardar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija un libro que quiera editar.");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        //Boton guardar cambios 
        String seleccionado = jListaBiblioteca.getSelectedValue();

        if (seleccionado != null) {
            //coger el título y el autor del libro seleccionado
            String[] partes = seleccionado.split(" - ");
            String tituloSeleccionado = partes[0].trim();
            String autorSeleccionado = partes[1].trim();

            //Buscar el libro en la biblioteca
            Libro libroEncontrado = biblioteca.buscarLibro(tituloSeleccionado, autorSeleccionado);

            if (libroEncontrado != null) {
                //Actualizar
                libroEncontrado.setTitulo(jTextFieldBiblioTitulo.getText());
                libroEncontrado.setAutor(jTextFieldBiblioAutor.getText());
                libroEncontrado.setGenero(jTextFieldBiblioGenero.getText());
                libroEncontrado.setEditorial(jTextFieldBiblioEditorial.getText());
                libroEncontrado.setEstado(EstadoLibro.valueOf((String) jComboBoxBiblioEstado.getSelectedItem()));
                libroEncontrado.setFechaInicio(jTextFieldBiblioComienzo.getText());
                libroEncontrado.setSinopsis(jTextAreaBiblioSinopsis.getText());
                libroEncontrado.setFechaFin(jTextFieldBiblioFin.getText());

                //Actualizar la lista
                DefaultListModel<String> modeloLibros = (DefaultListModel<String>) jListaBiblioteca.getModel();
                modeloLibros.setElementAt(libroEncontrado.getTitulo() + " - " + libroEncontrado.getAutor(), jListaBiblioteca.getSelectedIndex());

                //Deshabilitar después de guardar para que no se editen
                jTextFieldBiblioTitulo.setEnabled(false);
                jTextFieldBiblioAutor.setEnabled(false);
                jTextFieldBiblioGenero.setEnabled(false);
                jTextFieldBiblioEditorial.setEnabled(false);
                jComboBoxBiblioEstado.setEnabled(false);
                jTextFieldBiblioComienzo.setEnabled(false);
                jTextAreaBiblioSinopsis.setEnabled(false);
                jTextFieldBiblioFin.setEnabled(false);

                //Deshabilitar el botón de guardar
                jButtonGuardar.setEnabled(false);

                JOptionPane.showMessageDialog(this, "El libro." + jTextFieldBiblioTitulo.getText() + " ha sido actualizado");

            } else {
                // Si no se encuentra el libro
                JOptionPane.showMessageDialog(this, "No se pudo encontrar el libro.");
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //Eliminar libro
        //Comprobamos que el libro esta seleccionado
        String seleccionado = jListaBiblioteca.getSelectedValue();
        if (seleccionado != null) {
            //Extraer el título y autor del libro seleccionado oara pnerlo en la lista con el titulo y el autor
            String[] partes = seleccionado.split(" - ");
            String tituloSeleccionado = partes[0].trim();
            String autorSeleccionado = partes[1].trim();

            //Buscar el libro en la biblioteca
            Libro libroEncontrado = biblioteca.buscarLibro(tituloSeleccionado, autorSeleccionado);

            if (libroEncontrado != null) {
                //Eliminar el libro guardado en Biblioteca
                boolean eliminado = biblioteca.eliminarLibro(libroEncontrado);
                if (eliminado) {
                    // Eliminar el libro de la lista (JList)
                    DefaultListModel<String> modeloLibros = (DefaultListModel<String>) jListaBiblioteca.getModel();
                    modeloLibros.removeElement(seleccionado); //Quitar el libro de la lista si se elimina

                    JOptionPane.showMessageDialog(this, "Libro eliminado exitosamente.");

                    //Limpiar los campos
                    jTextFieldBiblioTitulo.setText("");
                    jTextFieldBiblioAutor.setText("");
                    jTextFieldBiblioGenero.setText("");
                    jTextFieldBiblioEditorial.setText("");
                    jComboBoxBiblioEstado.setSelectedIndex(0);
                    jTextFieldBiblioComienzo.setText("");
                    jTextAreaBiblioSinopsis.setText("");
                    jTextFieldBiblioFin.setText("");

                    //Deshabilitar los campos y el botón de guardar después de eliminar un libro
                    jTextFieldBiblioTitulo.setEnabled(false);
                    jTextFieldBiblioAutor.setEnabled(false);
                    jTextFieldBiblioGenero.setEnabled(false);
                    jTextFieldBiblioEditorial.setEnabled(false);
                    jComboBoxBiblioEstado.setEnabled(false);
                    jTextFieldBiblioComienzo.setEnabled(false);
                    jTextAreaBiblioSinopsis.setEnabled(false);
                    jTextFieldBiblioFin.setEnabled(false);
                    jButtonGuardar.setEnabled(false);

                    //Actualizar el contador al eliminar un libro
                    int contadorLibros = biblioteca.getContador();
                    jLabelNumLibros.setText(contadorLibros + "");

                    //Imagen predeterminada
                    ImageIcon imagenPredeterminada = new ImageIcon(getClass().getResource("/images/book-heart.png"));
                    portadaLibro.setIcon(imagenPredeterminada);
                    this.imageFile = null;

                } else {
                    JOptionPane.showMessageDialog(this, "Se ha producido un error al eliminar el libro.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Libro no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro que desee eliminar.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxBiblioEstadoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBoxBiblioEstadoComponentAdded

    }//GEN-LAST:event_jComboBoxBiblioEstadoComponentAdded

    private void jButtonImagePortadaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagePortadaAddActionPerformed
        abrirImagen();
    }//GEN-LAST:event_jButtonImagePortadaAddActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); //Clase UI que dentro tiene un LookAndFeel y importamos la clase FlatDarkLaf

        } catch (Exception e) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Seleccionar;
    private javax.swing.JLabel espacio;
    private javax.swing.JPanel espacio1;
    private javax.swing.JPanel espacio2;
    private javax.swing.JPanel espacio3;
    private javax.swing.JPanel espacio4;
    private javax.swing.JPanel espacio5;
    private javax.swing.JPanel espacio6;
    private javax.swing.JPanel espacio7;
    private javax.swing.JPanel espacio8;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonImagePortadaAdd;
    private javax.swing.JComboBox<String> jComboBoxBiblioEstado;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEnunciadoNum;
    private javax.swing.JLabel jLabelNumLibros;
    private javax.swing.JList<String> jListaBiblioteca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel1_enunciadoPag;
    private javax.swing.JPanel jPanel1_info1;
    private javax.swing.JPanel jPanel1_info2;
    private javax.swing.JPanel jPanel1_portada1;
    private javax.swing.JPanel jPanel1_portada2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel2_Add;
    private javax.swing.JPanel jPanel2_Biblioteca;
    private javax.swing.JPanel jPanel3_portada1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Inicio;
    private javax.swing.JPanel jPanel_Sipnosis1;
    private javax.swing.JPanel jPanel_Sipnosis2;
    private javax.swing.JPanel jPanel_enunciadoPag;
    private javax.swing.JPanel jPanel_info_prin1;
    private javax.swing.JPanel jPanel_lista1;
    private javax.swing.JPanel jPanel_num_libros;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane_listaLibros1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaBiblioSinopsis;
    private javax.swing.JTextArea jTextAreaSinopsis;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldBiblioAutor;
    private javax.swing.JTextField jTextFieldBiblioComienzo;
    private javax.swing.JTextField jTextFieldBiblioEditorial;
    private javax.swing.JTextField jTextFieldBiblioFin;
    private javax.swing.JTextField jTextFieldBiblioGenero;
    private javax.swing.JTextField jTextFieldBiblioTitulo;
    private javax.swing.JTextField jTextFieldComienzo;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldFin;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldRuta;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JLabel portadaAdd;
    private javax.swing.JLabel portadaLibro;
    private javax.swing.JPanel selectImage;
    // End of variables declaration//GEN-END:variables

    //metodo para cambiar la imagen y que se redimensione al tamaño del (jlabel)
    private void cambiarImage(String path) {
        ImageIcon image = new ImageIcon(path);
        Image img = image.getImage();

        //Obtenemos tamaño del jlabel
        int labelWidth = portadaAdd.getWidth();
        int labelHeight = portadaAdd.getHeight();

        //Calculamos la relacion de aspecto de la imagen origianl
        double aspectRatio = (double) img.getWidth(null) / img.getHeight(null);

        //Nuevas dimensiones de la imagen
        int nuevaAnchura = labelWidth;
        int nuevaAltura = (int) (labelWidth / aspectRatio);

        // Si la altura ajustada es mayor que la altura del JLabel ajustamos la altura
        if (nuevaAltura > labelHeight) {
            nuevaAltura = labelHeight;
            nuevaAnchura = (int) (labelHeight * aspectRatio);
        }

        // Escalar la imagen
        Image newImg = img.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);

        // Establecer la imagen escalada al JLabel
        Icon ic = new ImageIcon(newImg);
        portadaAdd.setIcon(ic);

        // Actualizar imagen
        this.repaint();
    }

    //abrir panel seleccionar iamgen
    private void abrirImagen() {
        JFileChooser img = new JFileChooser();
        if (img.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.imageFile = img.getSelectedFile();
            cambiarImage(img.getSelectedFile().getPath());
            jTextFieldRuta.setText(img.getSelectedFile().getPath());
        }
    }

    private void mostrarPortada(String rutaPortada) {
        ImageIcon imageIcon = new ImageIcon(rutaPortada);
        Image img = imageIcon.getImage();

        // Obtener el tamaño del JLabel para la portada
        int labelWidth = portadaLibro.getWidth();
        int labelHeight = portadaLibro.getHeight();

        // Calcular la relación de aspecto de la imagen original
        double aspectRatio = (double) img.getWidth(null) / img.getHeight(null);

        // Nuevas dimensiones de la imagen
        int newWidth = labelWidth;
        int newHeight = (int) (labelWidth / aspectRatio);  // Mantener la proporción

        // Si la altura ajustada es mayor que la altura del JLabel, ajustar la altura
        if (newHeight > labelHeight) {
            newHeight = labelHeight;
            newWidth = (int) (labelHeight * aspectRatio);  // Mantener la proporción
        }

        // Escalar la imagen
        Image newImg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // Establecer la imagen escalada al JLabel
        Icon icon = new ImageIcon(newImg);
        portadaLibro.setIcon(icon);

        // Repintar el panel si es necesario
        this.repaint();
    }
}
