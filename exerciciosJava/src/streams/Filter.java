package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Lucas", 3.0);
		Aluno a3 = new Aluno("Arthur", 9.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabens " + a.nome + "! Voce foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);;
	}
}
