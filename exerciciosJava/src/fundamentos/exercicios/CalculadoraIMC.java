package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraIMC {
	
	// Fazer uma calculadora de IMC
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Perdoe a pergunta, mas qual seu peso? (usar \",\") ");
		Double peso = teclado.nextDouble();
		
		System.out.println("Me informe sua altura (usar \",\"): ");
		Double altura = teclado.nextDouble();
		
		Double IMC = peso / Math.pow(altura, 2);
		
		System.out.printf("\n--> Seu IMC é: %.2f <--", IMC);
		
		teclado.close();
	}
}
