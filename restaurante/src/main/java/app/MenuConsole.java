package app;

import cardapio.ItemCardapio;
import pedido.Pedido;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConsole {

    private Scanner sc = new Scanner(System.in);

    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Entrada inválida. Digite apenas números.");
            }
        }
    }

    public void exibirMenu() {
        System.out.println("=== RESTAURANTE ===");
        System.out.println("1 - Registrar novo pedido");
        System.out.println("2 - Listar pedidos do dia");
        System.out.println("3 - Fechar restaurante");
        System.out.println("4 - Modificar pedido");
        System.out.println("0 - Sair");
        System.out.println();
    }

    public void exibirMenuModificacao() {
        System.out.println("=== MODIFICAR PEDIDO ===");
        System.out.println("1 - Acrescentar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Cancelar pedido");
        System.out.println("0 - Voltar");
        System.out.println();
    }

    public int lerOpcao() {
        return lerInteiro("Escolha uma opção: ");
    }


    public String lerNomeCliente() {
        System.out.print("Nome do cliente: ");
        return sc.nextLine();
    }

    public int lerNumeroPedido() {
        return lerInteiro("Número do pedido: ");
    }

    public int lerOpcaoLanche() {
        System.out.println("=== CARDÁPIO ===");
        System.out.println("1 - X-Burger - R$ 16,00");
        System.out.println("2 - X-Salada - R$ 18,00");
        System.out.println("3 - X-Bacon - R$ 22,00");
        return lerInteiro("Qual lanche você quer? ");
    }

    public boolean perguntarMaisItem() {
        System.out.print("Deseja adicionar mais um item? (s/n): ");
        String resposta = sc.nextLine();
        return resposta.equalsIgnoreCase("s");
    }

    public boolean perguntarRetirar(String ingrediente) {
        System.out.print("Retirar " + ingrediente + "? (s/n): ");
        String resposta = sc.nextLine();
        return resposta.equalsIgnoreCase("s");
    }

    public boolean perguntarAdicional(String adicional, double valor) {
        System.out.print("Adicionar " + adicional + " (+ R$ " + String.format("%.2f", valor) + ")? (s/n): ");
        String resposta = sc.nextLine();
        return resposta.equalsIgnoreCase("s");
    }

    public void exibirPedido(Pedido pedido) {
        System.out.println("--- Pedido #" + pedido.getNumero() + " ---");
        System.out.println("Cliente: " + pedido.getNomeCliente());
        for (ItemCardapio item : pedido.getItens()) {
            System.out.printf("- %s: R$ %.2f%n", item.getDescricao(), item.getPreco());
        }
        System.out.printf("Total: R$ %.2f%n", pedido.calcularTotal());
        System.out.println();
    }

    public void exibirItensNumerados(Pedido pedido) {
        int numero = 1;
        for (ItemCardapio item : pedido.getItens()) {
            System.out.printf("%d - %s: R$ %.2f%n", numero, item.getDescricao(), item.getPreco());
            numero++;
        }
    }

    public int lerNumeroItem() {
        return lerInteiro("Número do item: ");
    }

    public void exibirFechamentoDoDia(double total, HashSet<String> combinacoes) {
        System.out.println("=== FECHAMENTO DO DIA ===");
        System.out.printf("Total vendido: R$ %.2f%n", total);
        System.out.println("Combinações diferentes: " + combinacoes.size());
        for (String combinacao : combinacoes) {
            System.out.println("- " + combinacao);
        }
        System.out.println();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
