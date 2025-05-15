public class Frota {
    Helicoptero[] helicopteros = new Helicoptero[20];

    public Frota(){

    }

    public void cadastrarHelicoptero(Helicoptero helicoptero){
        for(int i = 0; i < helicopteros.length; i++){
            if(helicopteros[i] != null){
                helicopteros[i] = helicoptero;
            }
        }
    }

    public void ligarHelicoptero(){
        helicopteros.ligar();
        if(helicopteros.getLigado()){
            System.out.println("Helicoptero " + helicopteros.getModelo() + " ligou!");
        }
    }

    public void desligarHelicoptero(){
        helicopteros.desligar();
    }

    public void entrarPassageiro(){
        helicopteros.entra();
    }

    public void sairPassageiro(){
        helicopteros.sair();
    }

    public void decolar(int altitude){
        helicopteros.decolar(altitude);
    }

    public void aterrissar(){
        helicopteros.aterrissar();
    }

    public void exibirHelicopteros(){
        helicopteros.toString();
    }
}
