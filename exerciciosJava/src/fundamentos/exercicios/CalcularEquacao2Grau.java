package fundamentos.exercicios;

import java.util.Scanner;

public class CalcularEquacao2Grau {
	
	// Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--> Exemplo de Equa��o: ax2 + bx + c <--");
		System.out.println("\nQual valor de a na equa��o? (usar \",\") ");
		Double valorA = teclado.nextDouble();
		
		System.out.println("Qual valor de b na equa��o? (usar \",\") ");
		Double valorB = teclado.nextDouble();
		
		System.out.println("Qual valor de c na equa��o? (usar \",\") ");
		Double valorC = teclado.nextDouble();
		
		Double delta = (valorB * valorB) - (4 * valorA * valorC);
		Double resultado1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
		Double resultado2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
		
		System.out.println("\n--> Os Resultados S�o: <--");
		System.out.printf("-->       %.2f        <--", resultado1);
		System.out.printf("\n-->       %.2f        <--", resultado2);
		
		teclado.close();
	}
}
