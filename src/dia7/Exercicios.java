package dia7;

import java.util.*;

public class Exercicios {

    public static void exercicio1() {

        // Escreva um algoritmo que leia números insira em um array e
        // após mostre os números informados na tela.
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(numeros));


        in.close();
    }

    public static void exercicio1ArrayList() {

        // Escreva um algoritmo que leia números insira em um array e
        // após mostre os números informados na tela.
        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }


        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero < 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);


        System.out.println(numeros.stream().filter(numero -> numero < 0).count());


        in.close();
    }

    public static void exercicio3ArrayList() {

        // Escreva um algoritmo que leia números, insira em um array e
        // após mostre a quantidade de números pares.
        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }


        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);


        System.out.println(numeros.stream().filter(numero -> numero % 2 == 0).count());


        in.close();
    }

    public static void exercicio4ArrayList() {

        // Escreva um algoritmo que leia números, insira em um array e
        // após mostre o maior valor.
        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }


        int maiorValor = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }
        System.out.println(maiorValor);

        System.out.println(Collections.max(numeros));

        System.out.println(numeros.stream().max(Integer::compare).get());

        System.out.println(numeros.stream().mapToInt(v -> v).max().getAsInt());

        in.close();
    }
    public static void exercicio5() {
            // Escreva um algoritmo que simula um jogo da forca simples.
            // O usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
            // caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo.
            // Caso o numero de tentativas chegue a 0 o usuário perde.

        String [] palavra = {"a", "m", "i","z","a","d","e"};

        Scanner scan = new Scanner(System.in);

        int forca = 1, vencer = 0, perder = 0, contador = 0;

        String digito;
        String[] letrasDigitadas = new String[20];

        while (true) {
            int existePalavra = 0;
            System.out.println("Digite a letra:");
            digito = scan.next();
            letrasDigitadas[contador] = digito;
            for (String letrasDigitada : letrasDigitadas) {
                if (letrasDigitada != null) {
                    if (letrasDigitada.equals(digito)) {
                        existePalavra++;
                    }
                }
            }

            if (!(existePalavra > 1)) {
                for (int i = 0; i < palavra.length; i++) {
                    if (palavra[i].equals(digito)) {
                        System.out.println("Letra correta.");
                        vencer++;
                        break;
                    } else {
                        if (i == 4) {
                            System.out.println("Letra inexistente.");
                            perder++;
                        }
                    }
                }
                if (perder == 10) {
                    System.out.println("Você perdeu.");
                    System.exit(1);
                } else if (vencer == 7) {
                    System.out.println("Voce venceu.");
                    System.exit(1);
                }
            } else {
                System.out.println("Essa letra já foi digitada.");
            }
            contador++;
        }
    }


    public static void main(String[] args) {
        exercicio5();
    }
}
