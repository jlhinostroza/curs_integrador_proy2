package Formularios.JFRAMES;

import Clases.metodosVentana;
import DAO.RegEnvioDAO;
import Formularios.diaTerminos;
import Formularios.formPrincipal;
import static Formularios.formPrincipal.content;
import javax.swing.JOptionPane;
import Modelo.RegEnvio;

public class pan5 extends javax.swing.JPanel {

    private formPrincipal inst;

    public pan5(formPrincipal inst) {
        this.inst = inst;
        initComponents();

        LlenarTextPane();
    }

    private void LlenarTextPane() {
        String resumen = "Datos del remitente --------------------------\n"
                + "Nombre completo: \n"
                + "ID de usuario: \n"
                + "Correo electrónico: \n"
                + "Número telefónico: \n"
                + "DNI: \n"
                + "\n"
                + "Datos del destinatario ------------------------\n"
                + "Nombre completo: \n"
                + "Correo electrónico: \n"
                + "Número telefónico: \n"
                + "DNI: \n"
                + "\n"
                + "Datos del paquete -----------------------------\n"
                + "Peso (Kg): \n"
                + "Volumen (cm³): \n"
                + "Descripción corta: \n"
                + "\n"
                + "Datos del envío -------------------------------\n"
                + "Ciudad de origen: \n"
                + "Ciudad de destino: \n"
                + "Fecha de salida: \n"
                + "Fecha de llegada: \n"
                + "\n"
                + "Total -----------------------------------------\n"
                + "Costo total: ";
        
        tpaResumen.setText(resumen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpaResumen = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(962, 648));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(831, 902));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Envío");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Paso 4: Resumen");

        jScrollPane2.setViewportView(tpaResumen);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Para continuar con la operación debe de aceptar nuestros Términos y Condiciones");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("< Volver");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String idEnvio, idDestinatario, idFactura, idPaquete;
        if (diaTerminos.aceptTerminos == true) {
            try {
                JOptionPane.showMessageDialog(this, "¡Registro exitoso!");
                pan1 p1 = new pan1(this.inst);
                metodosVentana.mostarPanel(content, p1, inst.getAncho(), inst.getAlto());
                
                
                RegEnvio r = new RegEnvio();
                RegEnvioDAO rd = new RegEnvioDAO();

                r.setDesNombre(pan3.tfiDesNombre.getText());
                r.setDesCorreo(pan3.tfiDesCorreo.getText());
                r.setDesNumero(Integer.parseInt(pan3.tfiDesNumero.getText()));
                r.setDesDNI(Integer.parseInt(pan3.tfiDesDNI.getText()));
                r.setDesCiudad(rd.obtenerIdCiudad((String) pan1.jComboBoxCiudad2.getSelectedItem()));
                idDestinatario = rd.registrarDestinatario(r);

                r.setCosto(Float.parseFloat(pan2.jTextFieldAncho.getText()),Float.parseFloat(pan2.jTextFieldAlto.getText()),Float.parseFloat(pan2.jTextFieldLargo.getText()));
                r.setEstadoEnvio(1);
                idEnvio = rd.registrarEnvio(r);
                
                r.setMetPago(pan4.valorMetodo);
                r.setEnvioID(idEnvio);
                idFactura = rd.registrarFactura(r);
                
                r.setDescripcion(pan2.jTextArea1.getText());
                r.setValor(Float.parseFloat(pan2.jTextFieldValor.getText()));
                r.setPeso(Float.parseFloat(pan2.jTextFieldPeso1.getText()));
                r.setVolumen(Float.parseFloat(pan2.jTextFieldAncho.getText()), Float.parseFloat(pan2.jTextFieldLargo.getText()), Float.parseFloat(pan2.jTextFieldLargo.getText()));
                r.setRemID(inst.id);
                r.setDesID(idDestinatario);
                r.setEnvioID(idEnvio);
                r.setFacID(idFactura);
                idPaquete = rd.registrarPaquete(r);
                
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(this, "Error en el ingreso de datos", "Error al registrar envío", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe aceptar los términos y condiciones", "Error al registrar envío", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new diaTerminos(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        pan4 p4 = new pan4(this.inst);
        metodosVentana.mostarPanel(content, p4, inst.getAncho(), inst.getAlto());
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane tpaResumen;
    // End of variables declaration//GEN-END:variables
}
