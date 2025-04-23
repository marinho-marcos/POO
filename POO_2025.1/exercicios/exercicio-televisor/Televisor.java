public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(){
        ligado = false;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public String toString(){
        return String.format("\nCanal: %d\nVolume: %d\nLigado: %b\n", getCanal(), getVolume(), getLigado());
    }

    public void ligarTv(int canal, int volume){
        if(getLigado() == false){
            setLigado(true);
            setCanal(canal);
            setVolume(volume);
            System.out.println("\nLigando a TV...");
        } else{
            System.out.println("\nA TV ja está ligada");
        }
    }

    public void desligar(){
        if(getLigado()){
            setLigado(false);
            setCanal(0);
            setVolume(0);
            System.out.println("\nDesligando a TV...");
        } else{
            System.out.println("\nA TV ja está desligada");
        }
    }

    public void aumentarVolume(){
        if(getLigado()){
            setVolume(getVolume() + 1);
            System.out.println("Aumentando volume");
        } else{
            System.out.println("TV desligada. impossível aumentar o volume.");
        }
    }

}
