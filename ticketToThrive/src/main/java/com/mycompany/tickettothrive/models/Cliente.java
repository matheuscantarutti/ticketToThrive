
 
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EType;


public class Cliente extends Usuario {

    public Cliente(String nome, String login, String password, EType userType, String departamento) {
        super(nome, login, password, userType, departamento);
    }
    
    public void criarChamado(){
        Chamado call = new Chamado();
        addChamado(call);
    }
}
