package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Ana"); // Se tentar adicionar numa fila que tem restrição, responde uma exceção
		fila.offer("Bia"); // Se tentar adicionar numa fila que tem restrição, responde false
		fila.offer("Cesar");
		fila.offer("Carla");
		
		System.out.println(fila.peek()); // Seleciona, mas não tira da fila e responde null quando fila esta vazia
		System.out.println(fila.element()); // Seleciona, mas não tira da fila e responde com uma exceção quando fila esta vazia
		
		//fila.clear();
		//fila.isEmpty();
		//fila.size();
		
		System.out.println(fila.poll()); //Seleciona o proximo elemento da fila jogando ele pra fora da fila e retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); //Seleciona o proximo elemento da fila jogando ele pra fora da fila e retorna uma exceção
		
		//fila.contains("...");
	}
}
