public class Vazio extends ElementoTabuleiro {
    public void interagir(Jogador jogador){
        System.out.println("\nNada aqui...");
    }

    public String simbolo(){
        return "⬜";
    }
    
    public String simboloComJogador(){
        return "🙂";
    }
    
}