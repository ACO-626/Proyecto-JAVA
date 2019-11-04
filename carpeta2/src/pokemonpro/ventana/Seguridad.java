
package pokemonpro.ventana;

import javax.swing.JOptionPane;


public class Seguridad {
    
    String res; //Para la respuesta del usuario
    Login log =new Login();
    
    public boolean validarUsuario(String usuarios[], String user, String pwd, int intentos){
        boolean encontrado = false;
        
        for(int i=0; i<usuarios.length; i++){
            if((usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pwd))){
                
                
                encontrado = true;
                intentos = 0;
                Login.setIntentos(intentos);
                return true;
                
                
                
            }
        }
           
            
            

            return false;
        
       
    }
    
}
