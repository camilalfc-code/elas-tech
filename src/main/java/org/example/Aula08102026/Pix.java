package org.example.Aula08102026;

public class Pix implements MeioDePagamento {

    @Override
    public void pagar(double valor) {

        System.out.printf("Pagamento de R$ %.2f realizado via Pix.%n", valor);
    }
}
