package Formularios;

import Modelo.PaqueteInfo;
import DAO.PaqueteInfoDAO;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formPrincipalAdmin extends javax.swing.JFrame {
    
    private String nombre, id;
    private int tipo;

    public formPrincipalAdmin(String nombre, String id, int tipo) {
        
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío App - User: " + id);

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
        buttonGroup1.add(radEst1);
        buttonGroup1.add(radEst2);
        buttonGroup1.add(radEst3);
        buttonGroup1.add(radEst4);
        
        labNombre.setText(nombre);
        labCodigo.setText(id);
        
        if (tipo == 2){
            menMantenimiento.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabMenu = new javax.swing.JTabbedPane();
        scrInicio = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labNombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labCodigo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        radEst1 = new javax.swing.JRadioButton();
        radEst2 = new javax.swing.JRadioButton();
        radEst3 = new javax.swing.JRadioButton();
        radEst4 = new javax.swing.JRadioButton();
        cheEditar = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel13 = new javax.swing.JPanel();
        butActualizar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitSalir = new javax.swing.JMenuItem();
        mitSalir1 = new javax.swing.JMenuItem();
        menMantenimiento = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carga.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Paquetes en proceso de envío");

        labNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNombre.setText("NOMBRE COMPLETO");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("¡Bienvenido/a!");

        labCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCodigo.setText("NOMBRE COMPLETO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID de usuario:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID paquete", "Estado de envío"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labNombre)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labCodigo)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
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
        butBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butBuscar1MouseClicked(evt);
            }
        });

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

        radEst1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radEst1.setText("En cola de envío");
        radEst1.setEnabled(false);
        radEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEst1ActionPerformed(evt);
            }
        });

        radEst2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radEst2.setText("Preparando su salida de la oficina");
        radEst2.setEnabled(false);

        radEst3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radEst3.setText("En transporte");
        radEst3.setEnabled(false);
        radEst3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEst3ActionPerformed(evt);
            }
        });

        radEst4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radEst4.setText("Entregado al remitente");
        radEst4.setEnabled(false);

        cheEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheEditar.setText("Editar estado de envío");
        cheEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cheEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cheEditarItemStateChanged(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        jPanel13.setBackground(new java.awt.Color(255, 0, 0));

        butActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butActualizar.setForeground(new java.awt.Color(255, 255, 255));
        butActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butActualizar.setText("Actualizar estado");
        butActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfiId1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cheEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radEst1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radEst2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radEst3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radEst4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(55, 55, 55)
                        .addComponent(radEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radEst4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheEditar)
                .addGap(45, 45, 45))
        );

        scrEstEnvio.setViewportView(jPanel6);

        tabMenu.addTab("Estado de envío", scrEstEnvio);

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

        menMantenimiento.setText("Mantenimiento");
        menMantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Mantenimiento de personal");
        menMantenimiento.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Mantenimiento de usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menMantenimiento.add(jMenuItem3);

        jMenuBar1.add(menMantenimiento);

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
            .addComponent(tabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro/a de querer cerrar sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!", "", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new formLogin().setVisible(true);
        }
    }//GEN-LAST:event_mitSalirActionPerformed

    private void mitSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalir1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro/a de querer salir?", "Cerrar aplicación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!", "", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
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

    private void radEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radEst1ActionPerformed

    private void butBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscar1MouseClicked
        // Obtén el ID ingresado
        String paqueteID = tfiId1.getText().trim(); // Trimming para eliminar espacios en blanco al inicio y final

        // Si el campo tfiCorreo está vacío, muestra un mensaje
        if (paqueteID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un ID de paquete para buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crea un StringBuilder para almacenar los datos del paquete
        StringBuilder paqueteInfoText = new StringBuilder();

        // Realiza la búsqueda por ID si se ingresó un valor en tfiCorreo
        PaqueteInfoDAO paqueteInfoDAO = new PaqueteInfoDAO();
        PaqueteInfo paquete = paqueteInfoDAO.buscarPaquetePorID(paqueteID);

        // Si se encuentra el paquete, agrega la información al StringBuilder
        if (paquete != null) {
            paqueteInfoText.append("ID de Paquete: ").append(paquete.getPaqID()).append("\n");
            paqueteInfoText.append("Peso (Kg): ").append(paquete.getPaqPeso()).append("\n");
            paqueteInfoText.append("Volumen (cm³): ").append(paquete.getPaqVolumen()).append("\n");
            paqueteInfoText.append("Remitente: ").append(paquete.getRemitenteNombre()).append("\n");
            paqueteInfoText.append("Origen: ").append(paquete.getRemitenteCiudad()).append("\n");
            paqueteInfoText.append("Destino: ").append(paquete.getDestinatarioCiudad()).append("\n");
            paqueteInfoText.append("ID de Envío: ").append(paquete.getEnvID()).append("\n");
            paqueteInfoText.append("Fecha de Salida: ").append(paquete.getEnvFechaSalida()).append("\n");
            paqueteInfoText.append("Fecha de Llegada: ").append(paquete.getEnvFechaLlegada()).append("\n");
            paqueteInfoText.append("Estado de Envío: ").append(paquete.getEstDescripcion());
        } else {
            // Muestra un mensaje si el paquete no se encuentra
            JOptionPane.showMessageDialog(null, "No se encontró el paquete con el ID ingresado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Establece el texto en el JTextPane
        jTextPane1.setText(paqueteInfoText.toString());
    }//GEN-LAST:event_butBuscar1MouseClicked

    private void cheEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cheEditarItemStateChanged
        if (cheEditar.isSelected()) {
            if (!tfiId1.getText().isEmpty()) {
                // Habilitar los radiobuttons
                radEst1.setEnabled(true);
                radEst2.setEnabled(true);
                radEst3.setEnabled(true);
                radEst4.setEnabled(true);
            }
        } else {
            // Deshabilitar y limpiar la selección de los radiobuttons
            radEst1.setEnabled(false);
            radEst2.setEnabled(false);
            radEst3.setEnabled(false);
            radEst4.setEnabled(false);

            buttonGroup1.clearSelection();

        }
    }//GEN-LAST:event_cheEditarItemStateChanged

    private void butActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butActualizarMouseClicked
        // TODO add your handling code here:
        // Obtener el nuevo estado seleccionado
        int nuevoEstado = -1; // Valor predeterminado para ninguno seleccionado
        if (radEst1.isSelected()) {
            nuevoEstado = 1;
        } else if (radEst2.isSelected()) {
            nuevoEstado = 2;
        } else if (radEst3.isSelected()) {
            nuevoEstado = 3;
        } else if (radEst4.isSelected()) {
            nuevoEstado = 4;
        }

        if (nuevoEstado != -1) {
            // Realizar la actualización en la base de datos con el nuevo estado
            String paqueteID = ""; // Debes obtener el ID del paquete que deseas actualizar
            if (!tfiId1.getText().isEmpty()) {
                paqueteID = tfiId1.getText();
            }

            if (!paqueteID.isEmpty()) {
                // Llamar al método del DAO para actualizar el estado
                PaqueteInfoDAO paqueteInfoDAO = new PaqueteInfoDAO();
                if (paqueteInfoDAO.actualizarEstadoEnvio(paqueteID, nuevoEstado)) {
                    // La actualización se realizó con éxito
                    JOptionPane.showMessageDialog(this, "Actualización realizada con éxito.", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                    // Limpiar la selección de radiobuttons
                    buttonGroup1.clearSelection();

                    cheEditar.setSelected(false);

                    // Limpiar el contenido del TextPane
                    jTextPane1.setText("");

                    tfiId1.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado del paquete.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de paquete válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un nuevo estado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butActualizarMouseClicked

    private void radEst3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEst3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radEst3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipalAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipalAdmin(formLogin.trabajadoresList.get(formLogin.i).getNombre(), formLogin.trabajadoresList.get(formLogin.i).getId(), formLogin.trabajadoresList.get(formLogin.i).getTipo()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butActualizar;
    private javax.swing.JLabel butBuscar;
    private javax.swing.JLabel butBuscar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cheEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labNombre;
    private javax.swing.JMenu menMantenimiento;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitSalir1;
    private javax.swing.JRadioButton radEst1;
    private javax.swing.JRadioButton radEst2;
    private javax.swing.JRadioButton radEst3;
    private javax.swing.JRadioButton radEst4;
    private javax.swing.JScrollPane scrControlEnvios;
    private javax.swing.JScrollPane scrEstEnvio;
    private javax.swing.JScrollPane scrInicio;
    private javax.swing.JTabbedPane tabMenu;
    private javax.swing.JTable tabPaquete;
    private javax.swing.JTextField tfiId;
    private javax.swing.JTextField tfiId1;
    // End of variables declaration//GEN-END:variables
}
