package com.entity;

import java.util.Date;

/**
 * Esta clase permite crear una Persona, tiene constructores, getter & setters y el el método ToString.
 * 
 * @author Italo Alberto Guevara Villamil
 *
 */

public class Person {

	private long id;
	public String name;
	public String lastName1;
	public String lastName2;
	public Date dateBirth;
	public float height;

	
	/** 
	 * Constructor vacío.
	 */
	public Person() {}

	/** 
	 * Constructor sin ID, ya que si se desea persistir los datos a una DDBB, la base de datos genera el id automaticamente. 
	 */
	public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
		super();
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}

	/** 
	 * Constructor con todos los campos. 
	 */
	public Person(long id, String name, String lastName1, String lastName2, Date dateBirth, float height) {
		super();
		this.id = id;
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	

	/**
	 *  getters & Setter
	 */
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''"+
	            "\nPersona id= " + id +
				"\nNombre= " + name + 
				"\nApellido= " + lastName1 + 
				"\nApellido= " + lastName2
				+ "\nNacimiento= " + dateBirth + 
				"\nEstatura= " + height +
				"\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''' \n";
	}

}
