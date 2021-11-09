package escola;
import java.util.ArrayList;
public class Professor {
	private String nome;
	private String telefone;
	private String endereco;
	private String titulo;
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public Professor(String nome, String telefone, String endereco, String titulo) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.titulo = titulo;
	}
	
	public Professor(String nome, String telefone, String endereco, String titulo, ArrayList<Curso> cursos) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.titulo = titulo;
		this.cursos = cursos;
	}
	
	public void addCurso(Curso cc) {
		cursos.add(cc);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
