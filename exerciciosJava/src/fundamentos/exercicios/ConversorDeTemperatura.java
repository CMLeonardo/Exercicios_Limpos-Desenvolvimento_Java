package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorDeTemperatura {
	
	// Fazer um conversor de temperatura F -> C ou C -> F sem usar estruturas de controle
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Valor que deseja converter (usar \",\") : ");
		Double temperatura = teclado.nextDouble();
		
		System.out.println("Indique qual a unidade da temperatura informada (C ou F): ");
		String unidade = teclado.next();
		
		Double resultado = unidade.equals("c")||unidade.equals("C") ? ((1.8 * temperatura) + 32) : ((temperatura - 32)/1.8);
		String unidadeConvertido = unidade.equals("c")||unidade.equals("C") ? "Fahrenheit" : "Celsius";
		
		System.out.printf("\n--> O valor convertido é: %.2f %s <--", resultado, unidadeConvertido);
		
		teclado.close();
	}
}
