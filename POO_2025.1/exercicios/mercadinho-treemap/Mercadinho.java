import java.util.Map;
import java.util.TreeMap;

public class Mercadinho{
    private Map<Integer, Produto> estoque;
    
    public Mercadinho(){
        estoque = new TreeMap<>();
    }
    
    public void adicionarProduto(Produto p){
        estoque.put(p.getCodigo(), p);
    }
    
    public void removerProduto(int codigo){
        estoque.remove(codigo);
    }
    
    
    //BUSCAR COM VERIFICAÇÃO
    public void pesquisarPorCodigo(int codigo){
        if(estoque.containsKey(codigo)){
            System.out.println(estoque.get(codigo));
        } else{
            System.out.println("Não existe produto com esse código!\n");
        }
    }
    
    
    //BUSCAR SIMPLES
    public Produto buscarProduto(int codigo){
        return estoque.get(codigo);
    }
    
    public void exibirProdutos(){
        System.out.println("===== LISTA PRODUTOS =====");
        for(Integer p : estoque.keySet()){
            System.out.println(estoque.get(p));
        }
    }
    
    
    //METODO PARA EXIBIR UTILIZANDO ENTRYSET()
    public void listarProdutos(){
        System.out.println("===== LISTA PRODUTOS =====");
        for (Map.Entry<Integer, Produto> entrada : estoque.entrySet()) {
            int codigo = entrada.getKey();
            Produto produto = entrada.getValue();
        
            System.out.println("Código: " + codigo + " - Produto: " + produto.getNome() + " - R$" + produto.getPreco());
        }

    }
}