package org.example.Aula08102026;

public class Boleto implements MeioDePagamento {

    @Override
    public void pagar(double valor) {

        System.out.printf("Boleto de R$ %.2f gerado.%n", valor);
    }
}
