package Gestor.Entiny;

import Funcionario.Funcionario;

public class Gestor extends Funcionario {
    private String nivelAcesso;
    private String areaGerenciada;
    private String login;
    private String senha;
    private String formacao;
    private int tempoDeCasa;
    private boolean autorizaReposicao;

    public Gestor(int id, String nome, String email, String telefone, double salario, String dataAdmissao,
                  String nivelAcesso, String areaGerenciada, String login, String senha,
                  String formacao, int tempoDeCasa, boolean autorizaReposicao) {
        super(id, nome, "Gestor", email, telefone, salario, dataAdmissao);
        this.nivelAcesso = nivelAcesso;
        this.areaGerenciada = areaGerenciada;
        this.login = login;
        this.senha = senha;
        this.formacao = formacao;
        this.tempoDeCasa = tempoDeCasa;
        this.autorizaReposicao = autorizaReposicao;
    }

    public String getNivelAcesso() { return nivelAcesso; }
    public String getAreaGerenciada() { return areaGerenciada; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public String getFormacao() { return formacao; }
    public int getTempoDeCasa() { return tempoDeCasa; }
    public boolean isAutorizaReposicao() { return autorizaReposicao; }

    public void promoverFuncionario(Funcionario f, String novoCargo, double novoSalario) {
        f.reajustarSalario((novoSalario - f.getSalario()) / f.getSalario() * 100);
        System.out.println("Funcionário promovido para: " + novoCargo);
    }

    public void alterarPermissaoReposicao(boolean novoEstado) {
        this.autorizaReposicao = novoEstado;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nivelAcesso='" + nivelAcesso + '\'' +
                ", areaGerenciada='" + areaGerenciada + '\'' +
                ", formacao='" + formacao + '\'' +
                ", tempoDeCasa=" + tempoDeCasa +
                ", autorizaReposicao=" + autorizaReposicao;
    }
}
