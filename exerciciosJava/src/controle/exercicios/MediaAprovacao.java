package controle.exercicios;

import java.util.Scanner;

public class MediaAprovacao {

	// Criar um programa que receba duas notas parciais, calcular a média final. 
	// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
	// se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	// caso contrário imprime no console "Reprovado".
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			double valor = 0.0;
			for (int i = 1; i <= 2; i++) {
				System.out.printf("Insira a %d nota: ", i);
				valor += entrada.nextDouble();
			}
			
			double media = valor/2;
			System.out.print("O Aluno está ");
			
			if(media >= 7.0) {
				System.out.println("Aprovado");
			} else if(media < 7.0 && media > 4) {
				System.out.println("em Recuperação");
			} else {
				System.out.println("Reprovado");
			}
			
			entrada.close();
		}
}