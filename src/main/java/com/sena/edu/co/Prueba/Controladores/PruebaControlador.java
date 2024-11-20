package com.sena.edu.co.Prueba.Controladores;

import com.sena.edu.co.Prueba.Entidades.Persona;
import com.sena.edu.co.Prueba.Servicios.servicioPersona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PruebaControlador {

    servicioPersona servicio=new servicioPersona();

    @GetMapping("/Saludar")
    public String saludo(){
        return "Hola Aprendices Sobrevivientes";
    }
    @GetMapping("/Saludar/{nombre}")
    public String saludarNombre(@PathVariable String nombre){
        return "Hola "+nombre;
    }
    @GetMapping("/Saludando")
    public String saludoParam(@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido){
        return "Hola Aprendiz "+nombre+"  "+apellido;
    }
    @GetMapping("/ListaPersonas")
    public List<Persona> mostrarLista(){
        return servicio.getLista();
    }

    @PostMapping("/Agregar")
    public Persona agregar(@RequestBody Persona p){
        return servicio.agregar(p);
    }

}
