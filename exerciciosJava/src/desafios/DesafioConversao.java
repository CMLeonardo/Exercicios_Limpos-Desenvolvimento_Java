package desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro sal�rio: ");
		String salario1 = teclado.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do segundo sal�rio: ");
		String salario2 = teclado.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do terceiro sal�rio: ");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		Double valor1 = Double.parseDouble(salario1);
		Double valor2 = Double.parseDouble(salario2);
		Double valor3 = Double.parseDouble(salario3);
		
		Double soma = valor1 + valor2 + valor3;
		
		System.out.println("\n\nTotal dos sal�rios: " + soma);
		System.out.println("M�dia dos sal�rios: " + soma/3);
		
		teclado.close();
		
	}
}
