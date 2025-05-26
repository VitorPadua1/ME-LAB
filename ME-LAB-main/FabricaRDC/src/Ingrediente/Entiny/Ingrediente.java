package Ingrediente.Entiny;

public class Ingrediente {
    private int id;
    private String nome;
    private double quantidadeAtual;
    private String unidade; // Ex: kg, g, L
    private String validade;
    private String categoria; // seco, perecível, etc.
    private String fornecedor;

    public Ingrediente(int id, String nome, double quantidadeAtual, String unidade, String validade, String categoria, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.unidade = unidade;
        this.validade = validade;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getQuantidadeAtual() { return quantidadeAtual; }
    public String getUnidade() { return unidade; }
    public String getValidade() { return validade; }
    public String getCategoria() { return categoria; }
    public String getFornecedor() { return fornecedor; }

    public void adicionarQuantidade(double quantidade) {
        this.quantidadeAtual += quantidade;
    }

    public void consumirQuantidade(double quantidade) {
        if (this.quantidadeAtual >= quantidade) {
            this.quantidadeAtual -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente de " + nome + " no estoque.");
        }
    }

    public boolean estaVencido(String dataHoje) {
        return validade.compareTo(dataHoje) < 0;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidadeAtual=" + quantidadeAtual +
                ", unidade='" + unidade + '\'' +
                ", validade='" + validade + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
