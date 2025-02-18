package com.ejemplo.test;

import org.junit.jupiter.api.Test;

import com.ejemplo.models.Animal;
import com.ejemplo.models.TipoAnimal;
import com.ejemplo.sevices.AnimalService;

import static org.junit.jupiter.api.Assertions.*; // Correcto
import java.util.List;
import java.util.Map;
public class AnimalServiceTest {
	
	
	@Test
    void testAgruparPorTipo() {
        List<String> entradas = List.of(
                "Perro|TERRESTRE|Guau",
                "Pez|ACUATICO|Blub",
                "Águila|VOLADOR|Graa",
                "Gato|TERRESTRE|Miau"
        );
        
        AnimalService service = new AnimalService();
        Map<String, List<Animal>> resultado = service.agruparPorTipo(entradas);
        

        assertNotNull(resultado);
        assertEquals(3, resultado.size()); // Debe haber 3 tipos de animales

        assertTrue(resultado.containsKey("TERRESTRE"));
        assertTrue(resultado.containsKey("ACUATICO"));
        assertTrue(resultado.containsKey("VOLADOR"));
    }
	
	@Test
    void testEntradaVacia() {
        List<String> entradas = List.of();
        AnimalService service = new AnimalService();
        Map<String, List<Animal>> resultado = service.agruparPorTipo(entradas);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty()); // No debe haber grupos si no hay datos
    }
   
}
