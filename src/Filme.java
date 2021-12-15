public class Filme {
    private String  titulo;
    private Pessoa produtor, ator, atriz;
    private int anoLancamento;
    private Estudio estudio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getProdutor() {
        return produtor;
    }

    public void setProdutor(Pessoa produtor) {
        this.produtor = produtor;
    }

    public Pessoa getAtor() {
        return ator;
    }

    public void setAtor(Pessoa ator) {
        this.ator = ator;
    }

    public Pessoa getAtriz() {
        return atriz;
    }

    public void setAtriz(Pessoa atriz) {
        this.atriz = atriz;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }
}
