package org.example;

import java.util.Scanner;

public class AulaString {
    static void main() {

        //String nome = "Camila";

        //System.out.println(nome.toUpperCase());
        //imprime na tela o nome com letras maisculas

        //System.out.println(nome.toLowerCase());
        //imprime na tela o nome com letras minusculas

        //System.out.println(nome.charAt(0));
        //imprime na tela a primeira letra do nome
        //pq? pq o 0zero é a primeira letra
        //conta do 0 e não do 1

        //System.out.println(nome.contains("Camila"));
        //imprime na tela se o nome escrito é o nome que foi armazenado na string nome
        //como nesse caso foi ele retorna verdadeiro
        //se fosse outro nome ia retornar falso

        //System.out.println(nome.substring(0,4));
        //imprime na tela o intervalo de posições infomadas
        //c - 0
        //a - 1
        //m - 2
        //i - 3
        //retona Cami, as posições de 0 a 4

        //System.out.println(nome.replace("mi", "me"));
        //imprime na tela o troca de nome solicitado
        //era Camila
        //pedi pra trocar o mi por me
        //ai retornou Camela

        //System.out.println(" oi ".trim());
        //imprime na tela o que esta escrito entre aspas

        //System.out.println(nome.equals("Camila"));
        //imprime na tela o resultado da comparação
        //se eu tivesse escrito camila em minusculo ele iria dar false

        //System.out.println(nome.equalsIgnoreCase("Camila"));
       //imprime na tela se o nome esta correto ignorando maiusculas e minusculas


        //Exercicio

        /*
        Passo 1: pra pedir coisas pro usuário digitar, a gente precisa do Scanner.
        Colocar o import lá no topo do arquivo
        E dentro do main, cria o scanner
        */

        Scanner scanner = new Scanner(System.in);

        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        System.out.print("Digite seu nome completo: ");
        //Mostra a mensagem na tela pro usuário saber o que digitar.
        //A diferença pro println é que o print não pula linha, então o cursor fica logo depois do texto,
        //e a pessoa digita na mesma linha.

        String nome = scanner.nextLine();
        System.out.println("Seu nome tem " + nome.length() + " letras");
        //scanner.nextLine() fica esperando a pessoa digitar e apertar Enter,
        // e pega a linha inteira, com os espaços.
        // (Se fosse next(), pegaria só até o primeiro espaço, e você perderia o sobrenome.)
        //String nome = ... guarda o que foi digitado numa variável chamada nome, do tipo String (texto).

        //nome.length() devolve a quantidade de caracteres do texto, contando os espaços, que é o que a questão pede.

        //Os + servem pra juntar (concatenar) os pedaços:
        // o texto "Seu nome tem ", o número que o length() devolveu e o texto " letras".

        //O println imprime tudo e pula linha no final.
        //Exemplo: se você digitar Maria Silva, vai aparecer Seu nome tem 11 letras (10 letras + 1 espaço).

        System.out.println();


        //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

        System.out.print("Digite seu nome: ");
        //Mostra a mensagem pedindo o nome.
        // Como é print (sem o ln), o cursor fica na mesma linha e a pessoa digita logo depois do texto

        String nome2 = scanner.nextLine();
        //Espera a pessoa digitar e apertar Enter, pega a linha inteira e guarda na variável nome2.
        // Usei nome2 porque nome já foi usado na questão 1, e o Java não aceita duas variáveis com o mesmo
        // nome no mesmo lugar.

        System.out.println("Maiúsculo: " + nome2.toUpperCase());
        //nome2.toUpperCase() devolve uma versão do texto com todas as letras em maiúsculo.
        //O + junta o texto "Maiúsculo: " com o resultado.
        //O println imprime e pula linha.

        System.out.println("Minúsculo: " + nome2.toLowerCase());
        //Igual à anterior, mas com toLowerCase(), que devolve tudo em minúsculo.

        //Um detalhe importante: toUpperCase() e toLowerCase() não alteram a variável nome2.
        // Eles devolvem um texto novo, e o nome2 continua do jeito que a pessoa digitou.
        // Por isso dá pra usar os dois em seguida sem um estragar o outro.

        System.out.println();


        //3 — Peça o nome da pessoa e mostre a primeira letra dele.

        System.out.print("Digite seu nome: ");
        String nome3 = scanner.nextLine();

        System.out.println("Primeira letra: " + nome3.charAt(0));
        //charAt(0) devolve o caractere que está na posição 0.
        // No Java a contagem começa do zero, então a posição 0 é a primeira letra.
        //Exemplo: se digitar Maria, aparece Primeira letra: M.

        System.out.println();


        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        //Digite uma frase: Estou aprendendo Java
        //Digite uma palavra: Java
        //A palavra aparece na frase? true

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
        //Aqui os nomes das variáveis são novos (frase e palavra), então não tem conflito com as anteriores.
        //contains(palavra) devolve true se o texto da palavra aparece dentro da frase, e false se não aparece.
        //Exemplo: frase Estou aprendendo Java e palavra Java → aparece A palavra aparece na frase? true.
        //Um detalhe: o contains diferencia maiúsculas de minúsculas. Se você digitar java (minúsculo), vai dar false.

        System.out.println();


        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        // Digite de novo: ANA
        //Os nomes são iguais? true


        System.out.print("Digite seu nome: ");
        String nomeA = scanner.nextLine();

        System.out.print("Digite de novo: ");
        String nomeB = scanner.nextLine();

        System.out.println("Os nomes são iguais? " + nomeA.equalsIgnoreCase(nomeB));
        //Usei nomeA e nomeB porque são nomes novos, sem conflito com os anteriores.
        //equalsIgnoreCase(nomeB) compara os dois textos sem se importar com maiúsculas e minúsculas.
        // Devolve true se forem iguais e false se forem diferentes.
        //Exemplo: Ana e ANA → aparece Os nomes são iguais? true.
        //Um detalhe: se fosse equals em vez de equalsIgnoreCase, Ana e ANA dariam false, porque o equals
        // diferencia maiúsculas de minúsculas.

       /*
        Referência:
        String nome = "Maria Silva";
        nome.length();                 // 11
        nome.toUpperCase();            // MARIA SILVA
        nome.toLowerCase();            // maria silva
        nome.contains("Silva");        // true
        nome.charAt(0);                // M
        nome.substring(0, 5);          // Maria
        nome.replace("Silva","Souza"); // Maria Souza
        "  oi
        ".trim();               // "oi"
        nome.equals("maria silva");           // false
        nome.equalsIgnoreCase("maria silva"); // true
         */


    }
}
