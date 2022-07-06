package controle.exercicios;

import java.util.Scanner;

public class VerificarNumero {
	
	// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um Número: ");
		Double valor = entrada.nextDouble();
		
		if(valor >= 0 && valor <= 10 && valor%2 == 0) {
			System.out.println("O número informado está entre 0 e 10 e é par");
		} else {
			System.out.println("O número informado não está entre 0 e 10 ou não é par");
		}
		
		entrada.close();
	}
}
