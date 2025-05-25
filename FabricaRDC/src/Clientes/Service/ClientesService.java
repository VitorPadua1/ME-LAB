package Clientes.Service;

import Clientes.Entiny.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientesService {
    private ArrayList<Cliente> clientes;
    private Scanner scanner;
    private int idCounter;

    public ClientesService(Scanner scanner) {
        this.clientes = new ArrayList<>();
        this.scanner = scanner;
        this.idCounter = 1;
    }

    public void menuCliente() {
        int opcao;
        do {
            System.out.println("\n--- MENU CLIENTES ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> listarClientes();
                case 3 -> editarCliente();
                case 4 -> excluirCliente();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Data de Cadastro: ");
        String data = scanner.nextLine();

        Cliente cliente = new Cliente(idCounter++, nome, telefone, email, cpf, endereco, data);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    private void editarCliente() {
        System.out.print("ID do cliente a editar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Cliente c : clientes) {
            if (c.getId() == id) {
                System.out.print("Novo telefone: ");
                String tel = scanner.nextLine();
                System.out.print("Novo email: ");
                String email = scanner.nextLine();
                c.atualizarContato(tel, email);

                System.out.print("Novo endereço: ");
                String end = scanner.nextLine();
                c.atualizarEndereco(end);

                System.out.println("Cliente atualizado!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    private void excluirCliente() {
        System.out.print("ID do cliente a excluir: ");
        int id = Integer.parseInt(scanner.nextLine());
        clientes.removeIf(c -> c.getId() == id);
        System.out.println("Cliente excluído (se existia).");
    }

    // Método para obter a lista de clientes (se necessário para outras classes)
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}