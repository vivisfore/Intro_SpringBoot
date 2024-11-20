package com.sena.edu.co.Prueba.Entidades;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private LocalDate fecha;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String estadoCivil, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
