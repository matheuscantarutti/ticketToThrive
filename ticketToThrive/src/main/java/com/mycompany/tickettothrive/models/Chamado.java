
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EStatus;
import java.util.Calendar;
import java.util.Date;


class Chamado {
    private int id;
    private String descricao;
    private String tratamento;
    private Cliente criador;
    private Tecnico atendente;
    private EStatus prioridade;
    private Date nascimento;
    private Date obito;

    public Chamado(String descricao, Cliente criador, EStatus prioridade) {
        this.descricao = descricao;
        this.criador = criador;
        this.prioridade = prioridade;
        this.nascimento = Calendar.getInstance().getTime();
    }

    public Chamado() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public Tecnico getAtendente() {
        return atendente;
    }

    public void setAtendente(Tecnico atendente) {
        this.atendente = atendente;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public Date getObito() {
        return obito;
    }

    public void setObito(Date obito) {
        this.obito = obito;
    }

    public Cliente getCriador() {
        return criador;
    }

    public void setCriador(Cliente criador) {
        this.criador = criador;
    }

    public EStatus getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(EStatus prioridade) {
        this.prioridade = prioridade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    } 
}
