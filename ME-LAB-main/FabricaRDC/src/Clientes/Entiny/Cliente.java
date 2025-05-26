package Clientes.Entiny;


public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    private String dataCadastro;

    public Cliente(int id, String nome, String telefone, String email, String cpf, String endereco, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getDataCadastro() { return dataCadastro; }

    public void atualizarContato(String novoTelefone, String novoEmail) {
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }

    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String resumo() {
        return "Cliente " + nome + " (" + cpf + ") - Telefone: " + telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                '}';
    }
}
