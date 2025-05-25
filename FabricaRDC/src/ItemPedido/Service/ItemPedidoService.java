package ItemPedido.Service;


import ItemPedido.Entiny.ItemPedido;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemPedidoService {

    // Lista de itens do pedido do sistema
    private static final ArrayList<ItemPedido> itensPedido = new ArrayList<>();

    // Contador de ID automático
    private static int idCounter = 1;

    // Scanner para entrada de dados
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para cadastrar um novo item de pedido.
     */
    public static void cadastrarItemPedido() {
        System.out.print("ID do pedido: ");
        int pedidoId = Integer.parseInt(scanner.nextLine());

        System.out.print("ID do produto: ");
        int produtoId = Integer.parseInt(scanner.nextLine());

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.print("Preço unitário: ");
        double precoUnitario = Double.parseDouble(scanner.nextLine());

        System.out.print("Observação (opcional): ");
        String observacao = scanner.nextLine();

        // Cria objeto ItemPedido com dados fornecidos
        ItemPedido item = new ItemPedido(
                idCounter++,          // ID gerado automaticamente
                pedidoId,
                produtoId,
                quantidade,
                precoUnitario,
                observacao
        );

        itensPedido.add(item);  // Adiciona à lista de itens
        System.out.println("Item adicionado ao pedido com sucesso!");
    }

    /**
     * Método para retornar a lista de itens do pedido.
     * Útil para relatórios e listagens externas.
     */
    public static ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }
}

