package vistas;

import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;

public class BannerPanel {
    
    private JPanel panelBanner;

    public BannerPanel() {

        panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500, 800)); 
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    }
    
    public JPanel getJPanel() {
        return panelBanner;
    }
}