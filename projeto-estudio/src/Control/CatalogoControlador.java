package Control;

import Model.Catalogo;
import Model.Filme;

public class CatalogoControlador {

    Catalogo catalogo = new Catalogo();

    public Catalogo cadastrar(Filme filme) {
        catalogo.getFilme().add(filme);
        return catalogo;
    }

    public void imprimir() {
        System.out.println("\n*************************************");
        System.out.println("Filmes");
        System.out.println("*************************************");

        for(Filme itemFilme: catalogo.getFilme()){
            System.out.println("\nTítulo: " + itemFilme.getTitulo());
            System.out.println("Produtor: " + itemFilme.getProdutor().getNome());
            System.out.println("Estudio: " + itemFilme.getEstudio().getNome());
            System.out.println("Ano Lançamento: " + itemFilme.getAno());
        }
    }
}
