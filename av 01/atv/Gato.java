package atv;

public class Gato {
	private String nomeGato;
	private int idade;
	private String corPredominante;
	private String racao;
	private Dono dono;
	
	public Gato(String nomeGato, int idade, String corPredominante, String racao, Dono dono) {
		this.nomeGato = nomeGato;
		this.idade = idade;
		this.corPredominante = corPredominante;
		this.racao = racao;
		this.dono = dono;
	}

	public String getNomeGato() {
		return nomeGato;
	}

	public void setNomeGato(String nomeGato) {
		this.nomeGato = nomeGato;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}

	public String getRacao() {
		return racao;
	}

	public void setRacao(String racao) {
		this.racao = racao;
	}
	
	public Dono getDono() {
		return this.dono;
	}
	public void mostrarDono() {
		System.out.println("Nome do dono do gato " + this.nomeGato + ": " + this.dono.getNome());
	}
	
	
}
