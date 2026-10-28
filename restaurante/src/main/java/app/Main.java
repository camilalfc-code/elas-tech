package app;

import pedido.Pedido;

public class Main {

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        RestauranteFacade sistema = new RestauranteFacade();

        int opcao;
        do {
            menu.exibirMenu();
            opcao = menu.lerOpcao();

            switch (opcao) {

                case 1: {
                    Pedido pedido = sistema.criarPedido(menu.lerNomeCliente());
                    do {
                        int escolha = menu.lerOpcaoLanche();
                        if (!sistema.adicionarLanche(pedido, escolha)) {
                            menu.exibirMensagem("Opção inválida.");
                        }
                    } while (menu.perguntarMaisItem());
                    break;
                }

                case 2:
                    for (Pedido p : sistema.getPedidos()) {
                        menu.exibirPedido(p);
                    }
                    break;

                case 3: {
                    double total = sistema.calcularTotalDoDia();
                    menu.exibirFechamentoDoDia(total);
                    break;
                }
            }
        } while (opcao != 0);
    }
}