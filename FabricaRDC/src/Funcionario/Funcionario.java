package Funcionario;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private String email;
    private String telefone;
    private double salario;
    private String dataAdmissao;

    public Funcionario(int id, String nome, String cargo, String email, String telefone, double salario, String dataAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public double getSalario() { return salario; }
    public String getDataAdmissao() { return dataAdmissao; }

    public void atualizarContato(String novoEmail, String novoTelefone) {
        this.email = novoEmail;
        this.telefone = novoTelefone;
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
