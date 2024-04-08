package br.ufrpe.construfreq.Beans;

public class Funcionario extends Usuario
{
    private String cargo;
    private boolean ativo;
    private Usuario admResponsavel;

    public Funcionario(String nome, String cpf, String login, String senha, String wifiSSID, String cargo,
                       boolean ativo, Usuario admResponsavel) {
        super(nome, cpf, login, senha, wifiSSID);
        this.cargo = cargo;
        this.ativo = ativo;
        this.admResponsavel = admResponsavel;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getAdmResponsavel() {
        return admResponsavel;
    }

    public void setAdmResponsavel(Usuario admResponsavel) {
        this.admResponsavel = admResponsavel;
    }
}
