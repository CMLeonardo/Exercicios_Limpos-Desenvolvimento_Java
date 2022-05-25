package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		double a = 1; //Conersão implícita 
		System.out.println(a);
		
		float b = (float) 1.12345678888; // Conversão explícita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // Conversão explícita (CAST)
		System.out.println(d);
	}
}
