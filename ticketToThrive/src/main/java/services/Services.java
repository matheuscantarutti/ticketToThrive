/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author mathe
 */
public class Services {
    
    public static String verificaEmpresa(String empresa){
        if(empresa.equals("teste")){
            return "ok";
        }
        else{
            return null;
        }
    }
    public static String verificaLogin(String user, String senha){
        if(user.equals("admin") && senha.equals("1234")){
            return "ok";
        }
        else{
            return null;
        }
    }
}
