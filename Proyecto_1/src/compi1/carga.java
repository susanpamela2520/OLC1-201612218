
package compi1;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class carga {
    
    
      public static void lecturaArchivo (String ruta) {
    
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
          try {
              archivo = new File (ruta);
              fr = new FileReader(archivo);
              br = new BufferedReader(fr);
              br.readLine();
   
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(carga.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(carga.class.getName()).log(Level.SEVERE, null, ex);
          }
      
        
    }
      
     
         

      
      
      
          
      }

    
    

