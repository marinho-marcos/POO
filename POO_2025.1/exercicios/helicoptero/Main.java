import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frota frota1 = new Frota();

        do{
            Scanner teclado = new Scanner(System.in);

            int opcao = -1;

            System.out.println("\n----MENU----");
            System.out.println("1 - adicionar helicoptero");
            System.out.println("2 - ligar helicoptero");
            System.out.println("3 - desligar helicoptero");
            System.out.println("4 - entrar pessoa");
            System.out.println("5 - sair pessoa");
            System.out.println("6 - decolar helicoptero");
            System.out.println("7 - aterrisar helicoptero");
            System.out.println("8 - exibir helicoptero");
            System.out.println("0 - sair");

            System.out.println("escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.println("informe a capacidade: ");
                    int capacidade = teclado.nextInt();
                    Helicoptero novoHelicoptero = new Helicoptero(capacidade, modelo)
                    frota1.cadastrarHelicoptero(novoHelicoptero);
                    break;

                case 2:
                    frota1.ligarHelicoptero();
                    break;

                case 3:
                    frota1.desligarHelicoptero();
                    break;

                    
                case 4:
                    frota1.entrarPassageiro();
                    break;

                case 5:
                    frota1.sairPassageiro();
                    break;

                case 6:
                    
                    
                default:
                    break;
            }
        }

        /* 
        System.out.println(h1.toString());
        System.out.println(h2.toString());

        h1.entra();
        h2.entra();

        h1.entra();
        h2.entra();

        h1.entra();
        h2.entra();

        h1.ligar();
        h2.ligar();


        h1.decolar(500);
        h2.decolar(800);

        System.out.println(h1.toString());
        System.out.println(h2.toString());

        h1.aterrissar();
        h2.aterrissar();

        h1.desligar();
        h2.desligar();

        h1.sair();
        h2.sair();

        System.out.println(h1.toString());
        System.out.println(h2.toString());

        */
    }
    
}
