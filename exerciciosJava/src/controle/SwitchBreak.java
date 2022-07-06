package controle;

public class SwitchBreak {
	public static void main(String[] args) {
			
		String conceito = "";
		int nota = 3;
		
		switch(nota) {
			case 10: case 9: case 8:
				conceito = "A"; break;
			case 7: case 6: case 5:
				conceito = "B"; break;
			case 4: 
			case 3: 
			case 2:
				conceito = "C"; break;
		default:
			conceito = "D";
		}
		System.out.println("Conceito é " + conceito);
	}
}
