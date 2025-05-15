import java.util.Random;

public class Guerreiro{
    private String nome;
    private int codigo;
    private int energia;
    
    public Guerreiro(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.energia = 5;
    }
    
    public int getEnergia(){
        return energia;
    }
    
    public void setEnergia(int energia){
        this.energia = energia;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void incremento(){
        if(getEnergia() < 5){
            setEnergia(getEnergia() + 1);
            System.out.println("A energia aumentou em 1 ponto.\n");
        } else{
            System.out.println("A energia ja está cheia (5).\n");
        }
    }
    
    public void decremento(){
        if(getEnergia() > 0){
            setEnergia(getEnergia() - 1);
            System.out.println("A energia de " + getNome() + " diminuiu em 1 ponto.");
            
            if(getEnergia() == 0){
                System.out.println("A energia do guerreiro " + getNome() + " chegou a zero!\n");
            }
        } else{
            System.out.println("A energia ja está zerada.\n");
        }
    }
    
    public void alimentar(){
        incremento();
    }
    
    public int atacar(){
        Random random = new Random();
        int ataque = random.nextInt(2);
        
        if(ataque == 0){
            System.out.println("Ataque sem sucesso...");
        } else{
            System.out.println("Atacou com sucesso.");
        }
        
        return ataque;
    }
    
    public void lutar(Guerreiro oponente){
        int round = 1;
        
        do{
            System.out.printf("\n----- ROUND %d -----", round);
            
            System.out.println("\nO guerreiro " + getNome() + " atacou!");
            if(atacar() == 1){
                oponente.decremento();
                System.out.printf("Energia atual do oponente %s: %d\n", oponente.getNome(), oponente.getEnergia());
                
                if(oponente.getEnergia() == 0){
                    break;
                }
            }
        
            try {
            Thread.sleep(3000); // Pausa (2 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("\nO guerreiro " + oponente.getNome() + " atacou!");
            if(oponente.atacar() == 1){
                decremento();
                System.out.printf("Energia atual do guerreiro %s: %d\n", getNome(), getEnergia());
                
                if(getEnergia() == 0){
                    break;
                }
            }
            
            round++;
            
        } while(getEnergia() != 0 && oponente.getEnergia() != 0);
        
        if (getEnergia() <= 0 && oponente.getEnergia() <= 0) {
            System.out.println("\nEmpate!");
        } else if (getEnergia() > 0) {
            System.out.println("\nO guerreiro " + getNome() + " venceu!!!");
        } else {
            System.out.println("\nO guerreiro " + oponente.getNome() + " venceu!!!");
        }
    }
    
    public String toString(){
        return String.format("Nome: %s\nCodigo: %d\nEnergia: %d", getNome(), getCodigo(), getEnergia());
    }
}