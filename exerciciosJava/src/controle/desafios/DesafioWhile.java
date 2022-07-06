package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double notas = 0.0;
		int	i = 0;
		double valor = 0.0;
		
		while (valor != -1) {
			System.out.println("Digite a nota do Aluno (-1 = sair): ");
			valor = entrada.nextDouble();
			
			if(valor >= 0.0 && valor <= 10.0) {
				notas += valor;
				i++;
			}else if (valor != -1) {
				System.out.println("Informe uma nota Válida!");
			}
		}
		double media = notas/i;
		System.out.printf("Media da sala é: %.2f", media);
		
		entrada.close();
	}
}
