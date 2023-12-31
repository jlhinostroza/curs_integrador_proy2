package Formularios;

import Modelo.Trabajadores;
import Modelo.Usuarios;
import Clases.DatosPrograma;
import DAO.TrabajadoresDAO;
import DAO.UsuariosDAO;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formLogin extends javax.swing.JFrame {

    public static int i;
    public static ArrayList<Usuarios> usuariosList = new ArrayList<>();
    public static ArrayList<Trabajadores> trabajadoresList = new ArrayList<>();

    public formLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío Desktop App - " + DatosPrograma.version);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());

        tfiContra.addActionListener((ActionEvent e) -> {
            IniciarSesion();
        });
        tfiCorreo.addActionListener((ActionEvent e) -> {
            IniciarSesion();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfiCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfiContra = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboxPersonal = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 141, 38));

        jLabel2.setText("Correo electrónico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 270, -1));

        tfiCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo.setBorder(null);
        tfiCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(tfiCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 270, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 270, 20));

        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 270, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 270, 20));

        tfiContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiContra.setBorder(null);
        jPanel1.add(tfiContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, 20));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Para crear una cuenta FácilEnvío...");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 175, 175));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HAGA CLICK AQUÍ");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 400, 90));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Iniciar Sesión");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 290, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ISimg.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 120));

        cboxPersonal.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cboxPersonal.setText("Personal autorizado");
        jPanel1.add(cboxPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfiCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new formRegistrar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        IniciarSesion();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void IniciarSesion() {
        boolean comparar = false;
        String nom = "";

        if (cboxPersonal.isSelected()) {
            TrabajadoresDAO pd = new TrabajadoresDAO();

            trabajadoresList = pd.listarTodo();
            if (tfiCorreo.getText().isEmpty() || tfiContra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llenar correctamente los campos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {             
                for (i = 0; i < trabajadoresList.size(); i++) {
                    if (tfiCorreo.getText().equals(trabajadoresList.get(i).getCorreo()) && tfiContra.getText().equals(trabajadoresList.get(i).getContra())) {
                        nom = trabajadoresList.get(i).getNombre();
                        comparar = true;
                        break;
                    }
                }

                if (comparar) {
                    this.dispose();
                    // Verificar que i sea menor que usuariosList.size() antes de acceder al elemento
                    if (i < trabajadoresList.size()) {
                        new formPrincipalAdmin(trabajadoresList.get(i).getNombre(), trabajadoresList.get(i).getId(), trabajadoresList.get(i).getTipo()).setVisible(true);
                        JOptionPane.showMessageDialog(null, "¡Bienvenido/a " + nom + "!");
                    } else {
                        // Lógica adicional o mensaje de error si es necesario
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else {
            UsuariosDAO pd = new UsuariosDAO();

            usuariosList = pd.listarTodo();
            if (tfiCorreo.getText().isEmpty() || tfiContra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llenar correctamente los campos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                for (i = 0; i < usuariosList.size(); i++) {
                    if (tfiCorreo.getText().equals(usuariosList.get(i).getCorreo()) && tfiContra.getText().equals(usuariosList.get(i).getContra())) {
                        nom = usuariosList.get(i).getNombre();
                        comparar = true;
                        break;
                    }
                }

                if (comparar) {
                    this.dispose();
                    // Verificar que i sea menor que usuariosList.size() antes de acceder al elemento
                    if (i < usuariosList.size()) {
                        new formPrincipal(usuariosList.get(i).getNombre(), usuariosList.get(i).getId()).setVisible(true);
                        JOptionPane.showMessageDialog(null, "¡Bienvenido/a " + nom + "!");
                    } else {
                        // Lógica adicional o mensaje de error si es necesario
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(formLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cboxPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField tfiContra;
    private javax.swing.JTextField tfiCorreo;
    // End of variables declaration//GEN-END:variables
}
