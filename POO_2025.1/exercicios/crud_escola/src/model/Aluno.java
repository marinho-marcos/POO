package model;

public class Aluno {
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;

    public Aluno(int id, String nome, String sobrenome, int idade){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format("ID: %d | Nome: %s | Sobrenome: %s | Idade: %d%n", id, nome, sobrenome, idade);
    }
}