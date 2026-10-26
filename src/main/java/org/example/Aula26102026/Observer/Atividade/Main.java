package org.example.Aula26102026.Observer.Atividade;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        Voo voo = new Voo();
        Passageiro passageiro = new Passageiro();

        voo.adicionarObservador(passageiro);
        voo.mudarStatus("Embarque iniciado");

        PainelAeroporto painel = new PainelAeroporto();
        voo.adicionarObservador(painel);
        voo.mudarStatus("Atrasado");
        System.out.println();

        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);
        estoque.setQuantidade(50);
        estoque.setQuantidade(30);

        System.out.println();
    }

}