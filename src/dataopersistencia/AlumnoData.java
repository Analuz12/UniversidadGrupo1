/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataopersistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Alumno;


public class AlumnoData {
    private Connection con;
    
    public AlumnoData(){
        this.con=Conexion.getConexion();
    }
    public void guardarAlumno(Alumno alumno){
        String sql="INSERT INTO alumno (Apellido,Nombre,FechaNac,Dni,Activo) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setLong(4,alumno.getDni());
            ps.setBoolean(5,alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-AgregarAlumno");
        }
        
    }
    public ArrayList<Alumno> obtenerAlumno(){
     ArrayList<Alumno> listaTemp= new ArrayList();
     
      String sql="SELECT * FROM alumno WHERE Activo = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();//select
            
            while(rs.next()){
            
                Alumno a=new Alumno();
                
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setApellido(rs.getString("Apellido"));
                a.setNombre(rs.getString("Nombre"));
                a.setFechaNac(rs.getDate("FechaNac").toLocalDate());
                a.setDni(rs.getLong("Dni"));
                a.setActivo(rs.getBoolean("Activo"));
                
                listaTemp.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-ObtenerAlumnos");
        }
    return listaTemp;
    }
       
      public Alumno obtenerAlumnoPorId(int idAlumno) {
        String sql= "SELECT * FROM alumno WHERE Activo = 1 AND idAlumno = ?";
        
        Alumno alu = new Alumno();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                alu.setIdAlumno(idAlumno);
                alu.setApellido(rs.getString("Apellido"));
                alu.setNombre(rs.getString("Nombre"));
                alu.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alu.setDni(rs.getInt("dni"));
                alu.setActivo(rs.getBoolean("Activo"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-obtenerAlumnoPorId");
        }
        return alu;
         
    }
      public void borrarAlumno (int idAlumno){
        String sql="UPDATE alumno SET Activo=false WHERE idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino el alumno correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-borrarAlumno"+ex.getMessage());
        }
    }
    
    
    
    public void actualizaAlumno(Alumno alumno){
        String sql="UPDATE alumno SET Apellido = ?, Nombre = ?, fechaNac = ?,dni=?, Activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setLong(4, alumno.getDni());
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos del alumno actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-actualizarAlumno"+ex.getMessage());
        }
    }
}
    
