
package DAO;

import Modelo.Provincias;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProvinciasDAO {
    Util.MySQLConexion cn = new Util.MySQLConexion();
    Connection con;
    java.sql.PreparedStatement ps;
    ResultSet rs;
    Provincias p;
    ArrayList<Provincias> lista = new ArrayList<>();
    
     public ArrayList<Provincias> listarPorDepartamento(int id) {
        try {
            String sql =  "SELECT * FROM ciudad WHERE Departamento_ID = ?";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);    
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Provincias();
                p.setId(rs.getString("ciuID"));
                p.setNombre(rs.getString("ciuNombre"));
                p.setDepID(rs.getString("Departamento_ID"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProvinciasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
