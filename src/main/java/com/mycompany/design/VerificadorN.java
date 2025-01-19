package com.mycompany.design;

import com.mycompany.design.abstractEx.VerificadorAbs;

public class VerificadorN extends VerificadorAbs {
    
    @Override
    public void verificar(Solicitud solicitud){
        if(solicitud.getEstado() == EstadoEntrega.NORMAL){
            System.out.println("La solicitud es normal");
        }else{
            next(solicitud);
        }
    }
    
}
