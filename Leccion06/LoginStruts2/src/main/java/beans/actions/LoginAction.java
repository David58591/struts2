package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.*;

@Getter @Setter
public class LoginAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    @Override
    public String execute(){
        
        if("admin".equals(this.usuario)){
            return SUCCESS;
        }
        return INPUT;
    }


}
