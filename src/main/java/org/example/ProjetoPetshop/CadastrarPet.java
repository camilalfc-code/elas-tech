package org.example.ProjetoPetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarPet {

    void executar(Scanner sc, ArrayList<Pet> lista) {
        String nome = Petshop.lerTexto(sc, "Nome do pet: ");
        String especie = Petshop.lerTexto(sc, "Espécie: ");
        double peso = Petshop.lerPeso(sc, "Peso (kg): ");

        Pet pet = criarPet(especie);
        pet.nome = nome;
        pet.especie = especie;
        pet.peso = peso;
        pet.porte = pet.definirPorte();

        lista.add(pet);
        System.out.println("Pet cadastrado! Agora são " + lista.size() + " pet(s).");
        System.out.println();
    }

    private Pet criarPet(String especie) {
        if (especie.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        } else if (especie.equalsIgnoreCase("gato")) {
            return new Gato();
        }
        return new Pet();
    }
}
