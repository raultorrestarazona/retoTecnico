package com.ejemplo.sevices;

import com.ejemplo.models.Animal;
import com.ejemplo.models.Gato;
import com.ejemplo.models.Perro;
import com.ejemplo.models.Pez;
import com.ejemplo.models.Aguila;
import com.ejemplo.models.TipoAnimal;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalService {
	public Map<String, List<Animal>> agruparPorTipo(List<String> entradas) {
        List<Animal> animales = new ArrayList<>();
        
        for (String entrada : entradas) {
            String[] datos = entrada.split("\\|");
            String nombre = datos[0];
            TipoAnimal tipo = TipoAnimal.valueOf(datos[1]);
            String sonido = datos[2];
            
            switch (tipo) {
                case TERRESTRE:
                	 if ("Guau".equals(sonido)) {
                         // Si el sonido es "Guau", agregamos un Perro
                         animales.add(new Perro(nombre));
                     } else if ("Miau".equals(sonido)) {
                         // Si el sonido es "Miau", agregamos un Gato (Ejemplo de otro animal)
                         animales.add(new Gato(nombre));
                     }
                     break;
                case ACUATICO:
                    animales.add(new Pez(nombre));
                    break;
                case VOLADOR:
                    animales.add(new Aguila(nombre));
                    break;
            }
        }

        return animales.stream()
                .collect(Collectors.groupingBy(Animal::obtenerTipo));
}
}
