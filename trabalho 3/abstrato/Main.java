package abstrato;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Circulo c = new Circulo(2);
		Circulo d = new Circulo(3);
		Quadrado q = new Quadrado(3);
		Quadrado s = new Quadrado(2);
		Retangulo r = new Retangulo(3,2);
		
		ArrayList<Forma> formas = new ArrayList<Forma>();
		
		formas.add(c);
		formas.add(d);
		formas.add(q);
		formas.add(s);
		formas.add(r);
		
		for(int i = 0; i < formas.size(); i++) {
			formas.get(i).calcularArea();
			formas.get(i).calcularPerimetro();
		}
	}

}
