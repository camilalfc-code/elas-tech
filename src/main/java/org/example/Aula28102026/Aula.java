package org.example.Aula28102026;

public class Aula {

    public static void main(String[] args) {

        //interface saudacao
        Saudacao ola = () -> System.out.println("Olá, bem-vinda à aula de lambda!");
        ola.executar();
        System.out.println();

        //interface impressora
        Impressora maiusculo = texto -> System.out.println(texto.toUpperCase());
        Impressora minusculo = texto -> System.out.println(texto.toLowerCase());
        maiusculo.imprimir("Aprendendo Lambda em Java");
        minusculo.imprimir("Aprendendo Lambda em Java");
        System.out.println();

        //interface calculo
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a, b) -> Math.max(a, b);
        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
        System.out.println("Maior: " + maior.calcular(5, 3));
        System.out.println();

        //Acao
        repetir(() -> System.out.println("oi"));
        System.out.println();

    }

    //Acao
    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }


}
