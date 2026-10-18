package org.example.Aula16102026;

public class Carrinho {

    private static Carrinho instancia;
    private int quantidadeItens = 0;

    private Carrinho(){

    }

    public static Carrinho getInstancia(){
        if (instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }


    public void adicionarItem() {
        quantidadeItens++;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
