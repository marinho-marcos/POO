public class Principal {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("marcos", 25);
        pessoa1.falar();
        System.err.println("\n");

        Carro carro1 = new Carro("ford", "ka", 2020);
        carro1.exibirDados();

        System.err.println("\n");
        
        int vezes = 0;
        while(vezes < 3) {
            carro1.acelerar();
            carro1.exibirDados();
            vezes++;
        }

        System.err.println("\n");
        carro1.parar();
        
    }
}
