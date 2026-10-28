package app;

import cardapio.Lanche;
import cardapio.LancheFactory;
import pedido.GerenciadorPedidos;
import pedido.Pedido;

import java.util.Collection;

public class RestauranteFacade {

    private GerenciadorPedidos gerenciador = new GerenciadorPedidos();

    public Pedido criarPedido(String nomeCliente) {
        return gerenciador.criarPedido(nomeCliente);
    }

    public boolean adicionarLanche(Pedido pedido, int opcao) {
        Lanche lanche;
        switch (opcao) {
            case 1:
                lanche = LancheFactory.xBurger();
                break;
            case 2:
                lanche = LancheFactory.xSalada();
                break;
            case 3:
                lanche = LancheFactory.xBacon();
                break;
            default:
                return false;
        }
        pedido.adicionarItem(lanche);
        return true;
    }

    public double calcularTotalDoDia() {
        return gerenciador.calcularTotalDoDia();
    }

    public Collection<Pedido> getPedidos() {
        return gerenciador.getPedidos();
    }

}
