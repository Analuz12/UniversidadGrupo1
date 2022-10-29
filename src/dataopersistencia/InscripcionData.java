
package dataopersistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
       

    public InscripcionData() {
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
              //agregar restriccion de errores
        JOptionPane.showMessageDialog(null, "IncripcionData Sentencia SQL erronea-AgregarInscripcion"+ex.getMessage());
          
        }
 }
 
 
      public  Inscripcion obtenerInscripcion(int idMateria,int idAlumno){
          
        String sql="SELECT * FROM inscripcion WHERE IdMateria = ? AND  IdAlumno = ? ";
        
        Inscripcion i = null;
        
        try {
           
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,idMateria);
            ps.setInt(2, idAlumno);
            
            ResultSet rs=ps.executeQuery();//select
             
            while(rs.next()){
               i=new Inscripcion();
               i.setIdInscripcion(rs.getInt("idInscripcion"));
               Alumno a = ad.obtenerAlumnoPorId(idAlumno);
               i.setAlumno(a);
               Materia m = ma.obtenerMateriaPorId(idMateria);
               i.setMateria(m);
               i.setNota(rs.getDouble("Nota"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-Obtenerinscripcion"+ex.getMessage());
        }
    return i;
    }
      
      
      public void borrarInscripcion( int idAlumno, int idMateria){
          String sql="DELETE FROM inscripcion WHERE IdAlumno = ? AND IdMateria = ? ;";
          
          
          try {
               PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,idAlumno);
            ps.setInt(2,idMateria);
            
            int encuentra=ps.executeUpdate();
            
              if (encuentra>0) {
                  JOptionPane.showMessageDialog(null, "inscripcion borrada");
              }else {
                  JOptionPane.showMessageDialog(null, "inscripcion no encontrada");
              }
              ps.close();              
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "borrat inscripcion Sentencia SQL erronea-borrarInscripcion");
          }    
      
      }
      
//      public ArrayList <Inscripcion> obtenerInscripciones(){
//          ArrayList <Inscripcion> listIn =new ArrayList();
//          
//          String sql="SELECT * from inscripcion ; ";
//                  
//           try{
//               PreparedStatement ps= con.prepareStatement(sql);
//               ResultSet rs=ps.executeQuery();
//               
//               while(rs.next()){
//                   Inscripcion i = new Inscripcion ();
//                   
//                 i.setIdInscripcion(rs.getInt(2));
//                 i.setidAlumno(rs.getInt(3));
//                 
//                 
//                
//                   listIn.add(i);
//               }
//              
//           } catch (Exception ex) {
//              JOptionPane.showMessageDialog(null, "obtener inscripcion Sentencia SQL erronea-obtenerInscripcion");
//          }    
//           return listIn;
//      }   
//                  
      public void actualizarNota (int idMateria, int idAlumno, double Nota){
       
       String sql =" UPDATE inscripcion SET Nota = ? WHERE idAlumno = ? and idMateria = ?";
         
         try{    
           PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1,Nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            
            if( ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }else{
                 JOptionPane.showMessageDialog(null, "ALUMNO NO ENCONTRADO");
            }
            
            ps.close();
            
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcioData ActualizacionNota Sentencia SQL erronea-actualizarNota"+ex.getMessage());
        }
    
          
      }
      
      
//      public  ArrayList<Materia> obtenerMateriaInscriptas(int idAlumno){
//      ArrayList <Materia> listMat =new ArrayList();
//      String sql= "SELECT * FROM incripcion WHERE idAlumno= ?";
//      try{
//               PreparedStatement ps= con.prepareStatement(sql);
//               
//               ps.setInt(1,"IdAlumno());
//               ResultSet rs = ps.executeQuery();
//               
//               while(rs.next()){
//                Inscripcion i= new Inscripcion();
//                i=ma.obtenerMateria(rs.getInt("idMateria"));
//               }
//                listMat.add(i);
//           } catch (Exception ex) {
//              JOptionPane.showMessageDialog(null, "borrat inscripcion Sentencia SQL erronea-borrarInscripcion");
//          }    
//          
//          
//          return listMat;
//      }
//      
      
       public void /*ArrayList<>*/ obtenerMateriaNoInscriptas(){
      
      }
      
       
      public ArrayList<Alumno>obtenerAlumnosInscriptos(Alumno a){
      
          
          
          
      
      } 
    } 
    
  