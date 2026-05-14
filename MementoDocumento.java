package attMemento;

public class MementoDocumento {

    private final String titulo;
    private final String conteudo;
    private final String autor;
    private final String versao;

    public MementoDocumento(String titulo,
                             String conteudo,
                             String autor,
                             String versao) {

        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.versao = versao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public String getVersao() {
        return versao;
    }
}