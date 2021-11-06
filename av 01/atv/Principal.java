package atv;

public class Principal {

	public static void main(String[] args) {
		//criando o petshop
		PetShop auau = new PetShop();
		
		//criando os donos
		Dono hisrael = new Dono("Hisrael","02015468795","Paris, n 8","92 91234-5678");
		Dono rael = new Dono("Rael","0243891567","Madrid, n 12","92 98765-4321");
		
		//criando os gatos
		Gato Chanim = new Gato("Chanim", 2, "azul", "Pedigree", hisrael);
		Gato Psim = new Gato("Psim Psim", 6, "amarelo", "Pedigree", hisrael);
		Gato Miau = new Gato("Miau Miau", 4, "branco", "Pedigree", hisrael);
		
		Gato Pipoca = new Gato("Pipoca", 3, "preto", "Pedigree", rael);
		Gato Veinho = new Gato("Veinho", 12, "branco", "Pedigree", rael);
		
		//adicionando os gatos do dono hisrael
		hisrael.addGato(Chanim);
		hisrael.addGato(Psim);
		hisrael.addGato(Miau);
		
		//adicionando os gatos do dono rael
		rael.addGato(Pipoca);
		rael.addGato(Veinho);
		
		// mostrando o dono do gato Chanim
		Chanim.mostrarDono();
		
		// o gato favorito de um dono é o primeiro gato, aquele no índice 0
		hisrael.mostrarGatofavorito();
		
		//criar os cupons de desconto do dono Hisrael
		hisrael.addCupom(new Cupom("123456", 50, true));
		hisrael.addCupom(new Cupom("654321", 10, true));
		
		//mostrando os cupons do Hisrael
		System.out.println("--------Cupons do Hisrael---------");
		hisrael.mostrarCupons();
		
		//fazendo servico nos gatos
		auau.banho(Chanim, Chanim.getDono().getMaiorCupom(), "luxo");
		
		//imprimindo o valor final
		System.out.println("--------Valor da conta---------");
		System.out.println("valor: R$" + auau.getValorConta());
		
		//o valor final era 70 reais, mas com o desconto ficou 35
	}
}
