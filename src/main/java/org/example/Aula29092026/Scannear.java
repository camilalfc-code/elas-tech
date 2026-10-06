package org.example.Aula29092026;

import java.util.Scanner;

public class Scannear {

    public static void main(String[] args) {

        Scanner coisinha = new Scanner(System.in);
        String nome;
        int idade;


        System.out.println("Escreva seu nome: ");
        nome = coisinha.nextLine();
        System.out.println("Seu nome é: " + nome);
        nome = coisinha.nextLine();

        System.out.println("Escreva sua idade: ");
        idade = coisinha.nextInt();
        System.out.println("Sua idade é: " + idade);
        idade = coisinha.nextInt();

    }

}
