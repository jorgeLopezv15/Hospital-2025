package paneles;
import java.awt.*;
import javax.swing.*;

public class EntradaDeDatosPanel extends JPanel {
    
    public EntradaDeDatosPanel() {
        this.setSize(200, 800);
        this.setOpaque(true);
        this.setBackground(Color.BLUE);
        
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 10, 15); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        JButton historialBtn = new JButton("Historial");
        JButton pacientesBtn = new JButton("Pacientes");
        historialBtn.setPreferredSize(new Dimension(150, 45));
        pacientesBtn.setPreferredSize(new Dimension(150, 45));
        
        
        this.add(historialBtn, gbc);
        this.add(pacientesBtn, gbc);
    }

    public JPanel getPanel() {
        return this;
    }
}