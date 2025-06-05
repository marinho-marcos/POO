public class ClienteVip extends Cliente{
    private String numeroCartao;

    public ClienteVip(String nome, double valorCompra, String numeroCartao){
        super(nome, valorCompra);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao(){
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    public double calcularPagamento(){
        double valorComDesconto = getValorCompra() - (getValorCompra() * 0.10);
        return valorComDesconto;
    }

    public String toString(){
        return super.toString() + String.format("Valor com desconto: %.2f%nNumero do cartão: %s%n", calcularPagamento(), getNumeroCartao());
    }
}