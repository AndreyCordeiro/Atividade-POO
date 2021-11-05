package application;

import java.util.Scanner;

public class Senha {
    private String senha;

    public void menuSenha() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("=-=-=-=--=-=-= M E N U - DE - S E N H A =-=-=-=--=-=-=\n" +
                    "1 - Definir Senha.\n" +
                    "2 - Vizualizar Senha.\n" +
                    "3 - Sair.\n" +
                    "Escolha um opção: ");

            int option = sc.nextInt();

            if (option == 1) {
                definirSenha();
            } else if (option == 2) {
                mostrarSenha();
            } else if (option == 3) {
                System.out.println("Fim do menu de senha! Voltando ao menu principal.");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public void definirSenha() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma senha: ");
        setSenha(sc.nextLine());
        validarSenha(getSenha());
    }

    public void mostrarSenha() {
        if (senha == null) {
            System.out.println("Você ainda não definiu uma senha!");
        } else {
            System.out.println("Sua senha é: '" + getSenha() + "'. Não compartilhe com ninguém!");
        }
    }

    public void validarSenha(String senha) {
        try {
            int cont = 0;

            if (senha.length() < 10) {
                System.out.println("A senha deve conter pelo menos 10 caracteres.");
            }

            for (char c : senha.toCharArray()) {
                if (Character.isDigit(c)) {
                    cont++;
                }
                if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                    System.out.println("A senha não pode ter caracteres especiais!");
                }
            }

            if (cont < 2) {
                System.out.println("A senha deve conter pelo menos dois números!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}