package paneles;

import java.awt.*;
import javax.swing.*;

public class DiseñoPanel extends JPanel {
    
    public DiseñoPanel() {
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(1200, 60));
        this.setLayout(new GridBagLayout());

        
        Font largeFont = new Font("SansSerif", Font.BOLD, 23);

        GridBagConstraints gbc = new GridBagConstraints();
       
        JLabel vista = new JLabel("Pacientes");
        vista.setFont(largeFont);
        vista.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        this.add(vista, gbc);
        
       
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        this.add(Box.createGlue(), gbc);
        
    }
    
    public JPanel getPanel() {
        return this;
    }
}