package org.example.Aula23102026;

public class CalculadoraSimples {

    public int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
