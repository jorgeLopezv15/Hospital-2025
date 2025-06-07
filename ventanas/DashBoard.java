package ventanas;
import java.awt.Color;

import javax.swing.JFrame;

public class DashBoard extends JFrame {
    

 
    public DashBoard(){
        
        this.setTitle("DashBoard");
        this.setSize(1920,1080);
        this.setVisible(true);
        this.setBackground(Color.GREEN);
       
        
    }
   public JFrame getJFrame(){
return this;
   }
}