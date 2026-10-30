package org.example.Aula29102026;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;

public class Aula {

    public static void main(String[] args) {
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());


        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);
        System.out.println();
        /*
        numeros.stream() abre o “fluxo” de dados da lista.
        .filter(n -> n % 2 == 0) deixa passar só quem tem resto 0 na divisão por 2, ou seja, os pares.
        .collect(Collectors.toList()) junta o resultado numa nova lista, que é o que o enunciado pede.
         */

        List<String> frutas = List.of("maçã", "banana", "uva", "laranja");
        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(fruta -> System.out.println(fruta));
        System.out.println();
        /*
        .map(fruta -> fruta.toUpperCase()) pega cada fruta e a transforma na versão em maiúsculas.
        .forEach(...) percorre o resultado e imprime cada uma na tela, que é o que o enunciado pede.
        */

        List<String> cidades = List.of("São Paulo", "Santos", "Araraquara", "Salvador", "Curitiba",
                "São Carlos");
        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();
        System.out.println("Cidades com S: " + quantidade);
        System.out.println();
        /*
        .filter(cidade -> cidade.startsWith("S")) deixa passar só as cidades que começam com “S”.
        .count() conta quantas sobraram. Ele devolve um long, por isso a variável é long e não int.
        */


        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        saudacao.accept("Flora");
        Consumer<String> maiusculo = nome -> System.out.println(nome.toUpperCase());
        maiusculo.accept("Flora");
        System.out.println();
        /*
        Consumer<String> recebe um String e não devolve nada, por isso o corpo só imprime.
        .accept("Flora") é o que dispara o Consumer, igual ao .run() do Runnable.
        O segundo Consumer faz a mesma coisa, mas com toUpperCase().
        */

        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";
        System.out.println(avisoSistema.get());
        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());
        System.out.println();
        /*
        () -> "texto" não recebe nada e devolve o texto. O .get() é o que dispara, igual ao .accept() e ao
        .run().
        new Random().nextInt(100) sorteia um número de 0 a 99. Como o sorteio roda a cada .get(), as duas
        chamadas dão números diferentes (de vez em quando podem coincidir por sorte, aí é só rodar de novo
        kkk).
         */

        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15));
        Predicate<String> textoVazio = texto -> texto.isEmpty();
        System.out.println("A String \"\" está vazia? " + textoVazio.test(""));
        System.out.println("A String \"Java\" está vazia? " + textoVazio.test("Java"));
        System.out.println();
        /*
        Predicate<Integer> recebe um número e devolve true ou false.
        .test(...) é o que dispara, o “.run()/.accept()/.get()” do Predicate.
        No segundo, o isEmpty() só dá true para a String "".
        As barras \" servem para imprimir as aspas dentro do texto.
         */

        Function<Integer, String> formatarNota = numero -> "Nota fiscal nº: " + numero;
        System.out.println(formatarNota.apply(1542));
        Function<String, Integer> contarLetras = palavra -> palavra.length();
        System.out.println("A palavra 'Professor' tem " + contarLetras.apply("Professor") + " letras.");
        System.out.println();
        /*
        Function<Integer, String>: o primeiro tipo é o que entra (Integer) e o segundo é o que sai (String).
        .apply(...) é o que dispara, o “.test()/.get()” da Function.
        No segundo, entra String e sai Integer (a quantidade de letras).
         */
    }


}


/*
1 - Dada uma lista de números inteiros de 1 a 6, use Streams para filtrar apenas os números pares e salve
o resultado em uma nova lista.

2 - Dada uma lista com nomes de frutas em letras minúsculas, use o map para transformar todas as
palavras em letras maiúsculas e imprima cada uma na tela.

3 -  Dada uma lista de nomes de cidades, filtre apenas as cidades que começam com a letra "S" e conte
quantas cidades passaram pelo filtro.
 */
