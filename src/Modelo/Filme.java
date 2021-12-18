package Modelo;

public class Filme {
    private String  titulo;
    private int anoLancamento;
    private String nomeEstudio;
    private String elencoFilme;

    public Filme(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public Filme(String titulo, int anoLancamento, String elencoFilme) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.elencoFilme = elencoFilme;
    }

    public Filme(String titulo, int anoLancamento, String nomeEstudio, String elencoFilme) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.nomeEstudio = nomeEstudio;
        this.elencoFilme = elencoFilme;
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

    public String getNomeEstudio() {
        return nomeEstudio;
    }

    public void setNomeEstudio(String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public String getElencoFilme() {
        return elencoFilme;
    }

    public void setElencoFilme(String elencoFilme) {
        this.elencoFilme = elencoFilme;
    }
}
