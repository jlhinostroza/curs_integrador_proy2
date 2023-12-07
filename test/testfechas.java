
import DAO.RegEnvioDAO;
import Formularios.JFRAMES.pan1;
import Formularios.JFRAMES.pan3;
import Modelo.RegEnvio;
import javax.swing.JOptionPane;

public class testfechas {

    public static void main(String[] args) {
        RegEnvio r = new RegEnvio();
        RegEnvioDAO rd = new RegEnvioDAO();

        r.setDesNombre(a1);
        r.setDesCorreo(a2);
        r.setDesNumero(a3);
        r.setDesDNI(Integer.parseInt(pan3.tfiDesDNI.getText()));
        r.setDesCiudad(rd.obtenerIdCiudad((String) pan1.jComboBoxCiudad2.getSelectedItem()));
        String idDestinatario = rd.registrarDestinatario(r);
    }
}
