package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Cesar"));
		lista.add(new Usuario("Cesar"));
		lista.add(new Usuario("Cesar")); // Permite repetição
		
		System.out.println(lista.get(2)); // Consegue acessar por índice
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Cesar")));
		
		System.out.println("Tem a Ana na lista? " + lista.contains(new Usuario("Ana")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
