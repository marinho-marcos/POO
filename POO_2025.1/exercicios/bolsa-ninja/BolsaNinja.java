import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class BolsaNinja{
    private List<FerramentaNinja> ferramentas;
    
    public BolsaNinja(){
        ferramentas = new ArrayList<>();
    }
    
    public void adicionarFerramenta(FerramentaNinja f){
        ferramentas.add(f);
    }
    
    public void removerFerramenta(FerramentaNinja f){
        ferramentas.remove(f);
    }
    
    public boolean removerFerramentaPeloNome(String nome){
        return ferramentas.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }
    
    public void usarTodasFerramentas(){
        for(FerramentaNinja f : ferramentas){
            f.usarFerramenta();
        }
    }
    
    public void mostrarFerramentas(){
        System.out.println("\n===== FERRAMENTAS =====");
        for(FerramentaNinja f : ferramentas){
            System.out.println(f.toString());
        }
    }
}