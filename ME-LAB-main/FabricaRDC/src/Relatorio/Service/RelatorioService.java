package Relatorio.Service;

import Clientes.Service.ClientesService;
import Produto.Service.ProdutoService;
import Pedido.Service.PedidoService;
import Ingrediente.Service.IngredienteService;
import Estoque.Service.EstoqueService;
import Atendentes.Service.AtendenteService;
import Gestor.Service.GestorService;
import ItemPedido.Service.ItemPedidoService;

public class RelatorioService {

    // Variável estática para armazenar a instância de ClientesService
    private static ClientesService clientesService;

    /**
     * Gera um relatório geral com contagem de entidades do sistema.
     * @param csService Instância de ClientesService necessária para acessar os clientes
     */
    public static void gerarRelatorioGeral(ClientesService csService) {
        clientesService = csService;

        System.out.println("\n===== RELATÓRIO GERAL - RIO DOS COOKIES =====");

        // Contagem básica - usando métodos estáticos disponíveis
        System.out.println("Total de Clientes:            " + clientesService.getClientes().size());
        System.out.println("Total de Produtos:            " + ProdutoService.getProdutos().size());
        System.out.println("Total de Pedidos:             " + PedidoService.getPedidos().size());
        System.out.println("Total de Ingredientes:        " + IngredienteService.getIngredientes().size());
        System.out.println("Total de Registros de Estoque:" + EstoqueService.getEstoques().size());

        // Atendentes - usando a lista pública estática diretamente
        System.out.println("Total de Atendentes:          " + AtendenteService.atendentes.size());

        System.out.println("Total de Gestores:            " + GestorService.getGestores().size());
        System.out.println("Total de Itens de Pedido:     " + ItemPedidoService.getItensPedido().size());

        // Somar atendimentos realizados
        int totalAtendimentos = AtendenteService.atendentes.stream()
                .mapToInt(a -> a.getAtendimentosRealizados())
                .sum();

        System.out.println("Atendimentos realizados:      " + totalAtendimentos);
        System.out.println("=============================================");
    }
}