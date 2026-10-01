package org.example;

import java.util.Scanner;

public class AulaArrays {
    static void main() {

        //Aula

        //int[] notas = {3, 4, 7, 9, 10, 12, 88, 4};
        // aqui é quando eu tenho as notas

        //int[] outrasNotas = new int[3];
        // aqui é quando eu vou importar as notas
        // 3 pq são 3 notas

        //System.out.println(notas[4]);
        // [4] indica a posição da variavel que ele vai retornar
        // a quarta variavel é a nota 10
        //pq começa do 0, então a 1 posição é contada como 0 que é o 3
        //System.out.println();

        //System.out.println(notas.length);
        // retorna 8, porque são 8 variaveis
        // mostra o tamamho da array
        //System.out.println();

        //for(int i=0; i< notas.length; i++){
            //System.out.println(notas[i]);
        //}
        //roda o codigo, comecando da primeira posição 0 int i=0
        // i<notas.length fala pro codigo ir ate  seu tamanho final
        // i++ fala pra ele ir de um mais um
        // System.out.println(notas[i]) roda todas as variaveis i


        // Exercicio

        Scanner scanner = new Scanner(System.in);

        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[4]);
        System.out.println();

        //String[] quer dizer "array de textos".
        // Antes a gente usou int[] pra números, agora são nomes, então é String[].
        //A posição começa do zero, igual no charAt(0): o primeiro é [0], o terceiro é [2] e o último é [4].


        //2 — Crie um array com as notas {8, 6, 10, 7, 9}.
        // Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println();

        //for (int i = 0; i < notas.length; i++)
        // repete o bloco enquanto i for menor que o tamanho do array.
        // O i começa em 0 e vai subindo de 1 em 1 até chegar em 4.
        //notas[i] pega o valor da posição i a cada volta.
        //(i + 1) é porque o i começa em 0, mas o exemplo pede "Nota 1".
        // Os parênteses são importantes: sem eles, o Java juntaria o texto com i e depois com 1, e sairia Nota 01.


        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println();

        //int soma = 0; cria a variável que vai acumular o total, começando do zero.
        //Dentro do laço, soma = soma + notas[i]; pega o que já tinha na soma e adiciona a nota da vez.
        // Assim, volta por volta, ela vai juntando todas as notas.
        //notas.length é o tamanho do array (5), então a média é a soma dividida por 5.
        //(double) na frente do soma serve pra que a divisão dê um número com vírgula.
        // Sem ele, o Java faria uma divisão de inteiros e cortaria a parte decimal.
        //Não precisa criar o array notas de novo, porque ele já existe da questão 2.


        // 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("De trás pra frente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        //Antes de rodar, confere se o Scanner existe nesse arquivo.
        // Se você estiver em um arquivo novo, precisa do import java.util.Scanner;
        // no topo e do Scanner scanner = new Scanner(System.in); dentro do main.

        //new int[5] cria um array com 5 espaços vazios (começam valendo 0), pra gente preencher depois.
        //O primeiro laço roda de 0 a 4 e, a cada volta, pede um número e guarda na posição i com
        // numeros[i] = scanner.nextInt();.
        //nextInt() lê um número inteiro digitado (diferente do nextLine(), que lê texto).
        //O segundo laço faz o caminho inverso: começa em numeros.length - 1 (que é 4, a última posição),
        // e a cada volta faz i-- (diminui 1) até chegar em 0. O i >= 0 garante que o 0 também entra.


        /*
        Referência:
        int[]
        notas = {8, 6, 10, 7, 9};
        int[] notas = new int[5]
        •for(int i = 0; i
        < notas.length;
        i++){
        System.out.println(notas[i]);
        }
         */

    }


}
