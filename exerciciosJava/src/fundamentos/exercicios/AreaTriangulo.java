package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	// Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual valor da base do triangulo retangulo? (usar \",\") ");
		Double base = teclado.nextDouble();
		
		System.out.println("Qual valor da altura do triangulo retangulo? (usar \",\") ");
		Double altura = teclado.nextDouble();
		
		Double areaTriangulo = (base * altura) / 2;
		
		System.out.printf("\n--> �rea do tringulo retangulo: %.2f <--", areaTriangulo);
		
		teclado.close();
	}
}
