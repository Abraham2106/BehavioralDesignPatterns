package com.mycompany.design;

import com.mycompany.design.abstractEx.VerificadorAbs;

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
