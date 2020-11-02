/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tickettothrive.models;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
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


