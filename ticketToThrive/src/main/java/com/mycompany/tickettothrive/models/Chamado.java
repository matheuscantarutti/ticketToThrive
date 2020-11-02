
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EStatus;
import java.util.Date;


class Chamado {
    private String descricao;
    private Date nascimento;
    private Date obito;
    private Date evento;
    private Usuario criador;
    private EStatus prioridade;
    private boolean prazo;

    public Chamado(String descricao, Date nascimento, Usuario criador, EStatus status) {
        this.descricao = descricao;
        this.nascimento = nascimento;
        this.criador = criador;
        this.prioridade = status;
    }

    public Chamado() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getObito() {
        return obito;
    }

    public void setObito(Date obito) {
        this.obito = obito;
    }

    public Date getEvento() {
        return evento;
    }

    public void setEvento(Date evento) {
        this.evento = evento;
    }

    public Usuario getCriador() {
        return criador;
    }

    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public EStatus getStatus() {
        return prioridade;
    }

    public void setStatus(EStatus prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isPrazo() {
        return prazo;
    }

    public void setPrazo(boolean prazo) {
        this.prazo = prazo;
    }
    
    

   
    
    
    
}
