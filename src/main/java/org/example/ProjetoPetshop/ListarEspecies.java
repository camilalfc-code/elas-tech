package org.example.ProjetoPetshop;

import java.util.ArrayList;
import java.util.HashSet;

public class ListarEspecies {

    void executar(ArrayList<Pet> lista) {

        HashSet<String> especies = new HashSet<>();

        for (int i = 0; i < lista.size(); i++) {
            especies.add(lista.get(i).especie.toLowerCase());
        }

        System.out.println("--- ESPÉCIES CADASTRADAS ---");
        for (String esp : especies) {
            System.out.println("- " + esp);
        }
        System.out.println("Total de espécies diferentes: " + especies.size());
        System.out.println();
    }
}