package app;

import cardapio.Lanche;
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
                    adicionarItens(menu, sistema, pedido);
                    break;
                }

                case 2:
                    for (Pedido p : sistema.getPedidos()) {
                        menu.exibirPedido(p);
                    }
                    break;

                case 3: {
                    double total = sistema.calcularTotalDoDia();
                    menu.exibirFechamentoDoDia(total, sistema.getCombinacoes());
                    break;
                }

                case 4: {
                    int numero = menu.lerNumeroPedido();
                    Pedido pedido = sistema.buscarPedido(numero);

                    if (pedido == null) {
                        menu.exibirMensagem("Pedido não encontrado.");
                    } else {
                        int opcaoMod;
                        do {
                            menu.exibirMenuModificacao();
                            opcaoMod = menu.lerOpcao();

                            switch (opcaoMod) {
                                case 1:
                                    adicionarItens(menu, sistema, pedido);
                                    break;
                                case 2: {
                                    menu.exibirItensNumerados(pedido);
                                    int posicao = menu.lerNumeroItem();
                                    if (sistema.removerItem(pedido, posicao)) {
                                        menu.exibirMensagem("Item removido.");
                                    } else {
                                        menu.exibirMensagem("Item inválido.");
                                    }
                                    break;
                                }
                                case 3: {
                                    double total = sistema.calcularTotalDoDia();
                                    menu.exibirFechamentoDoDia(total, sistema.getCombinacoes());
                                    break;
                                }
                            }
                        } while (opcaoMod != 0);
                    }
                    break;
                }
            }
        } while (opcao != 0);
    }

    private static void adicionarItens(MenuConsole menu, RestauranteFacade sistema, Pedido pedido) {
        do {
            int escolha = menu.lerOpcaoLanche();
            Lanche lanche = sistema.criarLanche(escolha);

            if (lanche == null) {
                menu.exibirMensagem("Opção inválida.");
            } else {
                if (menu.perguntarRetirar("queijo")) lanche.setQueijo(false);
                if (menu.perguntarRetirar("alface")) lanche.setAlface(false);
                if (menu.perguntarRetirar("tomate")) lanche.setTomate(false);
                if (menu.perguntarRetirar("cebola")) lanche.setCebola(false);
                sistema.adicionarItem(pedido, lanche);
            }
        } while (menu.perguntarMaisItem());
    }

}