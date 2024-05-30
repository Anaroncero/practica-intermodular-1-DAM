/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tfc.practica_intermodular;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana
 */
public class jFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFramePrincipal
     */
    public jFramePrincipal() {
        initComponents();

    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        Estrella = new javax.swing.JLabel();
        TipoEstrella = new javax.swing.JLabel();
        Radio = new javax.swing.JLabel();
        Temperatura = new javax.swing.JLabel();
        Distancia = new javax.swing.JLabel();
        Composicion = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selectorPlanetas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        Boton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        satelites = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Estrella.setText("Estrella:");

        TipoEstrella.setText("Tipo de estrella:");

        Radio.setText("Radio:");

        Temperatura.setText("Temperatura:");

        Distancia.setText("Distancia:");

        Composicion.setText("Composicion:");

        Titulo.setFont(new java.awt.Font("Scheherazade", 1, 36)); // NOI18N
        Titulo.setText("PRÁCTICA INTERMODULAR -  1ºDAM");

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Radio(km)", "Temperatura", "Distancia", "Composicion", "P.Orbital", "N.satelites", "Fecha Creacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        selectorPlanetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta", "Tierra", "Marte", "Venus", "Saturno", "Jupiter", "Urano", "Mercurio", "Neptuno", " " }));
        selectorPlanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorPlanetasActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Planeta", "Radio", "Distancia", "P. Orbitario", "Temperatura", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sol.jpg"))); // NOI18N

        Boton.setText("Ver Estrella");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        satelites.setText("Sátelites");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Boton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipoEstrella)
                                    .addComponent(Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Composicion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(satelites, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(Titulo)))
                .addContainerGap(575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Estrella))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satelites)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoEstrella))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio)
                            .addComponent(L2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L4)
                            .addComponent(Distancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Composicion)
                            .addComponent(L5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorPlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPlanetasActionPerformed
        /**
         * Método que se ejecuta cuando se selecciona un planeta del ComboBox.
         * Dependiendo del planeta seleccionado, se consultan los datos
         * correspondientes de la base de datos y se actualizan las tablas de la
         * interfaz gráfica.
         */

// Combo Box:
        // Los comentarios solo los he puesto en el primero para que se reduzca el código
        if (selectorPlanetas.getSelectedItem().equals("Marte")) {
            // Obtener los datos de Marte
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosMarte = conexion.conectarConsultarMarte();

            // Obtener el modelo de datos de la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Limpiar la tabla
            model.setRowCount(0);

            // Agregar los datos a la tabla
            model.addRow(new Object[]{datosMarte[0], datosMarte[1], datosMarte[2], datosMarte[3], datosMarte[4], datosMarte[5], datosMarte[6], datosMarte[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Tierra")) {

            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosTierra = conexion.conectarConsultarTierra();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosTierra[0], datosTierra[1], datosTierra[2], datosTierra[3], datosTierra[4], datosTierra[5], datosTierra[6], datosTierra[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Venus")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosVenus = conexion.conectarConsultarVenus();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosVenus[0], datosVenus[1], datosVenus[2], datosVenus[3], datosVenus[4], datosVenus[5], datosVenus[6], datosVenus[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Saturno")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosSaturno = conexion.conectarConsultarSaturno();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosSaturno[0], datosSaturno[1], datosSaturno[2], datosSaturno[3], datosSaturno[4], datosSaturno[5], datosSaturno[6], datosSaturno[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Jupiter")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosJupiter = conexion.conectarConsultarJúpiter();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosJupiter[0], datosJupiter[1], datosJupiter[2], datosJupiter[3], datosJupiter[4], datosJupiter[5], datosJupiter[6], datosJupiter[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Urano")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosUrano = conexion.conectarConsultarUrano();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosUrano[0], datosUrano[1], datosUrano[2], datosUrano[3], datosUrano[4], datosUrano[5], datosUrano[6], datosUrano[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Neptuno")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosNeptuno = conexion.conectarConsultarNeptuno();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosNeptuno[0], datosNeptuno[1], datosNeptuno[2], datosNeptuno[3], datosNeptuno[4], datosNeptuno[5], datosNeptuno[6], datosNeptuno[7]});

        } else if (selectorPlanetas.getSelectedItem().equals("Mercurio")) {
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosMercurio = conexion.conectarConsultarMercurio();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{datosMercurio[0], datosMercurio[1], datosMercurio[2], datosMercurio[3], datosMercurio[4], datosMercurio[5], datosMercurio[6], datosMercurio[7]});

        }

//satelites
        if (selectorPlanetas.getSelectedItem().equals("Tierra")) {
            // Luna
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosLuna = conexion.conectarConsultarLuna();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos nuevos
            model.addRow(new Object[]{datosLuna[0], datosLuna[1], datosLuna[2], datosLuna[3], datosLuna[4], datosLuna[5], datosLuna[6]});
        } else if (selectorPlanetas.getSelectedItem().equals("Marte")) {
            // Deimos
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosDeimos = conexion.conectarConsultarDeimos();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos nuevos
            model.addRow(new Object[]{datosDeimos[0], datosDeimos[1], datosDeimos[2], datosDeimos[3], datosDeimos[4], datosDeimos[5], datosDeimos[6]});
            // Fobos
            String[] datosFobos = conexion.conectarConsultarFobos();
            model.addRow(new Object[]{datosFobos[0], datosFobos[1], datosFobos[2], datosFobos[3], datosFobos[4], datosFobos[5], datosFobos[6]});
        } else if (selectorPlanetas.getSelectedItem().equals("Jupiter")) {
            // Ío
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosIo = conexion.conectarConsultarÍo();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos nuevos
            model.addRow(new Object[]{datosIo[0], datosIo[1], datosIo[2], datosIo[3], datosIo[4], datosIo[5], datosIo[6]});
            // Europa
            String[] datosEuropa = conexion.conectarConsultarEuropa();
            model.addRow(new Object[]{datosEuropa[0], datosEuropa[1], datosEuropa[2], datosEuropa[3], datosEuropa[4], datosEuropa[5], datosEuropa[6]});
            // Ganimedes
            String[] datosGanimedes = conexion.conectarConsultarGanimedes();
            model.addRow(new Object[]{datosGanimedes[0], datosGanimedes[1], datosGanimedes[2], datosGanimedes[3], datosGanimedes[4], datosGanimedes[5], datosGanimedes[6]});
            // Calisto
            String[] datosCalisto = conexion.conectarConsultarCalisto();
            model.addRow(new Object[]{datosCalisto[0], datosCalisto[1], datosCalisto[2], datosCalisto[3], datosCalisto[4], datosCalisto[5], datosCalisto[6]});
        } else if (selectorPlanetas.getSelectedItem().equals("Saturno")) {
            // Titán
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosTitán = conexion.conectarConsultarTitán();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos nuevos
            model.addRow(new Object[]{datosTitán[0], datosTitán[1], datosTitán[2], datosTitán[3], datosTitán[4], datosTitán[5], datosTitán[6]});
            // Encélado
            String[] datosEncélado = conexion.conectarConsultarEncélado();
            model.addRow(new Object[]{datosEncélado[0], datosEncélado[1], datosEncélado[2], datosEncélado[3], datosEncélado[4], datosEncélado[5], datosEncélado[6]});
        } else if (selectorPlanetas.getSelectedItem().equals("Urano")) {
            // Titania
            ConexionBaseDatos conexion = new ConexionBaseDatos();
            String[] datosTitania = conexion.conectarConsultarTitania();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos nuevos
            model.addRow(new Object[]{datosTitania[0], datosTitania[1], datosTitania[2], datosTitania[3], datosTitania[4], datosTitania[5], datosTitania[6]});
            // Oberón
            String[] datosOberon = conexion.conectarConsultarOberón();
            model.addRow(new Object[]{datosOberon[0], datosOberon[1], datosOberon[2], datosOberon[3], datosOberon[4], datosOberon[5], datosOberon[6]});
        } else if (selectorPlanetas.getSelectedItem().equals("Venus") || selectorPlanetas.getSelectedItem().equals("Mercurio") || selectorPlanetas.getSelectedItem().equals("Neptuno") || selectorPlanetas.getSelectedItem().equals("Planeta")) {
            // Limpiar la segunda tabla 
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
            model2.setRowCount(0);
        }

    }//GEN-LAST:event_selectorPlanetasActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        /**
         * Conecta con la base de datos y consulta los datos de la estrella.
         * Luego, actualiza los componentes de la interfaz gráfica con estos
         * datos.
         */
        ConexionBaseDatos conexion = new ConexionBaseDatos();
        String[] datosEstrella = conexion.conectarConsultarEstrella();

        // Clic en  botón se pongan los datos de la estrella
        L1.setText(datosEstrella[0]);
        L2.setText(datosEstrella[1]);
        L3.setText(datosEstrella[2]);
        L4.setText(datosEstrella[3]);
        L5.setText(datosEstrella[4]);


    }//GEN-LAST:event_BotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        /**
         * Limpia los JLabels estableciendo su texto en vacío. También limpia
         * las filas de la primera y segunda tabla.
         */
        
        // Limpiar los JLabels
        L1.setText("");
        L2.setText("");
        L3.setText("");
        L4.setText("");
        L5.setText("");

        // Limpiar la tabla primera
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Limpiar la segunda tabla 
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        model2.setRowCount(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Main */
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
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Funciones propias de la interfaz gráfica */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JLabel Composicion;
    private javax.swing.JLabel Distancia;
    private javax.swing.JLabel Estrella;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel Radio;
    private javax.swing.JLabel Temperatura;
    private javax.swing.JLabel TipoEstrella;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel satelites;
    private javax.swing.JComboBox<String> selectorPlanetas;
    // End of variables declaration//GEN-END:variables
}
