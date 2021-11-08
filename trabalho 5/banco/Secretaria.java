package banco;

public class Secretaria extends Funcionario{
	private int numeroRamal;

	public Secretaria(String nome, double salario, int numeroRamal) {
		super(nome, salario);
		this.numeroRamal = numeroRamal;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Numero de ramal: " + this.numeroRamal);
	}
}
