package com.example.autoComplete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda) {

        String[] frasesTipicasDeBusqueda = {"bootacamp de java", "bootcamp de phyton", "curso de node.js",
                "curso de C", "bootcamp de Java avanzado"};

        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;

        for (String frase : frasesTipicasDeBusqueda) {
            if (frase.toLowerCase().contains(busqueda.toLowerCase())) {
                resultadoDeLaBusqueda[contador] = frase;
                contador++;
            }
        }
        return resultadoDeLaBusqueda;
    }
}
