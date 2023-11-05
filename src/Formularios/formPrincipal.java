
package Formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class formPrincipal extends javax.swing.JFrame {

    public formPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío App - User: ");

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        scrInicio = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scrCotizador = new javax.swing.JScrollPane();
        scrRegEnvio = new javax.swing.JScrollPane();
        scrTracking = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitSalir = new javax.swing.JMenuItem();
        mitSalir1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        scrInicio.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        scrInicio.setViewportView(jPanel1);

        jTabbedPane1.addTab("Inicio", scrInicio);

        scrCotizador.setBorder(null);
        jTabbedPane1.addTab("Cotizador", scrCotizador);

        scrRegEnvio.setBorder(null);
        jTabbedPane1.addTab("Registrar envío", scrRegEnvio);

        scrTracking.setBorder(null);
        jTabbedPane1.addTab("Tracking", scrTracking);

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mitSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mitSalir.setText("Cerrar sesión");
        mitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mitSalir);

        mitSalir1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitSalir1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mitSalir1.setText("Salir");
        mitSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalir1ActionPerformed(evt);
            }
        });
        jMenu1.add(mitSalir1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Acerca del programa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está segur@ de continuar?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!", "", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new formLogin().setVisible(true);
        }
    }//GEN-LAST:event_mitSalirActionPerformed

    private void mitSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalir1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mitSalir1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        diaAcercaPrograma dialog = new diaAcercaPrograma(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitSalir1;
    private javax.swing.JScrollPane scrCotizador;
    private javax.swing.JScrollPane scrInicio;
    private javax.swing.JScrollPane scrRegEnvio;
    private javax.swing.JScrollPane scrTracking;
    // End of variables declaration//GEN-END:variables
}
