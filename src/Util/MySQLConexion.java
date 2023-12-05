package Util;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQLConexion {

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/db_facilenvio";
            String usr = "root";
            String psw = "";
            con = DriverManager.getConnection(url, usr, psw);
            System.out.println("conexion ok");
        } catch (ClassNotFoundException ex) {
            System.out.println("No hay Driver!!");
        } catch (SQLException ex) {
            System.out.println("Error con la BD ");
            JOptionPane.showMessageDialog(null, "No se puedo conectar a internet", "Error de conexión con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}