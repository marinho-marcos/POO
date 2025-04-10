public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //representação padrão
    public String toString(){
        return "Nome da pessoa: " + this.nome;
    }

    //métodos
    public void falar(){
        System.out.println("olá mundo! eu sou o " + nome + " e tenho " + idade + " anos");
        System.out.printf("Olá mundo! eu sou o %s e tenho %d anos", nome, idade);       //
    }

    // //get
    // public String getNome(){
    //     return this.nome;
    // }

    // //set
    // public void setNome(String nome){
    //     this.nome = nome;
    // }
}
