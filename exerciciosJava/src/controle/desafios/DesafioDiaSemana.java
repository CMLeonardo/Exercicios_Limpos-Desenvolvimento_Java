package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual dia da semana hoje?");
		String diaSemana = entrada.next();
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (diaSemana.equalsIgnoreCase("terca") 
			    || diaSemana.equalsIgnoreCase("ter�a")) {
			System.out.println(3);
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if (diaSemana.equalsIgnoreCase("sabado") 
			   || diaSemana.equalsIgnoreCase("s�bado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia Inv�lido!");
		}
		
		entrada.close();
	}
}
