package com.everis.formacion.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.inject.Inject;
import com.everis.formacion.capadatos.domain.Persona;
import com.everis.formacion.capaservicio.PersonaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MostrarPersonaAction extends ActionSupport {

    private long contadorPersonas;

    Logger log = LogManager.getLogger(MostrarPersonaAction.class);

    @Inject
    private PersonaService personaService;

    private List<Persona> personas;

    @Override
    public String execute() {
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        return SUCCESS;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public long getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }
}
