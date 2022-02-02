package com.entity;

import java.util.Date;

/**
 * Permite crear un objeto Motocicleta, se puede crear con placa y propietario registrado,
 * también sin propietario y placa, cuenta con el método ToString y los getters & setters.
 * 
 * @author Italo Alberto Guevara Villamil
 *
 */

public class Bike {
	
	public String id;
	public String mark;
	public Date model;
	public int power;
	public String color;
	public String typeFuel;
	private Person owner;
	
	/** 
	 * Constructor vacío.
	 */	
	public Bike() {}
	
	/**
	 * Contructor sin el atributo id(Placa) y owner(propietario), para en caso de vehiculos no registrados, por lo tanto figura sin propietario.
	 */
	public Bike(String mark, Date model, int power, String color, String typeFuel) {
		super();
		this.mark = mark;
		this.model = model;
		this.power = power;
		this.color = color;
		this.typeFuel = typeFuel;
	}

	/** 
	 * Constructor con todos los campos. 
	 */
	public Bike(String id, String mark, Date model, int power, String color, String typeFuel, Person owner) {
		super();
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.power = power;
		this.color = color;
		this.typeFuel = typeFuel;
		this.owner = owner;
	}

	/**
	 * getter & setter
	 */
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"+ 
	            "\nBike " +
			    "\nPlaca= " + id +
				"\nMarca= " + mark +
				"\nModelo= " + model + 
				"\nCilindraje= " + power + 
				"\nColor= " + color +
				"\nTipo de Combustible= " + typeFuel +
				"\nPropietario= " + owner +
				"\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n";
	}
}
