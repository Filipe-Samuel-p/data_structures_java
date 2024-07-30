package LE1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLocadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Filme> filmeList = new ArrayList<>();
        Locadora locadora = new Locadora();
        int opcao;
        do {
            System.out.println("\n ***** BEM VINDOS A LOCADORA DO FILIPE *****\n");
            System.out.println("1- Adicionar um filme para aluguel");
            System.out.println("2- Alterar um filme ja existente");
            System.out.println("3- Ver filmes disponíveis");
            System.out.println("4- Pesquisar um filme específico");
            System.out.println("5- Alugar um filme");
            System.out.println("6- Limpar locadora (alugar todos os filmes)");
            System.out.println("7- sair");
            System.out.print("Digite uma opção desejada: ");
             opcao = input.nextInt();
             input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do filme: ");
                    String filmNome = input.nextLine();
                    System.out.print("Genero do filme: ");
                    String genero = input.nextLine();
                    System.out.print("Ano de lançamento do filme: ");
                    int anoLan = input.nextInt();
                    input.nextLine();
                    locadora.addFilme(filmeList, filmNome, genero, anoLan);
                    break;
                case 2:
                    locadora.alterar(filmeList);
                    break;
                case 3:
                    locadora.filmesDisponiveis(filmeList);
                    break;
                case 4:
                    locadora.pesquisar(filmeList);
                    break;
                case 5:
                    locadora.alugar(filmeList);
                    break;
                case 6:
                    locadora.limparLocadora(filmeList);
                    break;
                case 7:
                    System.out.println("\nObrigado pela preferencia");
                    break;
                default:
                    System.out.println("\nDigite uma opcao valida");
                    break;
            }
        } while (opcao != 7);

        input.close();
    }
}
