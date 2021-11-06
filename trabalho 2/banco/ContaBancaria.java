package banco;

public class ContaBancaria {
	private double saldo;
	private Date data;
	private String tipoConta;
	private double valorManutencao;
	
	public ContaBancaria(double nsaldo, String tipo, double valor){
		this.saldo = nsaldo;
		this.tipoConta = tipo;
		this.valorManutencao = valor;
		this.data = new Date("04","10","2021");
		
	}
	
	public String getDataAberturaFormatada(){
		return this.data.getDay() + "/" + this.data.getMonth() +"/" + this.data.getYear();	
	}

	public String tipoConta(){
		return this.tipoConta;
	}	

	public double getSaldo(){
		return this.saldo;
	}

	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}

}
