package org.example.Aula22102026.decorator;

public class Morango extends AcaiDecorator {

    public Morango(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.50;
    }

    public static void main(String[] args) {

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
