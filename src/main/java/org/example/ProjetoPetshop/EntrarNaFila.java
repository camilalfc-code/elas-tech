package org.example.ProjetoPetshop;

import java.util.ArrayDeque;
import java.util.Scanner;

public class EntrarNaFila {

    void executar(Scanner sc, ArrayDeque<String> fila) {
        System.out.print("Nome do pet pra entrar na fila: ");
        String nomeFila = sc.nextLine();
        fila.add(nomeFila);
        System.out.println(nomeFila + " entrou na fila.");
        System.out.println("Fila agora: " + fila);
        System.out.println();
    }
}
