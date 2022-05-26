package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double numeradorUm 		= (Math.pow((6 * (3 + 2)), 2) / (3 * 2));
		double numeradorDois 	= Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
		System.out.println("Valor do primeiro numerador:" + numeradorUm);
		System.out.println("Valor do segundo numerador:" + numeradorDois);
		
		double numerador = Math.pow((numeradorUm - numeradorDois), 3);
		System.out.println("Valor do numerador:" + numerador);
		
		double resultado = numerador / Math.pow(10, 3);
		System.out.println("O resultado é:" + resultado);
	}
}
