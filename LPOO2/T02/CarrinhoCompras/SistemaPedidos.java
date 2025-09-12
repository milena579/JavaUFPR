import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();
        sistema.executar();
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1 : incluirPedido();
                case 2 : excluirPedido();
                case 3 : listarPedidos();
                case 4 : incluirItemEmPedido();
                case 5 : excluirItemDePedido();
                case 6 : imprimirPedidos();
                case 0 : System.out.println("Saindo do sistema...");
                default : System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Incluir Pedido");
        System.out.println("2 - Excluir Pedido por nome do cliente");
        System.out.println("3 - Listar Pedidos");
        System.out.println("4 - Incluir Item em Pedido");
        System.out.println("5 - Excluir Item de Pedido");
        System.out.println("6 - Imprimir lista de Pedidos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void incluirPedido() {
        System.out.print("Nome do cliente: ");
        String cliente = scan.nextLine();
        System.out.print("Valor total permitido: ");
        double limite = scan.nextDouble();
        scan.nextLine();
        try {
            Pedido pedido = new Pedido(cliente, limite);
            pedidos.add(pedido);
            System.out.println("Pedido incluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao incluir pedido: " + e.getMessage());
        }
    }

    private void excluirPedido() {
        System.out.print("Nome do cliente: ");
        String cliente = scan.nextLine();
        boolean removido = pedidos.removeIf(p -> p.getCliente().equalsIgnoreCase(cliente));
        if (removido) {
            System.out.println("Pedido removido.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    private void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.printf("Cliente: %s | Total atual: R$%.2f%n", p.getCliente(), p.calcularTotal());
        }
    }

    private void incluirItemEmPedido() {
        System.out.print("Nome do cliente: ");
        String cliente = scan.nextLine();
        Pedido pedido = buscarPedido(cliente);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.print("Nome do item: ");
        String nomeItem = scan.nextLine();
        System.out.print("Preço do item: ");
        double preco = scan.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = scan.nextInt();
        scan.nextLine();

        try {
            pedido.acrescentaItem(new ItemDePedido(nomeItem, preco, qtd));
            System.out.println("Item incluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void excluirItemDePedido() {
        System.out.print("Nome do cliente: ");
        String cliente = scan.nextLine();
        Pedido pedido = buscarPedido(cliente);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.print("Nome do item a remover: ");
        String nomeItem = scan.nextLine();
        pedido.retirarItem(nomeItem);
        System.out.println("Item removido (se existia).");
    }

    private void imprimirPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    private Pedido buscarPedido(String cliente) {
        for (Pedido p : pedidos) {
            if (p.getCliente().equalsIgnoreCase(cliente)) {
                return p;
            }
        }
        return null;
    }
}
