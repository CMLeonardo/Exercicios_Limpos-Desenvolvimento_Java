package classe.desafios;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Qual o seu nome?");
		pessoa.nome  = entrada.next();
		
		System.out.println("Desculpa a pergunta, mas qual o seu peso (usar ',')?");
		pessoa.peso  = entrada.nextDouble();

		System.out.println("\n     | BORA QUE EU TO COM FOME |");
		Comida arroz = new Comida("Arroz", 0.2);
		pessoa.comerComida(arroz);

		Comida feijao = new Comida("Feijão", 0.07);
		pessoa.comerComida(feijao);

		System.out.printf("--> %s, agora você pesa: %.2f <--",pessoa.nome, pessoa.peso);
		entrada.close();
	}
}
