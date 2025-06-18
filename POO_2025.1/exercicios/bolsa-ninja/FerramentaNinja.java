public abstract class FerramentaNinja{
    private String nome;
    
    public FerramentaNinja(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract void usarFerramenta();
    
    public String toString(){
        return String.format("Nome: %s%n", getNome());
    }
}