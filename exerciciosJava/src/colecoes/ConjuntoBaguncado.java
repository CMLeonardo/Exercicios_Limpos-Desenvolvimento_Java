package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add(1);
		conjunto.add("teste");
		
		System.out.println(conjunto.size());
		
		conjunto.add("teste"); // Não aceita repetição
		
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // Se achar o item no nosso conjunto ele retorna true
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums); // União dos dois conjuntos
		conjunto.retainAll(nums); // Interseção dos dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
