package Ingrediente.Service;

import Ingrediente.Entiny.Ingrediente;
import java.util.ArrayList;
import java.util.Scanner;

public class IngredienteService {

    // Lista onde os ingredientes serão armazenados
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    // Scanner para entrada de dados via terminal
    private static final Scanner scanner = new Scanner(System.in);

    // Contador de ID automático
    private static int idCounter = 1;

    /**
     * Método responsável por cadastrar um novo ingrediente no sistema.
     */
    public static void cadastrarIngrediente() {
        System.out.print("Nome do ingrediente: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade atual: ");
        double quantidade = Double.parseDouble(scanner.nextLine());

        System.out.print("Unidade de medida (ex: kg, g, L): ");
        String unidade = scanner.nextLine();

        System.out.print("Validade (ex: 2024-12-01): ");
        String validade = scanner.nextLine();

        System.out.print("Categoria (seco, perecível, etc.): ");
        String categoria = scanner.nextLine();

        System.out.print("Fornecedor: ");
        String fornecedor = scanner.nextLine();

        // Cria o objeto Ingrediente com os dados fornecidos
        Ingrediente ingrediente = new Ingrediente(
                idCounter++,
                nome,
                quantidade,
                unidade,
                validade,
                categoria,
                fornecedor
        );

        // Adiciona o ingrediente à lista
        ingredientes.add(ingrediente);
        System.out.println("Ingrediente cadastrado com sucesso!");
    }

    /**
     * Retorna a lista de ingredientes cadastrados.
     */
    public static ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
