
package control;

public class LoginControl {
    
    String[][] usuariosYContraseñas = {

        {"leomessi", "12345"},       
        {"alberteinstein", "intel647"},    
        {"benito", "54321"},
        {"icecube", "ice0"},
        {"tupac", "pac56"},
        {"kiss", "ks0"},
        {"rockemma", "phyton"},
        {"George", "lopez"},
        {"Jhonny", "Matematica"},
        {"jinSakai", "GhostOfTushima"},
        {"Etzio", "Auditore"}
        
    };

    public boolean validacionDatos(String EntradaUsuario, String EntradaContraseña) {
        for (int i = 0; i < usuariosYContraseñas.length; i++) {
            String usuarioCorrecto = usuariosYContraseñas[i][0];
            String contraseñaCorrecta = usuariosYContraseñas[i][1];
            
            if (usuarioCorrecto.equals(EntradaUsuario) && 
                contraseñaCorrecta.equals(EntradaContraseña)) {
                return true; 
            }
        }
        return false;
    }
}