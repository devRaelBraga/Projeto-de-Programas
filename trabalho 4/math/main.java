package math;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int desejo = 1;
		while(desejo != 0) {
			System.out.println("");
			System.out.println("-----------------------------------");
			System.out.println("Escolha a operação a ser realizada:");
			System.out.println("(1) Soma:");
			System.out.println("(2) Multiplicacao:");
			System.out.println("(3) Subtracao:");
			System.out.println("(0) Sair.");
			System.out.print("Digite sua opção: ");
			Scanner on = new Scanner(System.in);
			desejo = on.nextInt();
			if(desejo > 3 || desejo < 0) {
				System.out.println("ERRO: Digite uma opção válida.");
			}
			else if(desejo != 0){
				System.out.println("Digite os termos abaixo: ");
				Scanner aa = new Scanner(System.in);
				Scanner bb = new Scanner(System.in);
				int a = aa.nextInt();
				int b = bb.nextInt();
				if(desejo == 1) {
					System.out.print(new Soma().calcula(a, b));
				}
				
				if(desejo == 2) {
					System.out.print(new Multiplicacao().calcula(a, b));
				}
				
				if(desejo == 3) {
					System.out.print(new Subtracao().calcula(a, b));
				}
			}
		}
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("| Até mais, obrigado |");
		System.out.println("----------------------");
	}
}
