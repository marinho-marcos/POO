public class Vazio extends ElementoTabuleiro {
    public int interagir(){
        return 0;
    }

    public String simbolo(){
        return "⬜";
    }
    
    public String simboloComJogador(){
        return "🙂";
    }
    
    public String mensagemInteracao(){
        return "\nNada aqui...";
    }
    
    @Override
    public boolean ehVazio(){
        return true;
    }
    
}