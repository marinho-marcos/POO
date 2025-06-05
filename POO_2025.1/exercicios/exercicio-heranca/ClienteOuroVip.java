public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, double valorCompra, String numeroCartao, String endereco){
        super(nome, valorCompra, numeroCartao);
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double calcularPagamento(){
        double valorComDesconto = getValorCompra() - (getValorCompra() * 0.15);
        return valorComDesconto;
    }

    public String toString(){
        return super.toString() + String.format("Endereço: %s%n", getEndereco());
    }
}
