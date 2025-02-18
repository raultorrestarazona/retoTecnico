package com.ejemplo.models;

public class Perro extends AnimalBase{
	public Perro(String nombre) {
        super(nombre, "Guau", TipoAnimal.TERRESTRE);
    }
}
