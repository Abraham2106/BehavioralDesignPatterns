package com.mycompany.design;
/**
 * Se define la interfaz con su modificador de acceso correspondiente.
 * Se definen los metodos de la interfaz
 */
public interface Verificador {
    public void setNext(Verificador verificador);
    public void verificar(Solicitud solicitud);
}
