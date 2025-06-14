public class Main
{
	public static void main(String[] args) {
		Mercado atacadao = new Mercado();
		
		atacadao.adicionarProduto(new Produto(111, "café", 18.50));
		atacadao.adicionarProduto(new Produto(222, "arroz", 5.75));
		atacadao.adicionarProduto(new Produto(333, "feijão", 6.00));
		atacadao.adicionarProduto(new Produto(444, "açucar", 3.80));
		atacadao.adicionarProduto(new Produto(555, "arroz", 5.75));
		
		Produto teste = new Produto(123, "bolacha", 1.99);
		
		atacadao.adicionarProduto(teste);
		
		atacadao.exibirProdutos();
		
		atacadao.removerProduto(teste);
		
		atacadao.exibirProdutos();
	}
}
