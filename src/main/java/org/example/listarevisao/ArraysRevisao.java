package org.example.listarevisao;

import java.util.Scanner;

public class ArraysRevisao {
    static void main() {

    /*
    Arrays
    Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
    Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
    Com o mesmo array, calcule e imprima a soma e a média.
    Crie um array com 5 números e descubra qual é o maior.
    Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
    Mini-desafio — Crie um array com 5 nomes.
    Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.
    Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei".
    Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.
    */

        //Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[4]);
        System.out.println();

        //Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço
        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println();

        //Com o mesmo array, calcule e imprima a soma e a média.
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = (double) soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println();

        //Crie um array com 5 números e descubra qual é o maior
        int[] numeros = {12, 45, 7, 33, 21};
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println();

        //Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7
        int[] notasContar = {8, 5, 10, 4, 7};
        //Usei notasContar porque notas já existe nesse main (do exercício 2), e o Java não deixa repetir o nome
        int contador = 0;
        //int contador = 0; fica antes do for, e é o "placar" que começa zerado.
        for (int i = 0; i < notasContar.length; i++) {
            if (notasContar[i] >= 7) {
                contador++;
                //O for percorre todas as notas.
                // A cada volta, o if pergunta: "essa nota é maior ou igual a 7?".
                // Se for, o contador++ soma 1 no placar.
            }
        }
        System.out.println("Notas maiores ou iguais a 7: " + contador);
        System.out.println();

        //Mini-desafio — Crie um array com 5 nomes.
        //Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.
        //Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei".
        //Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.
        Scanner scanner = new Scanner(System.in);
        String[] nomesLista = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        //Usei nomesLista porque nomes já existe nesse main (do exercício 1).
        int posicao = -1;
        //int posicao = -1; é a variável da dica. Posição -1 não existe em array nenhum,
        // então serve bem como "ainda não encontrei".
        System.out.print("Digite um nome: ");
        String busca = scanner.nextLine();
        for (int i = 0; i < nomesLista.length; i++) {
            if (nomesLista[i].equals(busca)) {
                posicao = i;
            }
        }
        if (posicao == -1) {
            System.out.println("Esse nome não está na lista.");
        } else {
            System.out.println(busca + " está na posição " + posicao);
        }

    }
}
