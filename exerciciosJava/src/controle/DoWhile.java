package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String portaSaida = "quack";
		
		do {
			System.out.println("Insira a senha hehe: ");
			portaSaida = entrada.nextLine();
		} while(!portaSaida.equalsIgnoreCase("quack"));
		
		System.out.println("Bouaaa meu bom, ta sabendo muito!");
		entrada.close();
	}
}
