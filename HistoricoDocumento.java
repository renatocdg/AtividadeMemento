package attMemento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDocumento {

	private List<MementoDocumento> historico = new ArrayList<>();

	// Adiciona uma versão ao histórico
	public void adicionarMemento(MementoDocumento memento) {

		historico.add(memento);

		System.out.println("[HISTÓRICO] Versão armazenada.");
	}

	// Recupera uma versão específica
	public MementoDocumento recuperarVersao(int indice) {

		if (indice >= 0 && indice < historico.size()) {

			System.out.println("[HISTÓRICO] Recuperando versão " + indice);

			return historico.get(indice);
		}

		return null;
	}
}