package LE1.ex1;

import java.util.ArrayList;

public interface LocadoraContrato {

    void addFilme(String nome, String genero, int ano);
    void filmesDisponiveis();
    void pesquisar();
    void alugar();
    void alterar();
    void limparLocadora();

}
