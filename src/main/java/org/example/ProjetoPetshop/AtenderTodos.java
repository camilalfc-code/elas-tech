package org.example.ProjetoPetshop;

import java.util.ArrayDeque;

public class AtenderTodos {

    void executar(ArrayDeque<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            while (!fila.isEmpty()) {
                String atendido = fila.poll();
                System.out.println("Atendendo " + atendido + "...");
            }
            System.out.println("Fila vazia, todos foram atendidos!");
        }
        System.out.println();
    }
}
