package beans;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Getter @Setter
public class HolaMundoAction {
    
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    private String saludosAtr;
    
    public String execute(){
        log.info("Ejecutando execute desde struts2");
        this.saludosAtr = "Saludos desde struts2";
        
        return "exito";
    }
}
