package abstrato;

public class Quadrado extends Retangulo {
	private double tamLado;
	
	public Quadrado(double tam) {
		super(tam, tam);
		this.tamLado = tam;
		
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("Perimetro do quadrado: " + (4*this.tamLado));
	}
	
	@Override
	public void calcularArea() {
		System.out.println("Area do quadrado: " + (this.tamLado*this.tamLado));
	}

}
