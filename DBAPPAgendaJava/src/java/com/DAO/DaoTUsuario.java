/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.hibernateUtil.HibernateUtil;
import com.interfaces.InterfaceTUsuario;
import com.pojos.Tusuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Franklin
 */
public class DaoTUsuario implements InterfaceTUsuario{

    private Session session;
    
    @Override
    public boolean register(Tusuario tUsuario) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(tUsuario);
        trans.commit();
        session.close(); //cerrar la conexion
        
        return true;
    }

    @Override
    public List getList() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tusuario getUser(String codigoUsuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Tusuario tUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
