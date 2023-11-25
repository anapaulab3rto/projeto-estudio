package View;

import Control.CatalogoControlador;
import Model.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int anoLancamento = 0;
        String tituloFilme = null, nomeEstudio = null, nomeProdutor = null;
        Filme filme;
        Estudio estudioFilme;
        Produtor produtorFilme;
        char comando;

        CatalogoControlador catalogoControlador = new CatalogoControlador();

        Scanner leitor = new Scanner(System.in);

        do {
            try {
                System.out.println("Digite o nome do Filme ");
                tituloFilme = leitor.nextLine();

                System.out.println("Digite o nome do Estudio ");
                nomeEstudio = leitor.nextLine();

                System.out.println("Digite o nome do Produtor ");
                nomeProdutor = leitor.nextLine();

                System.out.println("Digite o ano de lançamento ");
                anoLancamento = leitor.nextInt();

                leitor.nextLine();

            } finally {

                produtorFilme = new Produtor(nomeProdutor);
                estudioFilme = new Estudio(nomeEstudio);

                filme = new Filme(tituloFilme, estudioFilme, produtorFilme, anoLancamento);

                catalogoControlador.cadastrar(filme);

                System.out.println("Cadastrar outro Filme?(1=sim, 0=não)");
                comando = leitor.next().charAt(0);
                leitor.nextLine();
            }

        }while (comando == '1');


        leitor.close();
        catalogoControlador.imprimir();


    }
}
