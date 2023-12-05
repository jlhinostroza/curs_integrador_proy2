
package Clases;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class metodosVentana extends javax.swing.JFrame{
    public void metodosventana(String id){
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío App - User: " + id);

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void mostarPanel(JPanel panMayor, JPanel panMenor, int w, int h){
        panMenor.setSize(w, h);
        panMenor.setLocation(0, 0);
        
        panMayor.removeAll();
        panMayor.add(panMenor, BorderLayout.CENTER);
        panMayor.revalidate();
        panMayor.repaint();
    }
}
