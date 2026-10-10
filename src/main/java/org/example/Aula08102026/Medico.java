package org.example.Aula08102026;

public class Medico extends Funcionario {
    //extends	a palavra que cria a herança

    String especialidade;

    void atender() {
        System.out.println("Dr(a). " + nome + " está atendendo.");
    }
}

//Medico extends Funcionario herda tudo isso e acrescenta o que só médico tem: a especialidade e o atender().
