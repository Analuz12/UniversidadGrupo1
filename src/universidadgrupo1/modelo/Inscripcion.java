/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo1.modelo;

import universidadgrupo1.modelo.Alumno;

/**
 *
 * @author Ana luz
 */
public class Inscripcion {
    private int IdInscripcion;
    private Materia materia;
    private Alumno alumno;
    private double Nota;

    public Inscripcion() {
    }

    public Inscripcion(int IdInscripcion, Materia materia, Alumno alumno, double Nota) {
        this.IdInscripcion = IdInscripcion;
        this.materia = materia;
        this.alumno = alumno;
        this.Nota = Nota;
    }

    public Inscripcion(Materia materia, Alumno alumno, double Nota) {
        this.materia = materia;
        this.alumno = alumno;
        this.Nota = Nota;
    }

    public int getIdInscripcion() {
        return IdInscripcion;
    }

    public void setIdInscripcion(int IdInscripcion) {
        this.IdInscripcion = IdInscripcion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "materia=" + materia + ", alumno=" + alumno + ", Nota=" + Nota + '}';
    }


    
    
    
}


