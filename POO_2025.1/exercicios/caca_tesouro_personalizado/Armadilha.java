public class Armadilha extends ElementoTabuleiro{
    public void interagir(Jogador jogador){
        jogador.setPontuacao(jogador.getPontuacao() - 2);
        jogador.setArmadilhas(jogador.getArmadilhas() - 1);

        System.out.println("\nVoce caiu em uma ARMADILHA! -2 pontos.");
    }

    public String simbolo(){
        return "💣";
    }
    
    public String simboloComJogador(){
        return "💀";
    }
}
