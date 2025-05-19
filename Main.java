import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;                      //JLabel: Para mostrar texto dentro de esa ventana.



public class Main {

    public static void main(String[] args ) {

        //crear una ventana con frame

     JFrame miVentana = new JFrame();           ///crear un objeto JFrame (miventana)
     miVentana.setTitle("Hospital SCL");             //Establecer un titulo
     miVentana.setSize(1000,800);           //Definir el tamanno, ancho y alto
     miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     miVentana.setLayout(new BorderLayout());

    

     //CAJA

     //PANEL BANNER
    JPanel panelBanner = new JPanel();
    panelBanner.setPreferredSize(new Dimension(500, 800));
    panelBanner.setOpaque(true);
    panelBanner.setBackground(Color.RED);
    miVentana.add(panelBanner,BorderLayout.WEST);



    //LLAMAR A EL OTRO PANEL
    //Panel login
    LoginPanel panelLogin = new LoginPanel();
    miVentana.add(panelLogin.getJPanel());


   


     miVentana.setVisible(true);              //mostrar la ventana

    

    }


}
