import java.util.HashSet;
import java.util.Set;

public class Mercado{
    private Set<Produto> produtos;
    
    public Mercado(){
        produtos = new HashSet<Produto>();
    }
    
    public void adicionarProduto(Produto p){
        produtos.add(p);
    }
    
    public void removerProduto(Produto p){
        produtos.remove(p);
    }
    
    public boolean removerProdutoPeloCodigo(int codigo){
        return produtos.remove(new Produto(codigo, "", 0.0));   //CRIA OBJETO EQUIVALENTE PARA REMOVER
    }
    
    public void exibirProdutos(){
        System.out.println("==== Lista de produtos ====");
        for(Produto p : produtos){
            System.out.println(p.toString());
        }
    }
}