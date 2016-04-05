/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanRequest;

import com.DAO.DaoTUsuario;
import com.clases.Encrypt;
import com.pojos.Tusuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

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
        
        //evaluar que las contrasenias digitadas coincidan
        if (!this.tUsuario.getContrasenia().equals(txtContraseniaRepita)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "Las claves deben coincidir"));
            return "/usuario/registrar";
            
        }else{        
            this.tUsuario.setContrasenia(Encrypt.sha512(this.tUsuario.getContrasenia()));
            DaoTUsuario daoTUsuario = new DaoTUsuario();
            daoTUsuario.register(this.tUsuario);
            inicializar();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto: ", "Usuario Registrado correctamente"));
            
            /*Esta linea es para ejecutar una function de javascript
            *dentro de la function escribimos el nombre (id)del formulario en el archivo xhtml de la app
            *hay que importar esta function en el diseño o layaout, preferiblemente en el general
            */
            //RequestContext.getCurrentInstance().execute("limpiarForm('frmRegistrarUser')");
            //NO ME FUNCIONO LA PARTE DE ARRIBA
                        
            return "/usuario/registrar";
            
        }
    }
    
    private void inicializar(){
        this.tUsuario=new Tusuario();
        this.tUsuario.setCodigoUsuario("");
        this.tUsuario.setSexo('M');
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
