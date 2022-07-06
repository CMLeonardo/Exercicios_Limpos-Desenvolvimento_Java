package controle.desafios;

public class DesafioFor {
	// Não pode utilizar número para controlar o laço
	public static void main(String[] args) {
		for(String v = "#"; !v.equalsIgnoreCase("######"); v += "#") {
			System.out.println(v);
		}
	}
}
