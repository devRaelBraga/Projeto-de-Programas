package escola;
import java.util.ArrayList;

public class Curso {
	private String codigo;
	private String descricao;
	private Professor coordenador;
	private ArrayList<Disciplina> materias = new ArrayList<Disciplina>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public Curso(String codigo, String descricao, Professor coordenador) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.coordenador = coordenador;
		coordenador.addCurso(this);
	}
	
	public void addDisciplina(Disciplina materia) {
		materias.add(materia);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	
	
}
