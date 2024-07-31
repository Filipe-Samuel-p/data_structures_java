package LE1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora implements LocadoraContrato{

    Scanner input = new Scanner(System.in);
    List<Filme> listaDeFilmes = new ArrayList<>();

    @Override
    public void alterar() {

        if(listaDeFilmes.isEmpty()){
            System.out.println("\n Locadora vazia\n");
            return;
        }

        System.out.print("Qual nome do filme que quer alterar: ");
        String name = input.nextLine();
        for(Filme filmeDaLocadora : listaDeFilmes){

            if(filmeDaLocadora.getNomeFilm().equals(name)){
                System.out.println("\nFilme encontrado\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano de lancamento: " + filmeDaLocadora.getAnoLancamento());
                System.out.print("\nExecutar a alteração (y/n): ");
                char confirmacao = input.next().charAt(0);
                input.nextLine();

                if(confirmacao == 'y'){
                    System.out.print("Novo nome: ");
                    String novoNome = input.nextLine();
                    filmeDaLocadora.setNomeFilm(novoNome);
                    System.out.print("Genero do novo filme: ");
                    String novoGenero = input.nextLine();
                    filmeDaLocadora.setGenero(novoGenero);
                    System.out.print("Ano de lancamento do novo filme: ");
                    int novoAno = input.nextInt();
                    filmeDaLocadora.setAnoLancamento(novoAno);
                    input.nextLine();
                    System.out.println("\nOperação concluída\n");
                    return;
                }
                else {
                    System.out.println("\nAlteração cancelada\n");
                    return;
                }
           }
        }
        System.out.println("\n Filme não encontrado\n");
    }

    @Override
    public void addFilme(String nome,String genero, int ano) {
        try{
            listaDeFilmes.add(new Filme(ano,genero,nome));
        }
        catch (OutOfMemoryError e){
            System.out.println("Erro de alocação: " + e.getMessage());
        }
    }

    @Override
    public void alugar() {

        if(listaDeFilmes.isEmpty()){
            System.out.println("\nLocadora vazia\n");
            return;
        }

        System.out.print("Qual nome do filme que quer alugar: ");
        String name = input.nextLine();
        for(Filme filmeDaLocadora : listaDeFilmes){
            if(filmeDaLocadora.getNomeFilm().equals(name)){
                System.out.println("\nFilme encontrado\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano de lancamento: " + filmeDaLocadora.getAnoLancamento());
                System.out.print("\nExecutar a exclusão (y/n): ");
                char confirmacao = input.next().charAt(0);
                input.nextLine();

                if(confirmacao == 'y'){
                    listaDeFilmes.remove(filmeDaLocadora);
                    System.out.println("\n Filme removido\n");
                    return;
                }
                else {
                    System.out.println("\nExclusão cancelada\n");
                   return;
                }
            }
        }
        System.out.println("\nFilme não encontrado\n");
    }

    @Override
    public void filmesDisponiveis() {
        int count = 0;
        System.out.println("*** FILMES DIPONÍVEIS PARA ALUGUEL ***\n");
        if(listaDeFilmes.isEmpty()){
            System.out.println("\n A locadora está vazia\n");
            return;
        }
        for(Filme filmeDaLocadora : listaDeFilmes){
            count += 1;
            System.out.printf("\nFilme %d \n",count);
            System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
            System.out.println("Genero: " + filmeDaLocadora.getGenero());
            System.out.println("Ano de lançamento: " + filmeDaLocadora.getAnoLancamento());
        }
    }

    @Override
    public void pesquisar() {

        if(listaDeFilmes.isEmpty()){
            System.out.println("\nLocadora vazia\n");
            return;
        }

        System.out.println("\n Digite o nome do filme: ");
        String name = input.nextLine();
        for (Filme filmeDaLocadora : listaDeFilmes) {
            if (filmeDaLocadora.getNomeFilm().equals(name)) {
                System.out.println("\n*** Filme Encontrado ***\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano: " + filmeDaLocadora.getAnoLancamento());
                return;
            }
        }
        System.out.println("\n Filme não encontrado\n");
    }

    @Override
    public void limparLocadora() {

        if(listaDeFilmes.isEmpty()){
            System.out.println("\n A locadora esta vazia\n");
            return;
        }
        else{
            listaDeFilmes.clear();
            System.out.println("\n **** Locadora foi limpada ****\n");
        }
    }
}
