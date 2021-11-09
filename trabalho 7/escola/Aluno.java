package escola;

public class Aluno {
	private String nome;
	private String telefone;
	private String endereco;
	private Curso curso;
	private int matricula;
	
	public Aluno(String nome, String telefone, String endereco, Curso curso, int matricula) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.curso = curso;
		this.matricula = matricula;
	}
	
}
