package org.example.listarevisao;

public class Operadores {
    public static void main() {



    /*
    Operadores
    Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
    Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
    Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
    Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
    Crie um número e imprima o resto da divisão dele por 2.
    Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
    Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta:
    esse número é divisível por 3 e por 5 ao mesmo tempo?
    Uma comparação já produz true ou false sozinha — não precisa de if pra isso.
    E um número é divisível por outro quando o resto da divisão é zero.
     */

        //Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
        int a = 15;
        int b = 4;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
        //% é o operador de resto
        System.out.println();

        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
        int saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: " + saldo);
        System.out.println();

        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
        a = 10;
        b = 10;
        System.out.println("A é igual a B: " + (a == b));
        System.out.println("A é diferente de B: " + (a != b));
        System.out.println("A é maior que B: " + (a > b));
        System.out.println("A é maior ou igual a B: " + (a >= b));
        System.out.println();

        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
        int idade = 20;
        boolean temCarteira = true;
        System.out.println("Pode dirigir? " + (idade >= 18 && temCarteira));
        //&& quer dizer "e": o resultado só é true se as duas condições forem verdadeiras.
        System.out.println();

        //Crie um número e imprima o resto da divisão dele por 2.
        int numero = 17;
        System.out.println("Resto da divisão por 2: " + (numero % 2));
        //numero % 2 dá o resto da divisão por 2
        System.out.println();

        //Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
        int pacotes = 3;
        double precoPacote = 5.50;
        double total = pacotes * precoPacote;
        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.println();

        //Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta:
        //esse número é divisível por 3 e por 5 ao mesmo tempo?
        //Uma comparação já produz true ou false sozinha — não precisa de if pra isso.
        //E um número é divisível por outro quando o resto da divisão é zero.
        int valor = 30;
        boolean divisivel = valor % 3 == 0 && valor % 5 == 0;
        //valor % 3 == 0 pergunta: "o resto da divisão por 3 é zero?". Se for, o número é divisível por 3.
        //valor % 5 == 0 faz a mesma pergunta pro 5.
        //O && junta as duas, e o resultado só é true se as duas forem verdadeiras.
        //A conta toda já devolve true ou false, então vai direto pra variável boolean, sem if.
        System.out.println("É divisível por 3 e por 5? " + divisivel);
        System.out.println();

    }
}
