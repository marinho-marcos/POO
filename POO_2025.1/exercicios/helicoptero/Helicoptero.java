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

    public boolean ligar(){
        if(!getLigado()){
            setLigado(true);
            return true;
        } else{
            return false;
        }
    }

    public boolean desligar(){
        if(getLigado() && getAltitude() == 0){
            setLigado(false);
            return true;
        } else{
            return false;
        }
    }

    public boolean entra(){
        if(getQuantidade() < getCapacidade()){
            setQuantidade(getQuantidade()+1);
            return true;
        } else{
            return false;
        }
    }

    public boolean sair(){
        if(getQuantidade() > 0 && getAltitude() == 0){
            int passageiros = getQuantidade();
            for(int i = 1; i <= passageiros; i++){
                setQuantidade(getQuantidade() - 1);
                System.out.println("O passageiro " + i + " saiu.");
            }
            return true;
        } else{
            return false;
        }
    }
    
    public boolean decolar(int altitude){
        if(getLigado() && getAltitude() == 0){
            setAltitude(altitude);
            return true;
        } else{
            return false;
        }
    }

    public boolean aterrissar(){
        if(getLigado() && getAltitude() > 0){
            setAltitude(0);
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return String.format("\nModelo: %s\nLigado: %b\nAltitude: %d\nCapacidade: %d\nQuantidade: %d\n", getModelo(), getLigado(), getAltitude(), getCapacidade(), getQuantidade());
    }

}