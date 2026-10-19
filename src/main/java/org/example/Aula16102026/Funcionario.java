package org.example.Aula16102026;

public abstract class Funcionario {
//Etapa 1. Crie uma classe abstrata Funcionario

    private String nome;
    private double salarioBase;
    // com atributos privados nome e salarioBase,


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    // um construtor que recebe os dois,
    //o this.nome é o atributo da classe, e o nome sozinho é o valor
    // que chegou de fora.

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    // getters
    //Como nome e salarioBase são private, as classes filhas
    // (Desenvolvedor e Gerente) não conseguem usar direto,
    // e vão precisar chamar esses getters

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Salário inválido! Mantido " + this.salarioBase);
            return;
        }
        this.salarioBase = salarioBase;
    }
    // e um setter de salarioBase que não aceite valores negativos
    //o sinal é < (só os negativos são recusados).
    // Salário zero passa, e isso bate com o enunciado,
    // que só proíbe valores negativos.

    public abstract double calcularSalario();
    //Etapa 2. Adicione à classe Funcionario um metodo abstrato
    // calcularSalario().
    //A Funcionario diz todo funcionário tem que saber calcular o salário,
    // sem dizer como.
    // Cada tipo de funcionário (desenvolvedor, gerente) vai escrever
    // o seu jeito.


}
