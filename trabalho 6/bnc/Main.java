package bnc;

public class Main {

	public static void main(String[] args) {
		Corrente aa = new Corrente(1000, 2000);
		Poupanca bb = new Poupanca(10000, "23/02/2003");
		GeradorExtratos ger = new GeradorExtratos();
		
		ger.imprimirExtrato(aa);
		System.out.println("-------------------");
		ger.imprimirExtrato(bb);
	}

}
