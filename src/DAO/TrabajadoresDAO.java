
package DAO;

import Beans.Trabajadores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrabajadoresDAO {
    Util.MySQLConexion cn = new Util.MySQLConexion();
    Connection con;
    java.sql.PreparedStatement ps;
    ResultSet rs;
    Trabajadores p;
    ArrayList<Trabajadores> lista = new ArrayList<>();
    
     public ArrayList<Trabajadores> listarTodo() {
        try {
            String sql =  "SELECT * FROM trabajador";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Trabajadores();
                p.setId(rs.getString("traID"));
                p.setNombre(rs.getString("traNombre"));
                p.setCorreo(rs.getString("traCorreo"));
                p.setContra(rs.getString("traContrasena"));
                p.setTipo(rs.getInt("Trabajador_tipo_ID"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
