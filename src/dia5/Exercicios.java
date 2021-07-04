package dia5;

import java.util.Scanner;

public class Exercicios {

    public static void exercicio1() {
        // Dado um array com 20 números, imprima seus valores de trás para frente.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }


    // ordenar os algoritmos
    public static void exercicio02() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos números deseja ordenar: ");
        int tamanho = entrada.nextInt();
        int vetor[] = new int[tamanho];
        int aux;
        int a = 0;
        while (a < vetor.length) {
            System.out.print("Digite o " + (a + 1) + "º número: ");
            vetor[a] = entrada.nextInt();
            a++;
        }
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("\n Números ordenados: ");
        for (int k = 0; k < vetor.length; k++) {
            System.out.printf("%d ", vetor[k]);
        }
    }
    public static void main(String[] args) {
        exercicio02();
    }
}


