package streams;

import java.util.Objects;

public class Aluno {

	public final String nome;
	public double nota;
	public final boolean suborno;
	final boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = false;
		this.bomComportamento = true;
	}

	public Aluno(String nome, double nota, boolean suborno) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = suborno;
		this.bomComportamento = true;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota, suborno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota) && suborno == other.suborno;
	}
	
	
}
