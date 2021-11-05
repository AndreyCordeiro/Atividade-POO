package application;

import java.util.Scanner;

public class Vogais {
    public void verificarVogais() {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Digite uma frase: ");
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char vogais = sentence.charAt(i);

            if (vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u') {
                count++;
            }
        }
        System.out.println("Número de vogais na frase: " + count);
    }
}