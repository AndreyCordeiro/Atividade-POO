package application;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Filmes {
    public void menuFilmes() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("=-=-=-=--=-=-= M E N U - DE - F I L M E S =-=-=-=--=-=-=\n" +
                    "1 - Cadastrar Filmes.\n" +
                    "2 - Buscar Filmes.\n" +
                    "3 - Listar Filmes.\n" +
                    "4 - Remover Filmes.\n" +
                    "5 - Sair.\n" +
                    "Escolha um opção: ");

            int option = sc.nextInt();

            if (option == 1) {
                cadastrarFilmes();
            } else if (option == 2) {
                buscarFilmes();
            } else if (option == 3) {
                listarFilmes();
            } else if (option == 4) {
                removerFilmes();
            } else if (option == 5) {
                System.out.println("Fim do menu de filmes! Voltando ao menu principal.");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public List<String> listarFilmes = new LinkedList<>();

    public void cadastrarFilmes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do filme que deseja cadastrar: ");
        String filme = sc.nextLine();

        listarFilmes.add(filme);
    }

    public void buscarFilmes() {
        Scanner sc = new Scanner(System.in);

        if (listarFilmes.size() == 0) {
            System.out.println("Ainda não há filmes cadastrados!");
        } else {
            System.out.print("Digite o nome do filme que deseja buscar: ");
            String inputFilme = sc.nextLine();

            for (String filme : listarFilmes) {
                if (filme.equals(inputFilme)) {
                    System.out.println("O filme: " + filme + " foi encontrado!");
                } else {
                    System.out.println("O filme " + inputFilme + " não foi encontrado!");
                }
                break;
            }
        }
    }

    public void listarFilmes() {
        if (listarFilmes.isEmpty()) {
            System.out.println("Ainda não há filmes cadastrados!");
        } else {
            System.out.println(listarFilmes);
        }
    }

    public void removerFilmes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do filme que deseja remover: ");
        String filme = sc.nextLine();

        if (listarFilmes.contains(filme)) {
            listarFilmes.remove(filme);
            System.out.println("O filme: " + filme + " foi removido da lista!");
        } else {
            System.out.println("O filme: " + filme + " não foi encontado na lista!");
        }
    }
}