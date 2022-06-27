package fundamentos.exercicios;

import java.util.Scanner;

public class Potencias {
	// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. 
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual valor deseja saber o quadrado e o cubo? (usar \",\") ");
		Double valor = teclado.nextDouble();
		
		Double resultadoQuadrado = Math.pow(valor, 2);
		Double resultadoCubo = Math.pow(valor, 3);
		
		System.out.printf("\n--> %.2f Quadrado: %.2f <--", valor, resultadoQuadrado);
		System.out.printf("\n--> %.2f ao cubo: %.2f <--", valor,  resultadoCubo);
		
		teclado.close();
	}
}
