/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataopersistencia;

import java.sql.Connection;
import universidadgrupo1.modelo.Alumno;

/**
 *
 * @author Ana luz
 */
public class AlumnoData {
    private Connection con =null;
    
    public AlumnoData(Coneccion conexion){
        this.con = conexion.buscarConexion();
    }
    public void guardarAlumno (Alumno a){
        String query="INSERT INTO alumno(nombre,fechaNac,activo")
        
    }
}
