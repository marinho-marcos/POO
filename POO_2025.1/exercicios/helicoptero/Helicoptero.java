public class Helicoptero{
    private String modelo;
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int quantidade;

    public Helicoptero(int capacidade, String modelo){
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getModelo(){
        return modelo;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean status){
        this.ligado = status;
    }

    public int getAltitude(){
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void ligar(){
        if(!getLigado()){
            setLigado(true);
            System.out.println("Ligando helicoptero...\n");
        } else{
            System.out.println("O helicoptero ja esta ligado!");
        }
    }

    public void desligar(){
        if(getLigado() && getAltitude() == 0){
            setLigado(false);
            System.out.println("Desligando helicoptero...\n");
        } else{
            System.out.println("Impossivel desligar");
        }
    }

    public void entra(){
        if(getQuantidade() < getCapacidade()){
            setQuantidade(getQuantidade()+1);
            System.out.println("Uma passageiro entrou\n");
        } else{
            System.out.println("Helicoptero cheio!");
        }
    }

    public void sair(){
        if(getQuantidade() > 0 && getAltitude() == 0){
            int passageiros = getQuantidade();
            for(int i = 1; i <= passageiros; i++){
                setQuantidade(getQuantidade() - 1);
                System.out.println("O passageiro " + i + " saiu.");
            }
            System.out.println("\n");
        } else{
            System.out.println("Impossivel sair no momento...");
        }
    }
    

    public void decolar(int altitude){
        if(getLigado() && getAltitude() == 0){
            System.out.println("Decolando para altitude: " + altitude);
            setAltitude(altitude);
        } else{
            System.out.println("Impossivel decolar!");
        }
    }

    public void aterrissar(){
        if(getLigado() && getAltitude() > 0){
            System.out.println("Aterrissando...\n");
            setAltitude(0);
        }
    }

    public String toString(){
        return String.format("\nModelo: %s\nLigado: %b\nAltitude: %d\nCapacidade: %d\nQuantidade: %d\n", getLigado(), getAltitude(), getCapacidade(), getQuantidade());
    }

}