package application;

import java.util.Scanner;

public class Media {
    private double num1, num2, num3;

    public Double calcMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num1 = sc.nextDouble();

        System.out.print("Informe um número: ");
        num2 = sc.nextDouble();

        System.out.print("Informe um número: ");
        num3 = sc.nextDouble();

        Double media = (num1 + num2 + num3) / 3;
        System.out.println("A média é: " + media);

        return media;
    }
}