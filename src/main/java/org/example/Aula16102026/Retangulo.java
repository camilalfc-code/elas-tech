package org.example.Aula16102026;

public class Retangulo extends Forma {
    //b) Crie uma classe Retangulo que herda de Forma,
    //O extends Forma é o que diz: “o Retangulo é uma Forma”,
    // e por isso ele herda o exibirNome().

    private double largura;
    private double altura;
    // tem os atributos largura e altura, e implementa calcularArea().

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }
    //O novo aqui é o super(nome).
    // Ele chama o construtor da classe mãe (Forma) e entrega o nome
    // pra ela guardar.
    // Como o nome é private na Forma, é a própria Forma que precisa guardar,
    // e o Retangulo só repassa.
    // O super(...) tem que ser sempre a primeira linha do construtor.
    //Os outros dois (largura e altura) são do próprio Retangulo,
    // então ele guarda sozinho.

    @Override
    public double calcularArea() {
        return largura * altura;
    }
    //O @Override avisa que você está escrevendo o jeito do Retangulo
    // pro metodo abstrato que veio da Forma.
    // A conta é a da área do retângulo: largura vezes altura.
    //Esse é o metodo que estava sem corpo na Forma
}
