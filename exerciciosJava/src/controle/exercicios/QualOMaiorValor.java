package controle.exercicios;

import java.util.Scanner;

public class QualOMaiorValor {

	// Crie um programa que recebe 10 valores e ao final imprima o maior número.
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			double numero = 0;
			double aux = 0;
			
			for(int i = 1; i <= 10; i++) {
				System.out.printf("Digite o %d numero: \n", i);
				numero = entrada.nextDouble();
				aux = (numero > aux) ? numero : aux;
			}
			
			System.out.printf("\n--> O maior número digitado foi %.2f <--", aux);
			
			entrada.close();
		}
}
