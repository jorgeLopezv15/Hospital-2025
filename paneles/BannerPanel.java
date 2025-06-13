package paneles;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BannerPanel {
    private JPanel panelBanner;

    public BannerPanel() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,700));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.red);
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}