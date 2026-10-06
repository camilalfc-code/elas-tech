package org.example.listarevisao04102026;

public class ConcatenacaoPrintf {
    public static void main() {

    /*
    Concatenação e printf
    Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
    Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
    Crie uma variável com o preço de um produto e imprima com duas casas decimais.
    Usando printf, imprima numa linha só o nome, a idade e a altura.
    Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
    Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.
     */

        //Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        String nome = "Ana";
        int idade = 28;
        System.out.println(nome + " tem " + idade + " anos.");
        System.out.println();

        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f%n", media);
        System.out.println();

        //Crie uma variável com o preço de um produto e imprima com duas casas decimais.
        double preco = 49.9;
        System.out.printf("Preço: R$ %.2f%n", preco);
        //O printf com %.2f mostra a média com duas casas decimais, como o enunciado pede.
        // O %n pula a linha, porque o printf não pula sozinho.
        System.out.println();

        //Usando printf, imprima numa linha só o nome, a idade e a altura.
        double altura = 1.65;
        System.out.printf("%s tem %d anos e %.2f m de altura.%n", nome, idade, altura);
        System.out.println();

        //Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo.
        //Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
        //Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.
        double total = 0;
        String produto1 = "Caderno";
        double preco1 = 18.9;
        String produto2 = "Caneta";
        double preco2 = 3.5;
        String produto3 = "Mochila";
        double preco3 = 89.99;
        System.out.println("=== RECIBO ===");
        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        total += preco1;
        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        total += preco2;
        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        total += preco3;
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
