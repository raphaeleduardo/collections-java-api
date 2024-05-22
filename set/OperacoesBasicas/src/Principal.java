public class Principal {

	public static void main(String[] args) {
		
		// Teste conjunto de convidados
		ConjuntoConvidados cc = new ConjuntoConvidados();
		
		cc.adicionarConvidado("João", 120);
		cc.adicionarConvidado("José", 100);
		cc.adicionarConvidado("Maria", 93);
		cc.adicionarConvidado("Enzo", 97);
		cc.adicionarConvidado("Valentina", 81);
		
		cc.contarConvidados();
		cc.removerConvidadoCodigoConvite(100);
		cc.exibirConvidados();
		
		// Teste conjunto de convidados
		ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
		
		cpu.adicionarPalavars("Java");
		cpu.adicionarPalavars("Collections");
		cpu.adicionarPalavars("Framework");
		cpu.adicionarPalavars("Set");
		
		cpu.exibirPalavrasUnicas();

		cpu.verificarPalavra("Java");		
		
		cpu.removerPalavra("Java");
	}

}
