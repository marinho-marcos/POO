import java.util.List;
import java.util.LinkedList;

public class Biblioteca{
    private List<Livro> acervo;
    
    public Biblioteca(){
        acervo = new LinkedList<Livro>();
    }
    
    public void adicionarLivro(Livro l){
        acervo.add(l);
    }
    
    public void adicionarInicio(Livro l){
        acervo.addFirst(l);
    }
    
    public void adicionarFinal(Livro l){
        acervo.addLast(l);
    }
    
    public String exibirPrimeiro(){
        return acervo.getFirst().toString();
    }
    
    public String exibirFinal(){
        return acervo.getLast().toString();
    }
    
    public void removerLivro(Livro l){      //REMOVE PELA REFERENCIA
        acervo.remove(l);
    }
    
    public void removerPorIndice(int i){
        if(i < acervo.size()){
            acervo.remove(i);
        } else{
            System.out.println("Livro não encontrado");
        }
    }
    
    public void removerInicio(){
        acervo.removeFirst();
    }
    
    public void removerFinal(){
        acervo.removeLast();
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