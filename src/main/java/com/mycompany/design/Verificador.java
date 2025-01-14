package com.mycompany.design;

public interface Verificador {
    public void setNext(Verificador verificador);
    public void verificar(Solicitud solicitud);
}
