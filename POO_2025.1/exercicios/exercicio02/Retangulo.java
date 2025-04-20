public class Retangulo{
    private int largura;
    private int comprimento;
    
    //CONSTRUTOR
    public Retangulo(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    //GET LARGURA
    public int getLargura(){
        return largura;
    }

    //SET LARGURA
    public void setLargura(int largura){
        this.largura = largura;
    }
    
    //GET COMPRIMENTO
    public int getComprimento(){
        return comprimento;
    }

    //SET COMPRIMENTO
    public void setComprimento(int comprimento){
        this.comprimento = comprimento;
    }

    public double calcularArea(){
        return largura * comprimento;
    }

    public double calcularPerimetro(){
        return (2*largura)+(2*comprimento);
    }

    public void imprimir(){
        System.out.println("valor da largura: " + largura);
        System.out.println("valor do comprimento: " + comprimento);
        System.out.println("valor da área: " + calcularArea());
        System.out.println("valor do perimetro: " + calcularPerimetro());
    }
}