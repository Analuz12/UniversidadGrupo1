
package dataopersistencia;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Coneccion {
    private String url;
    private String usuario;
    private String password; 
    private Connection conexion;
    
    public Coneccion(String url,String usuario, String password){
         this.url=url;
         this.usuario=usuario;
         this.password=password;
        
    }
    public Connection buscarConexion(){
        if (conexion==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion=DriverManager.getConnection(url, usuario, password);
                        
                        } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
      return conexion;
    }
    
    
    
}
