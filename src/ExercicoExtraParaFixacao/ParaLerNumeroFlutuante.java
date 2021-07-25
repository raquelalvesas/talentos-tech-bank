package ExercicoExtraParaFixacao;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class ParaLerNumeroFlutuante {
    public static void main(String[] args) {

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n ", x);

        sc.close();
    }
}
