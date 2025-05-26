package Relatorio.Entiny;

public class Relatorio {
    private int id;
    private String titulo;
    private String dataCriacao;
    private String autor;
    private String tipo; // Ex: Estoque, Pedido, Produto
    private String resumo;
    private String status;

    public Relatorio(int id, String titulo, String dataCriacao, String autor, String tipo, String resumo, String status) {
        this.id = id;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.autor = autor;
        this.tipo = tipo;
        this.resumo = resumo;
        this.status = status;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDataCriacao() { return dataCriacao; }
    public String getAutor() { return autor; }
    public String getTipo() { return tipo; }
    public String getResumo() { return resumo; }
    public String getStatus() { return status; }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atualizarResumo(String novoResumo) {
        this.resumo = novoResumo;
    }

    public void imprimirCabecalho() {
        System.out.println("=== " + titulo.toUpperCase() + " ===");
        System.out.println("Tipo: " + tipo + " | Autor: " + autor + " | Data: " + dataCriacao);
        System.out.println("Status: " + status);
        System.out.println("------------------------------------");
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", resumo='" + resumo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
