package escola;

public class Projeto {
	private String nomeProjeto;
	private Professor responsavel;

	public Projeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Professor getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}	
	
}
