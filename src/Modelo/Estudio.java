package Modelo;

public class Estudio {
    private String nomeEstudio, cnpj;



    public Estudio(String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public String getNomeEstudio() {
        return nomeEstudio;
    }

    public void setNomeEstudio(String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
