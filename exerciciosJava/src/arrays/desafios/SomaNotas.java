package arrays.desafios;

import java.util.Scanner;

public class SomaNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0.0;

		System.out.println("Quantas notas vc deseja fazer a média? ");
		int tamanhoArray = entrada.nextInt();
		
		double notas[] = new double[tamanhoArray];
		
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Digite a %d nota: \n", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		for (double nota: notas) {
			soma += nota;
		}
		
		double media = soma / tamanhoArray;
		
		System.out.printf("Média das %d notas -> %.2f / %d = %.2f", tamanhoArray, 
																	soma,
																	tamanhoArray,
																	media);
		
		entrada.close();
	}
}
