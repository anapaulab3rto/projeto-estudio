package Model;

public class Filme {
    private String titulo;
    private Estudio estudio;
    private Produtor produtor;
    private int ano;

    public Filme(String titulo, Estudio estudio, Produtor produtor, int ano) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.produtor = produtor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
