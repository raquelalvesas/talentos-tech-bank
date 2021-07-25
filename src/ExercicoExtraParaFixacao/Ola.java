package ExercicoExtraParaFixacao;

import java.util.Locale;

public class Ola {

    public static void main(String[] args) {
        System.out.print("Olá Mundo!");
        System.out.println("Raquel");
        System.out.println("Exercício");

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        // Config a localização do programa
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        // Concatenação
        System.out.println("Resultado = " + x + " metros");
        // Concatenar vários elementos no printf
        System.out.printf("Resultado = %.2f metros%n", x);
        // Concatenar vários elementos em um mesmo comando de escrita.

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
