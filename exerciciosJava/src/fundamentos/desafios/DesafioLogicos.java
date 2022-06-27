package fundamentos.desafios;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na ter�a
		// Trabalho na quinta
		boolean saude = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Trabalhou ter�a (s = Sim ou n = N�o): ");
		String respostaTerca = teclado.nextLine().trim(); // trim() == tirar espa�os em branco
		
		System.out.println("Trabalhou Quinta (s = Sim ou n = N�o): ");
		String respostaQuinta = teclado.nextLine().trim();
		
		boolean trabalhoTerca = ((respostaTerca.equals("s")) ? true : false);
		boolean trabalhoQuinta = ((respostaQuinta.equals("s")) ? true : false);
		
		if (trabalhoTerca == true && trabalhoQuinta == true) {
			System.out.println("\nFomos ao shopping, compramos a TV de 50\" e compramos sorvete!!");
			saude = false;
		}else if (trabalhoTerca == true || trabalhoQuinta == true){
			System.out.println("\nFomos ao shopping, compramos a TV de 32\" e compramos sorvete!!");
			saude = false;
		} else {
			System.out.println("\nEstamos sem grana e n�o fomos ao shopping!!");
			saude = true;
		}
		
		if (saude) {
			System.out.println("Continua firme na dieta!");
		} else {
			System.out.println("Ingeriu calorias a mais!");
		}
		teclado.close();
		
		/* Resolu��o Professor 
		 * 
		 * public static void main(String[] args) {
			// Trabalho na ter�a (V ou F)
			// Trabalho na quinta (V ou F)
			
			boolean trabalho1 = false;
			boolean trabalho2 = false;
			
			boolean comprouTV50 = trabalho1 && trabalho2;
			boolean comprouTV32 = trabalho1 ^ trabalho2;
			boolean comprouSorvete = trabalho1 || trabalho2;
			
			// Operador Un�rio!
			boolean maisSaudavel = !comprouSorvete;
			
			System.out.println("Comprou TV 50\"? " + comprouTV50);
			System.out.println("Comprou TV 32\"? " + comprouTV32);
			System.out.println("Comprou Sorvete? " + comprouSorvete);
			System.out.println("Mais saud�vel? " + maisSaudavel);
	}*/
	}
}
