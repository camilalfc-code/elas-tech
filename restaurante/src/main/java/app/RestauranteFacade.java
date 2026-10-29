package app;

import cardapio.*;
import pedido.GerenciadorPedidos;
import pedido.Pedido;

import java.util.Collection;
import java.util.HashSet;

public class RestauranteFacade {

    private GerenciadorPedidos gerenciador = new GerenciadorPedidos();

    public Pedido criarPedido(String nomeCliente) {
        return gerenciador.criarPedido(nomeCliente);
    }

    public Lanche criarLanche(int opcao) {
        switch (opcao) {
            case 1:
                return LancheFactory.xBurger();
            case 2:
                return LancheFactory.xSalada();
            case 3:
                return LancheFactory.xBacon();
            default:
                return null;
        }
    }

    public void adicionarItem(Pedido pedido, ItemCardapio item) {
        pedido.adicionarItem(item);
    }

    public ItemCardapio comCheddar(ItemCardapio item) {
        return new ComCheddar(item);
    }

    public ItemCardapio comBaconExtra(ItemCardapio item) {
        return new ComBaconExtra(item);
    }

    public Pedido buscarPedido(int numero) {
        return gerenciador.buscarPedido(numero);
    }

    public boolean removerItem(Pedido pedido, int posicao) {
        return pedido.removerItem(posicao);
    }

    public boolean cancelarPedido(int numero) {
        return gerenciador.cancelarPedido(numero);
    }

    public double calcularTotalDoDia() {
        return gerenciador.calcularTotalDoDia();
    }

    public HashSet<String> getCombinacoes() {
        return gerenciador.getCombinacoes();
    }

    public Collection<Pedido> getPedidos() {
        return gerenciador.getPedidos();
    }

}
