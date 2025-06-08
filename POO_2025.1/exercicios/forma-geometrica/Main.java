public class Main{
    public static void main(String[] args){
        CadastrarForma formas1 = new CadastrarForma();

        FormaGeometrica f1 = new Quadrado();
        FormaGeometrica f2 = new Retangulo();
        FormaGeometrica f3 = new Triangulo();
        FormaGeometrica f4 = new Circulo();

        formas1.adicionarForma(f1);
        formas1.adicionarForma(f2);
        formas1.adicionarForma(f3);
        formas1.adicionarForma(f4);

        formas1.exibirFormas();
    }
}