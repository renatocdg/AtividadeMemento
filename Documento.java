package attMemento;

public class Documento {

	private String titulo;
	private String conteudo;
	private String autor;
	private String versao;

	public Documento(String titulo, String conteudo, String autor, String versao) {

		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
		this.versao = versao;
	}

	// Altera o conteúdo do documento
	public void editarDocumento(String novoConteudo, String novaVersao) {

		this.conteudo = novoConteudo;
		this.versao = novaVersao;
	}

	// Cria um estado salvo (Memento)
	public MementoDocumento salvar() {

		System.out.println("\n[DOCUMENTO] Salvando versão: " + versao);

		return new MementoDocumento(titulo, conteudo, autor, versao);
	}

	// Restaura estado salvo
	public void restaurar(MementoDocumento memento) {

		this.titulo = memento.getTitulo();
		this.conteudo = memento.getConteudo();
		this.autor = memento.getAutor();
		this.versao = memento.getVersao();

		System.out.println("\n[DOCUMENTO] Documento restaurado para versão: " + versao);
	}

	// Exibe estado atual
	public void exibirDocumento() {

		System.out.println("\n===== DOCUMENTO =====");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Versão: " + versao);
		System.out.println("Conteúdo:");
		System.out.println(conteudo);
		System.out.println("=====================");
	}
}