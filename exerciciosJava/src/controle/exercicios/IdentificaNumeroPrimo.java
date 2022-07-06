package controle.exercicios;

import java.util.Scanner;

public class IdentificaNumeroPrimo {

	// Criar um programa que receba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contadorDeDivisores = 0;
		
		System.out.println("Insira a número: ");
		Integer valor = entrada.nextInt();
		
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.printf("O número %d é primo", valor);
		}else {
			System.out.printf("O número %d não é primo", valor);
		}
		
		entrada.close();
	}
	
	/*
	 * // Criar um programa que receba um número e diga se ele é um número primo (switch case).
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contadorDeDivisores = 0;
		
		System.out.println("Insira a número: ");
		Integer valor = entrada.nextInt();
		
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch(contadorDeDivisores) {
		
		case 0:
			System.out.printf("O número %d é primo", valor);
			break;
			
		default:
			System.out.printf("O número %d não é primo", valor);
		}
		
		entrada.close();
	}
	 */
}
