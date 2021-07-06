package dia7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // No Java tudo é tipado
        //Apenas números inteiros no exemplo abaixo
        //Estrutura de dados que armazena os números
        int[] vetor = {1, 2, 4, 5};

        // vetor[] = 99;

        //Integer é uma classe

        // Classes(tudo que comece em maiúsculo) e seus primitivos
        Integer i = 0; // int
        Short s = 0; // short
        Long l = 0L; // log
        Float f = 0f; // float
        Double d = 0.0; // double
        Character c = 'a'; // char
        String src = "";

        List<Double> lista = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));


        lista.addAll(Arrays.asList(4.0));

        System.out.println(lista);

        lista.add(1.0);
        lista.add(2.0);

        System.out.println(lista);

        lista.remove(0);

        System.out.println(lista);

        List<Integer> lista2 = new ArrayList<>(); // Arrays.stream(vetor).boxed().collect(Collectors.toList());

        for (int v : vetor) {
            lista2.add(v);
        }

        System.out.println("Lista convertida de int para Integer");
        System.out.println(lista2);


        int a = 1;
        Integer b = a;

        Integer cc = 1;
        int dd = cc;

        List<Double> notas = new ArrayList<>(Arrays.asList(2d, 3d, 4d));

        notas.remove(2);

        System.out.println(notas);

        System.out.println("For each");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("For i");
        for (int j = 0; j < notas.size(); j++) {
            System.out.println(notas.get(j));
        }

        System.out.println("For do lambda");
        notas.stream().forEach(nota -> System.out.println(nota));

        System.out.println("For lambda reduzido");
        notas.forEach(System.out::println);


        System.out.println("Imutável");
        List<Integer> testeImutavel = Arrays.asList(1, 2, 3);
        testeImutavel = Collections.unmodifiableList(testeImutavel);

        System.out.println(testeImutavel.get(0));
        // testeImutavel.set(0, 5);

        System.out.println(testeImutavel.get(0));


        List<Integer> listaDeIntegers = new ArrayList<>();
        listaDeIntegers.add(1);
        listaDeIntegers.add(2);
        listaDeIntegers.add(3);

        // int[] novoArrayDeObjetos = (int[]) (Integer[]) listaDeIntegers.toArray();
        // int[] asd = {1,2,3};
        // Integer[] zxc = (Integer[]) asd;


        char[] palavraSplitada = "asdf".toCharArray();
        System.out.println(Arrays.toString(palavraSplitada));

    }

}
