package abstrato;


public class Circulo extends Forma {
	private float raio;
	private double pi = Math.PI;
	
	public Circulo(float raio) {
		super("Circulo");
		this.raio = raio;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("Area do circulo: " + this.raio * this.raio * this.pi);
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("Perimetro do circulo: " + (this.raio*2) * this.pi);
	}
}
