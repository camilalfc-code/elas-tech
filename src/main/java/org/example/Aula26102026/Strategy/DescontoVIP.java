package org.example.Aula26102026.Strategy;

public class DescontoVIP {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}
