package Estoque.Service;

import Estoque.Entiny.Estoque;
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueService {

    // Lista onde os registros de estoque são armazenados
    private static final ArrayList<Estoque> estoques = new ArrayList<>();

    // Scanner para entrada de dados via terminal
    private static final Scanner scanner = new Scanner(System.in);

    // Contador de ID automático
    private static int idCounter = 1;

    /**
     * Método para cadastrar um novo registro de estoque.
     */
    public static void cadastrarEstoque() {
        System.out.print("Nome do ingrediente: ");
        String ingrediente = scanner.nextLine();

        System.out.print("Quantidade disponível: ");
        double quantidade = Double.parseDouble(scanner.nextLine());

        System.out.print("Data da última entrada (ex: 2024-10-01): ");
        String dataEntrada = scanner.nextLine();

        System.out.print("Lote: ");
        String lote = scanner.nextLine();

        System.out.print("Local de armazenamento: ");
        String local = scanner.nextLine();

        System.out.print("Tipo de controle (FIFO, Manual, etc.): ");
        String tipoControle = scanner.nextLine();

        // Cria o objeto Estoque com os dados inseridos
        Estoque estoque = new Estoque(
                idCounter++,
                ingrediente,
                quantidade,
                dataEntrada,
                lote,
                local,
                tipoControle
        );

        // Adiciona à lista
        estoques.add(estoque);
        System.out.println("Registro de estoque cadastrado com sucesso!");
    }

    /**
     * Retorna a lista de registros de estoque.
     */
    public static ArrayList<Estoque> getEstoques() {
        return estoques;
    }
}
