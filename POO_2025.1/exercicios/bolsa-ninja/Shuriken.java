public class Shuriken extends FerramentaNinja implements Explosao{
    public Shuriken(String nome){
        super(nome);
    }
    
    public void usarFerramenta(){
        System.out.println("Jogando " + getNome());
    }
    
    public void explodir(){
        System.out.println(getNome() + " explodiu!!!");
    }
}