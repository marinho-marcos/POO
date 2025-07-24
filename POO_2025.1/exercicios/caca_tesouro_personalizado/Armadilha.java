public class Armadilha extends ElementoTabuleiro{
    public int interagir(){
        return -2;
    }

    public String simbolo(){
        return "💣";
    }
    
    public String simboloComJogador(){
        return "💀";
    }
    
    public String mensagemInteracao(){
        return "\nVoce caiu em uma ARMADILHA! -2 pontos.";
    }
    
    @Override
    public boolean ehArmadilha(){
        return true;
    }
}
