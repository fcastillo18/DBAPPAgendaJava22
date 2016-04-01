/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanRequest;

import com.DAO.DaoTUsuario;
import com.pojos.Tusuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Franklin
 */
@ManagedBean
@RequestScoped
public class MbRUsuario {

    /**
     * Creates a new instance of MbRUsuario
     */

    private Tusuario tUsuario;
    private List<Tusuario> listaUsuario;
    private String txtContraseniaRepita;
    
    public MbRUsuario() {
        this.tUsuario = new Tusuario();
        this.tUsuario.setCodigoUsuario("");
        this.tUsuario.setSexo('M');
    }
    
    public String register() throws Exception{
        DaoTUsuario daoTUsuario = new DaoTUsuario();
        daoTUsuario.register(this.tUsuario);
        
        return "/usuario/registrar";
    }
    
    public Tusuario gettUsuario() {
        return tUsuario;
    }
        
    public void settUsuario(Tusuario tUsuario) {
        this.tUsuario = tUsuario;
    }

    public List<Tusuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Tusuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public String getTxtContraseniaRepita() {
        return txtContraseniaRepita;
    }

    public void setTxtContraseniaRepita(String txtContraseniaRepita) {
        this.txtContraseniaRepita = txtContraseniaRepita;
    }
    

    
}
