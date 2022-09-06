package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(carro.estaLigado());
		
		carro.ligar();
		System.out.println(carro.estaLigado());
		
		System.out.println(carro.motor.giros());
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		System.out.println(carro.motor.giros());
		
		carro.frear();
		carro.frear();
		carro.frear();
		
		//Faltou Encapsulamento!!
		//carro.motor.fatorInjecao = -30;
		
		System.out.println(carro.motor.giros());
		
		// Rela��o Bidirecional
		//System.out.println(carro.motor.carro.motor.carro.motor.giros());
	}
}
