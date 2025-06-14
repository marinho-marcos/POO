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
    
    public void exibirProdutos(){
        System.out.println("==== Lista de prdutos ====");
        for(Produto p : produtos){
            System.out.println(p.toString());
        }
    }
}