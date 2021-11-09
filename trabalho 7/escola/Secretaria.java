package escola;
import java.util.ArrayList;

public class Secretaria {
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Turma> turmas = new ArrayList<Turma>();

	public Secretaria() {
	}
	
	public void cadastrarCurso(String codigo, String descricao, String nomcoordenador) {  //cadastrar um curso
		Professor coordenador = null;
		
		for(int i = 0; i < this.professores.size(); i++) {
			if(this.professores.get(i).getNome() == nomcoordenador) {
				coordenador = this.professores.get(i);
			}
		}
		
		Curso cc = new Curso(codigo, descricao, coordenador);
		this.cursos.add(cc);
		System.out.println("Curso cadastrado.");
	}
	
	public void cadastrarDisciplina(Curso cc,String codigo, String descricao, int cargaHoraria, String ementa) { //cadastrar disciplina sem pre-requisitos
		cc.addDisciplina(new Disciplina(codigo, descricao, cargaHoraria, ementa));
	}
	
	public void cadastrarDisciplina(Curso cc,String codigo, String descricao, int cargaHoraria, String ementa, ArrayList<Disciplina> req) {  //cadastrar disciplina com pre-requisitos
		cc.addDisciplina(new Disciplina(codigo, descricao, cargaHoraria, ementa, req));
	}
	
	public void cadastrarAluno(String nome, String telefone, String endereco, String curso, int matricula) {    //cadastrar aluno
		Curso cursao = null;
		for(int i = 0; i < this.professores.size(); i++) {
			if(this.cursos.get(i).getDescricao() == curso) {
				cursao = this.cursos.get(i);
			}
		}
		this.alunos.add(new Aluno(nome, telefone, endereco, cursao, matricula));
		System.out.println("Aluno cadastrado com sucesso.");
	}
	
	public void cadastrarProfCurs(String nome, Curso cc) {                            //cadastrar professor em um curso
		for(int i = 0; i < this.professores.size(); i++) {
			if(this.professores.get(i).getNome() == nome) {
				this.professores.get(i).addCurso(cc);
				System.out.println("Professor cadastrado com sucesso no curso");
			}
		}
	}

	public void cadastrarTurma(String nome, Professor responsavel, int ano, int semestre, String dia, String horario) {         //cadastrar turmas dependendo do numero de dias da semana
		this.turmas.add(new Turma(nome, responsavel, ano, semestre, dia, horario));
	}
	
	public void cadastrarTurma(String nome, Professor responsavel, int ano, int semestre, String dia1, String dia2, String horario) {
		this.turmas.add(new Turma(nome, responsavel, ano, semestre, dia1, dia2, horario));
	}
	
	public void cadastrarTurma(String nome, Professor responsavel, int ano, int semestre, String dia1, String dia2, String dia3, String horario) {
		this.turmas.add(new Turma(nome, responsavel, ano, semestre, dia1, dia2, dia3, horario));
	}
	
	public void cadastrarTurma(String nome, Professor responsavel, int ano, int semestre, String dia1, String dia2, String dia3, String dia4, String horario) {
		this.turmas.add(new Turma(nome, responsavel, ano, semestre, dia1, dia2, dia3, dia4, horario));
	}
	
	public void cadastrarTurma(String nome, Professor responsavel, int ano, int semestre, String dia1, String dia2, String dia3, String dia4, String dia5, String horario) {
		this.turmas.add(new Turma(nome, responsavel, ano, semestre, dia1, dia2, dia3, dia4, dia5, horario));
	}
	
	public void matricularAluno(String turma, Aluno alun) {
		for(int i = 0; i < this.turmas.size(); i++) {
			if(this.turmas.get(i).getNome() == turma) {
				this.turmas.get(i).addAluno(alun);
				System.out.println("Aluno cadastrado com sucesso na turma");
			}
		}
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public Professor getProfessor(String nome) {
		for(int i = 0; i < this.professores.size(); i++) {
			if(this.professores.get(i).getNome() == nome) {
				return this.professores.get(i);
			}
		}
		return null;
	}

}
