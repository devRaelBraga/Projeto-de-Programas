package banco;

public class Gerente extends Funcionario{
	private String senha;
	private String nomeUser;
	
	public Gerente(String nome, double salario, String senha, String nomeUser) {
		super(nome, salario);
		this.senha = senha;
		this.nomeUser = nomeUser;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Nome de usuario: " + this.nomeUser);
		System.out.println("Senha: " + this.senha);
	}
	
	@Override
	public void bonificacao(double porc) {
		this.salario = this.salario +  this.salario * ((porc + 3)/100);
	}
}
