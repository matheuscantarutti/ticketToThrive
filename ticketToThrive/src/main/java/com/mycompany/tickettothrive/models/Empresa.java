package com.mycompany.tickettothrive.models;

import java.util.ArrayList;


public class Empresa {
    private String nome;
    private int id;
    ArrayList <Usuario> colaboradores;

    public Empresa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Usuario> getColaboradores() {
        return colaboradores;
    }
    
    public void addColaboradores(Usuario user){
        colaboradores.add(user);
    }
    
}


