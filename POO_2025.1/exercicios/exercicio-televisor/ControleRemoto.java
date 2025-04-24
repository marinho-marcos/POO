public class ControleRemoto{
    private Televisor tv;
    
    //CONSTRUTOR
    public ControleRemoto(Televisor tv){
        this.tv = tv;
    }
    
    public void ligar(int canal, int volume){
        tv.ligar(canal, volume);
    }
    
    public void desligar(){
        tv.desligar();
    }
    
    public void aumentarVolume(){
        tv.aumentarVolume();
    }
    
    public void diminuirVolume(){
        tv.diminuirVolume();
    }
    
    public void mudarCanal(int canal){
        tv.mudarCanal(canal);
    }
    
    public String toString(){
        return tv.toString();
    }
}