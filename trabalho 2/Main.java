package banco;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(800.0, "Conta Corrente", 10.0);
		System.out.println("saldo: " + conta.getSaldo());
		conta.depositar(1000);
		System.out.println("voce depositou R$ 1000.0 e seu novo saldo e: R$" + conta.getSaldo());
		conta.sacar(1800);
		System.out.println("voce sacou R$ 1800.0 e seu novo saldo e: R$" + conta.getSaldo());
		System.out.println("tipo de conta: " + conta.tipoConta());
		System.out.println("data de abertura: " + conta.getDataAberturaFormatada());
	}
}
