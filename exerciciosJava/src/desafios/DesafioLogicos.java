package desafios;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça
		// Trabalho na quinta
		boolean saude = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Trabalhou terça (1 = Sim ou 0 = Não): ");
		Integer respostaTerca = teclado.nextInt();
		
		System.out.println("Trabalhou Quinta (1 = Sim ou 0 = Não): ");
		Integer respostaQuinta = teclado.nextInt();
		
		boolean trabalhoTerca = ((respostaTerca == 1) ? true : false);
		boolean trabalhoQuinta = ((respostaQuinta == 1) ? true : false);
		
		if (trabalhoTerca == true && trabalhoQuinta == true) {
			System.out.println("\nFomos ao shopping, compramos a TV de 50'' e compramos sorvete!!");
			saude = false;
		}else if (trabalhoTerca == true || trabalhoQuinta == true){
			System.out.println("\nFomos ao shopping, compramos a TV de 32'' e compramos sorvete!!");
			saude = false;
		} else {
			System.out.println("\nEstamos sem grana e não fomos ao shopping!!");
			saude = true;
		}
		
		if (saude) {
			System.out.println("Continua firme na dieta!");
		} else {
			System.out.println("Ingeriu calorias a mais!");
		}
		teclado.close();
	}
}
