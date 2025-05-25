package Relatorio.Service;

import Cliente.Service.ClienteService;
import Produto.Service.ProdutoService;
import Pedido.Service.PedidoService;
import Ingrediente.Service.IngredienteService;
import Estoque.Service.EstoqueService;
import Usuario.Service.AtendenteService;
import Usuario.Service.GestorService;
import Pedido.Entiny.ItemPedido;

public class RelatorioService {

    /**
     * Gera um relatório geral com contagem de entidades do sistema.
     */
    public static void gerarRelatorioGeral() {
        System.out.println("\n===== RELATÓRIO GERAL - RIO DOS COOKIES =====");

        // Contagem básica
        System.out.println("Total de Clientes:            " + ClienteService.getClientes().size());
        System.out.println("Total de Produtos:            " + ProdutoService.getProdutos().size());
        System.out.println("Total de Pedidos:             " + PedidoService.getPedidos().size());
        System.out.println("Total de Ingredientes:        " + IngredienteService.getIngredientes().size());
        System.out.println("Total de Registros de Estoque:" + EstoqueService.getEstoques().size());
        System.out.println("Total de Atendentes:          " + AtendenteService.getAtendentes().size());
        System.out.println("Total de Gestores:            " + GestorService.getGestores().size());
        System.out.println("Total de Itens de Pedido:     " + ItemPedido.getTotalItensCriados());

        // Somar atendimentos realizados
        int totalAtendimentos = AtendenteService.getAtendentes().stream()
                .mapToInt(a -> a.getAtendimentosRealizados())
                .sum();

        System.out.println("Atendimentos realizados:      " + totalAtendimentos);
        System.out.println("=============================================");
    }
}
