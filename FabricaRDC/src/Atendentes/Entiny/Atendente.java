package Atendentes.Entiny;

import Funcionario.Funcionario;

public class Atendente extends Funcionario {
    private String setor;
    private String turno;
    private String login;
    private String senha;
    private int atendimentosRealizados;
    private String canalDeAtendimento;

    public Atendente(int id, String nome, String email, String telefone, double salario, String dataAdmissao,
                     String setor, String turno, String login, String senha, int atendimentosRealizados, String canalDeAtendimento) {
        super(id, nome, "Atendente", email, telefone, salario, dataAdmissao);
        this.setor = setor;
        this.turno = turno;
        this.login = login;
        this.senha = senha;
        this.atendimentosRealizados = atendimentosRealizados;
        this.canalDeAtendimento = canalDeAtendimento;
    }

    public String getSetor() { return setor; }
    public String getTurno() { return turno; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public int getAtendimentosRealizados() { return atendimentosRealizados; }
    public String getCanalDeAtendimento() { return canalDeAtendimento; }

    public void registrarAtendimento() {
        this.atendimentosRealizados++;
    }

    public void trocarTurno(String novoTurno) {
        this.turno = novoTurno;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", setor='" + setor + '\'' +
                ", turno='" + turno + '\'' +
                ", canalDeAtendimento='" + canalDeAtendimento + '\'' +
                ", atendimentosRealizados=" + atendimentosRealizados;
    }
}
