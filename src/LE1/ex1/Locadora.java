package LE1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora implements LocadoraContrato{

    Scanner input = new Scanner(System.in);

    @Override
    public void alterar(ArrayList<Filme> locadora) {

        System.out.print("Qual nome do filme que quer alterar: ");
        String name = input.nextLine();
        for(Filme filmeDaLocadora : locadora){
            if(filmeDaLocadora.getNomeFilm().equals(name)){
                System.out.println("\nFilme encontrado\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano de lancamento: " + filmeDaLocadora.getAnoLancamento());
                System.out.print("\nExecutar a alteração (y/n)");
                char confirmacao = input.next().charAt(0);
                if(confirmacao == 'y'){
                    System.out.print("Novo nome: ");
                    String novoNome = input.nextLine();
                    System.out.print("Genero do novo filme: ");
                    String novoGenero = input.nextLine();
                    System.out.print("Ano de lancamento do novo filme: ");
                    int novoAno = input.nextInt();
                    break;
                }
                else {
                    System.out.println("\nAlteração cancelada\n");
                    break;
                }
            }
            else {
                System.out.println("Filme não encontrado\n");
            }
        }
    }

    @Override
    public void addFilme(ArrayList<Filme> locadora,String nome,String genero, int ano) {
        try{
            locadora.add(new Filme(ano,genero,nome));
        }
        catch (OutOfMemoryError e){
            System.out.println("Erro de alocação: " + e.getMessage());
        }
    }

    @Override
    public void alugar(ArrayList<Filme> locadora) {
        System.out.println("Qual nome do filme que quer excluir: ");
        String name = input.nextLine();
        for(Filme filmeDaLocadora : locadora){
            if(filmeDaLocadora.getNomeFilm().equals(name)){
                System.out.println("\nFilme encontrado\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano de lancamento: " + filmeDaLocadora.getAnoLancamento());
                System.out.print("\nExecutar a exclusão (y/n)");
                char confirmacao = input.next().charAt(0);
                if(confirmacao == 'y'){
                    locadora.remove(filmeDaLocadora);
                    break;
                }
                else {
                    System.out.println("\nExclusão cancelada\n");
                    break;
                }
            }
            else {
                System.out.println("\nFilme não encontrado\n");
            }
        }
    }

    @Override
    public void filmesDisponiveis(ArrayList<Filme> locadora) {
        int count = 0;
        System.out.println("*** FILMES DIPONÍVEIS PARA ALUGUEL ***\n");
        for(Filme filmeDaLocadora : locadora){
            count += 1;
            System.out.println("Filme \n" + count);
            System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
            System.out.println("Genero: " + filmeDaLocadora.getGenero());
            System.out.println("Ano de lançamento: " + filmeDaLocadora.getAnoLancamento());
        }
    }

    @Override
    public void pesquisar(ArrayList<Filme> locadora) {

        System.out.println("\n Digite o nome do filme: ");
        String name = input.nextLine();
        for (Filme filmeDaLocadora : locadora){
            if(filmeDaLocadora.getNomeFilm().equals(name)){
                System.out.println("\n Filme disponível para aluguel\n");
                System.out.println("Nome: " + filmeDaLocadora.getNomeFilm());
                System.out.println("Genero: " + filmeDaLocadora.getGenero());
                System.out.println("Ano: " + filmeDaLocadora.getAnoLancamento());
                break;
            }
            else {
                System.out.println("\nFilme não encontrado\n");
            }
        }

    }
}
