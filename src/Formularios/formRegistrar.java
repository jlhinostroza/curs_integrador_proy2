package Formularios;

import Modelo.Departamentos;
import Modelo.Provincias;
import Modelo.Usuarios;
import Clases.DatosPrograma;
import DAO.DepartamentosDAO;
import DAO.ProvinciasDAO;
import DAO.UsuariosDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formRegistrar extends javax.swing.JFrame {

    String apPaterno, apMaterno, nombres, departamento, provincia, correo, contra1, contra2, selectedProvinciaID;
    int numero, dni;
    boolean registroExitoso;

    public formRegistrar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío Desktop App - " + DatosPrograma.version);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());

        DepartamentosDAO departamentosDAO = new DepartamentosDAO();
        ArrayList<Departamentos> departamentos = departamentosDAO.listarTodo();
        final ArrayList<Provincias> provincias = new ArrayList<>();

        // Agregar la opción predeterminada al ComboBox de provincias
        comProvincia.addItem("--- Seleccione una provincia ---");

        for (Departamentos departamento : departamentos) {
            comDepartamento.addItem(departamento.getNombre());
        }

        comDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedDepartamentoIndex = comDepartamento.getSelectedIndex();

                if (selectedDepartamentoIndex > 0) {
                    int selectedDepartamentoID = departamentos.get(selectedDepartamentoIndex - 1).getId();
                    
                    
                    
                    ProvinciasDAO provinciasDAO = new ProvinciasDAO();
                    provincias.clear();
                    provincias.addAll(provinciasDAO.listarPorDepartamento(selectedDepartamentoID));

                    comProvincia.removeAllItems();
                    comProvincia.addItem("--- Seleccione una provincia ---");
                    for (Provincias provincia : provincias) {
                        comProvincia.addItem(provincia.getNombre());
                    }
                }
            }
        });

        comProvincia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedProvinciaIndex = comProvincia.getSelectedIndex();
                
                if (selectedProvinciaIndex > 0) {
                    selectedProvinciaID = provincias.get(selectedProvinciaIndex - 1).getId();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labVolver = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        butCrearCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfiApellidoMat = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfiApellidoPat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfiNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tfiNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfiDNI = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        comDepartamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comProvincia = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        tfiCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tfiRecontra = new javax.swing.JPasswordField();
        tfiContra = new javax.swing.JPasswordField();

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

        butCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        butCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butCrearCuenta.setText("Crear Cuenta");
        butCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCrearCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 910, 290, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¡Crea una cuenta en FácilEnvío!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 310, 38));

        jLabel2.setText("Apellido materno:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 270, -1));

        tfiApellidoMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiApellidoMat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiApellidoMat.setBorder(null);
        tfiApellidoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiApellidoMatActionPerformed(evt);
            }
        });
        jPanel3.add(tfiApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 270, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 270, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 270, 20));

        tfiApellidoPat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiApellidoPat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiApellidoPat.setBorder(null);
        tfiApellidoPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiApellidoPatActionPerformed(evt);
            }
        });
        jPanel3.add(tfiApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 270, 20));

        jLabel3.setText("Apellido paterno:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 270, 20));

        tfiNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiNombres.setBorder(null);
        tfiNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiNombresActionPerformed(evt);
            }
        });
        jPanel3.add(tfiNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 270, 20));

        jLabel4.setText("Nombres:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 270, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 690, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 270, 20));

        tfiNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiNumero.setBorder(null);
        tfiNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiNumeroActionPerformed(evt);
            }
        });
        jPanel3.add(tfiNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 270, 20));

        jLabel6.setText("Número celular:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 270, -1));

        tfiDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiDNI.setBorder(null);
        tfiDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiDNIActionPerformed(evt);
            }
        });
        jPanel3.add(tfiDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 270, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 270, 20));

        jLabel7.setText("Departamento:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 270, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 690, 20));

        comDepartamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccione un departamento ---" }));
        jPanel3.add(comDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 270, -1));

        jLabel8.setText("DNI:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 270, -1));

        jLabel9.setText("Provincia:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 270, -1));

        comProvincia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(comProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 270, -1));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 690, 20));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 830, 270, 20));

        jLabel10.setText("Contraseña:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 790, 270, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 760, 270, 20));

        tfiCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiCorreo.setBorder(null);
        tfiCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiCorreoActionPerformed(evt);
            }
        });
        jPanel3.add(tfiCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 740, 270, 20));

        jLabel11.setText("Correo electrónico:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 270, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 830, 270, 20));

        jLabel12.setText("Repetir contraseña:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 790, 270, -1));

        tfiRecontra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiRecontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiRecontra.setBorder(null);
        jPanel3.add(tfiRecontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 810, 270, 20));

        tfiContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiContra.setBorder(null);
        jPanel3.add(tfiContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 810, 270, 20));

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfiApellidoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiApellidoMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiApellidoMatActionPerformed

    private void tfiApellidoPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiApellidoPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiApellidoPatActionPerformed

    private void tfiNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiNombresActionPerformed

    private void tfiNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiNumeroActionPerformed

    private void tfiDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiDNIActionPerformed

    private void tfiCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiCorreoActionPerformed

    private void butCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCrearCuentaMouseClicked
        obtenerValores();
        validarDatos();
        almacenarValores();
        if (registroExitoso) {
            JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new formLogin().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario en la base de datos. Intente más tarde.", "Error al registrarse", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butCrearCuentaMouseClicked

    private void obtenerValores() {
        try {
            apPaterno = tfiApellidoPat.getText();
            apMaterno = tfiApellidoMat.getText();
            nombres = tfiNombres.getText();
            numero = Integer.parseInt(tfiNumero.getText());
            dni = Integer.parseInt(tfiDNI.getText());
            departamento = (String) comDepartamento.getSelectedItem();
            provincia = (String) comProvincia.getSelectedItem();
            correo = tfiCorreo.getText();
            contra1 = tfiContra.getText();
            contra2 = tfiRecontra.getText();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Llenar correctamente los campos.", "Error al registrarse", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validarDatos() {
        // Validar que los campos no estén vacíos
        if (apPaterno.isEmpty() || apMaterno.isEmpty() || nombres.isEmpty() || departamento.equals("--- Seleccione un departamento ---") || provincia.equals("--- Seleccione una provincia ---") || correo.isEmpty() || contra1.isEmpty() || contra2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error al registrarse.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Respetar el formato del correo
        if (!correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo inválido", "Error al registrarse.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ejemplo de validación de contraseñas coincidentes
        if (!contra1.equals(contra2)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no coinciden", "Error al registrarse.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dni <= 0 || String.valueOf(dni).length() != 8) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número de 8 dígitos", "Error al registrarse.", JOptionPane.ERROR_MESSAGE);
            return; // Detener la validación si el DNI no es válido
        }
        
        if (numero <= 0 || String.valueOf(numero).length() != 9) {
            JOptionPane.showMessageDialog(this, "El número celular debe ser un número de 9 dígitos", "Error al registrarse.", JOptionPane.ERROR_MESSAGE);
            return; // Detener la validación si el DNI no es válido
        }

        String nombrePattern = "^[a-zA-Zá-úÁ-Ú]+(?:\\s[a-zA-Zá-úÁ-Ú]+)?$";
        if (!apPaterno.matches(nombrePattern) || !apMaterno.matches(nombrePattern) || !nombres.matches(nombrePattern)) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un formato válido para los nombres y apellidos (sin números).", "Error al registrarse", JOptionPane.ERROR_MESSAGE);
            return; // Detener la validación si el formato no es válido
        }
        
        
    }
    
    private void almacenarValores(){
        Usuarios p = new Usuarios();
        UsuariosDAO u = new UsuariosDAO();
        p.setNombre(apPaterno + " " + apMaterno + ", " + nombres);
        p.setCorreo(correo);
        p.setNumero(numero);
        p.setDni(dni);
        p.setContra(contra1);
        p.setCiudad_id(selectedProvinciaID);
        
        registroExitoso = u.registrarUsuario(p);
    }
    

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
    private javax.swing.JLabel butCrearCuenta;
    private javax.swing.JComboBox<String> comDepartamento;
    private javax.swing.JComboBox<String> comProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField tfiApellidoMat;
    private javax.swing.JTextField tfiApellidoPat;
    private javax.swing.JPasswordField tfiContra;
    private javax.swing.JTextField tfiCorreo;
    private javax.swing.JTextField tfiDNI;
    private javax.swing.JTextField tfiNombres;
    private javax.swing.JTextField tfiNumero;
    private javax.swing.JPasswordField tfiRecontra;
    // End of variables declaration//GEN-END:variables
}
