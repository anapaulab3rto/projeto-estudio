package Controlador;

import Modelo.Atores;
import Modelo.Elenco;
import Modelo.Filme;

public class ElencoControlador {
    Elenco elenco = new Elenco();

    public Elenco cadastrarAtores(Atores atores){
        elenco.getAtoresFilmes().add(atores);

        return elenco;
    }

    public void imprimirAtores(){
            System.out.println("\n*************************************");
            System.out.println("Atores");
            System.out.println("*************************************");
            for (Atores itemAtores : elenco.getAtoresFilmes()){
            System.out.println("\nNome: " + itemAtores.getNomeAtores());
            System.out.println("Filme: " + itemAtores.getFilmeAtor());

    }

    }





}