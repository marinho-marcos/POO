import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Hotel hotel1 = new Hotel();
		
		int opcao;
		int numero;
		
		do{
		    System.out.println("==== MENU =====");
		    System.out.println("(1) - Adicionar quarto");
		    System.out.println("(2) - Reservar quarto");
		    System.out.println("(3) - Cancelar reserva de quarto");
		    System.out.println("(4) - Exibir quartos disponiveis");
		    System.out.println("(0) - Sair");
		    
		    System.out.println("\nInforme uma opção: ");
		    opcao = teclado.nextInt();
		    teclado.nextLine(); //limpeza
		    
		    switch(opcao){
		        case 1:
		            System.out.println("Informe o tipo do quarto: ");
		            String tipoQuarto = teclado.nextLine();
		            System.out.println("Informe o numero do quarto: ");
		            int numQuarto = teclado.nextInt();
		            
		            hotel1.addQuarto(new Quarto(tipoQuarto, numQuarto));
		            break;
		            
		        case 2:
		            System.out.println("Informe o numero do quarto que deseja reservar: ");
		            numero = teclado.nextInt();
		            hotel1.reservarQuarto(numero);
		            break;
		      
		        case 3:
		            System.out.println("Informe o numero do quarto que deseja cancelar reserva: ");
		            numero = teclado.nextInt();
		            hotel1.cancelarReserva(numero);
		            break;
		            
		        case 4:
		            hotel1.exibirQuartos();
		            break;
		            
		        case 0:
		            opcao = 0;
		            System.out.println("\nfinalizando o sistema...");
		            break;
		            
		        default:
		            System.out.println("Opcao invalida!");
		    }
		    
		} while(opcao != 0);
		
		teclado.close();
	}
}
