
import beans.actions.LoginAction;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Getter @Setter
@Results({
    @Result(name = "success", location = "/WEB-INF/content/bienvenido.jsp"),
    @Result(name = "input", location = "login", type = "redirectAction")
})
public class ValidarUsuarioAction extends ActionSupport{
    
     Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
   
    @Override
    @Action("validarUsuario")
    public String execute(){
        if("admin".equals(this.usuario)){
            return SUCCESS;
        }
        return INPUT;
    }
}
