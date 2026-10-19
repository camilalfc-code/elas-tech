package org.example.Aula16102026;

public class Exercicio3 {

    static void main() {

        Produto p = new Produto();
        //Cria o produto vazio: nome = null, preco = 0.0, quantidade = 0.

        p.setNome("Caneta");
        p.setPreco(5.50);
        p.setQuantidade(10);
        //Os três valores passam pelos setters e são guardados: Caneta, 5.5 e 10.

        p.setPreco(-3);
        //Aqui o porteiro age: -3 <= 0, então ele avisa, não guarda e
        // sai com o return.
        // O preço continua 5.5.
        // É por isso que apareceu “Preço inválido! Mantido 5.5”.

        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
        System.out.println();
    }

/*
Questão 3: Getters e Setters
Crie uma classe Produto com os atributos privados
nome (String),
preco (double) e
quantidade (int).

Crie getters e setters para todos os atributos.
O setter de preco não deve aceitar valores menores ou iguais a zero.
O setter de quantidade não deve aceitar valores negativos.
No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.
*/
}
