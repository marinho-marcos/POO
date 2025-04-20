public class FitaDeVideo{
    private String titulo;
    private double preco;
    
    public FitaDeVideo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    
    public void imprimir(){
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Preço do aluguel/dia: R$%.2f\n", preco);
    }
    
    public String getValorAluguel(int quantidadeDiasAlugada){
        double total = preco * quantidadeDiasAlugada;
        return String.format("\nPreço por %d dias: R$%.2f",quantidadeDiasAlugada, total);
    }
    
    public String toString(){
        return String.format("\nTitulo da fita: %s\nPreço da fita: R$%.2f", titulo, preco);
    }
}