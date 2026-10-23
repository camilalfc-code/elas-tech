package org.example.Aula22102026.decorator;

public class Main {
    public static void main(String[] args) {
        //So cafe puro
        Cafe pedido1 = new CafeSimples();
        System.out.println(pedido1.getDescricao() + " = R$ " + pedido1.getPreco());

        // cafe com leite
        Cafe pedido2 = new ComLeite(new CafeSimples());
        System.out.println(pedido2.getDescricao() + " = R$ " + pedido2.getPreco());

        // cafe com leite E chocolate
        Cafe pedido3 = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println(pedido3.getDescricao() + " = R$ " + pedido3.getPreco());

        // cafe com chocolate E leite
        Cafe pedido4 = new ComLeite(new ComChocolate(new CafeSimples()));
        System.out.println(pedido4.getDescricao() + " = R$ " + pedido3.getPreco());

        System.out.println();

        // Açaí só com granola
        Acai acai1 = new Granola(new AcaiSimples());
        System.out.println(acai1.getDescricao());
        System.out.println("Preço: R$ " + acai1.getPreco());

        System.out.println();

        // Açaí com granola e morango
        Acai acai2 = new Morango(new Granola(new AcaiSimples()));
        System.out.println(acai2.getDescricao());
        System.out.println("Preço: R$ " + acai2.getPreco());

        System.out.println();

    }
}
