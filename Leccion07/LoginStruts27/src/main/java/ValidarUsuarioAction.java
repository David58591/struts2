
import beans.actions.LoginAction;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


@Results({
    @Result(name = "success", location = "/WEB-INF/content/bienvenido.jsp"),
    @Result(name = "input", location = "/WEB-INF/content/login.jsp")
})
@Getter
@Setter
public class ValidarUsuarioAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

   
    @Action("validarUsuario")
    public String execute() {
        if ("admin".equals(this.usuario)) {
            addActionMessage(getText("usuario.valido"));
            return SUCCESS;
        }
        return INPUT;
    }

    @Override
    public void validate() {
        if (this.usuario == null || "".equals(this.usuario.trim())) {
            addFieldError("usuario", getText("val.usuario"));
        } else if (!usuarioValido()) {
            addActionError(getText("usuario.invalido"));
        }
        if(this.password == null || "".equals(this.password.trim())){
            addFieldError("password",getText("val.password"));
        }else if (this.password.length()< 3) {
            addFieldError("password","val.pass.min.length");
        }
    }
    
     private boolean usuarioValido(){
            return "admin".equals(this.usuario);
        }
}
