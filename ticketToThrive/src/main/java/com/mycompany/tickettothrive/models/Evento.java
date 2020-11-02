
package com.mycompany.tickettothrive.models;

import java.util.Date;


public class Evento {
    private String descricao;
    private Date data;

    public Evento(String descricao, Date data) {
        this.descricao = descricao;
        this.data = data;
    }

    public Evento() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
