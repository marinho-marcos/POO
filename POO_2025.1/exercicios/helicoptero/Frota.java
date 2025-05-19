public class Frota {
	Helicoptero[] helicopteros;

	public Frota(int qntd) {
		this.helicopteros = new Helicoptero[qntd];
	}

	public void addHelicoptero(Helicoptero helicoptero) {
	    boolean adicionado = false;
		for(int i = 0; i < helicopteros.length; i++) {
			if(helicopteros[i] == null) {
				helicopteros[i] = helicoptero;
				System.out.println("\nhelicoptero " + helicoptero.getModelo() + " adicionado com sucesso!\n");
				adicionado = true;
				break;
			}
		}
		
		if(!adicionado){
		    System.out.println("Frota cheia. não foi possivel adicionar\n");
		}
	}

	public void ligarHelicoptero(int n) {
		if(indiceValido(n)) {
			boolean ligou = helicopteros[n].ligar();
			if(ligou){
			    System.out.println("Helicoptero " + helicopteros[n].getModelo() + " ligou!");
			} else{
			    System.out.println("O helicoptero ja esta ligado!");
			}
		}
	}

	public void desligarHelicoptero(int n) {
		if(indiceValido(n)) {
			boolean desligou = helicopteros[n].desligar();
			if(desligou){
			    System.out.println("Helicoptero " + helicopteros[n].getModelo() + " desligou!"); 
			} else{
			    System.out.println("Impossivel desligar");
			}
		}
	}

	public void entrarPassageiro(int n) {
		if(indiceValido(n)) {
			boolean entrou = helicopteros[n].entra();
			if(entrou){
			    System.out.println("Passageiro entrou no Helicoptero " + helicopteros[n].getModelo());
			} else{
			    System.out.println("Helicoptero cheio!");
			}
		}
	}

	public void sairPassageiro(int n) {
		if(indiceValido(n)) {
		    boolean saiu = helicopteros[n].sair();
			if(saiu){
			    System.out.println("Todos os passageiros sairam do helicoptero " + helicopteros[n].getModelo());
			} else{
			    System.out.println("Impossivel sair no momento...");
			}
		}
	}

	public void decolar(int altitude, int n) {
		if(indiceValido(n)) {
			boolean decolou = helicopteros[n].decolar(altitude);
			if(decolou){
			    System.out.println("O helicoptero " + helicopteros[n].getModelo() + " decolou para a altitude: " + altitude);  
			} else{
			    System.out.println("Impossivel decolar!");
			}
		}
	}

	public void aterrissar(int n) {
		if(indiceValido(n)) {
			boolean aterrissou = helicopteros[n].aterrissar();
			if(aterrissou){
			    System.out.println("O helicoptero " + helicopteros[n].getModelo() + " aterrissou...");
			} else{
			    System.out.println("Impossível aterrissar.\n");
			}
		}
	}

	public void exibirHelicoptero(int n) {
		if(indiceValido(n)) {
			System.out.println(helicopteros[n].toString());
		}

	}

	public void exibirFrota() {
		for(int i = 0; i < helicopteros.length; i++) {
			if(helicopteros[i] != null){
			    System.out.println("Helicoptero " + (i+1) + ":");
			    System.out.println(helicopteros[i].toString());
			}
		}
	}

	public boolean indiceValido(int n) {
		if(n >= 0 && n <= helicopteros.length && helicopteros[n] != null) {
			return true;
		} else {
			System.out.println("Não existe helicoptero na posiçao informada.");
			return false;
		}
	}
}