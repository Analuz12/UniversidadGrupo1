
package dataopersistencia;

import java.sql.Connection;

/**
 *
 * @author Ana luz
 */
public class CursadaData {
       private Connection con;

    public CursadaData() {
        this.con = Conexion.getConexion();
}
}