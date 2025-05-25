import java.util.Scanner;
import Clientes.Service.ClientesService;
import Atendentes.Service.AtendenteService;
import Estoque.Service.EstoqueService;
import Gestor.Service.GestorService;
import Ingrediente.Service.IngredienteService;
import ItemPedido.Service.ItemPedidoService;
import Pedido.Service.PedidoService;
import Produto.Service.ProdutoService;
import Relatorio.Service.RelatorioService;


public class Main {
    static Scanner scanner = new Scanner(System.in);


    static ClientesService clientesService = new ClientesService(scanner);


    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU RIO DOS COOKIES =====");
            System.out.println("1. Menu Cliente");
            System.out.println("2. Menu Produto");
            System.out.println("3. Cadastrar Pedido");
            System.out.println("4. Cadastrar Ingrediente");
            System.out.println("5. Cadastrar Estoque");
            System.out.println("6. Cadastrar Atendente");
            System.out.println("7. Cadastrar Gestor");
            System.out.println("8. Cadastrar Item de Pedido");
            System.out.println("9. Gerar Relatório");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> clientesService.menuCliente();
                case 2 -> ProdutoService.menuProduto();
                case 3 -> PedidoService.cadastrarPedido();
                case 4 -> IngredienteService.cadastrarIngrediente();
                case 5 -> EstoqueService.cadastrarEstoque();
                case 6 -> AtendenteService.cadastrarAtendente();
                case 7 -> GestorService.cadastrarGestor();
                case 8 -> ItemPedidoService.cadastrarItemPedido();
                case 9 -> RelatorioService.gerarRelatorioGeral();
                case 10 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 10);
    }
}


















