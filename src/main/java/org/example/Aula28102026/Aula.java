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

        //operação
        mostrarResultado(n -> n * 2, 5);
        mostrarResultado(n -> n * n, 5);
        mostrarResultado(n -> -n, 5);
        System.out.println();

        //condição
        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));
        System.out.println();

    }

    //Acao
    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    //operação
    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    //condição
    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }


}
