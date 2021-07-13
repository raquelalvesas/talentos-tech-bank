package dia6;

import java.sql.Array;
import java.util.Arrays;

public class RespGrupos {
    public static void sortGrupo1() {
        int[] arrayDesordenado = {-15, 98, 35, 7, 18, 0, 543, 35, 15, 2, -11, -15, -15};
        int[] arrayOrdenador = new int[arrayDesordenado.length];
        for (int j = 0; j < arrayOrdenador.length; j++) {
            int valorMinimo = arrayDesordenado[j];
            for (int i = j; i < arrayDesordenado.length; i++) {
                if (arrayOrdenador[j] > arrayDesordenado[i]) {
                    int aux = valorMinimo;
                    valorMinimo = arrayDesordenado[i];
                    arrayDesordenado[i] = aux;
                }
                arrayOrdenador[j] = valorMinimo;
            }
        }
        for (int number : arrayOrdenador) {
            System.out.print(number + ", ");
        }
    }

    public static void sortGrupo2() {
        int[] lista = {50, 30, 25, 80, 2, 7, 30, 20, -1, -101, 30, 50};
        int menor;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[i]) {
                    menor = lista[j];
                    lista[j] = lista[i];
                    lista[i] = menor;
                }
            }
        }
        for (int valor : lista) {
            System.out.println(valor);
        }
    }

    public static void sortGrupo3() {
        // valores a serem ordenados
        int vetor[] = {3, 5, 10, 8, 1, 3, -10};
        // armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;
        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;
            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        System.out.println(Arrays.toString(vetor));
    }

    public static void main(String[] args) {
    sortGrupo2();
    }
}

// A resposta da questão 4 está em outra na aba de exercícios,
// pois a mesma foi questão para o meu grupo resolver.