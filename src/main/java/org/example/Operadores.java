package org.example;

public class Operadores {
    static void main() {

        int numero1 = 10;
        int numero2 = 5;
        int resultado = 0;

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(resultado);

        System.out.println("Depois da operação");
        resultado = numero1 + numero2;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(resultado);

        numero2 = 20;
        System.out.println(numero2);
        resultado = numero1 + numero2;
        System.out.println(resultado);

        resultado = numero1 - numero2;
        System.out.println(resultado);

        resultado = numero1 / numero2;
        System.out.println(resultado);

        resultado = numero1 * numero2;
        System.out.println(resultado);

        resultado = numero1 % numero2;
        System.out.println(resultado);

    }
}
