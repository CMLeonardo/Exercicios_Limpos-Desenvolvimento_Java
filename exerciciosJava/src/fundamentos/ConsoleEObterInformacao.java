package fundamentos;

import java.util.Scanner;

public class ConsoleEObterInformacao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine(); //Usamos esse nextLine pq quando clicamos enter no nextInt sobra um \n, ent ele serve para pegar esse \n
		
		System.out.printf("\nNome: %s %s \nIdade: %d \n", nome, sobrenome, idade);
		entrada.close();
	}
}
