package com.entity;

import java.util.ArrayList;

/**
 * Esta clase permite crear una Fruta, tiene constructores, getter & setters y el el método ToString.
 * 
 * @author Italo Alberto Guevara Villamil
 *
 */

public class Fruit {
	
	public long id;
	public String name;
	private float averageWeigth;
	public ArrayList<String> colors = new ArrayList<String>();
	
	/** 
	 * Constructor vacío.
	 */
	public Fruit() {
		super();
	}

	/** 
	 * Constructor sin ID, ya que si se desea persistir los datos a una DDBB, la base de datos genera el id automaticamente. 
	 */
	public Fruit(String name, float averageWeigth, ArrayList<String> colors) {
		super();
		this.name = name;
		this.averageWeigth = averageWeigth;
		this.colors = colors;
	}
	
	/** 
	 * Constructor con todos los campos. 
	 */
	public Fruit(long id, String name, float averageWeigth, ArrayList<String> colors) {
		super();
		this.id = id;
		this.name = name;
		this.averageWeigth = averageWeigth;
		this.colors = colors;
	}
	
	/**
	 *  getters & Setter
	 */
	public float getAverageWeigth() {
		return averageWeigth;
	}

	public void setAverageWeigth(float averageWeigth) {
		this.averageWeigth = averageWeigth;
	}

	@Override
	public String toString() {
		return "\nnombre= " + name + 
				"\npeso promedio= " + averageWeigth + 
				"\nviene en la siguiente varidad de colores= " + colors;
	}
	
	

}
