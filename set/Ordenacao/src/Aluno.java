import java.util.Objects;

public class Aluno {

	private String nome;
	private long matricula;
	private double media;

	public Aluno(String nome, long matricula, double media) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
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
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
	}

}
