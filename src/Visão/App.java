package Visão;

import Controlador.CatalogoFilmeControlador;
import Modelo.*;


import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int anoLancamento = 0;
        String tituloFilme = null, nomeEstudio = null, filmeAtor = null, nomeAtores = null;
        int idade = 0;
        Filme filme;
        Atores atores;
        String elencoFilme = null;
        char comando;


        CatalogoFilmeControlador catalogoFilmeControlador = new CatalogoFilmeControlador();
        CatalogoFilmes catalogoAtual;
        Elenco elencoAtual;

        Scanner leitor = new Scanner(System.in);

        do {
            try {
                System.out.println("Digite o nome do Filme ");
                tituloFilme = leitor.nextLine();

                System.out.println("Digite o nome do Estudio ");
                nomeEstudio = leitor.nextLine();

                System.out.println("Digite o ano de lançamento ");
                anoLancamento = leitor.nextInt();



                leitor.nextLine();


                do {
                    try {
                        System.out.println("Digite o nome do Ator ou atriz ");
                        nomeAtores = leitor.nextLine();

                        System.out.println("Digite a idade do Ator ou atriz ");
                        idade = leitor.nextInt();

                        filmeAtor = tituloFilme;

                    } finally {
                        atores = new Atores(nomeAtores, idade, filmeAtor);
                        elencoAtual = catalogoFilmeControlador.cadastrarAtores(atores);


                        System.out.println("Cadastrar outro Ator ou Atriz?(1=sim, 0=não)");
                        comando = leitor.next().charAt(0);
                        leitor.nextLine();

                    }
                } while (comando == '1');


            } finally {

                filme = new Filme(tituloFilme, anoLancamento, nomeEstudio, elencoFilme);
                catalogoAtual = catalogoFilmeControlador.cadastrarFilmes(filme);


                System.out.println("Cadastrar outro Filme?(1=sim, 0=não)");
                comando = leitor.next().charAt(0);
                leitor.nextLine();
            }

        }while (comando == '1');


        leitor.close();

        catalogoFilmeControlador.imprimirFilmes();


    }
}

