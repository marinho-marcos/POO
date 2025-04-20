import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Informe o valor do raio do círculo: ");
       double raio = entrada.nextDouble();
       
       Circulo circulo1 = new Circulo(raio);
       circulo1.imprimir();
       entrada.close();
    }
}