package tallergestion;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TallerGestion {

    public static void main(String[] args) {
       
        JFrame ventana = new JFrame("Gestión de Taller");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300); // ancho x alto

      
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Bienvenido al sistema de gestión del taller");
        panel.add(etiqueta);

  
        ventana.add(panel);

        ventana.setVisible(true);
    }
}
