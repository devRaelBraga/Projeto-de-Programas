package bnc;

public class Corrente extends Conta{
	private double limite;

	public Corrente(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

}
