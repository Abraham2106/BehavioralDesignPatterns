package com.mycompany.design;

import com.mycompany.design.Solicitud;
import com.mycompany.design.Verificador;

public abstract class VerificadorAbs implements Verificador {
    private Verificador nextV;

    public void setNext(Verificador verificador){
        this.nextV = verificador;
    }
    public void next(Solicitud solicitud){
        if(nextV != null){
            nextV.verificar(solicitud);
        }else{
            System.out.println("No se puede verificar la solicitud");
        }
    }
        

}
