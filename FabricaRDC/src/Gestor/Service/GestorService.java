package Gestor.Service;

import Gestor.Entiny.Gestor;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorService {

    // Lista de gestores cadastrados
    private static final ArrayList<Gestor> gestores = new ArrayList<>();

    // Scanner para entrada de dados
    private static final Scanner scanner = new Scanner(System.in);

    // Contador automático de IDs
    private static int idCounter = 1;

    /**
     * Método para cadastrar um novo gestor no sistema.
     */
    public static void cadastrarGestor() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.print("Data de Admissão (ex: 2024-08-01): ");
        String dataAdmissao = scanner.nextLine();

        System.out.print("Nível de Acesso: ");
        String nivel = scanner.nextLine();

        System.out.print("Área Gerenciada (ex: Estoque, Atendimento): ");
        String area = scanner.nextLine();

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Formação: ");
        String formacao = scanner.nextLine();

        System.out.print("Tempo de casa (em anos): ");
        int tempo = Integer.parseInt(scanner.nextLine());

        System.out.print("Pode autorizar reposição? (true/false): ");
        boolean podeAutorizar = Boolean.parseBoolean(scanner.nextLine());

        // Criação do objeto Gestor
        Gestor gestor = new Gestor(
                idCounter++, nome, email, telefone, salario, dataAdmissao,
                nivel, area, login, senha, formacao, tempo, podeAutorizar
        );

        // Adiciona à lista
        gestores.add(gestor);
        System.out.println("Gestor cadastrado com sucesso!");
    }

    /**
     * Retorna a lista de gestores cadastrados.
     */
    public static ArrayList<Gestor> getGestores() {
        return gestores;
    }
}
