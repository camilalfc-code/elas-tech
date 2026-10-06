package org.example.listarevisao04102026;

import java.util.Scanner;

public class Loops {
    static void main() {

        Scanner scanner = new Scanner(System.in);

    /*
    Imprima os números de 1 a 20, um por linha.
    Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
    Peça um número e mostre a tabuada dele de 1 a 10.
    Imprima só os números pares de 1 a 30.
    Usando for, some todos os números de 1 a 100 e mostre o resultado.
    Refaça o primeiro exercício com while. Compare os dois códigos.
    Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
    Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:
    Digite a altura: 5 * ** *** **** *****
    Você vai precisar de um laço dentro do outro. O de fora controla a linha; o de dentro
    imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.
     */

        //Imprima os números de 1 a 20, um por linha.
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");
        System.out.println();


        //Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();

        // Imprima só os números pares de 1 a 30.
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //Usando for, some todos os números de 1 a 100 e mostre o resultado.
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 a 100 é: " + soma);
        System.out.println();

        //Refaça o primeiro exercício com while. Compare os dois códigos.
        int contador = 1;
        while (contador <= 20) {
            System.out.println(contador);
            contador++;
        }
        System.out.println();

        //Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
        int energia = 3;
        do {
            System.out.println("Jogando...");
            energia--;
        } while (energia > 0);
        //O do { ... } while (...) é igual ao while, mas com uma diferença:
        // ele executa o bloco primeiro e só depois testa a condição.
        // Por isso o do while roda pelo menos uma vez, mesmo que a condição já comece falsa.
        System.out.println();

        //Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:
        //Digite a altura: 5 * ** *** **** *****
        //Você vai precisar de um laço dentro do outro. O de fora controla a linha; o de dentro
        //imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        for (int linha = 1; linha <= altura; linha++) {
            //O for de fora (linha) roda de 1 até a altura, uma volta por linha do triângulo.
            for (int coluna = 1; coluna <= linha; coluna++) {
                //O for de dentro (coluna) roda de 1 até o número da linha atual, então a quantidade de asteriscos
                // cresce junto com a linha. Na linha 3, ele roda 3 vezes.
                System.out.print("*");
                //O print("*") não pula linha, então os asteriscos ficam lado a lado.
            }
            System.out.println();
        }

    }

}
