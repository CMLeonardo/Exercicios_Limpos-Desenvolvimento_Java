package fundamentos;

public class CalculaTemperatura {
	public static void main(String[] args) {
		double temperaturaFahr   = 86;
		
		double temperaturaCelsius = ((temperaturaFahr - 32) *  5.0)/9.0;
		
		System.out.println("Para a temperatura de " + temperaturaFahr + "F a temperatura em Celsius será: " + temperaturaCelsius + "C"); 
	}
}
