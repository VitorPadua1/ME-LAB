package Estoque.Entiny;

public class Estoque {
    private int id;
    private String ingrediente; // nome do ingrediente
    private double quantidadeDisponivel;
    private String dataUltimaEntrada;
    private String lote;
    private String localArmazenamento;
    private String tipoControle; // Ex: FIFO, Manual

    public Estoque(int id, String ingrediente, double quantidadeDisponivel, String dataUltimaEntrada,
                   String lote, String localArmazenamento, String tipoControle) {
        this.id = id;
        this.ingrediente = ingrediente;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.dataUltimaEntrada = dataUltimaEntrada;
        this.lote = lote;
        this.localArmazenamento = localArmazenamento;
        this.tipoControle = tipoControle;
    }

    public int getId() { return id; }
    public String getIngrediente() { return ingrediente; }
    public double getQuantidadeDisponivel() { return quantidadeDisponivel; }
    public String getDataUltimaEntrada() { return dataUltimaEntrada; }
    public String getLote() { return lote; }
    public String getLocalArmazenamento() { return localArmazenamento; }
    public String getTipoControle() { return tipoControle; }

    public void entradaEstoque(double quantidade, String dataEntrada) {
        this.quantidadeDisponivel += quantidade;
        this.dataUltimaEntrada = dataEntrada;
    }

    public void saidaEstoque(double quantidade) {
        if (quantidade <= this.quantidadeDisponivel) {
            this.quantidadeDisponivel -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente para " + ingrediente);
        }
    }

    public boolean precisaRepor(double minimo) {
        return this.quantidadeDisponivel < minimo;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "id=" + id +
                ", ingrediente='" + ingrediente + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", dataUltimaEntrada='" + dataUltimaEntrada + '\'' +
                ", lote='" + lote + '\'' +
                ", localArmazenamento='" + localArmazenamento + '\'' +
                ", tipoControle='" + tipoControle + '\'' +
                '}';
    }
}
