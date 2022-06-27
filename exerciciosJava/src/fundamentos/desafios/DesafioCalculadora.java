package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Qual opera��o??
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro n�mero: ");
		Double num1 = teclado.nextDouble();
		
		System.out.println("Escreva o segundo n�mero: ");
		Double num2 = teclado.nextDouble();
		
		System.out.println("Qual a opera��o entre os dois n�meros: ");
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
