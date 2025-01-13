/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 */
public interface CPaquete {

    /**
     * Este es el interface que le da los metodos a las clases 
     * @param verificador
     */
    void setNext(CPaquete verificador);
    void verificarPaquete(String paquete);
}
