/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.tickettothrive.models.Empresa;
/**
 *
 * @author mathe
 */
public interface BasicDao {
    
    public void insert();
    public void alter();
    public void delete ();
    public Empresa searchEmpresaPerId(int id);
    public int count(); 
    
}
