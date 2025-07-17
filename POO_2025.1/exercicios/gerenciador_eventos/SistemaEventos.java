import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class SistemaEventos {
    private Map<String, Evento> eventos;

    public SistemaEventos(){
        eventos = new HashMap<>();
    }

    public void adicionarEvento(Evento e){
        eventos.put(e.getNome(), e);
        System.out.println("\nEvento " + e.getNome() + " adicionado com sucesso!");
    }

    public Evento buscarEventoPeloNome(String nome){
        if(eventos.containsKey(nome)){
           return eventos.get(nome); 
        }
        
        System.out.println("Não existe evento com esse nome!\n");
        return null;
    }

    public List<Evento> listarEventos(){
        List<Evento> listaEventos = new ArrayList<>();
    
        for(String chave : eventos.keySet()){
            listaEventos.add(eventos.get(chave));
        }
        
        return listaEventos;
    }
}