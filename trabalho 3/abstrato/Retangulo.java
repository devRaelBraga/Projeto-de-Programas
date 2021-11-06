package abstrato;

public class Retangulo extends Forma {
	private double tamLado1;
	private double tamLado2;
	
	public Retangulo(double tam1, double tam2) {
		super("Retangulo");
		this.tamLado1 = tam1;
		this.tamLado2 = tam2;
	}

	@Override
	public void calcularArea() {
		System.out.println("Area do Retangulo: " + (this.tamLado1 * this.tamLado2));
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("Perimetro do Retangulo: " + (this.tamLado1*2 + (this.tamLado1*2)));
	}
}
