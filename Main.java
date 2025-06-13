import java.awt.BorderLayout;


import javax.swing.*;

import paneles.BannerPanel;
import paneles.LoginView;

public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame(); 
        
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(800, 600); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);
        

        LoginView loginPanel = new LoginView();
        miVentana.add(loginPanel.getPanel(), BorderLayout.CENTER);

        BannerPanel panelBanner = new BannerPanel();
        miVentana.add(panelBanner.getBanner(), BorderLayout.WEST);

        miVentana.setVisible(true);
    }
}