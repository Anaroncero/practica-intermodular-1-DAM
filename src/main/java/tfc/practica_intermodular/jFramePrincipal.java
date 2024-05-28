/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tfc.practica_intermodular;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipoEstrella)
                                    .addComponent(Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Composicion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estrella)
                            .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoEstrella)
                            .addComponent(L1))
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
                            .addComponent(Distancia)
                            .addComponent(L4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Composicion)
                            .addComponent(L5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorPlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPlanetasActionPerformed
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
    model.addRow(new Object[] { datosMarte[0], datosMarte[1], datosMarte[2], datosMarte[3], datosMarte[4], datosMarte[5], datosMarte[6], datosMarte[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Tierra")) {
    
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosTierra = conexion.conectarConsultarTierra();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosTierra[0], datosTierra[1], datosTierra[2], datosTierra[3], datosTierra[4], datosTierra[5], datosTierra[6], datosTierra[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Venus")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosVenus = conexion.conectarConsultarVenus();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosVenus[0], datosVenus[1], datosVenus[2], datosVenus[3], datosVenus[4], datosVenus[5], datosVenus[6], datosVenus[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Saturno")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosSaturno = conexion.conectarConsultarSaturno();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosSaturno[0], datosSaturno[1], datosSaturno[2], datosSaturno[3], datosSaturno[4], datosSaturno[5], datosSaturno[6], datosSaturno[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Júpiter")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosJupiter = conexion.conectarConsultarJupiter();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosJupiter[0], datosJupiter[1], datosJupiter[2], datosJupiter[3], datosJupiter[4], datosJupiter[5], datosJupiter[6], datosJupiter[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Urano")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosUrano = conexion.conectarConsultarUrano();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosUrano[0], datosUrano[1], datosUrano[2], datosUrano[3], datosUrano[4], datosUrano[5], datosUrano[6], datosUrano[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Neptuno")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosNeptuno = conexion.conectarConsultarNeptuno();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosNeptuno[0], datosNeptuno[1], datosNeptuno[2], datosNeptuno[3], datosNeptuno[4], datosNeptuno[5], datosNeptuno[6], datosNeptuno[7] });
    
} else if (selectorPlanetas.getSelectedItem().equals("Mercurio")) {
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosMercurio = conexion.conectarConsultarMercurio();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    model.addRow(new Object[] { datosMercurio[0], datosMercurio[1], datosMercurio[2], datosMercurio[3], datosMercurio[4], datosMercurio[5], datosMercurio[6], datosMercurio[7] });
    
}



    }//GEN-LAST:event_selectorPlanetasActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
      
    ConexionBaseDatos conexion = new ConexionBaseDatos();
    String[] datosEstrella = conexion.conectarConsultarEstrella();
    
    // Actualizar los JLabel con los datos de Marte
    L1.setText(datosEstrella[0]);
    L2.setText(datosEstrella[1]);
    L3.setText(datosEstrella[2]);
    L4.setText(datosEstrella[3]);
    L5.setText(datosEstrella[4]);
    

    

    }//GEN-LAST:event_BotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        model.setRowCount(0);
   
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> selectorPlanetas;
    // End of variables declaration//GEN-END:variables
}
