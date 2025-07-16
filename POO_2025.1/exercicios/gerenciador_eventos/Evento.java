import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Evento {
    private String nome;
    private int capacidade;
    private LocalDate data;
    private Set<Participante> participantes;

    public Evento(String nome, int capacidade, LocalDate data) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.data = data;
        participantes = new HashSet<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public boolean adicionarParticipante(Participante p){
        return participantes.add(p);
    }

    public List<Participante> listarParticipantePorNome(){
        List<Participante> participantesOrdenados = new ArrayList<>();

        for(Participante p: participantes){
            participantesOrdenados.add(p);
        }

        Collections.sort(participantesOrdenados);

        return participantesOrdenados;
    }

    public Set<Participante> buscarParticipantesPorInicial(char letra){
        Set<Participante> participantesInicial = new HashSet<>();

        for(Participante p : participantes){
            if(p.getNome().startsWith(String.valueOf(letra))){
                participantesInicial.add(p);
            }
        }

        return participantesInicial;
    }

}
