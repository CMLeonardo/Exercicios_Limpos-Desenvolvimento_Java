package oo.heranca.desafio;

public class testeCarro {

	public static void main(String[] args) {
		Golf golf = new Golf();
		Huracan huracan = new Huracan();
		
		System.out.println(golf);
		System.out.println(huracan);
		
		golf.acelerar();
		huracan.reduzir();
		
		System.out.println(golf);
		System.out.println(huracan);
		
		golf.reduzir();
		huracan.acelerar();
		
		System.out.println(golf);
		System.out.println(huracan);
	}
}
