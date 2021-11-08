package banco;

public class Main {
	public static void main(String[] args) {
		
		//instanciando as classes
		Gerente aa;
		Telefonista bb;
		Secretaria cc;
		Funcionario dd;
		
		
		aa = new Gerente("Rael", 1000, "1234", "raelb");
		bb = new Telefonista("Lucas", 1000, "1308195");
		cc = new Secretaria("Juliana", 1000, 12478);
		dd = new Funcionario("Adevan", 1000);
		
		aa.mostrarDados();
		System.out.println("-------------------");
		bb.mostrarDados();
		System.out.println("-------------------");
		cc.mostrarDados();
		System.out.println("-------------------");
		dd.mostrarDados();
		System.out.println("-------------------");
		
		aa.bonificacao(10);
		bb.bonificacao(10);
		dd.bonificacao(10);
		
		aa.mostrarDados();
		System.out.println("-------------------");
		bb.mostrarDados();
		System.out.println("-------------------");
		dd.mostrarDados();
		//System.out.println(aa instanceof Gerente);
		//System.out.println(aa instanceof Funcionario);
		//System.out.println(aa instanceof Secretaria);
	}
}
