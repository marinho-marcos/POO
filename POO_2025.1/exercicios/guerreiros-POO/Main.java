import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Guerreiro guerreiro1 = new Guerreiro("Gladiador", 111);
		Guerreiro guerreiro2 = new Guerreiro("Kratos", 222);
		
		//guerreiro1.lutar(guerreiro2);
		
		guerreiro1.alimentar();
		System.out.println(guerreiro1.toString());
	}
}