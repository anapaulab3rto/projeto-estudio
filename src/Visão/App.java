package Visão;

import Controlador.CatalogoFilmeControlador;
import Controlador.ElencoControlador;
import Modelo.*;


import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        int anoLancamento = 0;
        String tituloFilme = null, nomeEstudio = null, filmeAtor = null, nomeAtores = null, nomeProdutor = null;
        Filme filme;
        Estudio estudioFilme;
        Produtor produtorFilme;
        Atores atores;
        char comando;


        CatalogoFilmeControlador catalogoFilmeControlador = new CatalogoFilmeControlador();
        CatalogoFilmes catalogoAtual;
        ElencoControlador elencoControlador = new ElencoControlador();
        Elenco elencoAtual;

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


                do {
                    try {
                        System.out.println("Digite o nome do Ator ou atriz ");
                        nomeAtores = leitor.nextLine();

                        filmeAtor = tituloFilme;


                    } finally {


                        atores = new Atores(nomeAtores, filmeAtor);
                        elencoAtual = elencoControlador.cadastrarAtores(atores);




                        System.out.println("Cadastrar outro Ator ou Atriz?(1=sim, 0=não)");
                        comando = leitor.next().charAt(0);
                        leitor.nextLine();

                    }
                } while (comando == '1');


            } finally {

                produtorFilme = new Produtor(nomeProdutor);
                estudioFilme = new Estudio(nomeEstudio);

                filme = new Filme(tituloFilme, estudioFilme, produtorFilme, anoLancamento);

                catalogoAtual = catalogoFilmeControlador.cadastrarFilmes(filme);




                System.out.println("Cadastrar outro Filme?(1=sim, 0=não)");
                comando = leitor.next().charAt(0);
                leitor.nextLine();
            }

        }while (comando == '1');


        leitor.close();

        catalogoFilmeControlador.imprimirFilmes();
        elencoControlador.imprimirAtores();




    }
}

