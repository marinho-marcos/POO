import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a largura do retângulo: ");
        int largura = entrada.nextInt();

        System.out.println("Informe o comprimento do retângulo: ");
        int comprimento = entrada.nextInt();
        System.out.println("\n");

        Retangulo ret1 = new Retangulo(largura, comprimento);
        
        entrada.close();
        ret1.imprimir();
    }
}