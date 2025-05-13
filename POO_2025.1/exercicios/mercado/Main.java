import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Mercado mercado1 = new Mercado();
		
		int opcao = -1;
		
		do{
		    System.out.println("===== MENU =====");
		    System.out.println("(1) - adicionar produto");
		    System.out.println("(2) - remover produto");
		    System.out.println("(3) - exibir produtos");
		    System.out.println("(4) - pesquisar produto");
		    System.out.println("(0) - sair");
		    
		    System.out.println("\nEscolha uma opção:");
		    opcao = teclado.nextInt();
		    teclado.nextLine(); //Limpeza buffer
		    
		    switch(opcao){
		        case 1:
		            System.out.println("Infome o nome do produto:");
		            String nome = teclado.nextLine();
		            System.out.println("Agora informe o valor do produto:");
		            double valor = teclado.nextDouble();
		            Produto produto = new Produto(nome, valor);
		            mercado1.adicionarProduto(produto);
		            System.out.println("\n");
		            break;
		            
		        case 2:
		            mercado1.removerProduto();
		            System.out.println("\n");
		            break;
		            
		        case 3:
		            mercado1.exibirProdutos();
		            System.out.println("\n");
		            break;
		            
		        case 4:
		            System.out.println("Informe o nome do produto que deseja pesquisar:");
		            String produtoPesquisa = teclado.nextLine();
		            mercado1.pesquisarProduto(produtoPesquisa);
		            break;
		            
		        case 0:
		            opcao = 0;
		            System.out.println("Encerrando o sistema...");
		            break;
		            
		        default:
		            System.out.println("Opção inválida!\n");
		    }
		    
		} while(opcao != 0);
	}
}