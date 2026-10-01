package org.example;

public class ExercicioConcatenacao {
    static void main() {

        // 1 - Concatenação
        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade
                + " e tenho " + idade + " anos.");

        // 2 - Produto
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = preco * quantidade;

        System.out.println("Comprei " + quantidade + " unidades de " + produto
                + " por R$ " + preco + " cada. Total: R$ " + total);

        // 3 - Soma
        int numero1 = 15;
        int numero2 = 4;
        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2
                + " é igual a " + soma + ".");

        // 0 - Diferença entre concatenação e soma
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // O primeiro resultado é 22 porque o Java entende os números
        // como parte da concatenação depois que encontra o texto.
        // No segundo, os parênteses fazem a soma acontecer primeiro.

        // 1 - Operações com inteiros
        int a = 10;
        int b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // 2 - Operações com decimais
        double decimalA = 10;
        double decimalB = 3;

        System.out.println("Soma: " + (decimalA + decimalB));
        System.out.println("Subtração: " + (decimalA - decimalB));
        System.out.println("Multiplicação: " + (decimalA * decimalB));
        System.out.println("Divisão: " + (decimalA / decimalB));
        System.out.println("Resto: " + (decimalA % decimalB));

        // 3 - Notas
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        double somaNotas = nota1 + nota2 + nota3;
        double media = somaNotas / 3;

        System.out.println("A soma das notas é: " + somaNotas);
        System.out.println("A média das notas é: " + media);

        // 4 - a + b * c
        int valorA = 3;
        int valorB = 4;
        int valorC = 5;

        int resultado1 = valorA + valorB * valorC;

        System.out.println("O resultado de a + b * c é: " + resultado1);

        // 5 - (a + b) * c
        int resultado2 = (valorA + valorB) * valorC;

        System.out.println("O resultado de (a + b) * c é: " + resultado2);

        // Desafio
        int segundos = 3785;
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("3785 segundos correspondem a " + minutos
                + " minutos e " + segundosRestantes + " segundos.");
    }
}
