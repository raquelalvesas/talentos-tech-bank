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
            // caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
            // o numero de tentativas vai diminuindo.
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
                    System.out.println("Você venceu.");
                    System.exit(1);
                }
            } else {
                System.out.println("Essa letra já foi digitada.");
            }
            contador++;
        }
    }

    public static void exercicio5Alternativo() {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, dê uma dica sobre a palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();


        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>();
        for (char x : palavraParaSerAdivinhada) {
            listaDeLetrasAcertadas.add(false);
        }

        System.out.println("Agora é a vez do jogador 2...");
        System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2, chute uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true);
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes--;
                System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
            }

            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (listaDeLetrasAcertadas.get(i)) {
                    System.out.printf("%s ", palavraParaSerAdivinhada[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }


        System.out.println("------------------------------");
        if (!listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("Jogador 1 ganhou o jogo");
        }
        in.close();
    }

    public static void desafio() {
        //Dado um array de números inteiros com valores negativos e
        //positivos, encontre o número mais próximo de zero.
        //Se houver valores como 2 e -2, considere o número positivo.

        int [] vetor = {-3, 3, 5, 6, 7, 8, 9, 10};
        int indiceDoMenorValor = 0;


        for (int i = 0; i < vetor.length; i++) {
            boolean oValorEMaisPertoDeZero = Math.abs(vetor[i]) < Math.abs(vetor[indiceDoMenorValor]);
            boolean oValorEMaisPertoDeZeroEPositivo = Math.abs(vetor[i])
                    == Math.abs(vetor[indiceDoMenorValor]) && vetor[i] > vetor[indiceDoMenorValor];


            if (oValorEMaisPertoDeZero || oValorEMaisPertoDeZeroEPositivo) {
                indiceDoMenorValor = i;
            }
        }

        System.out.printf("O valor mais próximo de zero é : %d", vetor[indiceDoMenorValor]);
    }

    public static void main(String[] args) {
        desafio();


        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        Optional<Double> bill = costBeforeTax
                .stream()
                .filter(cost -> cost > 600)
                .map((cost) -> cost + .12 * cost)
                .reduce(Double::sum);
        System.out.println("\nTotal : " + (bill.orElse(0.0)));


    }
}
