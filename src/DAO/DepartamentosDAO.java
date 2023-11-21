
package DAO;

import Modelo.Departamentos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepartamentosDAO {
    Util.MySQLConexion cn = new Util.MySQLConexion();
    Connection con;
    java.sql.PreparedStatement ps;
    ResultSet rs;
    Departamentos p;
    ArrayList<Departamentos> lista = new ArrayList<>();
    
     public ArrayList<Departamentos> listarTodo() {
        try {
            String sql =  "SELECT * FROM departamento";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Departamentos();
                p.setId(rs.getInt("depID"));
                p.setNombre(rs.getString("depNombre"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
