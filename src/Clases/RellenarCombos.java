/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RellenarCombos {
    public void RellenarComboBoxDepartamentos(String valor, JComboBox combo) {
        String sql = "SELECT * FROM `departamento` ORDER BY depID ASC";
        Statement st;
        Util.MySQLConexion con = new Util.MySQLConexion();
        Connection conexion = con.getConexion();
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
        }
        
    }
    public void RellenarComboBoxCiudades(String departamento, String valor, JComboBox combo) {
        String sql = "SELECT * FROM ciudad c INNER JOIN departamento d ON  c.Departamento_ID=d.depID  WHERE d.depNombre = '"+departamento+"'";
        Statement st;
        Util.MySQLConexion con = new Util.MySQLConexion();
        Connection conexion = con.getConexion();
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
        }
        
    }
}
