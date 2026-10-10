package org.example.Aula08102026;

public class Professora extends Pessoa {
    String disciplina;

    void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }
    //No printf, os espaços entram na ordem:
    // %s recebe o nome da professora (herdado),
    // %.1f recebe a nota com uma casa decimal,
    // e o segundo %s recebe o nome da aluna.
    // O %n pula a linha.

    //O símbolo % é usado no printf para indicar um espaço reservado que será substituído por um valor.
    //O %s significa:Coloque aqui uma String.
    //O .1 significa uma casa decimal e o f significa número decimal (float/double).

    /*
    @Override
    public void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }
    */

    public void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }


}