public class Main{
    public static void main(String[] args){
        FitaDeVideo fita1 = new FitaDeVideo("Exterminador do Futuro", 2);
        
        fita1.imprimir();
        System.out.println(fita1.getValorAluguel(3));
        System.out.println(fita1.toString());
    }
}