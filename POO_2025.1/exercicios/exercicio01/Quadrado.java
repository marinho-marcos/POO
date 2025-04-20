public class Quadrado{
    private int lado;
    
    //CONSTRUTOR
    public Quadrado(int lado){
        this.lado = lado;
    }

    //GET
    public int getLado(){
        return lado;
    }

    //SET
    public void setLado(int lado){
        this.lado = lado;
    }

    public String toString(){
        System.out.println("Lado: " + lado);
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

    public void imprimir(){
        System.out.println("valor do lado: " + lado);
        System.out.println("valor da área: " + calcularArea());
        System.out.println("valor do perimetro: " + calcularPerimetro());
    }
}