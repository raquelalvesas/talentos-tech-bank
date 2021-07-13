package dia8.exercicioagenda;

import dia8.exerciciopessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    public static void exercicio1() {

        //Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
        //void armazenaPessoa(String nome, int idade, float altura);
        //void removePessoa(String nome);
        //int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
        //void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
        //void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

    }

    private List<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void armazenaPessoa(String nome, double altura, int anoDeNascimento, String numeroDeCelular) {
        Pessoa pessoa = new Pessoa(nome, altura, anoDeNascimento, numeroDeCelular );
        contatos.add(pessoa);
    }

    public void removePessoa(String nome) {
        int index = buscaPessoa(nome);
        if (index > -1) {
            contatos.remove(index);
        }


    }

    public Integer buscaPessoa(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;

    }

    public void imprimeAgenda() {
        for (Pessoa pessoa: contatos) {
            System.out.println(pessoa);
        }
    }

    public void imprimePessoa( int index) {
        System.out.println(this.contatos.get(index));
    }


    }



