package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = (media >= 5.0 ? "em recupera��o" : "reprovado");
		String resultado = (media >= 7.0 ? "aprovado" : resultadoParcial);
		
		System.out.println("O aluno est� " + resultado);
	}
}
