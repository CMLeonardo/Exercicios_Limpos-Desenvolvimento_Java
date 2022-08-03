package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); // Ordena o set corretamente
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Cesar");
		listaAprovados.add("Bruno");
		listaAprovados.add("Carla");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for(Integer numeros: nums) {
			System.out.println(numeros);
		}
	}
}
