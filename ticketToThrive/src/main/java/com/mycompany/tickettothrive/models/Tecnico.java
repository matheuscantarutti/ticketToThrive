
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Tecnico extends Usuario {
    
    private ArrayList <Chamado> chamadosAtendidos;
    private String descricaoTratamento;

    public Tecnico(String nome, String login, String password, EType userType, String departamento) {
        super(nome, login, password, userType, departamento);
    }

    public String getDescricaoTratamento() {
        return descricaoTratamento;
    }

    public void setDescricaoTratamento(String descricaoTratamento) {
        this.descricaoTratamento = descricaoTratamento;
    }
    
    
    public ArrayList <Chamado> getChamadsAtendidos(){
        return chamadosAtendidos;
    }
    
    public void addChamadoAtendido(Chamado call){
        chamadosAtendidos.add(call);
    }
    
    public void tratarChamado(Chamado call){
        setDescricaoTratamento(descricaoTratamento);
        call.setTratamento(this.descricaoTratamento);
    }
    
    public void finalizarChamado(Chamado call){
        Date deathTime = Calendar.getInstance().getTime();
        call.setObito(deathTime);
    }
    
}
