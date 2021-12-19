package Modelo;

import java.util.ArrayList;

public class Atores {
    private String nomeAtores;
    private String filmeAtor;



    public Atores(String nomeAtores, String filmeAtor) {
        this.nomeAtores = nomeAtores;
        this.filmeAtor = filmeAtor;
    }

    public String getNomeAtores() {
        return nomeAtores;
    }

    public void setNomeAtores(String nomeAtores) {
        this.nomeAtores = nomeAtores;
    }

    public String getFilmeAtor() {
        return filmeAtor;
    }

    public void setFilmeAtor(String filmeAtor) {
        this.filmeAtor = filmeAtor;
    }
}

