package Questao01;

import java.util.Scanner;

public class VetorABC {
	public static void main(String[] args) {
		int tvetor = 5;
		int[] a = new int[tvetor];
		int[] b = new int[tvetor];
		int[] c = new int[tvetor];

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite os números do vetor A:");

		for (int i = 0; i < tvetor; i++) {
			a[i] = ler.nextInt();
		}

		System.out.println("\n");
		System.out.println("Digite os números do vetor B:");

		for (int i = 0; i < tvetor; i++) {
			b[i] = ler.nextInt();
		}

		for (int i = 0; i < tvetor; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("\nVetor C: (A+B)");

		for (int i = 0; i < tvetor; i++) {
			System.out.println("C" + (i + 1) + " " + a[i] + " + " + b[i] + " = " + c[i] + "\n");
		}

		ler.close();
	}

}