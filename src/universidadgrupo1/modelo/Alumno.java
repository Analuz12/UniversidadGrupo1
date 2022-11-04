/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo1.modelo;

import java.time.LocalDate;



/**
 *
 * @author Ana luz
 */
public class Alumno {
    private int IdAlumno;
    private String Apellido;
    private String Nombre;
    private LocalDate FechaNac;
    private long Dni;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int IdAlumno, String Apellido, String Nombre, LocalDate FechaNac, long Dni, boolean activo) {
        this.IdAlumno = IdAlumno;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Dni = Dni;
        this.activo = activo;
    }
//constructor sin ID para alumnos que aun no estan en la base de datos
    public Alumno(String Apellido, String Nombre, LocalDate FechaNac, long Dni, boolean activo) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Dni = Dni;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return Apellido + " " + Nombre + " " + Dni ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.IdAlumno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.IdAlumno != other.IdAlumno) {
            return false;
        }
        return true;
    }
    
    
    
}
