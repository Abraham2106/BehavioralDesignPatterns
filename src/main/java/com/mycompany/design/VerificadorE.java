package com.mycompany.design;

public class VerificadorE extends VerificadorAbs {
    
    @Override
    public void verificar(Solicitud solicitud){
        if(solicitud.getEstado() == EstadoEntrega.EXCELENTE){
            System.out.println("La solicitud es excelente");
        }else{
            next(solicitud);
        }
    }
    
}
