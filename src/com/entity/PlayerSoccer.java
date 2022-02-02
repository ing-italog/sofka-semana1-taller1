package com.entity;

/**
 * Esta clase permite crear una Futbolista, al cual se le puede asignar un objeto de tipo Persona(Person), tiene el método ToString.
 * 
 * @author Italo Alberto Guevara Villamil
 *
 */

public class PlayerSoccer {

	public Person player;
	public String position;
	public int number;
	public double Speed;
	public double Strong;
	public double Regate;
	public double kick;
	public double header;

	/** 
	 * Constructor vacío.
	 */
	public PlayerSoccer() {}

	/** 
	 * Constructor con todos los campos. 
	 */
	public PlayerSoccer(Person player, String position, int number, double speed, double strong, double regate,
			double kick, double header) {
		super();
		this.player = player;
		this.position = position;
		this.number = number;
		Speed = speed;
		Strong = strong;
		Regate = regate;
		this.kick = kick;
		this.header = header;
	}

	@Override
	public String toString() {
		return "\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" +
	            "\nJugador= "	+ player + 
	            "\nPosicion= " + position +
	            "\nNúmero= " + number + 
	            "\nVelocidad= " + Speed +
	            "\nFuerza= " + Strong + 
	            "\nRegate="	+ Regate + 
	            "\nDisparo= " + kick + 
				"\nCabeceo= " + header +
				"\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°";
	}
}
