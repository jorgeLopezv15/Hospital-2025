
package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import paneles.DiseñoPanel;
import paneles.EntradaDeDatosPanel;

public class DashBoard extends JFrame {
    
    public DashBoard() {
        setTitle("hospital");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(new DiseñoPanel().getPanel(),BorderLayout.NORTH);
        this.add(new EntradaDeDatosPanel().getPanel(),BorderLayout.EAST);
        
        Tabla tabla = new Tabla();
        this.add(tabla, BorderLayout.EAST); 
        
    
        setVisible(true);
    }
}