package Modelo;

public class Produtor {
    private String nomeProdutor;
    private int idadeProdutor;

    public Produtor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;

    }

    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }

    public int getIdadeProdutor() {
        return idadeProdutor;
    }

    public void setIdadeProdutor(int idadeProdutor) {
        this.idadeProdutor = idadeProdutor;
    }
}
