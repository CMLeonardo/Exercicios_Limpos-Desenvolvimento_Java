package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) * PI;
	}
}
