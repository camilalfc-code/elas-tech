package org.example.Aula08102026;

public class Cardiologista extends Medico {
    //extends	a palavra que cria a herança

    void examinarCoracao() {
        System.out.println("Dr(a). " + nome + " está examinando o coração.");
    }
}

//Repara que o Cardiologista usa o nome sem ter escrito: o atributo vem lá do Funcionario,
// passando pelo Medico. O que é só dele é o examinarCoracao().