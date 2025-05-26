package Produto.Service;

import Produto.Entiny.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {

    // Lista de produtos e controle de ID
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int idCounter = 1;

    // Scanner compartilhado
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Menu interativo para operações de produto.
     */
    public static void menuProduto() {
        int opcao;
        do {
            System.out.println("\n--- MENU PRODUTOS ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Editar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> listar(produtos);
                case 3 -> editarProduto();
                case 4 -> excluirProduto();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    /**
     * Cadastra um novo produto com dados do usuário.
     */
    public static void cadastrarProduto() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sabor: ");
        String sabor = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Validade: ");
        String validade = scanner.nextLine();
        System.out.print("Quantidade disponível: ");
        int qtd = Integer.parseInt(scanner.nextLine());

        Produto produto = new Produto(idCounter++, nome, sabor, preco, tipo, validade, qtd);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    /**
     * Permite editar o preço e o estoque de um produto existente.
     */
    public static void editarProduto() {
        System.out.print("ID do produto a editar: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Produto p : produtos) {
            if (p.getId() == id) {
                System.out.print("Novo preço: ");
                double novoPreco = Double.parseDouble(scanner.nextLine());
                p.atualizarPreco(novoPreco);
                System.out.print("Ajuste de estoque (+/-): ");
                int ajuste = Integer.parseInt(scanner.nextLine());
                p.ajustarEstoque(ajuste);
                System.out.println("Produto atualizado!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    /**
     * Remove um produto da lista com base no ID.
     */
    public static void excluirProduto() {
        System.out.print("ID do produto a excluir: ");
        int id = Integer.parseInt(scanner.nextLine());
        produtos.removeIf(p -> p.getId() == id);
        System.out.println("Produto excluído (se existia).");
    }

    /**
     * Método genérico para listar qualquer lista.
     */
    public static <T> void listar(ArrayList<T> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            for (T item : lista) {
                System.out.println(item);
            }
        }
    }

    /**
     * Retorna a lista de produtos (caso precise acessar fora).
     */
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
