package atv;

public class PetShop {
	private double valorServico;

	public PetShop() {
		
	}
	
	//-----------------------------------servicos com cupom-------------------------------
	public void banho(Gato gato, Cupom cupom, String servico) {
		int preco1 = 50;
		int preco2 = 60;
		int preco3 = 70;
		
		if(servico == "luxo") {
			this.valorServico = (this.valorServico + preco3) - (preco3*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2 - (preco2*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco1 - (preco1*(cupom.getPorcentagemDesconto()/100));
		}
		
	}
	
	public void tosa(Gato gato, Cupom cupom, String servico) {
		int preco1 = 50;
		int preco2 = 40;
		int preco3 = 30;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco1 - (preco1*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2 - (preco2*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "simples") {
			this.valorServico = (this.valorServico + preco3) - (preco3*(cupom.getPorcentagemDesconto()/100));
		}
	}
	
	public void consulta(Gato gato, Cupom cupom, String servico) {
		int preco1 = 100;
		int preco2 = 80;
		int preco3 = 90;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco1 - (preco1*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "top") {
			this.valorServico = (this.valorServico + preco3) - (preco3*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco2 - (preco2*(cupom.getPorcentagemDesconto()/100));
		}
	}
	
	public void hotelzinho(Gato gato, Cupom cupom, String servico) {
		int preco1 = 100;
		int preco2 = 120;
		int preco3 = 150;
		
		if(servico == "luxo") {
			this.valorServico = (this.valorServico + preco3) - (preco3*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2 - (preco2*(cupom.getPorcentagemDesconto()/100));
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco1 - (preco1*(cupom.getPorcentagemDesconto()/100));
		}
	}
	
	//------------------servicos sem cupom--------------------------------
	
	public void banho(Gato gato, String servico) {
		int preco1 = 50;
		int preco2 = 60;
		int preco3 = 70;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco3;
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2;
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco1;
		}
	}
	
	public void tosa(Gato gato, String servico) {
		int preco1 = 50;
		int preco2 = 40;
		int preco3 = 30;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco1;
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2;
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco3;
		}
	}
	
	public void consulta(Gato gato, String servico) {
		int preco1 = 100;
		int preco2 = 80;
		int preco3 = 90;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco1;
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco3;
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco2;
		}
	}
	
	public void hotelzinho(Gato gato, String servico) {
		int preco1 = 100;
		int preco2 = 120;
		int preco3 = 150;
		
		if(servico == "luxo") {
			this.valorServico = this.valorServico + preco3;
		}
		
		if(servico == "top") {
			this.valorServico = this.valorServico + preco2;
		}
		
		if(servico == "simples") {
			this.valorServico = this.valorServico + preco1;
		}
	}
	
	//receber o valor da conta
	
	public double getValorConta() {
		double valor = this.valorServico;
		this.valorServico = 0;
		return valor;
	}
}
