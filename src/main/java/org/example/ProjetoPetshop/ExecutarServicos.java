package org.example.ProjetoPetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecutarServicos {

    void executar(Scanner sc, ArrayList<Servico> servicos) {
        System.out.print("Nome do pet: ");
        String nomeServico = sc.nextLine();

        for (Servico servico : servicos) {
            servico.executar(nomeServico);
        }

        System.out.println();
    }
}
