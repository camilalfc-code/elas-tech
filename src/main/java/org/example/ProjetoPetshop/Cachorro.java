package org.example.ProjetoPetshop;

public class Cachorro extends Pet {

    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }

    void buscarBolinha() {
        System.out.println(nome + " foi buscar a bolinha!");
    }

}
