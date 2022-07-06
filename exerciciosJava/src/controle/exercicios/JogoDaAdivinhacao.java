package controle.exercicios;

import java.util.Scanner;

public class JogoDaAdivinhacao {
	// Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
	// O Jogador tem 10 tentativas para adivinhar o número gerado.
	// Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
	// e imprima se o número inserido é maior ou menor do que o número armazenado.
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numeroAdivinha = 10;
			boolean adivinhou = false;
			
			for (int i = 10; i > 0; i--) {
				System.out.println("Insira a número: ");
				Integer valor = entrada.nextInt();
				if (valor == numeroAdivinha) {
					adivinhou = true;
					break;
				}else if (valor < numeroAdivinha) {
					System.out.println("O número a ser descoberto é maior");
				} else {
					System.out.println("O número a ser descoberto é menor");
				}
				System.out.printf("Faltam %d tentativas!\n\n", i-1);
			}
			
			if(adivinhou) {
				System.out.printf("\n\n--> Você adivinhoooou, o número era %d <--", numeroAdivinha);
			}else {
				System.out.printf("--> Acabaram as tentativas :/, o número era %d <--", numeroAdivinha);
			}
			
			entrada.close();
		}
}
