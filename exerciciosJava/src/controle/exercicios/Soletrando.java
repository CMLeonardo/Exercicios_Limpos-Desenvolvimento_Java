package controle.exercicios;

import java.util.Scanner;

public class Soletrando {
	
	// Criar um programa que receba uma palavra e imprime no console letra por letra.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a palavra que deseja ser soletrada: ");
		String palavra = entrada.next();
		
		System.out.println("Soletrando:");
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		entrada.close();
	}
}
