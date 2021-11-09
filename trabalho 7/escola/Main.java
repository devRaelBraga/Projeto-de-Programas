package escola;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Secretaria sec = new Secretaria();
		DepRH RH = new DepRH();
		
		RH.cadastrarProfessor("Luiz", "91234-5678", "rua dos coqueiros", "Doutor");
		RH.cadastrarProfSec(sec);
		
		sec.cadastrarCurso("23180", "Engenharia de Computacao", "Luiz");
		sec.cadastrarAluno("hisrael", "91234-5678", "rua dos coqueiros", "Engenharia de Computacao", 2015080088);
		
		sec.cadastrarTurma("ECP03-T01", sec.getProfessor("Luiz"), 2021, 1, "Segunda-Feira", "9h");
	}

}
