
package Formularios;

import Clases.DatosPrograma;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class formRegistrar extends javax.swing.JFrame {

    public formRegistrar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío Desktop App - " + DatosPrograma.version);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labVolver = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfiCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfiCorreo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfiCorreo2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tfiCorreo3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfiCorreo4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        tfiCorreo6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tfiContra = new javax.swing.JPasswordField();
        tfiContra1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        labVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labVolver.setForeground(new java.awt.Color(255, 255, 255));
        labVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVolver.setText("< Volver");
        labVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labVolver)
                .addContainerGap(966, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Crear Cuenta");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 910, 290, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¡Crea una cuenta en FácilEnvío!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 310, 38));

        jLabel2.setText("Apellido materno:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 270, -1));

        tfiCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo.setBorder(null);
        tfiCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreoActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 270, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 270, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 270, 20));

        tfiCorreo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo1.setBorder(null);
        tfiCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreo1ActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 270, 20));

        jLabel3.setText("Apellido paterno:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 270, 20));

        tfiCorreo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo2.setBorder(null);
        tfiCorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreo2ActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 270, 20));

        jLabel4.setText("Nombres:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 270, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 690, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 270, 20));

        tfiCorreo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo3.setBorder(null);
        tfiCorreo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreo3ActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 270, 20));

        jLabel6.setText("Número celular:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 270, -1));

        tfiCorreo4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo4.setBorder(null);
        tfiCorreo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreo4ActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 270, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 270, 20));

        jLabel7.setText("Departamento:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 270, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 690, 20));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 270, -1));

        jLabel8.setText("DNI:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 270, -1));

        jLabel9.setText("Provincia:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 270, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 270, -1));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 690, 20));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 830, 270, 20));

        jLabel10.setText("Contraseña:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 790, 270, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 760, 270, 20));

        tfiCorreo6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo6.setBorder(null);
        tfiCorreo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreo6ActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 740, 270, 20));

        jLabel11.setText("Correo electrónico:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 270, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 830, 270, 20));

        jLabel12.setText("Repetir contraseña:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 790, 270, -1));

        tfiContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiContra.setBorder(null);
        jPanel3.add(tfiContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 810, 270, 20));

        tfiContra1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiContra1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiContra1.setBorder(null);
        jPanel3.add(tfiContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 810, 270, 20));

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfiCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreoActionPerformed

    private void tfiCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreo1ActionPerformed

    private void tfiCorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreo2ActionPerformed

    private void tfiCorreo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreo3ActionPerformed

    private void tfiCorreo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreo4ActionPerformed

    private void tfiCorreo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreo6ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void labVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labVolverMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new formLogin().setVisible(true);
    }//GEN-LAST:event_labVolverMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labVolver;
    private javax.swing.JPasswordField tfiContra;
    private javax.swing.JPasswordField tfiContra1;
    private javax.swing.JTextField tfiCorreo;
    private javax.swing.JTextField tfiCorreo1;
    private javax.swing.JTextField tfiCorreo2;
    private javax.swing.JTextField tfiCorreo3;
    private javax.swing.JTextField tfiCorreo4;
    private javax.swing.JTextField tfiCorreo6;
    // End of variables declaration//GEN-END:variables
}
