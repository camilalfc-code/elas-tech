package listarevisao;

import java.util.Scanner;

 public class ScannerRevisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        Pergunte dois números e mostre a soma.
        Pergunte a altura e o peso e imprima os dois numa frase.
        Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        Depois imprima tudo numa ficha.
        Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome.
        Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás.
        O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.
        */

        //Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.println();

        //Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        System.out.print("Qual é a sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("No próximo aniversário você vai fazer " + (idade + 1) + " anos.");
        System.out.println();

        //Pergunte dois números e mostre a soma.
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println();

        //Pergunte a altura e o peso e imprima os dois numa frase.
        System.out.print("Qual é a sua altura (em metros)? ");
        double altura = scanner.nextDouble();
        System.out.print("Qual é o seu peso (em kg)? ");
        double peso = scanner.nextDouble();
        System.out.printf("Você tem %.2f m de altura e pesa %.1f kg.%n", altura, peso);
        System.out.println();

        //Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        //Depois imprima tudo numa ficha.
        //Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome.
        //Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás.
        //O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.
        System.out.print("Digite a idade: ");
        int idadeFicha = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nomeFicha = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidadeFicha = scanner.nextLine();
        System.out.println("=== FICHA ===");
        System.out.println("Nome: " + nomeFicha);
        System.out.println("Idade: " + idadeFicha);
        System.out.println("Cidade: " + cidadeFicha);

        /*
        Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome.4
        A pergunta do nome foi pulada: o programa não esperou você digitar e já foi pra cidade.
        Por que aconteceu:
        Quando você digitou 4 e apertou Enter, o teclado mandou duas coisas: o número 4 e o Enter (uma "quebra de linha").
        O nextInt() pegou só o 4 e deixou o Enter pra trás.
        O nextLine() seguinte leu até o próximo Enter.
        Como o Enter já estava lá esperando, ele achou que você tinha digitado nada e seguiu em frente.
        Por isso o nome ficou vazio, e a cidade acabou sendo a primeira que o programa deixou você digitar.
        Como consertar: coloca um scanner.nextLine(); logo depois do nextInt(), só pra "comer" o Enter que sobrou.
        Não precisa guardar em variável.
        */

    }
}
