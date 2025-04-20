import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.toString());
		
		Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("\nInforme o valor do seu salário: ");
	    double salario = entrada.nextDouble();
	    
	    entrada.close();
		
		System.out.println("\n");
		funcionario1.setSalario(salario);
		System.out.println(funcionario1.toString());
		System.out.println(funcionario1.salarioLiquido());
	}
}