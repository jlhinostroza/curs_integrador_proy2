
package Clases;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class metodosDefectoVentana extends javax.swing.JFrame{
    public void metodosventana(String id){
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío App - User: " + id);

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
