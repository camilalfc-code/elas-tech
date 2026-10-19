package org.example.Aula16102026;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    //Crie uma classe Produto com os atributos privados
    // nome (String), preco (double) e quantidade (int).

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Crie getters e setters para todos os atributos.
    //o getter é o metodo que entrega o valor de um atributo private
    // pra quem está de fora.
    //o getter, que só devolve o que está guardado
    //getter = “me entrega o valor”

    //setter = “guarda esse valor novo”
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido! Mantido " + this.preco);
            return;
        }
        this.preco = preco;
    }
    //O setter de preco não deve aceitar valores menores ou iguais a zero.

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida! Mantido " + this.quantidade);
            return;
        }
        this.quantidade = quantidade;
    }
    //O setter de quantidade não deve aceitar valores negativos.
}
