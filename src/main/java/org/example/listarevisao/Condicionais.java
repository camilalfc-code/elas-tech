package org.example.listarevisao;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Condicionais
        Peça a idade e diga se a pessoa é maior ou menor de idade.
        Peça um número e diga se ele é par ou ímpar.
        Peça dois números e diga qual é o maior. Se forem iguais, avise.
        Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
        Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
        Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
        Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais →
        Isósceles; todos diferentes → Escaleno.
        A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais — então,
        se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.
         */

        //Peça a idade e diga se a pessoa é maior ou menor de idade.
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
            }
        System.out.println();

        //Peça um número e diga se ele é par ou ímpar.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            //numero % 2 dá o resto da divisão por 2
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
            }
        System.out.println();

        //Peça dois números e diga qual é o maior. Se forem iguais, avise.
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("O maior é o primeiro: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior é o segundo: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        System.out.println();

        //Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
        System.out.println();

        //Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
        System.out.print("Escolha um sabor de 1 a 3: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Sabor: Chocolate");
                break;
            case 2:
                System.out.println("Sabor: Morango");
                break;
            case 3:
                System.out.println("Sabor: Baunilha");
                break;
            default:
                System.out.println("Opção inválida.");
        }
             System.out.println();

        //Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
        System.out.print("Digite sua idade: ");
        int idadeIngresso = scanner.nextInt();
        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            //O || quer dizer "ou": o resultado é true se pelo menos uma das condições for verdadeira.
            // Aqui, paga R$ 10 quem tem menos de 12 ou quem tem 60 ou mais.
        } else {
            System.out.println("Ingresso: R$ 25");
        }
        System.out.println();

        /*
        Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais →
        Isósceles; todos diferentes → Escaleno.
        A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais — então,
        se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.
        */
        System.out.print("Digite o lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o lado 3: ");
        double lado3 = scanner.nextDouble();
        if (lado1 == lado2 && lado2 == lado3) {
            //lado1 == lado2 && lado2 == lado3 testa se os três são iguais.
            // Se o 1 é igual ao 2 e o 2 é igual ao 3, então todos são iguais.
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            //lado1 == lado2 || lado1 == lado3 || lado2 == lado3 testa se pelo menos um par é igual.
            // Como o equilátero já foi pego no if de cima, quem chega aqui tem exatamente dois lados iguais.
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

    }
}
