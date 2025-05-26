package Pedido.Entiny;

public class Pedido {
    private int id;
    private String cliente; // nome ou identificação
    private String data;
    private String status; // Ex: Em produção, Em entrega, Entregue
    private double valorTotal;
    private String formaPagamento;
    private boolean entregue;

    public Pedido(int id, String cliente, String data, String status, double valorTotal, String formaPagamento, boolean entregue) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.entregue = entregue;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public String getData() { return data; }
    public String getStatus() { return status; }
    public double getValorTotal() { return valorTotal; }
    public String getFormaPagamento() { return formaPagamento; }
    public boolean isEntregue() { return entregue; }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void marcarComoEntregue() {
        this.entregue = true;
        this.status = "Entregue";
    }

    public void atualizarValorTotal(double novoTotal) {
        this.valorTotal = novoTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", data='" + data + '\'' +
                ", status='" + status + '\'' +
                ", valorTotal=" + valorTotal +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", entregue=" + entregue +
                '}';
    }
}
