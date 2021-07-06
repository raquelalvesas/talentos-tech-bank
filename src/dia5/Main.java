package dia5;

import java.util.Scanner;

public class Main {

    // Revisão e exercícios de fixação loops

    public static void execicio1() {
        // 1. Dois números são inseridos pelo teclado. Escreva um programa para encontrar o valor de um número elevado à potência de outro. (Não use o método Math.pow integrado Java)
        /// Por exemplo, 2 elevado 3 = 8

        // System.out.println(Math.pow(2, 3));
        // Faça um programa que calcula o exponencial a partir de sua base e sua potencia
        // Por exemplo, 2 elevado 3 = 8

        Scanner in = new Scanner(System.in);

        int base;
        int potencia;
        int resultado = 1;

        System.out.println("Informe o valor da base");
        base = in.nextInt();

        System.out.println("Informe o valor da potencia");
        potencia = in.nextInt();

        for (int i = 1; i <= potencia; i++) {
            // resultado = resultado * base;
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

        //Método do próprio Java.
        System.out.println(Math.pow(base, potencia));

        in.close();


    }

    public static void execicio2I() {
       // 2. Escreve um programa que imprima os seguintes padrões:
        int i = 4;
        while (i > 0) {
            System.out.println("**********");
            i--;
        }
        System.out.println("");
    }

    public static void execicio2II() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void execicio2III() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int k = linhas - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void execicio2IV() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void execicio2V() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void execicio2VI() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {

                System.out.printf("%d ", l);
                k++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }

            System.out.print("\n");
        }
    }

    /*Segunda opção de resolução do exercício 2VI
    int rows = 5;
        System.out.println("");
        for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= (rows - i) * 2; j++) {
            System.out.print(" ");
        }
        for (int k = i; k >= 1; k--) {
            System.out.print(" " + k);
        }
        for (int l = 2; l <= i; l++) {
            System.out.print(" " + l);
        }
        System.out.println();
    }
}*/


    public static void main(String[] args) {
        execicio2VI();

    }
}