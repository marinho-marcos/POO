import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado: ");
        int lado = entrada.nextInt();

        entrada.close();

        Quadrado q1 = new Quadrado(lado);
        q1.calcularArea();
        q1.calcularPerimetro();
        q1.imprimir();
    }
}