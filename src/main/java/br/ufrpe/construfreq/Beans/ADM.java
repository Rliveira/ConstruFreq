package br.ufrpe.construfreq.Beans;

public class ADM extends Usuario
{
    private boolean ehAdm;

    public ADM(String nome, String cpf, String login, String senha, String wifiSSID, boolean ehAdm) {
        super(nome, cpf, login, senha, wifiSSID);
        this.ehAdm = ehAdm;
    }

    public boolean isEhAdm() {
        return ehAdm;
    }

    public void setEhAdm(boolean ehAdm) {
        this.ehAdm = ehAdm;
    }
}
