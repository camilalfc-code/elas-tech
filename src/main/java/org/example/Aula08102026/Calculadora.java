package org.example.Aula08102026;

public class Calculadora {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}

