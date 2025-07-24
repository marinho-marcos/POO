public class Tesouro extends ElementoTabuleiro {
    public int interagir(){
        return 3;
    }

    public String simbolo(){
        return "💰";
    }
    
    public String simboloComJogador(){
        return "🤑";
    }
    
    public String mensagemInteracao(){
        return "\nVoce encontrou um TESOURO! +3 pontos.";
    }
    
    @Override
    public boolean ehTesouro(){
        return true;
    }
}
