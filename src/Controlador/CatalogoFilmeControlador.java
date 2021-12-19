package Controlador;


import Modelo.CatalogoFilmes;

import Modelo.Filme;




public class CatalogoFilmeControlador {

    CatalogoFilmes catalogoFilmes = new CatalogoFilmes();

    public CatalogoFilmes cadastrarFilmes(Filme filme) {
        catalogoFilmes.getFilme().add(filme);

        return catalogoFilmes;
    }



    public void imprimirFilmes() {
        System.out.println("\n*************************************");
        System.out.println("Filmes");
        System.out.println("*************************************");
        for (Filme itemFilme : catalogoFilmes.getFilme()) {
            System.out.println("\nTítulo: " + itemFilme.getTitulo());
            System.out.println("Produtor: " + itemFilme.getProdutorFilme().getNomeProdutor());
            System.out.println("Estudio: " + itemFilme.getEstudioFilme().getNomeEstudio());
            System.out.println("Ano Lançamento: " + itemFilme.getAnoLancamento());



            }




    }
}
