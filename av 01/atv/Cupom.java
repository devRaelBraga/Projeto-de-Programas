package atv;

public class Cupom {
	private String codigo;
	private double porcentagemDesconto;
	private boolean ativado;
	
	public Cupom(String codigo, double porcentagemDesconto, boolean ativado) {
		super();
		this.codigo = codigo;
		this.porcentagemDesconto = porcentagemDesconto;
		this.ativado = ativado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public boolean isAtivado() {
		return ativado;
	}

	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}
	
}
