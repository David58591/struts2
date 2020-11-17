package beans.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Getter @Setter
public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;
    
    public String execute(){
        log.info("Ejecutando execute desde struts2");
        this.saludosAtr = "Hola desde Struts2 con convenciones";
        
        return "exito";
    }
}
