/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo1;

import dataopersistencia.AlumnoData;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo1.modelo.Alumno;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         AlumnoData alu= new AlumnoData();
         //Utilize el metodo guardar alumno se puede ver reflejado en la base de datos
         //Alumno bruno=new Alumno ("Cerutti","Bruno",LocalDate.of(1997, Month.MARCH,14),3456789,true);
        
         //Metodo para obtener el alumno por ID
         //Alumno alum=alu.obtenerAlumnoPorId(3);
         //System.out.println(alum);
         
         //Metodo para actualizar alumno
         //alum.setApellido("lopez");
         //alu.actualizaAlumno(alum);
         
         
         //Metodo para borrar Alumno
        // Alumno alum=alu.borrarAlumno(2);
       
         //Metodo para mostrar la lista de alumno
         //Alumno alumno=alu.obtenerAlumno();
         //System.out.println(alumno);
            
    
    
    }
    
}
