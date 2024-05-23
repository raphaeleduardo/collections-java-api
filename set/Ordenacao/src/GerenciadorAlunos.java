import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	Set<Aluno> alunos;

	public GerenciadorAlunos() {
		this.alunos = new HashSet<Aluno>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		alunos.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		Aluno remover = null;
		if (!alunos.isEmpty()) {
			for (Aluno a : alunos) {
				if (matricula == a.getMatricula()) {
					remover = a;
				}
			}
		} else {
			System.out.println("O conjunto está vázio...");
		}
		alunos.remove(remover);
	}

	public Set<Aluno> exibirAlunoPorNome() {
		Set<Aluno> nomes = new TreeSet<Aluno>(new ComparatorAluno());
		if (!alunos.isEmpty()) {
			nomes.addAll(alunos);
		} else {
			System.out.println("O conjunto está vázio...");
		}
		return nomes;
	}

	public Set<Aluno> exibirAlunoPorNota() {
		Set<Aluno> notas = new TreeSet<Aluno>(new ComparatorNota());
		if (!alunos.isEmpty()) {
			notas.addAll(alunos);
		} else {
			System.out.println("O conjunto está vázio...");
		}
		return notas;
	}
	
	public Set<Aluno> exibirAlunos() {
		return alunos;
	}

}
