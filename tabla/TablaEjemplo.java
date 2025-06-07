package tabla;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaEjemplo extends JPanel {
    
    public TablaEjemplo() {

        setLayout(new BorderLayout());

        String[] columnas = { "ID", "Nombre", "Edad" };
        
      Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };
        
      DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        
   
        JScrollPane scrollPane = new JScrollPane(tabla);
        
    
        add(scrollPane, BorderLayout.CENTER);
    }
}