package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		double a = 1; //Coners�o impl�cita 
		System.out.println(a);
		
		float b = (float) 1.12345678888; // Convers�o expl�cita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // Convers�o expl�cita (CAST)
		System.out.println(d);
	}
}
