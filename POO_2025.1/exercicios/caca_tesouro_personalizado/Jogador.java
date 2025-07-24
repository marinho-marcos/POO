import java.util.Set;
import java.util.HashSet;

public class Jogador {
    private int pontuacao;
    private int linha;
    private int coluna;
    private Tesouro tesouro;
    private Armadilha armadilha;
    private Set<String> visitados;

    public Jogador(){
        this.pontuacao = 0;
        this.linha = 0;
        this.coluna = 0;
        this.tesouro = new Tesouro();
        this.armadilha = new Armadilha();
        visitados = new HashSet<>();
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
    }

    public String simbolo(ElementoTabuleiro elemento){
        if(elemento instanceof Tesouro) return tesouro.simbolo();
        if(elemento instanceof Armadilha) return armadilha.simbolo();
        return "🙂";
    }
}