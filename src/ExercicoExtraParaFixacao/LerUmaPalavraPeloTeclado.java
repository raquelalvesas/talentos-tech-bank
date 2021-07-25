package ExercicoExtraParaFixacao;

import java.util.Scanner;

public class LerUmaPalavraPeloTeclado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
