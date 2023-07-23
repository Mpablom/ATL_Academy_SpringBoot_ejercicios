package com.example.CrudEjemplo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class CrudController {
    ArrayList<String> personas = new ArrayList<>(Arrays.asList(
            "Marco Polo",
            "Isabella Rossellini",
            "John Doe",
            "Jane Smith",
            "Alex Rodriguez",
            "Emily Dickinson",
            "Michael Jordan",
            "Grace Kelly",
            "Thomas Edison",
            "Marie Curie"
    ));
    @GetMapping("/obtenerListaPersonas")
    public List<String> listarPersonas() {
        return personas;
    }

    @GetMapping("/obtenerPersonaPorNombre/{nombre}")
    public String obtenerPersonaPorNombre(@PathVariable String nombre){
        for (String persona: personas){
            if (persona.toLowerCase().contains(nombre.toLowerCase())){
                return persona;
            }
        }
        return null;
    }
    @DeleteMapping("/eliminarPerson/{nombre}")
    public String eliminarPersona(@PathVariable String nombre) {
        String busqueda = obtenerPersonaPorNombre(nombre);
        boolean eliminado = personas.removeIf(persona -> persona.toLowerCase().contains(busqueda.toLowerCase()));

        if (eliminado) {
            return "Persona eliminada correctamente.";
        } else {
            return "No se encontró ninguna persona con ese nombre.";
        }
    }
    @PostMapping("/agregarPersona/{nombreCompleto}")
    public ArrayList<String> agregarPersona(@PathVariable String nombreCompleto){
        personas.add(nombreCompleto);
        return personas;
    }
}
