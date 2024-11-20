package com.sena.edu.co.Prueba.Servicios;

import com.sena.edu.co.Prueba.Entidades.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioPersona {

    ArrayList<Persona> lista=new ArrayList<>();

    public servicioPersona() {

        lista.add(new Persona("Viviana","Forero",38,"Casada", LocalDate.of(1996,03,18)));
        lista.add(new Persona("Mateo","Segura",13,"Soltero", LocalDate.of(2009,9,06)));
        lista.add(new Persona("Camila","Martinez",23,"Soltera", LocalDate.of(2000,11,21)));
        lista.add(new Persona("Valeria","Ceballos",25,"Casada", LocalDate.of(1998,04,04)));
        lista.add(new Persona("Jefferson","Palacios",40,"Casado", LocalDate.of(1983,01,06)));
    }

    public Persona agregar(Persona p){
        lista.add(p);
        return p;
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }
}
