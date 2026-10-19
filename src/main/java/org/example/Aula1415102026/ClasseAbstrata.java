package org.example.Aula1415102026;

public class ClasseAbstrata {

    /*
    Abstração é a ideia, e classe abstrata é uma ferramenta do Java pra colocar essa ideia em prática

    Abstração é o princípio: mostrar só o que importa e esconder o resto.
    Ela existe em qualquer programação, e dá pra aplicar de mais de um jeito
    (por exemplo, também com interfaces).

    Classe abstrata é um recurso concreto da linguagem, com a palavra abstract:
    public abstract class Animal {
    public abstract void fazerSom();
    }
    Ela é um molde que não pode virar objeto (não existe new Animal()).
    Serve de base pras classes filhas, que são obrigadas a implementar o fazerSom() do jeito delas.
    Pensa assim: “ter um molde de bolo” é a abstração,
    e “a forma de bolo de verdade que você usa” é a classe abstrata

    Interface é outra ferramenta de abstração, ainda mais “pura” que a classe abstrata:
    ela é só uma lista de contratos, com o que a classe deve fazer
    Quem usa a interface “assina o contrato” com a palavra implements e é obrigado a escrever o método

    A diferença pra classe abstrata:
    Classe abstrata é “o que eu sou” (um Cachorro é um Animal).
    Pode ter atributos e métodos já prontos, e uma classe só herda de uma (extends).
    Interface é “o que eu sei fazer” (um Pássaro sabe voar).
    Uma classe pode implementar várias ao mesmo tempo (implements Voador, Nadador).
    Pensa na carteira de motorista: ela é um contrato que diz “essa pessoa sabe dirigir”,
    e não importa quem ela é
     */

}
