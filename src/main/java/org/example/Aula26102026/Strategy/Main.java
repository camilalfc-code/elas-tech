package org.example.Aula26102026.Strategy;

public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra(new DescontoEstudante());

        System.out.println(compra.calcularPrecoFinal(100));
        // 90.0




        System.out.println(compra.calcularPrecoFinal(100));
        // 80.0
    }
}
