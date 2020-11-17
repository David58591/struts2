package com.everis.formacion.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name = "bienvenidoResult", location = "bienvenidoTile", type = "tiles"),
    @Result(name = "personaResult", location = "personasTile", type = "tiles")
})
public class LinkAction extends ActionSupport{
    @Action(value = "bienvenidoAction")
    public String bienvenido(){
        return "bienvenidoResult";
    }
    
    @Action(value = "personasAction")
    public String personas(){
        return "personasResult";
    }
}
