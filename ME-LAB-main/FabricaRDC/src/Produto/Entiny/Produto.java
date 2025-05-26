package Produto.Entiny;

public class Produto {
    private int id;
    private String nome;
    private String sabor;
    private double preco;
    private String tipo; // Tradicional, Diet, Vegano etc.
    private String validade;
    private int quantidadeDisponivel;

    public Produto(int id, String nome, String sabor, double preco, String tipo, String validade, int quantidadeDisponivel) {
        this.id = id;
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
        this.tipo = tipo;
        this.validade = validade;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getSabor() { return sabor; }
    public double getPreco() { return preco; }
    public String getTipo() { return tipo; }
    public String getValidade() { return validade; }
    public int getQuantidadeDisponivel() { return quantidadeDisponivel; }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void ajustarEstoque(int quantidade) {
        this.quantidadeDisponivel += quantidade;
    }

    public boolean estaDisponivel() {
        return this.quantidadeDisponivel > 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                ", validade='" + validade + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                '}';
    }
}
