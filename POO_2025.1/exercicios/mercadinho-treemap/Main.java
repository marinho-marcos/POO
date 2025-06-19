public class Main
{
	public static void main(String[] args) {
		Mercadinho atacadao = new Mercadinho();
		
		atacadao.adicionarProduto(new Produto(01, "Arroz", 5.79));
		atacadao.adicionarProduto(new Produto(04, "Feijão", 7.00));
		atacadao.adicionarProduto(new Produto(03, "Cuscuz", 2.50));
		atacadao.adicionarProduto(new Produto(105, "Açucar", 3.49));
		atacadao.adicionarProduto(new Produto(55, "Macarrão", 2.99));
		
		System.out.println();
		
		atacadao.pesquisarPorCodigo(01);
		
		atacadao.exibirProdutos();
		
		atacadao.removerProduto(03);
		
		System.out.println();
		
		atacadao.listarProdutos();
	}
}
