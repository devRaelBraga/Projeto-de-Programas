package abstrato;

abstract public class Forma {
	private String tipoForma; 
	public Forma(String tipo) {
		this.tipoForma = tipo;
	}
	
	abstract public void calcularArea();
	abstract public void calcularPerimetro();
}

