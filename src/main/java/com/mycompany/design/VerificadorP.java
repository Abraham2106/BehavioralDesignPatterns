package com.mycompany.design;

public class VerificadorP extends VerificadorAbs {
    
    @Override
    public void verificar(Solicitud solicitud){
        if(solicitud.getEstado() == EstadoEntrega.PESIMO){
            System.out.println("La solicitud es pesima");
        }else{
            next(solicitud);
        }
    }
    
}
