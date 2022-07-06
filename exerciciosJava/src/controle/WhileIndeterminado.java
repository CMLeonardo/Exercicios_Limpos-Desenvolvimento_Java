package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String portaSaida = "";
		while (!portaSaida.equalsIgnoreCase("quack")) {
			System.out.println("Insira a senha hehe: ");
			portaSaida = entrada.nextLine();
		}
		System.out.println("Bouaaa meu bom, ta sabendo muito!");
		entrada.close();
	}
}
