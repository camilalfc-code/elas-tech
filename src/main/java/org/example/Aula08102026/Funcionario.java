package org.example.Aula08102026;

public class Funcionario {
    String nome;
    double salario;

    void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }
}


//Funcionario tem o que todo mundo do hospital tem: nome, salário e trabalhar().