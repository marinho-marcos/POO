import java.util.Objects;

public class Produto{
    private int codigoProduto;
    private String nome;
    private double valor;
    
    public Produto(int codigoProduto, String nome, double valor){
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.valor = valor;
    }
    
    public int getCodigoProduto(){
        return codigoProduto;
    }
    
    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    // SOBREESCRITA DO METODO HASHCODE
    @Override
    public int hashCode(){
        return Objects.hash(codigoProduto);
    }
    
    // SOBREESCRITA DO METODO EQUALS UTILIZANDO NOME E VALOR COMO CRITERIO
    /*
    @Override
    public boolean equals(Object p){
        if(this == p){
            return true;
        } else if(p == null || getClass() != p.getClass()){
            return false;
        } else{
            Produto produto = (Produto) p;
            return nome == produto.nome && Objects.equals(valor, produto.valor);
        }
    }
    */
    
    // SOBREESCRITA DO METODO EQUALS UTILIZANDO CODIGO DO PRODUTO COMO CRITERIO
    @Override
    public boolean equals(Object p){
        if(this == p){
            return true;
        } else if(p == null || getClass() != p.getClass()){
            return false;
        } else{
            Produto produto = (Produto) p;
            return codigoProduto == produto.codigoProduto;
        }
    }
    
    public String toString(){
        return String.format("Código do produto: %d%nNome do produto: %s%nValor: %.2f%n", getCodigoProduto(), getNome(), getValor());
    }
}