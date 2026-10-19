package org.example.Aula16102026;

public abstract class Forma {
    // Crie uma classe abstrata Forma
    //O abstract na frente de class é o que diz: “isso é um molde,
    // não dá pra criar objeto direto dela”.

    private String nome;
    //um atributo nome;

    public Forma(String nome) {
        this.nome = nome;
    }
    //um construtor que recebe o nome;
    //Ele funciona igual ao setter que você já conhece:
    // o this.nome é o atributo da classe, e o nome sozinho é o valor
    // que chegou de fora.
    // A diferença é que o construtor roda na hora que o objeto é criado.

    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }
    //um metodo normal exibirNome(), que imprime o nome da forma;
    //Ele é um metodo normal (com corpo, fazendo o trabalho),
    // e as classes filhas vão herdar ele pronto, sem precisar reescrever.

    public abstract double calcularArea();
    //um metodo abstrato calcularArea(), que retorna um double.
    //Ele não tem corpo, não tem chaves { }, só termina com ponto e vírgula.
    // A Forma só diz “toda forma tem que saber calcular a área”,
    // sem dizer como.
    //Cada classe filha (como o Retangulo) é obrigada a escrever o seu jeito
    // de calcular.
    //É o controle remoto de novo: o botão existe, mas cada TV faz do
    // seu jeito



}
