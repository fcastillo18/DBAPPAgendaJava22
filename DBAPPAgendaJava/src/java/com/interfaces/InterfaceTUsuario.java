/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.pojos.Tusuario;
import java.util.List;

/**
 *
 * @author Franklin
 */
public interface InterfaceTUsuario {
    
    public boolean register(Tusuario tUsuario) throws Exception;
    public List getList() throws Exception; //lista usuarios
    public Tusuario getUser(String codigoUsuario) throws Exception; //para buscar un usuario
    public boolean update(Tusuario tUsuario);
    
}
