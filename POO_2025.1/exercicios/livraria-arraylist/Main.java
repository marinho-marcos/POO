public class Main
{
	public static void main(String[] args) {
		Biblioteca acervo1 = new Biblioteca();
		
		Livro l1 = new Livro("livro a", "João marcos", 10);
		Livro l2 = new Livro("livro b", "antonio josé", 5);
		Livro l3 = new Livro("livro c", "pedro ", 8);
		
		acervo1.adicionarLivro(l1);
		acervo1.adicionarLivro(l2);
		acervo1.adicionarLivro(l3);
		
		acervo1.exibirLivros();
		
		acervo1.removerLivro(l3);   //REMOVE PELA REFERENCIA
		
		acervo1.removerPorIndice(1);    //REMOVE PELO INDICE
		
		acervo1.exibirLivros();
		
		System.out.println(acervo1.acervoVazio());
		
		System.out.println(acervo1.tamanho());
		
		//acervo1.removerTudo();
		
		System.out.println(acervo1.buscarPorIndice(0));
		
	}
}
