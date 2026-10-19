package org.example.ProjetoPetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPet {

    void executar(Scanner sc, ArrayList<Pet> lista) {
        System.out.print("Qual pet você procura? ");
        String busca = sc.nextLine();

        boolean achou = false;

        for (int i = 0; i < lista.size(); i++) {
            Pet p = lista.get(i);
            if (p.nome.equalsIgnoreCase(busca)) {
                System.out.println("Encontrado: " + p.nome + " (" + p.especie + ") - " + p.peso + " kg");
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Pet não encontrado.");
        }

        System.out.println();
    }
}
