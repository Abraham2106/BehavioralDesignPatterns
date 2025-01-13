/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 * Esta es la clase que verfica si un paquete es pequeno si no se le pasa al siguiente manejador 
 */
public class PaquetePequeño implements CPaquete{
    private CPaquete verificador;
    
    @Override
    public void setNext(CPaquete verificador){
        this.verificador = verificador;
    }
    @Override
    public void verificarPaquete(String paquete){
        if(paquete.matches("Pequeño")){
            System.out.println("Se manejo por medio del sistema pequeño");
    }else if(verificador != null){
        verificador.verificarPaquete(paquete);
        
    }else{
            System.out.println("No se puede verificar");
    }
        
    }
        
}
