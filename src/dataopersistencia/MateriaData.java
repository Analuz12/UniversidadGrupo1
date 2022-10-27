/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataopersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Materia;

/**
 *
 * @author Ana luz
 */
public class MateriaData {
    private Connection con;

    public MateriaData() {
        this.con = Conexion.getConexion();
    }
 
     public void guardarMateria(Materia materia){
        String sql="INSERT INTO materia (Nombre,Anio,Activa ) VALUES (?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2,materia.getAnio());
            ps.setBoolean(3,materia.isActiva());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregado exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-AgregarMateria");
        }
       
    }
     public ArrayList<Materia> obtenerMateria(){
     ArrayList<Materia> listaMateria= new ArrayList();
     
      String sql="SELECT * FROM materia WHERE Activa = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();//select
            
            while(rs.next()){
            
                Materia a=new Materia();
                
                a.setIdMateria(rs.getInt("idMateria"));
                a.setNombre(rs.getString("Nombre"));
                a.setAnio(rs.getInt("Anio"));
                a.setActiva(rs.getBoolean("Activa"));
                
                listaMateria.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-ObtenerMateria");
        }
    return listaMateria;
    }
     
     
        
      public Materia obtenerMateriaPorId(int idMateria) {
        String sql= "SELECT * FROM materia WHERE Activa = 1 AND idMateria = ?";
        
        Materia alu = new Materia();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                alu.setIdMateria(idMateria);
                alu.setNombre(rs.getString("Nombre"));
                alu.setAnio(rs.getInt("Anio"));
                alu.setActiva(rs.getBoolean("Activa"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-obtenerMateriaPorId");
        }
        return alu;
         
    }
     public void borrarMateria (int idMateria){
        String sql="UPDATE materia SET Activo=0 WHERE idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino la materia correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-borrarMateria"+ex.getMessage());
        }
    }
    
    
    
    public void actualizaMateria(Materia materia){
        String sql="UPDATE materia SET  Nombre = ?,Anio=?, Activa=? WHERE idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActiva());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos de la materia actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-actualizarMateria"+ex.getMessage());
        }
    }
}
