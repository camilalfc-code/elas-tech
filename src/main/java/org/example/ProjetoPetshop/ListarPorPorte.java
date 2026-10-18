package org.example.ProjetoPetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class ListarPorPorte {

    void executar(Scanner sc, ArrayList<Pet> lista) {
        System.out.print("Qual porte (Pequeno, Médio ou Grande)? ");
        String porteBusca = sc.nextLine();

        boolean achouPorte = false;

        for (int i = 0; i < lista.size(); i++) {
            Pet p = lista.get(i);
            if (p.porte.equalsIgnoreCase(p.definirPorte())) {
                System.out.println(p.nome + " (" + p.especie + ") - " + p.peso + " kg - Porte " + p.porte);
                achouPorte = true;
            }
        }

        if (!achouPorte) {
            System.out.println("Nenhum pet desse porte.");
        }

        System.out.println();
    }
}
