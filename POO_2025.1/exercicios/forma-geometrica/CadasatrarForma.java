public class CadasatrarForma {
    private FormaGeometrica[] formas;
    private int index;

    public CadasatrarForma(){
        formas = new FormaGeometrica[10];
    }

    public void adicionarForma(FormaGeometrica forma){
        if(index < formas.length){
            formas[index++] = forma;
        }
    }

    public void exibirFormas(){
        for(int i = 0; i < index; i++){
            formas[i].desenhar();
        }
    }
}
