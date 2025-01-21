/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 * Define el contrato de los responsables en la cadena de responsabilidad
 */

public interface Gestor {
    /**
     * Asigna el siguiente gestor en la cadena
     * @param siguienteGestor 
     */
     void setNext(Gestor siguienteGestor); 
     /**
      * Maneja la tarea
      * @param tarea 
      */
     void handleRequest(Tarea tarea); 
}
