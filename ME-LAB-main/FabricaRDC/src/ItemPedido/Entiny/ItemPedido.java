package ItemPedido.Entiny;

public class ItemPedido {
    private int id;
    private int pedidoId;
    private int produtoId;
    private int quantidade;
    private double precoUnitario;
    private double subtotal;
    private String observacao;

    public ItemPedido(int id, int pedidoId, int produtoId, int quantidade, double precoUnitario, String observacao) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.observacao = observacao;
        this.subtotal = calcularSubtotal();
    }

    public int getId() { return id; }
    public int getPedidoId() { return pedidoId; }
    public int getProdutoId() { return produtoId; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
    public double getSubtotal() { return subtotal; }
    public String getObservacao() { return observacao; }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public void atualizarQuantidade(int novaQtd) {
        this.quantidade = novaQtd;
        this.subtotal = calcularSubtotal();
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", pedidoId=" + pedidoId +
                ", produtoId=" + produtoId +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", subtotal=" + subtotal +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
