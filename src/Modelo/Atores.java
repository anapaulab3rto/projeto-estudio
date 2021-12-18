package Modelo;

public class Atores {
    private String nomeAtores;
    private int idade;
    private String filmeAtor;

    public Atores(String nomeAtores, int idade) {
        this.nomeAtores = nomeAtores;
        this.idade = idade;
    }

    public Atores(String nomeAtores, int idade, String filmeAtor) {
        this.nomeAtores = nomeAtores;
        this.idade = idade;
        this.filmeAtor = filmeAtor;
    }

    public String getFilmeAtor() {
        return filmeAtor;
    }

    public void setFilmeAtor(String filmeAtor) {
        this.filmeAtor = filmeAtor;
    }

    public String getNomeAtores() {
        return nomeAtores;
    }

    public void setNomeAtores(String nomeAtores) {
        this.nomeAtores = nomeAtores;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

