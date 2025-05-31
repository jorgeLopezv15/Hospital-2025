package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;
import ventanas.*;

public class LoginView {

    private JPanel panelLogin;
    private JFrame frame; 
    public LoginView(JFrame frame){ 
        this.frame = frame; 

        panelLogin = new JPanel();
        panelLogin.setSize(500,800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.PINK);
        panelLogin.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Título
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panelLogin.add(titulo, gbc);

        // Entrada de correo
        JTextField entradaCorreo = new JTextField("Usuario: ");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        // Entrada contraseña
        JPasswordField entradaContra = new JPasswordField("Contraseña: ");
        entradaContra.setSize(new Dimension(100, 50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        // Botón
        JButton entradaBoton = new JButton("Iniciar");
        entradaBoton.setPreferredSize(new Dimension(100, 30));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(entradaBoton, gbc);

        // Acción del botón
        entradaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose(); 
                new DashBoard(); 
            }
        });
    }

    public JPanel getJPanel(){
        return panelLogin;
    }
}