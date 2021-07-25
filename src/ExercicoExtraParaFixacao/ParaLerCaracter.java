package ExercicoExtraParaFixacao;

import java.util.Scanner;

public class ParaLerCaracter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.printf("Você digitou: " + x);

        sc.close();
    }
}
