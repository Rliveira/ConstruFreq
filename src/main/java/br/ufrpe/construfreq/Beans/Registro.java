package br.ufrpe.construfreq.Beans;

import java.time.LocalDateTime;
import java.util.UUID;

public class Registro
{
    private String IDRegistro;
    private Estabelecimento estabelecimento;
    private Usuario usuario;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;


    public void registrarEntrada(Usuario usuario, Estabelecimento estabelecimento, LocalDateTime dataHoraEntrada)
    {
        UUID uuid = UUID.randomUUID();
        this.IDRegistro = uuid.toString();
        this.usuario = usuario;
        this.estabelecimento= estabelecimento;
        this.dataHoraEntrada = LocalDateTime.now();
        this.dataHoraSaida = null;
    }

    public void registrarSaida()
    {
        if(this.dataHoraEntrada != null)
        {
            this.dataHoraSaida = LocalDateTime.now();
        }
    }

    public String getIDRegistro() {
        return IDRegistro;
    }

    public void setIDRegistro(String IDRegistro) {
        this.IDRegistro = IDRegistro;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
}
