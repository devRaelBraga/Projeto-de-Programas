package escola;
import java.util.ArrayList;

public class DepRH {
	private ArrayList<Professor> professores = new ArrayList<Professor>();

	public DepRH() {
	}
	
	public void cadastrarProfessor(String nome, String telefone, String endereco, String titulo) {  //cadastrar professor sem alocar ele a um curso
		this.professores.add(new Professor(nome, telefone, endereco, titulo));
		System.out.println("Professor cadastrado com sucesso.");
	}
	
	public void cadastrarProfessor(String nome, String telefone, String endereco, String titulo, Curso cc) { //cadastrar professor alocando ele a um curso
		this.professores.add(new Professor(nome, telefone, endereco, titulo));
		this.professores.get(this.professores.size()-1).addCurso(cc);
		System.out.println("Professor cadastrado com sucesso.");
	}
	
	public void cadastrarProfessor(String nome, String telefone, String endereco, String titulo, ArrayList<Curso> cc) {  //cadastrar professor alocando ele a uma lista de cursos
		this.professores.add(new Professor(nome, telefone, endereco, titulo, cc));
		System.out.println("Professor cadastrado com sucesso.");
	}
	
	public void cadastrarProfSec(Secretaria sec) {
		sec.setProfessores(this.professores);
	}
}
