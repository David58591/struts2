package com.everis.formacion.capaservicio;

import java.util.List;
import com.everis.formacion.capadatos.domain.Persona;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona recuperarPersona(Persona persona);

    public void agregarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
    
    public long contarPersonas();
}
