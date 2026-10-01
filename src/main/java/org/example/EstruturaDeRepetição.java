package org.example;

import java.util.Scanner;

public class EstruturaDeRepetição {
    static void main() {

        Scanner scanner = new Scanner(System.in);


        for (int i = 10; i >= 1; i -- ){
            System.out.println("Volta " + i);
        }


        int senha = 0;
        while (senha != 1234){
            System.out.println("Senha errada! Digite a senha correta ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso liberado");


    }
}
