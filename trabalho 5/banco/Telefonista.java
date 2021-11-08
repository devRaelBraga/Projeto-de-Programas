package banco;

public class Telefonista extends Funcionario{
	private String codigo;

	public Telefonista(String nome, double salario, String codigo) {
		super(nome, salario);
		this.codigo = codigo;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Codigo de telefonista: " + this.codigo);
	}
}
