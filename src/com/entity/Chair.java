package com.entity;

/**
 * Esta clase permite crear una Silla, tiene constructores, todos sus atributos son públicos, también tiene el método ToString.
 * 
 * @author Italo Alberto Guevara Villamil
 *
 *
*/
public class Chair {
	
	public long id;
	public String name;
	public double price;
	public String model;
	public String material;
	public int numbLegs;
	public double weight;
	public double height;
	public double width;
	public double deep;
	
	/** 
	 * Constructor vacío.
	 */
	public Chair() {}

	/** 
	 * Constructor con todos los campos. 
	 */
	public Chair(long id, String name, double price, String model, String material, int numbLegs, double weight,
			double height, double width, double deep) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.model = model;
		this.material = material;
		this.numbLegs = numbLegs;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.deep = deep;
	}

	@Override
	public String toString() {
		return "\n.................................................................." + 
			    "\nSilla " +
				"\nid= " + id + 
				"\nNombre= " + name + 
				"\nPrecio= " + price + 
				"\nModelo= " + model + 
				"\nMaterial= " + material +
				"\nNúmero de patas= " + numbLegs + 
				"\nPeso= " + weight + 
				"\nAlto= " + height +
				"\nAncho= " + width +
				"\nProfundo= " + deep +
				"\n..................................................................";
	}
	
	
	
	
	
	

}
