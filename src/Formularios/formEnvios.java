package Formularios;


import Util.MySQLConexion;
import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class formEnvios extends javax.swing.JFrame {
    
    MySQLConexion cc= new MySQLConexion();
    java.sql.Connection con=cc.getConexion();

    public formEnvios() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void mostrar(){
        String sql ="select * from envio";
        Statement st ;
        MySQLConexion cc= new MySQLConexion();
        java.sql.Connection con=cc.getConexion();
        System.out.println(sql);
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("envID");
        model.addColumn("envFechaSalida");
        model.addColumn("envFechaLlegada");
        model.addColumn("envCosto");
        model.addColumn("Estado");
        visor.setModel(model);
        
        String [] datos = new String [5];
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            while(rs.next())
            {
                datos[0] = rs.getString(1); 
                datos[1] = rs.getString(2);  
                datos[2] = rs.getString(3);  
                datos[3] = rs.getString(4);  
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
        
    }
public void insertarFechas(){
    String sql = "INSERT INTO envio(envFechaSalida, envFechaLlegada, envCosto, Envio_estado_ID) VALUES (?, ?, ?, ?)";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        
        // Obtén las fechas como Strings y el costo como un Double
        String fechaSalida = ((JTextField) jdSalida.getDateEditor().getUiComponent()).getText();
        String fechaLlegada = ((JTextField) jdLlegada.getDateEditor().getUiComponent()).getText();

        // Convierte el texto del campo txtCosto a un Double (manejando excepciones si es necesario)
        double costo = 0.0;  // Valor predeterminado en caso de error
        try {
            costo = Double.parseDouble(txtCosto.getText());
        } catch (NumberFormatException e) {
            // Manejar la excepción si el usuario ingresó un valor no numérico
            e.printStackTrace();  // Otra opción sería mostrar un mensaje de error al usuario
        }
        int idEstadoEnvio = getIdEstadoEnvio();

        // Establece los valores en el PreparedStatement
        pst.setString(1, fechaSalida);
        pst.setString(2, fechaLlegada);
        pst.setDouble(3, costo);
        pst.setInt(4, idEstadoEnvio);
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Fecha Registrada");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de Registro: " + e.getMessage());
    }
}
public void Eliminar() {
    // Obtiene la fila seleccionada de la JTable
    int filaSeleccionada = visor.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar");
        return;
    }

    // Obtiene el valor de la columna que contiene la clave primaria (supongamos que es la columna 0)
    Object envID = visor.getValueAt(filaSeleccionada, 0);

    String sql = "DELETE FROM envio WHERE envID = ?"; // Reemplaza clave_primaria con el nombre real de tu columna de clave primaria
    try {
        java.sql.Connection con = cc.getConexion();
        try (PreparedStatement st = con.prepareStatement(sql)) {
            // Establece el valor de la clave primaria en el parámetro de la consulta SQL
            st.setObject(1, envID);
            
            int rs = st.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
            }
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
}

private int getIdEstadoEnvio() {
    // Implementa la lógica para obtener el ID del estado de envío según tus necesidades
    // Puede ser una consulta a la base de datos u otra lógica de obtención
    return 1;  // Por ejemplo, devolver un valor fijo para demostración
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdSalida = new com.toedter.calendar.JDateChooser();
        jdLlegada = new com.toedter.calendar.JDateChooser();
        txtCosto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdSalida.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        jdLlegada.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel2.setText("FECHA DE SALIDA:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel3.setText("FECHA DE LLEGADA:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel4.setText("COSTO:");

        btnIngresar.setBackground(new java.awt.Color(102, 255, 51));
        btnIngresar.setForeground(new java.awt.Color(0, 255, 0));
        btnIngresar.setText("AGREGAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(102, 204, 255));
        btnListar.setForeground(new java.awt.Color(0, 204, 255));
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CONFIGURACION DE PEDIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jdSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    insertarFechas();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        mostrar(); 
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    String id = visor.getValueAt(visor.getSelectedRow(), 0).toString();
    MySQLConexion cc= new MySQLConexion();
    Eliminar();
    mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(formEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEnvios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdLlegada;
    private com.toedter.calendar.JDateChooser jdSalida;
    private javax.swing.JTextField txtCosto;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
