package dia3;

import java.util.Scanner;

public class Exercicios {

    public static void validaSystemInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // 1. Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número");
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }

        int numero = in.nextInt();

        System.out.println("IF/ELSE");
        if (numero % 2 ==0) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }

        System.out.println("SWITCH/CASE");

        int mod = numero % 2;

        switch (mod) {
            case 0:
                System.out.println("É um número par");
            default:
                System.out.println("É um número ímpar");
        }

        System.out.println("IF/ELSE TERNÁRIO");

        String resultadoTernario = numero % 2 == 0? "É um número par" : "É um número ímpar";
        System.out.println(resultadoTernario);

        in.close();
    }

    public static void exercicio2() {
        // 2. Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
        // Infantil A = 5 a 7 anos
        // Infantil B = 8 a 11 anos
        // Juvenil A = 12 a 13 anos
        // Juvenil B = 14 a 17 anos
        // Adultos = Maiores de 18 anos*/

        System.out.println("Digite sua idade");

        Scanner in = new Scanner(System.in);

        if (!in.hasNext()) {
            System.out.println("Você precisa digitar um número");
            in.close();
            System.exit(1);
        }

        int idade = in.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade não permitida");
        }

        in.close();

    }

    public static void exercicio3() {
        // 3. Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
        // Escreva um algoritmo que determina o maior também.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = in.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoValor = in.nextInt();

        if (primeiroValor < segundoValor) {
            System.out.println("O primeiro valor digitado é menor: " + primeiroValor);
        } else if (segundoValor < primeiroValor) {
            System.out.println("O segundo valor digitado é menor: " + segundoValor);
        } else {
            System.out.println("Os valores digitados são iguais");
        }
    }


    public static void exercicio4() {
        // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:
        // Encontre o maior valor
        // Encontre o menor valor
        // Calcule a média dos números lidos

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numero = in.nextInt();

        int menorValor = numero;
        int maiorValor = numero;
        int somaDosValores = 0;

        // somaDosValores = somaDosValores + numero;
        somaDosValores += numero;
        // Tem o mesmo significado, faz a mesma coisa


        System.out.println("Digite o segundo numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o terceiro numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o quarto numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;

        }
        System.out.println("Digite o quinto numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o sexto numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o setimo numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o oitavo numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o nono numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o decimo numero:");
        numero = in.nextInt();
        somaDosValores += numero;

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.println("A média dos valores é:" + somaDosValores / 10.0);

        in.close();
    }

    public static void exercicio5() {
        // 5. Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
        // (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores.
        // No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

        Scanner in = new Scanner(System.in);

        System.out.println("Digita a operação que deseja fazer (a, s, m, d");
        char operacao = in.next().charAt(0);

        System.out.println("Digite o primeiro valor");
        double valor1 = in.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = in.nextDouble();

        switch (operacao) {
            case 'a':
                System.out.printf("A soma entre o valor %f + %f é igual", valor1, valor2, valor1 + valor2);
                break;
            case 's':
                System.out.printf("A subtração entre o valor %f - %f é igual", valor1, valor2, valor1 + valor2);
                break;
            case 'm':
                System.out.printf("A multiplicação entre o valor %f * %f é igual", valor1, valor2, valor1 + valor2);
                break;
            case 'd':
                if (valor2 == 0) {
                    System.out.println("não se pode dividir por 0");
                } else {
                    System.out.printf("A divisão entre o valor %f / %f é igual", valor1, valor2, valor1 + valor2);
                }
                break;
        }

        in.close();

    }

    public static void exercicio6() {
        // 6. Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
        // O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t])
        // e deverá fazer o mesmo para o jogador 2. No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1 - Digite 1 para PEDRA, 2 papel PAPEL ou 3 para TESOURA: ");
        int a = scanner.nextInt();

        System.out.println("Jogador 2 - Digite 1 para PEDRA, 2 papel PAPEL ou 3 para TESOURA: ");
        int b = scanner.nextInt();

        if (a == b)
            System.out.println("Empate");
            else if (a == 1 && b == 2 || a == 2 && b == 3 && b == 1)
            System.out.println("Jogador 2 venceu");
            else if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2)
            System.out.println("Jogador 1 venceu");

            scanner.close();
    }


    public static void main(String[] args) {

        exercicio6();
    }
}
