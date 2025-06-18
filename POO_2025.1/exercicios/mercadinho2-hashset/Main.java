import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Mercado atacadao = new Mercado();
		Scanner teclado = new Scanner(System.in);
		
		atacadao.adicionarProduto(new Produto(111, "café", 18.50));
		atacadao.adicionarProduto(new Produto(222, "arroz", 5.75));
		atacadao.adicionarProduto(new Produto(333, "feijão", 6.00));
		atacadao.adicionarProduto(new Produto(444, "açucar", 3.80));
		atacadao.adicionarProduto(new Produto(555, "arroz", 5.75));
		
		atacadao.exibirProdutos();
		
		System.out.println("Informe o codigo do produto para remover: ");
		int codigo = teclado.nextInt();
		
		boolean removido = atacadao.removerProdutoPeloCodigo(codigo); //REMOVENDO OBJETO SEM REFERENCIA
		
		if(removido){
		    System.out.println("\nProduto removido com sucesso!\n");
		} else{
		    System.out.println("\nNão existe produto com este código!\n");
		}
		
		atacadao.exibirProdutos();
	}
}
