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
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Alumno;


public class AlumnoData {
    private Connection con;
    
    public AlumnoData(){
        this.con=Conexion.getConexion();
    }
    public void guardarAlumno(Alumno alumno) throws SQLException{
        String sql="INSERT INTO alumnos (Apellido,Nombre,FechaNac,Dni,Activo) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(4,alumno.getDni());
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
}
