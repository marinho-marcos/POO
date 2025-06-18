public class Livro{
    private String titulo;
    private String autor;
    private int quantidade;
    
    public Livro(String titulo, String autor, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public String toString(){
        return String.format("Titulo: %s | Autor: %s | Quantidade: %d%n", getTitulo(), getAutor(), getQuantidade());
    }
    
    
}