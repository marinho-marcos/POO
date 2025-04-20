public class Funcionario {
    private String nome;
    private int codigo;
    private String CPF;
    private int idade;
    private String endereco;
    private String telefone;
    private double salario;
    

    // getter e setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getter e setter para código
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // getter e setter para CPF
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    // getter e setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // getter e setter para endereço
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // getter e setter para telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // getter e setter para salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String salarioLiquido(){
        double resultado = salario - (salario*0.11);
        return String.format("\nSalário liquido: %.2f", resultado);
    }
    
    public String toString() {
        return "Funcionário: " + nome + "\n" +
               "Código: " + codigo + "\n" +
               "CPF: " + CPF + "\n" +
               "Idade: " + idade + "\n" +
               "Endereço: " + endereco + "\n" +
               "Telefone: " + telefone + "\n" +
               "Salário: " + String.format("R$%.2f", salario);
    }
}