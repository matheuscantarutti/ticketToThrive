
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EType;
import java.util.ArrayList;


public class Tecnico extends Usuario {
    
    private ArrayList <Chamado> chamadosAtendidos;

    public Tecnico(String nome, String login, String password, EType userType, String departamento) {
        super(nome, login, password, userType, departamento);
    }
    
    public ArrayList <Chamado> getChamadsAtendidos(){
        return chamadosAtendidos;
    }
    
    public void addChamadoAtendido(Chamado call){
        chamadosAtendidos.add(call);
    }
    
    public void tratarChamado(Chamado call){
       Evento tratamento = new Evento();
       call.addEvento(tratamento);
    }
    
    public void finalizarChamado(Chamado call){
        Evento obito = new Evento();
        call.setObito(obito);
    }
    
}
