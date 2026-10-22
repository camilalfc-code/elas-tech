package org.example.Aula21102026.builder;

public class Main {

    static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
        .borda("catupiry")
        .sabor ("mussarela")
        .temQueijo(true)
                .build();

    }
}
