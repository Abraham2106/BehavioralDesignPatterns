package com.mycompany.design;

public class Solicitud {
    private String message;
    private EstadoEntrega estado;
    Solicitud(String message, EstadoEntrega estado){
        this.message = message;
        this.estado = estado;
    }
    public String getMessage(){
        return message;
    }
    public EstadoEntrega getEstado(){
        return estado;
    }
}
