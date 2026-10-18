package org.example.ProjetoPetshop;

import java.util.ArrayList;

    public class ListarPets {

        void executar(ArrayList<Pet> lista) {
            if (lista.isEmpty()) {
                System.out.println("Nenhum pet cadastrado.");
            } else {
                System.out.println("--- PETS CADASTRADOS ---");
                for (int i = 0; i < lista.size(); i++) {
                    Pet p = lista.get(i);
                    System.out.println(p.nome + " (" + p.especie + ") - " + p.peso + " kg - Porte " + p.porte);
                    p.emitirSom();
                    if (p instanceof Cachorro) {
                        Cachorro c = (Cachorro) p;
                        c.buscarBolinha();
                    }
                }
                Petshop.mostrar(lista.get(0));
                System.out.println("---");
                Petshop.mostrar(lista.get(0), "=== FICHA DO PET ===");
            }
            System.out.println();
        }
    }
