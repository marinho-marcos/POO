public class Pergaminho extends FerramentaNinja{
    public Pergaminho(String nome){
        super(nome);
    }
    
    public void usarFerramenta(){
        System.out.println("Usando " + getNome());
    }
}