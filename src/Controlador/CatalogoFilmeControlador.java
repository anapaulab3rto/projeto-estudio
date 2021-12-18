package Controlador;

import Modelo.Atores;
import Modelo.CatalogoFilmes;
import Modelo.Elenco;
import Modelo.Filme;



public class CatalogoFilmeControlador {
    Elenco elenco = new Elenco();
    CatalogoFilmes catalogoFilmes = new CatalogoFilmes();

    public CatalogoFilmes cadastrarFilmes(Filme filme) {
        catalogoFilmes.getFilme().add(filme);

        return catalogoFilmes;
    }

    public Elenco cadastrarAtores(Atores atores){
        elenco.getAtores().add(atores);

        return elenco;
    }





    public void imprimirFilmes() {
        System.out.println("\n*************************************");
        System.out.println("Filmes");
        System.out.println("*************************************");
        for (Filme itemFilme : catalogoFilmes.getFilme()) {
            System.out.println("\nTítulo: " + itemFilme.getTitulo());
            System.out.println("Estudio: " + itemFilme.getNomeEstudio());
            System.out.println("Ano Lançamento: " + itemFilme.getAnoLancamento());



            }
        System.out.println("\n*************************************");
        System.out.println("Atores");
        System.out.println("*************************************");
        for (Atores itemAtores : elenco.getAtores()){
            System.out.println("\nNome: " + itemAtores.getNomeAtores());
            System.out.println("Idade: " + itemAtores.getIdade());
            System.out.println("Filme: "+itemAtores.getFilmeAtor());;
        }



    }
}
