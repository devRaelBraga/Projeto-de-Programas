package escola;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//criando os projetos
		Projeto java = new Projeto("POO usando Java");
		Projeto pp = new Projeto("Projeto de Programas");
		
		
		//criando os professores
		Professor Cuevas = new Professor("Luis Cuevas Rodriguez", new Endereco("Rua dos Coqueiros", 357, "Parque 10", "69258-516"),"1234","0203654", "PhD.", "(92) 91234-5678", java);
		Professor Luiz = new Professor("Luiz", new Endereco("Rua dos Motoqueiros", 35677, "Parque 14", "69258-516"), "4321", "2312131", "MsC.", "9219921", pp);
		
		//definindo os responsaveis pelos projetos
		java.setResponsavel(Cuevas);
		pp.setResponsavel(Luiz);
		
		//criando os departamentos
		Departamento dpt = new Departamento("Dpto. Pesquisa","Laboratorio", 1, Cuevas);
		Departamento materias = new Departamento("Dpto. Materias", "Salas de aula", 1, Luiz);
		
		//criando os alunos
		Aluno Rael = new Aluno("Rael", "123456", "2015080088", new Endereco("Rua das palmeiras", 37, "Zumbi", "69058-581"), Cuevas.getProjeto());
		Aluno lael = new Aluno("lael", "123lhdgdf456", "20fsfsdfsfds88", new Endereco("Rua das Oliveiras", 467, "Praca 14", "66828-681"), Cuevas.getProjeto());
		
		
		Cuevas.addAluno(Rael);
		Cuevas.addAluno(lael);
		Cuevas.mostrarAlunos();
		
		Luiz.addAluno(Rael);
		Luiz.addAluno(lael);
		Luiz.mostrarAlunos();
		
		Rael.mostrarDadosAluno();
		lael.mostrarDadosAluno();
		Cuevas.mostrarDadosProf();
		Luiz.mostrarDadosProf();
	}
}
