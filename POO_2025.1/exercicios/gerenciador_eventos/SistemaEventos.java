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
    }

    public Evento buscarEventoPeloNome(String nome){
        return eventos.get(nome);
    }

    public List<Evento> listarEventos(){
        Set<Evento> listaEventos = new HashSet<>();

        for()
    }
}
