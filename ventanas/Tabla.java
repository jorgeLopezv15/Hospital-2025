package ventanas;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import control.Pacientes;

public class Tabla extends JScrollPane {  

    public Tabla() {
        
        String[] columnas = {"id ", "nombre del paciente", "edad"};
        Object[][] datos = new Pacientes().getDatos();

        
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        
        
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(800, 600));
        
    }
}