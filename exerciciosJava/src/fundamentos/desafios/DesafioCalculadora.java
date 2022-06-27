package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Qual operação??
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número: ");
		Double num1 = teclado.nextDouble();
		
		System.out.println("Escreva o segundo número: ");
		Double num2 = teclado.nextDouble();
		
		System.out.println("Qual a operação entre os dois números: ");
		String operacao = teclado.next();
		
		Double resultado = operacao.equals("+") ? (num1 + num2) : 0;
		resultado = operacao.equals("-") ? (num1 - num2) : resultado;
		resultado = operacao.equals("*") ? (num1 * num2) : resultado;
		resultado = operacao.equals("/") ? (num1 / num2) : resultado;
		resultado = operacao.equals("%") ? (num1 % num2) : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		teclado.close();
	}
}
