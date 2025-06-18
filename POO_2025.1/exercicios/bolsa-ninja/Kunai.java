public class Kunai extends FerramentaNinja implements Explosao{
    public Kunai(String nome){
        super(nome);
    }
    
    public void usarFerramenta(){
        System.out.println("Jogando " + getNome());
    }
    
    public void explodir(){
        System.out.println(getNome() + " explodiu!!!");
    }
}