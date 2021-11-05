package application;

import java.util.Scanner;

public class Bissexto {
    public void anoBissexto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = sc.nextInt();

        //O ano deve ser divisível por 4 Mas Não divisível por 100, de qualquer, o ano deve ser divisível por 400
        boolean isBissexto = ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));

        if (isBissexto) {
            System.out.println("O ano " + ano + " é Bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é Bissexto!");
        }
    }
}