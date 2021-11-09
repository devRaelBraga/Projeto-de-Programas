package escola;
import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private int ano;
	private int semestre;
	private ArrayList<String> diasSemana = new ArrayList<String>();
	private ArrayList<String> horarios = new ArrayList<String>();
	
	private String nome;
	private Professor prof;
	
	public Turma(String nome, Professor prof, int ano, int semestre, String dia, String horario) {
		this.nome = nome;
		this.prof = prof;
		this.diasSemana.add(dia);
		this.horarios.add(horario);
	}
	
	public Turma(String nome, Professor prof, int ano, int semestre, String dia1, String dia2, String horario) {
		this.nome = nome;
		this.prof = prof;
		this.diasSemana.add(dia1);
		this.diasSemana.add(dia2);
		this.horarios.add(horario);
	}
	
	public Turma(String nome, Professor prof, int ano, int semestre, String dia1, String dia2, String dia3, String horario) {
		this.nome = nome;
		this.prof = prof;
		this.diasSemana.add(dia1);
		this.diasSemana.add(dia2);
		this.diasSemana.add(dia3);
		this.horarios.add(horario);
	}
	
	public Turma(String nome, Professor prof, int ano, int semestre, String dia1, String dia2, String dia3, String dia4, String horario) {
		this.nome = nome;
		this.prof = prof;
		this.diasSemana.add(dia1);
		this.diasSemana.add(dia2);
		this.diasSemana.add(dia3);
		this.diasSemana.add(dia4);
		this.horarios.add(horario);
	}
	
	public Turma(String nome, Professor prof, int ano, int semestre, String dia1, String dia2, String dia3, String dia4, String dia5, String horario) {
		this.nome = nome;
		this.prof = prof;
		this.diasSemana.add(dia1);
		this.diasSemana.add(dia2);
		this.diasSemana.add(dia3);
		this.diasSemana.add(dia4);
		this.diasSemana.add(dia5);
		this.horarios.add(horario);
	}
	
	public void addAluno(Aluno alun) {
		this.alunos.add(alun);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	
	
	
}
