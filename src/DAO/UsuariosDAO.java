
package DAO;

import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuariosDAO {
    Util.MySQLConexion cn = new Util.MySQLConexion();
    Connection con;
    java.sql.PreparedStatement ps;
    ResultSet rs;
    Usuarios p;
    ArrayList<Usuarios> lista = new ArrayList<>();
    
    public static String nombreDepartamentoCiudad = null;
    
     public ArrayList<Usuarios> listarTodo() {
        try {
            String sql =  "SELECT * FROM remitente";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Usuarios();
                p.setId(rs.getString("remID"));
                p.setNombre(rs.getString("remNombre"));
                p.setCorreo(rs.getString("remCorreo"));
                p.setNumero(rs.getInt("remNumero"));
                p.setDni(rs.getInt("remDNI"));
                p.setContra(rs.getString("remContrasena"));
                p.setCiudad_id(rs.getString("Ciudad_ID"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
     
     public boolean registrarUsuario(Usuarios usuario) {
        try {
            String sql = "INSERT INTO remitente (remNombre, remCorreo, remNumero, remDNI, remContrasena, Ciudad_ID) VALUES (?, ?, ?, ?, ?, ?)";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setInt(3, usuario.getNumero());
            ps.setInt(4, usuario.getDni());
            ps.setString(5, usuario.getContra());
            ps.setString(6, usuario.getCiudad_id());
            
            int resultado = ps.executeUpdate();
            
            return resultado > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     public String obtenerNombreDepartamentoCiudadPorIDUsuario(String userID) {
        

        try {
            // Consulta para obtener el nombre del departamento y la ciudad
            String sql = "SELECT d.depNombre, c.ciuNombre "
                    + "FROM remitente r "
                    + "JOIN ciudad c ON r.Ciudad_ID = c.CiuID "
                    + "JOIN departamento d ON c.Departamento_ID = d.depID "
                    + "WHERE r.remID = ?";

            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, userID);
            rs = ps.executeQuery();

            if (rs.next()) {
                String nombreDepartamento = rs.getString("depNombre");
                String nombreCiudad = rs.getString("ciuNombre");

                // Concatenar el nombre del departamento y la ciudad
                nombreDepartamentoCiudad = nombreDepartamento + ", " + nombreCiudad;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return nombreDepartamentoCiudad;
    }
}
