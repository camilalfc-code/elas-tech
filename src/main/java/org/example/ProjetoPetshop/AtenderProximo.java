package org.example.ProjetoPetshop;

import java.util.ArrayDeque;

public class AtenderProximo {

    void executar(ArrayDeque<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Próximo da fila: " + fila.peek());
            String atendido = fila.poll();
            System.out.println("Atendendo " + atendido + "...");
            System.out.println("Fila agora: " + fila);
        }
        System.out.println();
    }
}
