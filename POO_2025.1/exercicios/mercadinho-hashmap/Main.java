public class Main
{
	public static void main(String[] args) {
		Mercadinho atacadao = new Mercadinho();
		
		atacadao.adicionarProduto(new Produto(01, "Arroz", 5.79));
		atacadao.adicionarProduto(new Produto(02, "Feijão", 7.00));
		atacadao.adicionarProduto(new Produto(03, "Cuscuz", 2.50));
		
		System.out.println();
		
		atacadao.pesquisarPorCodigo(01);
		
		atacadao.exibirProdutos();
		
		atacadao.removerProduto(03);
		
		System.out.println();
		
		atacadao.listarProdutos();
	}
}
