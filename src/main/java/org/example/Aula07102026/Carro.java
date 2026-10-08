package org.example.Aula07102026;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }
}
