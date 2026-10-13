package org.example.ProjetoPetshop;

public class Gato extends Pet {
    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}
