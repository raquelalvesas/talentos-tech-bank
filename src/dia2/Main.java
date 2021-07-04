package dia2;

public class Main {

    public static void main(String[] args) {
        operadores ();
    }

    public static void operadores() {
        // Atribuições
        int idade = 20;

        // Aritméticos
        int i = 1 + 1; // + - * / ++ -- %

        System.out.println(10.0/3.0);
        System.out.println(10 % 3);

        // Relacionais ( operador que retorna um boolean)
        boolean operadorRelacional = 1 > 2; // ==, !=, >, <, >=, <=
        // boolean tiposDiferentes = "1" == 1; Impossível de fazer no Java.

        // Operadores Lógicos
        boolean testeLogico = 1 == 1 || 2 == 1;

        boolean invertido = !!true;

    }

    public static void primeiroIf() {
        int idade = 1000;

        if (idade <0) {
            System.out.println("Idade inválida");
        } else if (idade >= 150) {
            System.out.println("Você tem permissão para assistir o conteúdo");
        } else if (idade >=18){
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        } else {
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        }
    }
}
