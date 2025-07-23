import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private ElementoTabuleiro[][] tabuleiro;
    private Jogador jogador;
    private int movimentosRestantes;
    private int tesourosRestantes;
    private int armadilhasRestantes;

    public Jogo(){
        tabuleiro = new ElementoTabuleiro[6][6];
        jogador = new Jogador();
        movimentosRestantes = 10;
        tesourosRestantes = 3;
        armadilhasRestantes = 3;

        inicializarTabuleiro();
        jogador.registrarVisita(0, 0);
    }

    private void inicializarTabuleiro(){
        Random random = new Random();
        int tesourosAdicinoados = 0;
        int armadilhasAdicionadas = 0;

        // preenchendo tabuleiro com vazio
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                tabuleiro[i][j] = new Vazio();
            }
        }

        // criando tesouros aleatoriamente
        while(tesourosAdicinoados < 3){
            int linha = random.nextInt(6);
            int coluna = random.nextInt(6);

            if(tabuleiro[linha][coluna] instanceof Vazio && !(linha == 0 && coluna == 0)){
                tabuleiro[linha][coluna] = new Tesouro();
                tesourosAdicinoados++;
            }
        }

        // criando armadilhas aleatoriamente
        while(armadilhasAdicionadas < 3){
            int linha = random.nextInt(6);
            int coluna = random.nextInt(6);

            if(tabuleiro[linha][coluna] instanceof Vazio && !(linha == 0 && coluna == 0)){
                tabuleiro[linha][coluna] = new Armadilha();
                armadilhasAdicionadas++;
            }
        }
    }

    public void executar(){
        Scanner scanner = new Scanner(System.in);

        while(movimentosRestantes > 0 && tesourosRestantes > 0){
            exibirTabuleiro();

            System.out.println("Pontuacao: " + jogador.getPontuacao());
            System.out.println("Movimentos restantes: " + movimentosRestantes);
            System.out.print("\nDigite um comando (W/A/S/D): ");

            String comando = scanner.nextLine().toUpperCase();

            // linha e coluna atuais
            int novaLinha = jogador.getLinha();
            int novaColuna = jogador.getColuna();

            switch(comando){
                case "A": 
                    novaColuna--; 
                    break;
                case "W": 
                    novaLinha--; 
                    break;
                case "D": 
                    novaColuna++; 
                    break;
                case "S": 
                    novaLinha++; 
                    break;
                default:
                    System.out.println("Comando inválido! Use W, A, S ou D.");
                    continue;
            }

            // verificando se movimento é valido
            if(novaLinha < 0 || novaLinha >= 6 || novaColuna < 0 || novaColuna >= 6){
                System.out.println("Movimento invalido. fora do tabuleiro!\n");
                continue;
            }

            // verificando se a celula ja foi visitada
            if(jogador.jaVisitou(novaLinha, novaColuna)){
                System.out.println("Posicao ja visitada!\n");
                continue;
            }

            // registrando movimento valido
            jogador.moverPara(novaLinha, novaColuna);
            movimentosRestantes--;

            // interagindo com o elemento da celula visitada
            ElementoTabuleiro elemento = tabuleiro[novaLinha][novaColuna];
            int pontos = elemento.interagir();
            jogador.adicionarPontos(pontos);

            if(elemento instanceof Tesouro){
                System.out.println("\nVoce encontrou um TESOURO! +3 pontos.");
                tesourosRestantes--;
            } else if(elemento instanceof Armadilha){
                System.out.println("\nVoce caiu em uma ARMADILHA! -2 pontos.");
                armadilhasRestantes--;
            } else{
                System.out.println("\nNada aqui...");
            }
            
            System.out.println("\n********************************************\n");
        }
        
        exibirTabuleiro();

        // fim de jogo
        System.out.println("\n====== FIM DE JOGO ======");
        
        revelarTabuleiro();
        
        if(movimentosRestantes == 0){
            System.out.println("\nSeus movimentos acabaram!");
        } else {
            System.out.println("\nVocê encontrou todos os tesouros!");
        }
        
        System.out.println("\n===== STATUS =====");
        System.out.println("Pontuacao final: " + jogador.getPontuacao());
        System.out.println("Tesouros: " + (3 - tesourosRestantes));
        System.out.println("Armadilhas: " + (3 - armadilhasRestantes));

    }

    private void exibirTabuleiro() {
        System.out.println("\nTABULEIRO:");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(obterSimbolo(i, j) + " ");
            }
            System.out.println(); // nova linha do tabuleiro
        }
        System.out.println(); // espaço extra para separar jogadas
    }
    
    // metodo responsavel pela exibicao do simbolo dos elementos
    private String obterSimbolo(int i, int j){
        int linhaJogador = jogador.getLinha();
        int colunaJogador = jogador.getColuna();
        
        // caso o jogador esta na posicao
        if(i == linhaJogador && j == colunaJogador){
            ElementoTabuleiro elemento = tabuleiro[i][j];
            
            if(elemento instanceof Tesouro) return "🤑";
            if(elemento instanceof Armadilha) return "💀";
            return jogador.simbolo();
        }
        
        // caso ja tenha sido revelado
        if(jogador.jaVisitou(i, j)){
            return tabuleiro[i][j].simbolo();
        }
        
        // caso posicao seja vazia
        return "🟥";
    }
    
    // metodo auxiliar para revelar o tabuleiro ao fim do jogo
    private void revelarTabuleiro(){
        System.out.println("\nTABULEIRO REVELADO:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%s ", tabuleiro[i][j].simbolo());
            }
        System.out.println(); // nova linha
        }
    }
    
}
