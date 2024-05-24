import java.util.Objects;

public class Evento {

	private String nome;
	private String atracao;

	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(atracao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(atracao, other.atracao) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}

}
