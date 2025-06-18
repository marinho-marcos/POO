import java.util.List;
import java.util.ArrayList;

public class Biblioteca{
    private List<Livro> acervo;
    
    public Biblioteca(){
        acervo = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro l){
        acervo.add(l);
    }
    
    public void removerLivro(Livro l){
        acervo.remove(l);
    }
    
    public void removerPorIndice(int i){
        if(i < acervo.size()){
            acervo.remove(i);
        } else{
            System.out.println("Livro não encontrado");
        }
        
    }
    
    public boolean acervoVazio(){
        return acervo.isEmpty();
    }
    
    public int tamanho(){
        return acervo.size();
    }
    
    public void removerTudo(){
        acervo.clear();
    }
    
    public String buscarPorIndice(int i){
        if(i < acervo.size()){
            return acervo.get(i).toString();
        } else{
            return "Livro não encontrado";
        }
    }
    
    
    public void exibirLivros(){
        int aux = 1;
        System.out.println("==== LIVROS ====");
        for(Livro l : acervo){
            System.out.printf("(%d) - ", aux);
            System.out.println(l.toString());
            aux++;
        }
    }
    
    
    /*
    public void exibirLivros(){
        System.out.println("==== LIVROS ====");
        for(int i = 0; i < acervo.size(); i++){
            System.out.printf("(%d - )", i + 1);
            System.out.println(acervo.get(i).toString());
        }
    }
    */
}