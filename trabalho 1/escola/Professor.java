package escola;
import java.util.ArrayList;

public class Professor {
	private String nome;
	private String cpf;
	private String matricula;
	private String titulo;
	private String fone;
	private Departamento dept;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private Endereco casa;
	private Projeto projeto;
	private Professor chefe;
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public Professor(String nome, Endereco casa, String cpf, String matricula, String titulo, String fone, Projeto projeto) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.titulo = titulo;
		this.fone = fone;
		this.casa = casa;
		this.projeto = projeto;
	}
	
	public Professor(String nome, Endereco casa, String cpf, String matricula, String titulo, String fone, Departamento dep, Projeto projeto, Professor chefe) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.titulo = titulo;
		this.fone = fone;
		this.casa = casa;
		this.dept = dep;
		this.chefe = chefe;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return this.alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addAluno(Aluno alu) {
		this.alunos.add(alu);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public Departamento getDept() {
		return this.dept;
	}
	
	public void setDept(Departamento dep) {
		this.dept = dep;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public void mostrarAlunos() {
		for (int i = 0; i < this.alunos.size(); i++) {
			System.out.println("aluno: " + this.alunos.get(i).getNome());
		}
	}
	
	public void mostrarDadosProf() {
		System.out.print("-------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Fone: " + this.fone);
		System.out.println("Titulo: " + this.titulo);
		System.out.print("Endereco: ");
		this.casa.mostrarEndereco();
		System.out.println("Projeto: " + this.projeto.getNomeProjeto());
		System.out.println("Departamento: " + this.dept.getNomeDpto());
	}
}
