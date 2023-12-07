package DAO;

import Modelo.RegEnvio;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class RegEnvioDAO {

    private Connection con;
    Util.MySQLConexion cn = new Util.MySQLConexion();
    ResultSet rs;

    // Método para Registrar Destinatario
    public String registrarDestinatario(RegEnvio destinatario) {
        String idGenerado = null;
        try {
            String sql = "INSERT INTO destinatario (desNombre, desCorreo, desNumero, desDNI, Ciudad_ID) VALUES (?, ?, ?, ?, ?)";
            con = cn.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, destinatario.getDesNombre());
            ps.setString(2, destinatario.getDesCorreo());
            ps.setInt(3, destinatario.getDesNumero());
            ps.setInt(4, destinatario.getDesDNI());
            ps.setString(5, destinatario.getDesCiudad());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                // Obtén las claves generadas (en este caso, el ID de destinatario)
                ResultSet generatedKeys = ps.getGeneratedKeys();

                if (generatedKeys.next()) {
                    idGenerado = generatedKeys.getString(1);
                } else {
                    throw new SQLException("No se generó el ID de destinatario.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idGenerado;
    }

// Método para Registrar Envío
    public String registrarEnvio(RegEnvio envio) {
        String idGenerado = null;
        try {
            String sql = "INSERT INTO envio (envFechaSalida, envFechaLlegada, envCosto, Envio_estado_ID) VALUES (?, ?, ?, ?)";
            con = cn.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, envio.getFecha());
            ps.setString(2, envio.getFechaLlegada());
            ps.setFloat(3, envio.getCosto());
            ps.setInt(4, envio.getEstadoEnvio());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                // Obtén las claves generadas (en este caso, el ID de envío)
                ResultSet generatedKeys = ps.getGeneratedKeys();

                if (generatedKeys.next()) {
                    idGenerado = generatedKeys.getString(1);
                } else {
                    throw new SQLException("No se generó el ID de envío.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idGenerado;
    }

// Método para Registrar Factura
    public String registrarFactura(RegEnvio factura) {
        String idGenerado = null;
        try {
            String sql = "INSERT INTO factura (facFecha, Metodo_pago_ID, Envio_ID) VALUES (?, ?, ?)";
            con = cn.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, factura.getFecha());
            ps.setInt(2, factura.getMetPago());
            // Asignar el ID del envío correspondiente a la factura
            ps.setString(3, factura.getEnvioID());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                // Obtén las claves generadas (en este caso, el ID de factura)
                ResultSet generatedKeys = ps.getGeneratedKeys();

                if (generatedKeys.next()) {
                    idGenerado = generatedKeys.getString(1);
                } else {
                    throw new SQLException("No se generó el ID de factura.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idGenerado;
    }

    // Método para Registrar Paquete
    public String registrarPaquete(RegEnvio paquete) {
        String idGenerado = null;
        try {
            String sql = "INSERT INTO paquete (paqDescripcion, paqValor, paqPeso, paqVolumen, Remitente_ID, Destinatario_ID, Envio_ID, Factura_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            con = cn.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paquete.getDescripcion());
            ps.setFloat(2, paquete.getValor());
            ps.setFloat(3, paquete.getPeso());
            ps.setFloat(4, paquete.getVolumen());
            ps.setString(5, paquete.getRemID());
            ps.setString(6, paquete.getDesID());
            ps.setString(7, paquete.getEnvioID());
            ps.setString(8, paquete.getFacID());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                // Obtén las claves generadas (en este caso, el ID de paquete)
                ResultSet generatedKeys = ps.getGeneratedKeys();

                if (generatedKeys.next()) {
                    idGenerado = generatedKeys.getString(1);
                } else {
                    throw new SQLException("No se generó el ID de paquete.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idGenerado;
    }

    public String obtenerIdCiudad(String nombreCiudad) {
        String idCiudad = "-1"; // Valor predeterminado si no se encuentra la ciudad

        try {
            con = cn.getConexion(); // Reemplaza por tu método para obtener la conexión a la base de datos

            // Consulta SQL para obtener el ID de la ciudad por su nombre
            String sql = "SELECT ciuID FROM ciudad WHERE ciuNombre = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreCiudad);

            rs = ps.executeQuery();

            if (rs.next()) {
                // Se encontró la ciudad, obtén el ID
                idCiudad = rs.getString("ciuID");
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en una aplicación real
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idCiudad;
    }
}
