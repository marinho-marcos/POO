import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Main
{
	public static void main(String[] args) {
		Evento festa1 = new Evento("festa da luz", 5, LocalDate.of(2025,01,28));
		
		festa1.adicionarParticipante(new Participante("Joao", "83986616585", "marcos123@gmail.com"));
		festa1.adicionarParticipante(new Participante("pedro", "8443216585", "pedro321@gmail.com"));
		festa1.adicionarParticipante(new Participante("Ana", "21988727656", "ana777@gmail.com"));
		
		List<Participante> participantesOrdenado = festa1.listarParticipantePorNome();
		
		System.out.println("\n=== LISTA ORDEM ALFABÉTICA ===");
		for(Participante p : participantesOrdenado){
		    System.out.print(p.toString());
		}
		
		
		Set<Participante> participantesInicial = festa1.buscarParticipantePorInicial('A');
		
		System.out.println("\n=== LISTA POR INCIAL ===");
		for(Participante p : participantesInicial){
		    System.out.print(p.toString());
		}
		
		
		SistemaEventos s1 = new SistemaEventos();
		
		s1.adicionarEvento(festa1);
		Evento evento = s1.buscarEventoPeloNome("festa da luz");
		System.out.println(evento.toString());
		
		List<Evento> listaEventos = s1.listarEventos();
		
		System.out.println("\n=== LISTA EVENTOS ===");
		for(Evento e : listaEventos){
		    System.out.print(e.toString());
		}
	}
}
