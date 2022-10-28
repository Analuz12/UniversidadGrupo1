
package dataopersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Alumno;
import universidadgrupo1.modelo.Inscripcion;
import universidadgrupo1.modelo.Materia;

/**
 *
 * @author Ana luz
 */
public class InscripcionData {
       private Connection con;
       private AlumnoData ad;
       private MateriaData ma;
       

    public InscripcionData(Connection conexion,MateriaData ma,AlumnoData ad) {
        this.con = Conexion.getConexion();
        this.ad= new AlumnoData();
        this.ma= new MateriaData();
        
        
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
 
 
      public  Inscripcion obtenerInscripcion(int Materia,int Alumno){
        String sql="SELECT* FROM inscripcion WHERE IdMateria=? AND IdAlumno=? ";
        Inscripcion i = null;
        
        try {
           
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,Materia);
            ps.setInt(2, Alumno);
            
            ResultSet rs=ps.executeQuery();//select
             
            while(rs.next()){
                i=new Inscripcion();
               i.setIdInscripcion(rs.getInt("idInscripcion"));
               Alumno a = ad.obtenerAlumnoPorId(Alumno);
               i.setAlumno(a);
               Materia m = ma.obtenerMateriaPorId(Materia);
               i.setMateria(m);
               i.setNota(rs.getDouble("Nota"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-Obtenerinscripcion"+ex.getMessage());
        }
    return i;
    }
      
      
      
      
      
      
      
    } 
    
  