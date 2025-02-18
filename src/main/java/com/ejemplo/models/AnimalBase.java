package com.ejemplo.models;

public abstract class AnimalBase implements Animal{
	 	protected String nombre;
	    protected String sonido;
	    protected TipoAnimal tipo;

	    public AnimalBase(String nombre, String sonido, TipoAnimal tipo) {
	        this.nombre = nombre;
	        this.sonido = sonido;
	        this.tipo = tipo;
	    }

	    @Override
	    public String hacerSonido() {
	        return this.sonido;
	    }

	    @Override
	    public String obtenerTipo() {
	        return this.tipo.name();
	    }
}
