package controle;

public class Continue {
	public static void main(String[] args) {
		Loop: for (int i = 0; i <= 10; i++) { // Criei um Rótulo para o loop
			if (i%2 == 1) {
				continue Loop;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
