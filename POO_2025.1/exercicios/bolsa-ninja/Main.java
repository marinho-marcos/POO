public class Main
{
	public static void main(String[] args) {
		BolsaNinja bolsa1 = new BolsaNinja();
		
		FerramentaNinja f1 = new Kunai("kunai explosiva");
		FerramentaNinja f2 = new Kunai("kunai venenosa");
		FerramentaNinja f3 = new Shuriken("shuriken pequena");
	    FerramentaNinja f4 = new Shuriken("shuriken grande");
	    FerramentaNinja f5 = new Pergaminho("pergaminho de invocação");
	    FerramentaNinja f6 = new Pergaminho("pergaminho jutsu proibido");
        
        bolsa1.adicionarFerramenta(f1);
        bolsa1.adicionarFerramenta(f2);
        bolsa1.adicionarFerramenta(f3);
        bolsa1.adicionarFerramenta(f4);
        bolsa1.adicionarFerramenta(f5);
        bolsa1.adicionarFerramenta(f6);
        
        bolsa1.usarTodasFerramentas();
        bolsa1.mostrarFerramentas();
        
        
        // REALIZANDO CAST FORÇANCO JAVA A ENXERGAR F4 COMO DO TIPO SHURIKEN
        if(f4 instanceof Shuriken){
            ((Shuriken) f4).explodir();
        }
        
        // REALIZANDO CAST FORÇANCO JAVA A ENXERGAR F2 COMO DO TIPO DA INTERFACE EXPLOSAO
        if(f4 instanceof Explosao){
            ((Explosao) f2).explodir();
        }
        
	}
}
