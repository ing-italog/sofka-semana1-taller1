package com.entity;

/**
 * Permite crear una Cuenta Bancaria, para crear la cuenta bancaria es necesario asignar un objeto Person(user),
 * todo los atr�butos son privados y no cuentan con getter y setters, ya que se recomienda cambiar el estado de 
 * sus atributos a tr�ves de un/unos m�todos publicos. 
 * 
 * @author Italo Alberto Guevara Villamil
 */

public class BankAccount {

	private Person user;
	private long accountNumber;
	private boolean activated;
	private long balance;

	/** 
	 * Constructor con todos los campos. 
	 */
	public BankAccount(Person user, long accountNumber, boolean activated, long balance) {
		super();
		this.user = user;
		this.accountNumber = accountNumber;
		this.activated = activated;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "\nCliente= " + user.name +
				"\nN�mero de cuenta= " + accountNumber +
				"\nactiva= " + activated + 
				"\nsaldo= " + balance;
	}

}
