public class Calendario{
    private int dia;
    private int mes;
    private int ano;
    
    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String nomeDoMes(int m){
        switch(m){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return m + " não corresponde a um mês do calendário!";
        }
    }
        
    public void mostrarData(){
        System.out.printf("\nDia %d de %s de %d", dia, nomeDoMes(mes), ano);
    }
    
    public void anoBissexto(){
        if(ano%4 == 0){
            System.out.printf("\n%d é bissexto!\n", ano);
        } else{
            System.out.printf("\n%d não é bissexto!\n", ano);
        }
    }
}