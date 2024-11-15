package menu;
import java.util.Scanner;
import produto.model.ProdutoPromocao;
import produto.repository.*; 

public class Menu {
	
	public static void main(String[] args) {
		
		ProdutoPromocao pp1 = new ProdutoPromocao("Bring me the Horizon", "Camiseta", 850.0f);
		
		pp1.visualizar();
		
		ProdutoPromocao pp2 = new ProdutoPromocao("Paramore", "Boné", 40.0f);
		pp2.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;
	
		while (true) {
			System.out.println("*****************************************************************");
			System.out.println("            ____________________________________                 ");
			System.out.println("           |____________________________________|                ");
			System.out.println("                                                                 ");
			System.out.println("                🎼 BEM VINDO AO SPACEMICH 🎼                      ");
			System.out.println("          🎧 O SEU E-COMMERCE DE VESTUÁRIO ROCK! 🎸🎻             ");
			System.out.println("           ______________________________________                ");
			System.out.println("                                                                 ");
			System.out.println("=================================================================");
			System.out.println("                                                                 ");
			System.out.println("  | 1 - CRIAR PRODUTO                                            ");
			System.out.println("  | 2 - REMOVER PRODUTO                                          ");
			System.out.println("  | 3 - LISTAR PRODUTO                                           ");
			System.out.println("  | 0 - SAIR                                                     ");
			System.out.println("                                                                 ");
			System.out.println("_________________________________________________________________");
			System.out.println("                                                                 ");
			System.out.println(" 🤘 Digite a opção desejada: 🤘                                    ");
			System.out.println("_________________________________________________________________");
			System.out.println("                                                                 ");
			System.out.println("*****************************************************************");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("_________________________________________________________________");
				System.out.println("                                                                 ");
				System.out.println("\nAgradeço por utilizar nossos produtos 😎🎻 ");
				System.out.println("\nVolte sempre ALECRIM DA TREVOSIDADE!🦇 😎 🤘 ");
				System.out.println("                                                                 ");
				System.out.println("_________________________________________________________________");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1: // CRIAR PRODUTO
				System.out.println("Adicione seu produto: ");
				
				break;
			case 2: // REMOVER PRODUTO
				System.out.println("Produto removido, volte sempre que precisar ❤️ 🤘 ");
				break;

			case 3: // LISTAR PRODUTO
				System.out.println("Produto disponivel: ");
				break;
			
			}
		}
	}
}

