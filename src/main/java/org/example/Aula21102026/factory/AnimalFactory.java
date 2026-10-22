package org.example.Aula21102026.factory;

public class AnimalFactory {
    public static Animal getAnimal(String tipo) {
        if (tipo.equals("cachorro")) {
            return new Cachorro();
        } else if (tipo.equals("gato")) {
            return new Gato();
        }
        return null;
    }
}
