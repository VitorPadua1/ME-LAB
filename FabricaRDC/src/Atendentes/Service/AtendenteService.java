package Atendentes.Service;

import Atendentes.Entiny.Atendente;
import java.util.ArrayList;
import java.util.Scanner;

public class AtendenteService {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Atendente> atendentes = new ArrayList<>();
    private static int idCounter = 1;

    public static void cadastrarAtendente() {
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
        System.out.print("Setor: ");
        String setor = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Número de atendimentos já realizados: ");
        int atendimentos = Integer.parseInt(scanner.nextLine());
        System.out.print("Canal de atendimento (WhatsApp, Presencial, etc.): ");
        String canal = scanner.nextLine();

        Atendente atendente = new Atendente(
                idCounter++, nome, email, telefone, salario, dataAdmissao,
                setor, turno, login, senha, atendimentos, canal
        );

        atendentes.add(atendente);
        System.out.println("Atendente cadastrado com sucesso!");
    }
}
