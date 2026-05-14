package attMemento;

public class Main {

	public static void main(String[] args) {

		// Criando documento inicial
		Documento documento = new Documento("Projeto Padrão Memento", "Conteúdo inicial do documento.", "Renato",
				"Versão 1.0");

		HistoricoDocumento historico = new HistoricoDocumento();

		// Estado inicial
		System.out.println("ESTADO INICIAL:");
		documento.exibirDocumento();

		// Salvando primeira versão
		historico.adicionarMemento(documento.salvar());

		// Primeira alteração
		documento.editarDocumento("Conteúdo atualizado com novas informações.", "Versão 2.0");

		System.out.println("\nAPÓS PRIMEIRA ALTERAÇÃO:");
		documento.exibirDocumento();

		// Salvando segunda versão
		historico.adicionarMemento(documento.salvar());

		// Segunda alteração
		documento.editarDocumento("Conteúdo alterado incorretamente pelo usuário.", "Versão 3.0");

		System.out.println("\nAPÓS SEGUNDA ALTERAÇÃO:");
		documento.exibirDocumento();

		// Restaurando versão anterior
		MementoDocumento versaoAnterior = historico.recuperarVersao(1);

		documento.restaurar(versaoAnterior);

		System.out.println("\nDOCUMENTO RESTAURADO:");
		documento.exibirDocumento();

		// Restaurando versão mais antiga
		MementoDocumento versaoInicial = historico.recuperarVersao(0);

		documento.restaurar(versaoInicial);

		System.out.println("\nDOCUMENTO RESTAURADO PARA VERSÃO INICIAL:");
		documento.exibirDocumento();
	}
}