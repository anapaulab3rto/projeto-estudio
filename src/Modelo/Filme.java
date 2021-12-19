package Modelo;




public class Filme {
    private String  titulo;
    private Estudio estudioFilme;
    private Produtor produtorFilme;
    private int anoLancamento;




    public Filme(String titulo, Estudio estudioFilme, Produtor produtorFilme, int anoLancamento) {
        this.titulo = titulo;
        this.estudioFilme = estudioFilme;
        this.produtorFilme = produtorFilme;
        this.anoLancamento = anoLancamento;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Estudio getEstudioFilme() {
        return estudioFilme;
    }

    public void setEstudioFilme(Estudio estudioFilme) {
        this.estudioFilme = estudioFilme;
    }

    public Produtor getProdutorFilme() {
        return produtorFilme;
    }

    public void setProdutorFilme(Produtor produtorFilme) {
        this.produtorFilme = produtorFilme;
    }


}
