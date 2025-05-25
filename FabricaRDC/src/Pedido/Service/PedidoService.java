package Pedido.Service;

import Pedido.Entiny.Pedido;
import java.util.ArrayList;
import java.util.Scanner;

public class PedidoService {

    // Lista de pedidos do sistema
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();

    // Contador de ID automático
    private static int idCounter = 1;

    // Scanner para entrada de dados
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para cadastrar um novo pedido.
     */
    public static void cadastrarPedido() {
        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Data do pedido (ex: 2024-10-01): ");
        String data = scanner.nextLine();

        System.out.print("Forma de pagamento: ");
        String forma = scanner.nextLine();

        // Cria objeto Pedido com dados fornecidos
        Pedido pedido = new Pedido(
                idCounter++,         // ID gerado automaticamente
                cliente,
                data,
                "Em produção",       // Status inicial do pedido
                0.0,                 // Valor total inicia como 0.0
                forma,
                false                // Pedido não entregue inicialmente
        );

        pedidos.add(pedido);  // Adiciona à lista de pedidos
        System.out.println("Pedido cadastrado com sucesso!");
    }

    /**
     * Método para retornar a lista de pedidos.
     * Útil para relatórios e listagens externas.
     */
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
