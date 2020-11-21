
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EStatus;
import java.util.ArrayList;


class Chamado {
    private ArrayList <Evento> eventos;
    private int id = 0;
    private Cliente criador;
    private Tecnico atendente;
    private EStatus prioridade;
    private Evento nascimento;
    private Evento obito;

    public Chamado(Cliente criador, EStatus prioridade, Evento nascimento) {
        this.criador = criador;
        this.prioridade = prioridade;
        this.nascimento = nascimento;
        setCodigo();
    }

    public Chamado() {
    }

    public Tecnico getAtendente() {
        return atendente;
    }

    public void setAtendente(Tecnico atendente) {
        this.atendente = atendente;
    }

    public Evento getNascimento() {
        return nascimento;
    }

    public void setNascimento(Evento nascimento) {
        this.nascimento = nascimento;
    }

    public Evento getObito() {
        return obito;
    }

    public void setObito(Evento obito) {
        this.obito = obito;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    
    public void addEvento(Evento ocorrencia){
        eventos.add(ocorrencia);
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

    public int getCodigo() {
        return this.id;
    }

    public void setCodigo() {
        this.id++;
    } 
}
