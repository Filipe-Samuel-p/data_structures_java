package LE1.ex1;

import java.util.ArrayList;

public interface LocadoraContrato {

    void addFilme(ArrayList<Filme> locadora, String nome, String genero, int ano);
    void filmesDisponiveis(ArrayList<Filme> locadora);
    void pesquisar(ArrayList<Filme>locadora);
    void alugar(ArrayList<Filme> locadora);
    void alterar(ArrayList<Filme> locadora);
    void limparLocadora(ArrayList<Filme> locadora);
}
