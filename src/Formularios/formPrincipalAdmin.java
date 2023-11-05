package Formularios;

import Beans.PaqueteInfo;
import DAO.PaqueteInfoDAO;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formPrincipalAdmin extends javax.swing.JFrame {

    public formPrincipalAdmin() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío App - User: ");

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        DefaultTableModel model = (DefaultTableModel) tabPaquete.getModel(); // Obtén el modelo de la tabla

        PaqueteInfoDAO paqueteInfoDAO = new PaqueteInfoDAO();
        ArrayList<PaqueteInfo> paquetes = paqueteInfoDAO.listarInfoPaquetes();
        for (PaqueteInfo paquete : paquetes) {
            model.addRow(new Object[]{
                paquete.getPaqID(),
                paquete.getPaqPeso(),
                paquete.getPaqVolumen(),
                paquete.getRemitenteNombre(),
                paquete.getRemitenteCiudad(),
                paquete.getDestinatarioCiudad(),
                paquete.getEnvID(),
                paquete.getEnvFechaSalida(),
                paquete.getEnvFechaLlegada(),
                paquete.getEstDescripcion()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMenu = new javax.swing.JTabbedPane();
        scrInicio = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scrControlEnvios = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfiId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        butBuscar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabPaquete = new javax.swing.JTable();
        scrEstEnvio = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfiId1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        butBuscar1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        scrTracking = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitSalir = new javax.swing.JMenuItem();
        mitSalir1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabMenu.setBackground(new java.awt.Color(51, 51, 51));
        tabMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        scrInicio.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
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

        tabMenu.addTab("Inicio", scrInicio);

        scrControlEnvios.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(876, 567));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Control y Búsqueda de Envíos");

        jLabel2.setText("ID de paquete:");

        tfiId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiId.setBorder(null);
        tfiId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiIdActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        butBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butBuscar.setForeground(new java.awt.Color(255, 255, 255));
        butBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butBuscar.setText("Buscar");
        butBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        tabPaquete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabPaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID paquete", "Peso (kg)", "Volumen (cm³)", "Remitente", "Origen", "Destino", "ID envío", "Fecha de salida", "Fecha de llegada", "Estado de envío"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabPaquete);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfiId, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfiId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        scrControlEnvios.setViewportView(jPanel3);

        tabMenu.addTab("Control de envíos", scrControlEnvios);

        scrEstEnvio.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Estado de Envío");

        jLabel3.setText("ID de paquete:");

        tfiId1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfiId1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfiId1.setBorder(null);
        tfiId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiId1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        butBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        butBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butBuscar1.setText("Buscar");
        butBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butBuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setText("En cola de envío");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setText("Preparando su salida de la oficina");

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton3.setText("En transporte");

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton4.setText("Entregado al remitente");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("Editar estado de envío");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfiId1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tfiId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(161, 161, 161))))
        );

        scrEstEnvio.setViewportView(jPanel6);

        tabMenu.addTab("Estado de envío", scrEstEnvio);

        scrTracking.setBorder(null);
        tabMenu.addTab("Tracking", scrTracking);

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

        jMenu3.setText("Mantenimiento");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Acerca del programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        diaAcercaPrograma dialog = new diaAcercaPrograma(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tfiIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiIdActionPerformed

    private void butBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscarMouseClicked
        // Obtén el ID ingresado
        String paqueteID = tfiId.getText().trim(); // Trimming para eliminar espacios en blanco al inicio y final

        // Limpia la tabla antes de realizar una nueva búsqueda
        DefaultTableModel model = (DefaultTableModel) tabPaquete.getModel();
        model.setRowCount(0);

        // Si el campo tfiCorreo está vacío, muestra la lista de todos los paquetes
        if (paqueteID.isEmpty()) {
            PaqueteInfoDAO paqueteInfoDAO = new PaqueteInfoDAO();
            ArrayList<PaqueteInfo> paquetes = paqueteInfoDAO.listarInfoPaquetes();
            for (PaqueteInfo paquete : paquetes) {
                model.addRow(new Object[]{
                    paquete.getPaqID(),
                    paquete.getPaqPeso(),
                    paquete.getPaqVolumen(),
                    paquete.getRemitenteNombre(),
                    paquete.getRemitenteCiudad(),
                    paquete.getDestinatarioCiudad(),
                    paquete.getEnvID(),
                    paquete.getEnvFechaSalida(),
                    paquete.getEnvFechaLlegada(),
                    paquete.getEstDescripcion()
                });
            }
        } else {
            // Realiza la búsqueda por ID si se ingresó un valor en tfiCorreo
            PaqueteInfoDAO paqueteInfoDAO = new PaqueteInfoDAO();
            PaqueteInfo paquete = paqueteInfoDAO.buscarPaquetePorID(paqueteID);

            // Si se encuentra el paquete, agrega la fila correspondiente a la tabla
            if (paquete != null) {
                model.addRow(new Object[]{
                    paquete.getPaqID(),
                    paquete.getPaqPeso(),
                    paquete.getPaqVolumen(),
                    paquete.getRemitenteNombre(),
                    paquete.getRemitenteCiudad(),
                    paquete.getDestinatarioCiudad(),
                    paquete.getEnvID(),
                    paquete.getEnvFechaSalida(),
                    paquete.getEnvFechaLlegada(),
                    paquete.getEstDescripcion()
                });
            } else {
                // Muestra un mensaje si el paquete no se encuentra
                JOptionPane.showMessageDialog(null, "No se encontró el paquete con el ID ingresado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_butBuscarMouseClicked

    private void tfiId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiId1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butBuscar;
    private javax.swing.JLabel butBuscar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitSalir1;
    private javax.swing.JScrollPane scrControlEnvios;
    private javax.swing.JScrollPane scrEstEnvio;
    private javax.swing.JScrollPane scrInicio;
    private javax.swing.JScrollPane scrTracking;
    private javax.swing.JTabbedPane tabMenu;
    private javax.swing.JTable tabPaquete;
    private javax.swing.JTextField tfiId;
    private javax.swing.JTextField tfiId1;
    // End of variables declaration//GEN-END:variables
}
