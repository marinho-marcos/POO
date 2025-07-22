import java.util.Set;
import java.util.HashSet;

public class Jogador {
    private int pontuacao;
    private int linha;
    private int coluna;

    public Jogador(){
        this.pontuacao = 0;
        this.linha = 0;
        this.coluna = 0;
    }

    public int getPontuacao(){
        return pontuacao;
    }

    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public void adicionarPontos(int ponto){
        pontuacao += ponto;
    }


    public void moverPara(int novaLinha, int novaColuna){
        linha = novaLinha;
        coluna = novaColuna;
    }

    public String simbolo(){
        return "🙂";
    }
}
