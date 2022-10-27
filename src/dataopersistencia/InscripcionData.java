
package dataopersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Inscripcion;

/**
 *
 * @author Ana luz
 */
public class InscripcionData {
       private Connection con;

    public InscripcionData() {
        this.con = Conexion.getConexion();
}
    
 public void guardarInscripcion(Inscripcion inscripcion){
        String sql="INSERT INTO inscripcion (idMateria,idAlumno,Nota ) VALUES (?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,inscripcion.getMateria().getIdMateria());
            ps.setInt(2,inscripcion.getAlumno().getIdAlumno());
            ps.setDouble(3,inscripcion.getNota());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            
            if(rs.next()){
                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion agregada exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "IncripcionData Sentencia SQL erronea-AgregarMateria");
        }
 
    } 
    
    
    
    
    
    
    
    
}