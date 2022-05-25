package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		// double a = 2.3; // double por ser um tipo primitivo é escrito tudo em minusculo e aparece em cor diferente (palavra reservada)
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat(" !!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
					.replace("X", "Leo")
					.toUpperCase()
					.concat(" !!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "." (Notação Ponto)
	}
}
