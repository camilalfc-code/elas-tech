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
        O println() vazio no final é a linha em branco de sempre.
         */

        List<String> frutas = List.of("maçã", "banana", "uva", "laranja");
        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(fruta -> System.out.println(fruta));
        System.out.println();
        /*
        .map(fruta -> fruta.toUpperCase()) pega cada fruta e a transforma na versão em maiúsculas.
        .forEach(...) percorre o resultado e imprime cada uma na tela, que é o que o enunciado pede.
        O println() vazio no final é a sua linha em branco de sempre.
         */

        List<String> cidades = List.of("São Paulo", "Santos", "Araraquara", "Salvador", "Curitiba", "São Carlos");
        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();
        System.out.println("Cidades com S: " + quantidade);
        System.out.println();
        /*
        .filter(cidade -> cidade.startsWith("S")) deixa passar só as cidades que começam com “S”.
        .count() conta quantas sobraram. Ele devolve um long, por isso a variável é long e não int.
        O println() vazio no final é a linha em branco de sempre.
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
