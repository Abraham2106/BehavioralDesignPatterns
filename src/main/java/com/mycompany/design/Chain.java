/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 */
public class Chain {
     public static void main(String[] args){
        Verificador verificador = new VerificadorP();
        Verificador verificador2 = new VerificadorN();
        Verificador verificador3 = new VerificadorE();
       
        verificador.setNext(verificador2);
        verificador2.setNext(verificador3);

        Solicitud solicitud = new Solicitud("Solicitud 1", EstadoEntrega.EXCELENTE);
        Solicitud solicitud2 = new Solicitud("Solicitud 2", EstadoEntrega.NORMAL);
        Solicitud solicitud3 = new Solicitud("Solicitud 3", EstadoEntrega.PESIMO);

        verificador.verificar(solicitud);
        verificador.verificar(solicitud2);
        verificador.verificar(solicitud3);
        



     }
}
