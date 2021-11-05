package escola;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private Endereco casa;
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
	public Aluno(String nome, String cPF, String matricula, Endereco casa, Projeto projeto) {
		this.nome = nome;
		this.cpf = cPF;
		this.matricula = matricula;
		this.casa = casa;
		this.projetos.add(projeto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cPF) {
		this.cpf = cPF;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Endereco getEndereco() {
		return this.casa;
	}
	
	public void setEndereco(Endereco casa) {
		this.casa = casa;
	}
	

	public void mostrarDadosAluno() {
		System.out.print("-------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Matricula: " + this.matricula);
		System.out.print("Endereco: ");
		this.casa.mostrarEndereco();
		this.mostrarProjetosAluno();
	}
	
	public void mostrarProjetosAluno() {
		for (int i = 0; i < this.projetos.size(); i++) {
			System.out.println("Nome do projeto: " + this.projetos.get(i).getNomeProjeto());
		}
	}
}
