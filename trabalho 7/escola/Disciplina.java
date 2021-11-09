package escola;
import java.util.ArrayList;
public class Disciplina {

	private String codigo;
	private String descricao;
	private int cargaHoraria;
	private String ementa;
	private ArrayList<String> bibliografia;
	private ArrayList<Disciplina> requisitos;
	
	public Disciplina(String codigo, String descricao, int cargaHoraria, String ementa) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
	}
	
	public Disciplina(String codigo, String descricao, int cargaHoraria, String ementa, ArrayList<Disciplina> req) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.requisitos = req;
	}
	
	public void addBibliografia(String biblio) {
		bibliografia.add(biblio);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public ArrayList<String> getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(ArrayList<String> bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	
	
}
