package org.example.Aula26102026.Strategy;

public class Compra {
    private Desconto desconto;

    public Compra(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoFinal(double valor) {
        return valor - desconto.calcularDesconto(valor);
    }
}
