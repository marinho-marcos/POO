public class Main{
    public static void main(String[] args){
        CadasatrarForma formas1 = new CadasatrarForma();

        FormaGeometrica f1 = new Quadrado();

        formas1.adicionarForma(f1);

        formas1.exibirFormas();
    }
}