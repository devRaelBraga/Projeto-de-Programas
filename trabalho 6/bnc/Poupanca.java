package bnc;

public class Poupanca extends Conta{
	private String diaAniversario;
	
	public Poupanca(double saldo, String dia) {
		super(saldo);
		this.diaAniversario = dia;
	}

}
