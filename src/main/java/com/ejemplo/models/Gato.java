package com.ejemplo.models;

public class Gato extends AnimalBase{
	public Gato(String nombre) {
        super(nombre, "Miau", TipoAnimal.TERRESTRE);
    }
}
