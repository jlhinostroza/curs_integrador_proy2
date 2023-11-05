package DAO;

import Beans.PaqueteInfo;
import Util.MySQLConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaqueteInfoDAO {

    private final MySQLConexion cn = new MySQLConexion();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private PaqueteInfo paqueteInfo;
    private ArrayList<PaqueteInfo> lista = new ArrayList<>();

    public ArrayList<PaqueteInfo> listarInfoPaquetes() {
        try {
            String sql = "SELECT p.paqID, p.paqPeso, p.paqVolumen, r.remNombre as remitente_nombre, cr.ciuNombre as remitente_ciudad, cd.ciuNombre as destinatario_ciudad, e.envID, DATE_FORMAT(e.envFechaSalida, '%Y-%m-%d %H:%i:%s') as envFechaSalida, DATE_FORMAT(e.envFechaLlegada, '%Y-%m-%d %H:%i:%s') as envFechaLlegada, es.estDescripcion as estado_descripcion "
                    + "FROM paquete p "
                    + "JOIN remitente r ON p.Remitente_ID = r.remID "
                    + "JOIN ciudad cr ON r.Ciudad_ID = cr.ciuID "
                    + "JOIN destinatario d ON p.Destinatario_ID = d.desID "
                    + "JOIN ciudad cd ON d.Ciudad_ID = cd.ciuID "
                    + "JOIN envio e ON p.Envio_ID = e.envID "
                    + "JOIN envio_estado es ON e.Envio_estado_ID = es.estID";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                paqueteInfo = new PaqueteInfo();
                paqueteInfo.setPaqID(rs.getString("paqID"));
                paqueteInfo.setPaqPeso(rs.getDouble("paqPeso"));
                paqueteInfo.setPaqVolumen(rs.getDouble("paqVolumen"));
                paqueteInfo.setRemitenteNombre(rs.getString("remitente_nombre"));
                paqueteInfo.setRemitenteCiudad(rs.getString("remitente_ciudad"));
                paqueteInfo.setDestinatarioCiudad(rs.getString("destinatario_ciudad"));
                paqueteInfo.setEnvID(rs.getString("envID"));
                paqueteInfo.setEnvFechaSalida(rs.getString("envFechaSalida"));
                paqueteInfo.setEnvFechaLlegada(rs.getString("envFechaLlegada"));
                paqueteInfo.setEstDescripcion(rs.getString("estado_descripcion"));
                lista.add(paqueteInfo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteInfoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PaqueteInfoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public PaqueteInfo buscarPaquetePorID(String paqueteID) {
        PaqueteInfo paquete = null;
        try {
            String sql = "SELECT p.paqID, p.paqPeso, p.paqVolumen, r.remNombre as remitente_nombre, cr.ciuNombre as remitente_ciudad, cd.ciuNombre as destinatario_ciudad, e.envID, DATE_FORMAT(e.envFechaSalida, '%Y-%m-%d %H:%i:%s') as envFechaSalida, DATE_FORMAT(e.envFechaLlegada, '%Y-%m-%d %H:%i:%s') as envFechaLlegada, es.estDescripcion as estado_descripcion "
                    + "FROM paquete p "
                    + "JOIN remitente r ON p.Remitente_ID = r.remID "
                    + "JOIN ciudad cr ON r.Ciudad_ID = cr.ciuID "
                    + "JOIN destinatario d ON p.Destinatario_ID = d.desID "
                    + "JOIN ciudad cd ON d.Ciudad_ID = cd.ciuID "
                    + "JOIN envio e ON p.Envio_ID = e.envID "
                    + "JOIN envio_estado es ON e.Envio_estado_ID = es.estID "
                    + "WHERE p.paqID = ?";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, paqueteID);
            rs = ps.executeQuery();
            if (rs.next()) {
                paquete = new PaqueteInfo();
                paquete.setPaqID(rs.getString("paqID"));
                paquete.setPaqPeso(rs.getDouble("paqPeso"));
                paquete.setPaqVolumen(rs.getDouble("paqVolumen"));
                paquete.setRemitenteNombre(rs.getString("remitente_nombre"));
                paquete.setRemitenteCiudad(rs.getString("remitente_ciudad"));
                paquete.setDestinatarioCiudad(rs.getString("destinatario_ciudad"));
                paquete.setEnvID(rs.getString("envID"));
                paquete.setEnvFechaSalida(rs.getString("envFechaSalida"));
                paquete.setEnvFechaLlegada(rs.getString("envFechaLlegada"));
                paquete.setEstDescripcion(rs.getString("estado_descripcion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteInfoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PaqueteInfoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return paquete;
    }
}
