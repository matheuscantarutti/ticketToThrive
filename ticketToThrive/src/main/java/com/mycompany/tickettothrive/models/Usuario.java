
package com.mycompany.tickettothrive.models;

import com.mycompany.tickettothrive.models.enums.EType;
import java.util.ArrayList;


public class Usuario {
    private String nome;
    private String login;
    private String password;
    private EType userType;
    private String departamento;
    private ArrayList <Chamado> chamados;

    public Usuario(String nome, String login, String password, EType userType, String departamento) {
        this.nome = nome;
        this.login = login;
        this.password = password;
        this.userType = userType;
        this.departamento = departamento;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EType getUserType() {
        return userType;
    }

    public void setUserType(EType userType) {
        this.userType = userType;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Chamado> getChamados() {
        return chamados;
    }
    
    public void addChamado(Chamado call){
        chamados.add(call);
    }
}

