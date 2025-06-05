public abstract class Cliente {
    private String nome;
    private double valorCompra;

    public Cliente(String nome, double valorCompra){
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValorCompra(){
        return valorCompra;
    }

    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }

    public String toString(){
        return String.format("Nome do cliente: %s%nValor da compra: %.2f%n", getNome(), getValorCompra());
    }

    public abstract double calcularPagamento();
}
