package dia1;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
       exercicio4();
    }


    public static void exercicio1() {
        // 1. Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

        short Y = 99;
        short Z = 11;
        short coringa = 0;

        // short resultado = (short) (y - z);
        // TODO Pesquisar mais sobre arithmetic entre shorts

        System.out.printf("O valor da variável Y antes da troca é = %d\n", Y);
        System.out.printf("O valor da variável Z antes da troca é = %d\n", Z);

        coringa = Y;
        Y = Z;
        Z = coringa;

        System.out.println("O valor da variável Y depois da troca é = " + Y);
        System.out.println("O valor da variável Z depois da troca é = " + Z);

    }

    public static void exercicio2() {
        // 2. Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar o seu antecessor");
        int valor = in.nextInt();

        // int antecessor = valor - 1;
        // TODO tratar erros de inputs diferentes de inteiros

        System.out.println("O valor de " + valor + "é: " + --valor);
        in.close();
    }

    public static void exercicio3() {
        // 3. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo
        // A = b * h
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = in.nextDouble();
        System.out.println("Qual a altura do retângulo?");
        double altura = in.nextInt();

        double area = base * altura;

        System.out.println("A área desse retângulo é: " + area);

        in.close();


    }
    public static void exercicio4() {
        // 4. Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
        // 200 votos totais
        // 20 votos nulo
        // 40 votos brancos
        // 140 votos validos

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o total de votos");
        int totalDeVotos = in.nextInt();

        System.out.println("Digite o total de votos brancos");
        int totalDeVotosBrancos = in.nextInt();

        System.out.println("Digite o total de votos nulos");
        int totalDeVotosNulos = in.nextInt();

        System.out.println("Digite o total de votos validos");
        int totalDeVotosValidos = in.nextInt();

        System.out.println("A quantidade de votos é: " + totalDeVotos);

        System.out.println("A quantidade de votos é: " + totalDeVotosBrancos);

        System.out.println("A quantidade de votos é: " + totalDeVotosNulos);

        System.out.println("A quantidade de votos é: " + totalDeVotosValidos);

        double percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        percentualVotosBrancos = totalDeVotosBrancos * 100 / totalDeVotos;
        percentualVotosNulos = totalDeVotosNulos * 100 / totalDeVotos;
        percentualVotosValidos = totalDeVotosValidos * 100 / totalDeVotos;

        System.out.println("----");
        System.out.println("O percentual total de votos brancos é:" + percentualVotosBrancos +"%");
        System.out.println("O percentual total de votos nulos é:" + percentualVotosNulos +"%");
        System.out.println("O percentual total de votos válidos é:" + percentualVotosValidos +"%");



        in.close();
    }

}









