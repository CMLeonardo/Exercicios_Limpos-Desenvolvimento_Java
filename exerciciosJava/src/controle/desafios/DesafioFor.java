package controle.desafios;

public class DesafioFor {
	// N�o pode utilizar n�mero para controlar o la�o
	public static void main(String[] args) {
		for(String v = "#"; !v.equalsIgnoreCase("######"); v += "#") {
			System.out.println(v);
		}
	}
}
