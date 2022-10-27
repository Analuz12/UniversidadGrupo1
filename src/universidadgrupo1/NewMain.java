/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo1;

import dataopersistencia.AlumnoData;
import dataopersistencia.Conexion;
import dataopersistencia.MateriaData;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import universidadgrupo1.modelo.Alumno;
import universidadgrupo1.modelo.Materia;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Prueba conexion.
        
        Connection con=Conexion.getConexion();
        
        //Prueba Alumno.
        //AlumnoData alu= new AlumnoData();
         //Utilize el metodo guardar alumno se puede ver reflejado en la base de datos
       // Alumno bruno=new Alumno ("Cerutti","Bruno",LocalDate.of(1997, Month.MARCH,14),3456789,true);
        
         //Metodo para obtener el alumno por ID
         //Alumno alum=alu.obtenerAlumnoPorId(3);
         //System.out.println(alum);
         
         //Metodo para actualizar alumno
         //alum.setApellido("lopez");
         //alu.actualizaAlumno(alum);
         
         
         //Metodo para borrar Alumno
        // Alumno alus=alu.borrarAlumno(3);
        
        
       
         //Metodo para mostrar la lista de alumno
         //ArrayList<Alumno> listaTemp=alu.obtenerAlumno();
         //System.out.println(listaTemp);
            
         MateriaData mat= new MateriaData();
         
         //Materia mate = new Materia ("Laboratorio",1,true);
         
         
         //ArrayList<Materia> listaMateria= mat.obtenerMateria();
         //System.out.println(listaMateria);
         
         Materia mates= mat.obtenerMateriaPorId(3);
         System.out.println(mat);
    }
    
}
