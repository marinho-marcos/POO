public class Circulo{
    private double raio;
    public final static double PI = 3.141516;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return PI * raio * raio;
    }
    
    public double calcularPerimetro(){
        return 2 * PI * raio;
    }
    
    public void imprimir(){
        System.out.printf("Valor do raio: %.1f\n", raio);
        System.out.printf("Valor da área do círculo: %.2f\n", calcularArea());
        System.out.printf("Valor do perímetro do círculo: %.2f\n", calcularPerimetro());
    }
}