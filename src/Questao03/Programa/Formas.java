package Questao03.Programa;

import java.util.Scanner;

import Questao03.Classes.Circulo;
import Questao03.Classes.Quadrado;

public class Formas {
    public static void main(String[] args) {
        int opt = -1;
        
        Scanner ler = new Scanner(System.in);
        Quadrado square = new Quadrado();
        Circulo circle = new Circulo();

        while(opt != 0) {
            System.out.println("Qual forma deseja usar?: \n1- Quadrado \n2- Círculo \n0- Sair");
            opt = ler.nextInt();
            ler.nextLine();

            switch (opt) {
                case 0:
                return;
                case 1:
                   System.out.println("\nInforme o tamanho da reta:");
                   square.setLado(ler.nextDouble());

                   System.out.println("\n▸ Área do Quadrado:");
                   System.out.println(square.calcularArea() + "cm²");
                   System.out.println(square.explicaCalculo() + "\n");

                   break;

                case 2:
                    System.out.println("\nInforme o tamanho do raio:");
                    circle.setRaio(ler.nextDouble());

                    System.out.println("\n▸ Área do Círculo:");
                    System.out.println(circle.calcularArea() + "cm²");
                    System.out.println(circle.explicaCalculo() + "\n");
            }
        }

        ler.close();

    }
}
