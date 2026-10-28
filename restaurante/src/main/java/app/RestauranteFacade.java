package app;

import cardapio.Lanche;
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
                lanche = new Lanche("X-Burger", 16.00);
                break;
            case 2:
                lanche = new Lanche("X-Salada", 18.00);
                break;
            case 3:
                lanche = new Lanche("X-Bacon", 22.00);
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
