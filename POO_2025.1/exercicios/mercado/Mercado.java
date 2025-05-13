import java.util.Scanner;

public class Mercado{
    private Produto[] produtos = new Produto[20];
    
    public Mercado(){
        //CONSTRUTOR PADRAO
    }
    
    public void adicionarProduto(Produto produto){
        if(estoqueCheio()){
            System.out.println("Estoque cheio. não é possivel adicionar novos produtos!");
        } else {
            for(int i = 0; i < produtos.length; i++){
                if(produtos[i] == null){
                    produtos[i] = produto;
                    System.out.println("Produto adicionado na posicao " + (i+1) + " da lista!");
                    break;
                }
            }
        }
    }
    
    public void removerProduto(){
        Scanner teclado = new Scanner(System.in);
        
        if(isEmpty() == false){
            exibirProdutos();
            System.out.println("\nQual você deseja remover (escolha o numero referente): ");
            int escolha = teclado.nextInt();
            
            if(escolha > 0 && escolha <= 20){
                if(produtos[escolha - 1] != null){
                    produtos[escolha - 1] = null;
                    System.out.println("Produto removido com sucesso!");
                } else{
                    System.out.println("Essa posicao ja esta vazia!");
                }
            } else{
                System.out.println("Opção inválida!");
            }
        } else{
            System.out.println("Não existem produtos cadastrados!");
        }
    }
    
    public void pesquisarProduto(String produto){
        boolean encontrado = false;
        
        if(isEmpty() == false){
            for(Produto p : produtos){
                if(p != null && produto.equalsIgnoreCase(p.getNome())){
                    System.out.println(produto + " se encontra no nosso estoque!\n");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("O produto buscado não se encontra!");
            }
        } else{
            System.out.println("Não temos produtos cadastrados!\n");
        }
    }
    
    public void exibirProdutos(){
        if(isEmpty() == false){
            System.out.println("\nProdutos disponiveis:");
            for(int i = 0; i < produtos.length; i++){
                if(produtos[i] != null){
                    System.out.println((i+1) + " - " + produtos[i].getNome() + " | R$" + produtos[i].getValor());
                }
            }
        }else{
            System.out.println("\nNão existem produtos cadastrados!");
        }
    }
    
    public boolean isEmpty(){
        boolean vazio = true;
        for(Produto p : produtos){
            if(p != null){
                vazio = false;
                break;
            }
        }
        return vazio;
    }
    
    public boolean estoqueCheio(){
        boolean cheio = true;
        for(Produto p : produtos){
            if(p == null){
                cheio = false;
                break;
            }
        }
        return cheio;
    }
}