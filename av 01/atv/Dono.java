package atv;

import java.util.ArrayList;

public class Dono {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private ArrayList<Gato> gatos = new ArrayList<Gato>();
	private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
	
	public Dono(String nome, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void addGato(Gato gato) {
		this.gatos.add(gato);
	}
	
	public Gato getGato(int index) {
		return this.gatos.get(index);
	}
	
	public void mostrarGatofavorito() {
		System.out.println("Gato favorito do " + this.nome +": " + this.gatos.get(0).getNomeGato());
	}
	
	public void addCupom(Cupom cupom) {
		this.cupons.add(cupom);
	}
	
	public void mostrarCupons() {
		for (int i = 0; i < this.cupons.size(); i++) {
			System.out.println("Codigo do cupom: " + this.cupons.get(i).getCodigo());
		}
	}
	
	public Cupom getMaiorCupom() {
		double maior = 0;
		int indiceMaior = 0;
		
		for (int i = 0; i < this.cupons.size(); i++) {
			if(this.cupons.get(i).getPorcentagemDesconto() > maior) {
				maior = this.cupons.get(i).getPorcentagemDesconto();
				indiceMaior = i;
			}
		}
		
		return this.cupons.get(indiceMaior);
	}
}
