package com.ejemplo.main;

import java.util.List;
import java.util.Map;

import com.ejemplo.models.Animal;
import com.ejemplo.sevices.AnimalService;

public class Main {
	public static void main(String[] args) {
        AnimalService service = new AnimalService();
        
        // Entrada de ejemplo (nombre|tipo|sonido)
        List<String> entradas = List.of(
                "Perro|TERRESTRE|Guau",
                "Pez|ACUATICO|Blub",
                "Aguila|VOLADOR|Graa",
                "Gato|TERRESTRE|Miau"
        );
        
        // Reemplazamos var con el tipo explícito Map<String, List<Animal>>
        Map<String, List<Animal>> animalesPorTipo = service.agruparPorTipo(entradas);
        
        // Mostrar animales agrupados por tipo
        animalesPorTipo.forEach((tipo, animales) -> {
            System.out.println("Animales " + tipo + ":");
            animales.forEach(animal -> System.out.println("- " + animal.hacerSonido()));
        });
    }
}
