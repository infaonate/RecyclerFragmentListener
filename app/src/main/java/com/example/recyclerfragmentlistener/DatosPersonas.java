package com.example.recyclerfragmentlistener;

import java.util.ArrayList;
import java.util.List;
public class DatosPersonas {

    public static List<Persona> obtenerPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "García López"));
        personas.add(new Persona("María", "Fernández Ruiz"));
        personas.add(new Persona("Pedro", "Martínez Sanz"));
        personas.add(new Persona("Ana", "González Pérez"));
        personas.add(new Persona("Luis", "Rodríguez Muñoz"));
        personas.add(new Persona("Carmen", "Jiménez Torres"));
        return personas;
    }
}