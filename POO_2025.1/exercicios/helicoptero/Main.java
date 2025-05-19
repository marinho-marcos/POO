import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe quantos helicopteros a frota vai possuir: ");
        int tamanhoFrota = teclado.nextInt();
        teclado.nextLine(); //limpar buffer
        
        Frota frota = new Frota(tamanhoFrota);
        
        int opcaoMenu;
        do{

            System.out.println("\n----MENU----");
            System.out.println("1 - adicionar helicoptero");
            System.out.println("2 - ligar helicoptero");
            System.out.println("3 - desligar helicoptero");
            System.out.println("4 - entrar pessoa");
            System.out.println("5 - sair pessoa");
            System.out.println("6 - decolar helicoptero");
            System.out.println("7 - aterrisar helicoptero");
            System.out.println("8 - exibir dados de um helicoptero");
            System.out.println("9 - exibir frota completa");
            System.out.println("0 - sair");

            System.out.println("\nescolha uma opcao: ");
            opcaoMenu = teclado.nextInt();
            teclado.nextLine(); //limpar buffer

            switch (opcaoMenu) {

                case 1:
                    System.out.println("Informe o modelo: ");
                    String modeloHelicoptero = teclado.nextLine();
                    System.out.println("informe a capacidade: ");
                    int capacidade = teclado.nextInt();
                    teclado.nextLine(); //limpar buffer
                    Helicoptero modelo = new Helicoptero(capacidade, modeloHelicoptero);
                    frota.addHelicoptero(modelo);
                    break;

                case 2:
                    System.out.println("Qual helicoptero deseja ligar?");
                    int opcaoLigar = teclado.nextInt();
                    frota.ligarHelicoptero(opcaoLigar - 1);
                    break;
                    
                case 3:
                    System.out.println("Qual helicoptero deseja desligar?");
                    int opcaoDesligar = teclado.nextInt();
                    frota.desligarHelicoptero(opcaoDesligar - 1);
                    break;

                case 4:
                    System.out.println("Em qual helicoptero o passageiro vai entrar?");
                    int opcaoEntrar = teclado.nextInt();
                    frota.entrarPassageiro(opcaoEntrar - 1);
                    break;

                case 5:
                    System.out.println("De qual helicoptero o passageiro vai sair?");
                    int opcaoSair = teclado.nextInt();
                    frota.sairPassageiro(opcaoSair - 1);
                    break;
                    
                case 6:
                    System.out.println("Qual helicoptero vai decolar?");
                    int opcaoDecolar = teclado.nextInt();
                    System.out.println("Informe a altitude: ");
                    int altitude = teclado.nextInt();
                    frota.decolar(altitude, opcaoDecolar  - 1);
                    break;
                    
                case 7:
                    System.out.println("Qual helicoptero vai aterrissar?");
                    int opcaoAterrissar = teclado.nextInt();
                    frota.aterrissar(opcaoAterrissar - 1);
                    break;
                    
                case 8:
                    System.out.println("Exibir dados de Qual helicoptero?");
                    int opcaoDados = teclado.nextInt();
                    frota.exibirHelicoptero(opcaoDados - 1);
                    break;
                    
                case 9:
                    frota.exibirFrota();
                    break;
                    
                case 0:
                    System.out.println("Encerrando sistema...");
                    opcaoMenu = 0;
                    break;
                    
                default:
                    System.out.println("Opção inválida");
            }
        } while(opcaoMenu != 0);
        
        teclado.close();
    }
    
}