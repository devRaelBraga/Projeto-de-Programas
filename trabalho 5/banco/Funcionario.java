package banco;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
	}
	
	public void bonificacao(double porc) {
		this.salario = this.salario +  this.salario * (porc/100);
	}
}
