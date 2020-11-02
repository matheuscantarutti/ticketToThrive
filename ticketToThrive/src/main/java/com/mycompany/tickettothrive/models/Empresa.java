package com.mycompany.tickettothrive.models;

import java.util.ArrayList;


public class Empresa {
    ArrayList <Usuario> colaboradores;

    public Empresa() {
    }

    public ArrayList<Usuario> getColaboradores() {
        return colaboradores;
    }
    
    public void addColaboradores(Usuario user){
        colaboradores.add(user);
    }
    
}


