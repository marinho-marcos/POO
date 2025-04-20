public class Main {
	public static void main(String[] args) {
		Calendario data1 = new Calendario(10, 11, 1996);
		Calendario data2 = new Calendario(20, 4, 2025);
		
		System.out.println(data1.nomeDoMes(12)); 
		
		data1.mostrarData();
		data1.anoBissexto();
		
		data2.mostrarData();
		data2.anoBissexto();
	}
}