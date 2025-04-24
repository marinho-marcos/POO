import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Televisor tv1 = new Televisor();
        System.out.println(tv1.toString());
        
        ControleRemoto controle1 = new ControleRemoto(tv1);
        controle1.ligar(7, 33);
        System.out.println(controle1.toString());
        
        controle1.mudarCanal(22);
        System.out.println(controle1.toString());
        
        controle1.desligar();
        
    }
}