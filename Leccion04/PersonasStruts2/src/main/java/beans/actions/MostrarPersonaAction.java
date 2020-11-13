package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Getter @Setter
public class MostrarPersonaAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    private String nombre;
    
    
    @Override
    public String execute(){
        log.info("El nombre es " +this.getNombre());
        return ActionSupport.SUCCESS;
    }
    
    public String getTitulo(){
        return getText("persona.titulo");
    }
    
    public String getValor(){
        return getText("persona.valor");
    }
    
    public String getBoton(){
        return getText("persona.boton");
    }
}
