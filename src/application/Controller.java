package application;

import java.util.Scanner;

public class Controller {
    public void menu() {
        Filmes filmes = new Filmes();
        Media media = new Media();
        Senha senha = new Senha();
        Vogais vogais = new Vogais();
        Bissexto bissexto = new Bissexto();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("=-=-=-=--=-=-= M E N U - P R I N C I P A L =-=-=-=--=-=-=\n" +
                    "1 - Calcular média.\n" +
                    "2 - Listar vogais em uma frase.\n" +
                    "3 - Verificar ano Bissexto.\n" +
                    "4 - Menu de filmes.\n" +
                    "5 - Menu de senha.\n" +
                    "6 - Sair.\n" +
                    "Escolha um opção: ");

            int option = sc.nextInt();

            if (option == 1) {
                media.calcMedia();
            } else if (option == 2) {
                vogais.verificarVogais();
            } else if (option == 3) {
                bissexto.anoBissexto();
            } else if (option == 4) {
                filmes.menuFilmes();
            } else if (option == 5) {
                senha.menuSenha();
            } else if (option == 6) {
                System.out.println("Fim do programa!");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}