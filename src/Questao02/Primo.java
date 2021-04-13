package Questao02;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        int p[] = new int[10];
        int num;

        Scanner read = new Scanner(System.in);

        System.out.println("A seguir, digite uma sequência de 10 números \n(Pressione 'Enter' para confirmar uma inserção):");

        for (int i = 0; i < p.length; i++) {
            num = read.nextInt();
            p[i] = num;
        }

        System.out.println("\nVerificação:");
        System.out.println("—————————————————————————————————");

        for (int i = 0; i < p.length; i++) {
            if (ehPrimo(p[i])) {
                System.out.println("▸" + p[i] + " é um número primo!");
            } else
                System.out.println("▸" + p[i] + " NÃO é um número primo!");
        }

        read.close();
    }

    private static boolean ehPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}