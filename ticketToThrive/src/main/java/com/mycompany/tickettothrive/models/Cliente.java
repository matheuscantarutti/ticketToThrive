
 
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EType;
import java.util.ArrayList;


public class Cliente extends Usuario {
    private ArrayList <Chamado> chamadosCriados;

    public Cliente(String nome, String login, String password, EType userType, String departamento) {
        super(nome, login, password, userType, departamento);
    }

    public ArrayList <Chamado> getChamadosCriados() {
        return chamadosCriados;
    }
    
    public void addChamadoCriado(Chamado call){
        chamadosCriados.add(call);
    }
    
    public void criarChamado(){
        Chamado call = new Chamado();
        addChamadoCriado(call);
    }
}
