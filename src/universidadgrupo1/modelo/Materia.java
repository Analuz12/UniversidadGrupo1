/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo1.modelo;

import java.util.Objects;

/**
 *
 * @author Ana luz
 */
public class Materia {
private int IdMateria;
private String Nombre;
private int Anio;
private boolean Activa;

    public Materia() {
    }

    public Materia(int IdMateria, String Nombre, int Anio, boolean Activa) {
        this.IdMateria = IdMateria;
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.Activa = Activa;
    }

    public Materia(String Nombre, int Anio, boolean Activa) {
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.Activa = Activa;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public boolean isActiva() {
        return Activa;
    }

    public void setActiva(boolean Activa) {
        this.Activa = Activa;
    }

    @Override
    public String toString() {
        return "Materia{" + "IdMateria=" + IdMateria + ", Nombre=" + Nombre + ", Anio=" + Anio + ", Activa=" + Activa + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.IdMateria;
        hash = 97 * hash + Objects.hashCode(this.Nombre);
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
        final Materia other = (Materia) obj;
        if (this.IdMateria != other.IdMateria) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    



    
}
