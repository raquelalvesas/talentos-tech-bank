package ExercicoExtraParaFixacao;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);*/

        /*System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade + " anos");*/

        System.out.println("Digite o seu primeiro nome, idade, altura e se tem cachorros");
        String primeiroNome = scanner.next();
        int idade = scanner.nextInt();
        float altura = scanner.nextFloat();
        boolean temPet = true;

        System.out.println("Você digitou as seguintes informações");
        System.out.println("Digite seu primeiro nome: " + primeiroNome);
        System.out.println("Digite a sua idade: " + idade);
        System.out.println("Digite a sua altura: " + altura);
        System.out.println("Tem cachorros? " + temPet );

    }



}
