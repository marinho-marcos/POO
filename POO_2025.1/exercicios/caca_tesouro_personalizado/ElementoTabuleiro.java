public abstract class ElementoTabuleiro {
    public abstract int interagir();
    public abstract String simbolo(); 
    public abstract String simboloComJogador();
    public abstract String mensagemInteracao();
    
    public boolean ehTesouro(){
        return false;
    }
    
    public boolean ehArmadilha(){
        return false;
    }
    
    public boolean ehVazio(){
        return false;
    }
}
