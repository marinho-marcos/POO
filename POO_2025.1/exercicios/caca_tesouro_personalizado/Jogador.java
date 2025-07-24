import java.util.Set;
import java.util.HashSet;

public class Jogador {
    private int pontuacao;
    private int movimentos;
    private int linha;
    private int coluna;
    private int tesouros;
    private int armadilhas;
    private Set<String> visitados;

    public Jogador(){
        this.pontuacao = 0;
        this.movimentos = 10;
        this.linha = 0;
        this.coluna = 0;
        this.tesouros = 3;
        this.armadilhas = 3;
        visitados = new HashSet<>();
    }

    public int getPontuacao(){
        return pontuacao;
    }

    public int getMovimentos(){
        return movimentos;
    }

    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public int getTesouros(){
        return tesouros;
    }

    public int getArmadilhas(){
        return armadilhas;
    }

    public void setTesouros(int tesouro){
        this.tesouros = tesouro;
    }

    public void setArmadilhas(int armadilha){
        this.armadilhas = armadilha;
    }

    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public void setMovimentos(int movimento){
        this.movimentos = movimento;
    }

    public void adicionarPontos(int ponto){
        pontuacao += ponto;
    }

    public void registrarVisita(int linha, int coluna){
        visitados.add(linha + "," + coluna);
    }

    public boolean jaVisitou(int linha, int coluna){
        return visitados.contains(linha + "," + coluna);
    }


    public void moverPara(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        registrarVisita(linha, coluna);
        setMovimentos(getMovimentos() - 1);
    }
}