package escola;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade = "Manaus";
	private String estado = "AM";
	
	public Endereco(String rua, int numero, String bairro, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void mostrarEndereco() {
		System.out.println(this.rua + ", n: " + this.numero + ", " + this.bairro + ", " + this.cep + ", " + this.cidade + "-" + this.estado);
	}
}
