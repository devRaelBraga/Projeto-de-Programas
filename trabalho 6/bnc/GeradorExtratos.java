package bnc;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtratos {
	public GeradorExtratos() {
	}
	
	public void imprimirExtrato(Conta a) {
		System.out.println("Tipo de Conta: " + a.getClass());
		System.out.println("Saldo atual: " + a.saldo);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date agora = new Date();
		System.out.println("Data "+ sdf.format(agora));
	}
}
