package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos númericos inteiros
		byte anosDeEmpresa = 127; // Range de -128 a 127
		short numeroDeVoos = 542; // oq muda de um pra outro e apenas a quantidade suportada
		int id = 56789;
		long pontosAcumulados = 2_234_854_223L; //Quando ultrapassa o limite de int, colocar L no final do número
		
		// Tipos numéricos reais
		float salario = 11_445.44F; //com F é obrigatório
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'H';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados /vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
