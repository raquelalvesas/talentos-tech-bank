package dia8.exerciciopessoa;

import java.time.Year;

public class Pessoa {
    // Crie uma classe para representar uma pessoa, com os atributos de nome, ano de nascimento e altura.
        // Crie e também um método para imprimir todos dados de uma pessoa.
        // Crie um método para mostrar quantos anos a pessoa fará/terá neste ano.


        private String nome;
        private int anoDeNascimento;
        private Double altura;
        private String numeroDeCelular;

    public Pessoa(String nome, double altura, int anoNascimento, String numeroDeCelular) {
        this.nome = nome;
        this.anoDeNascimento = anoNascimento;
        this.altura = altura;
        this.setNumeroDeCelular(numeroDeCelular);

    }

    public Pessoa(String nome, Double aDouble, Object o) {
    }

    public Pessoa(String nome, Double aDouble, Object o, Object numeroDeCelular) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(double nome) {
        this.setNome(nome);
    }

    public int getAnoDeNascimento(int anoDeNascimento) {
        return anoDeNascimento;
    }

    public void steAnoDeNascimento(int anoDeNascimento) {
        this.steAnoDeNascimento(anoDeNascimento);
    }

    public double getAltura() {
        return altura;
    }

    public void steAltura(double altura) {
        this.steAltura(altura);
    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(String numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", anoDeNascimento=" + this.getAnoDeNascimento() +
                ", altura=" + this.getAltura() +
                ", numeroDeCelular='" + this.getNumeroDeCelular() + '\'' +
                '}';
    }

    public void imprimiTodosOsDadosDaPessoa() {
        System.out.println(this);
    }

    public void mostrarQuantosAnosAhPessoaTeraNoAnoCorrente() {
        if (this.getAnoDeNascimento() == null) {
            System.out.println("Ano de nascimento não informado");
            return;
        }

        Integer anoAtual = Year.now().getValue();
        Integer anosQueAhPessoaTera = anoAtual - this.getAnoDeNascimento();
        System.out.println(anosQueAhPessoaTera);
    }

    private Integer getAnoDeNascimento() {
        return anoDeNascimento;
    }


}








