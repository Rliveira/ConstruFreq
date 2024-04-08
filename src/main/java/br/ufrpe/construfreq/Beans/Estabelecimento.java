package br.ufrpe.construfreq.Beans;

public class Estabelecimento
{
    private String nome;
    private Location endereco;

    private String wifiSSID;

    private double raioLocalizacao;

    public Estabelecimento(String nome, Location endereco, String wifiSSID, double raioLocalizacao)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.wifiSSID = wifiSSID;
        this.raioLocalizacao = raioLocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Location getEndereco() {
        return endereco;
    }

    public void setEndereco(Location endereco) {
        this.endereco = endereco;
    }

    public String getWifiSSID() {
        return wifiSSID;
    }

    public void setWifiSSID(String wifiSSID) {
        this.wifiSSID = wifiSSID;
    }

    public double getRaioLocalizacao() {
        return raioLocalizacao;
    }

    public void setRaioLocalizacao(double raioLocalizacao) {
        this.raioLocalizacao = raioLocalizacao;
    }
}
