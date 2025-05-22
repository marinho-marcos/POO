public class Quarto{
    private String tipo;
    private int numero;
    private boolean disponivel;
    
    public Quarto(String tipo, int numero){
        this.tipo = tipo;
        this.numero = numero;
        this.disponivel = true;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public boolean getDisponivel(){
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    
    public boolean reservar(){
        if(getDisponivel()){
            setDisponivel(false);
            return true;
        } else{
            return false;
        }
    }
    
    public boolean cancelar(){
        if(!getDisponivel()){
            setDisponivel(true);
            return true;
        } else{
            return false;
        }
    }
    
    public String toString(){
        return String.format("\nTipo: %s\nNumero: %d\nDisponivel: %b\n", getTipo(), getNumero(), getDisponivel());
    }
}