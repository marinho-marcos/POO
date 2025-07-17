import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Main
{
	public static void main(String[] args) {
		Evento festa1 = new Evento("Festa da luz", 5, LocalDate.of(2025,01,28));
		Evento festa2 = new Evento("São joão", 10, LocalDate.of(2025, 06, 24));

		SistemaEventos s1 = new SistemaEventos();
		
		festa1.adicionarParticipante(new Participante("Joao", "83986616585", "marcos123@gmail.com"));
		festa1.adicionarParticipante(new Participante("pedro", "8443216585", "pedro321@gmail.com"));
		festa1.adicionarParticipante(new Participante("Ana", "21988727656", "ana777@gmail.com"));

		festa2.adicionarParticipante(new Participante("Leonardo", "83987345676", "leo@gmail.com"));
		festa2.adicionarParticipante(new Participante("Lucas", "11955789234", "lucas@gmail.com"));
		festa2.adicionarParticipante(new Participante("Beatriz", "81990875434", "bia@gmail.com"));
		
		//FESTA 1
		/* 
		List<Participante> participantesOrdenado = festa1.listarParticipantePorNome();
		
		System.out.println("\n=== LISTA ORDEM ALFABÉTICA ===");
		for(Participante p : participantesOrdenado){
		    System.out.print(p.toString());
		}
		

		Set<Participante> participantesInicial = festa1.buscarParticipantePorInicial('a');
		
		System.out.println("\n=== LISTA POR INICIAL ===");
		for(Participante p : participantesInicial){
		    System.out.print(p.toString());
		}
		
		s1.adicionarEvento(festa1);
		Evento evento = s1.buscarEventoPeloNome("festa da luz");
		System.out.println(evento.toString());
		
		List<Evento> listaEventos = s1.listarEventos();
		
		System.out.println("\n=== LISTA EVENTOS ===");
		for(Evento e : listaEventos){
		    System.out.print(e.toString());
		}
		*/


		//FESTA 2
		s1.adicionarEvento(festa2);

		List<Participante> participantesOrdenado = festa2.listarParticipantePorNome();
		
		System.out.println("\n=== LISTA ORDEM ALFABÉTICA ===");
		for(Participante p : participantesOrdenado){
		    System.out.print(p.toString());
		}
		
		
		Set<Participante> participantesInicial = festa2.buscarParticipantePorInicial('a');
		
		if (!participantesInicial.isEmpty()) {
			System.out.println("\n=== LISTA POR INICIAL ===");
			for(Participante p : participantesInicial){
				System.out.print(p.toString());
			}
		}
	}

	
}
