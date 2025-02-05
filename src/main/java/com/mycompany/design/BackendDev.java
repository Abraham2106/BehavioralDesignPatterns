/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 */
public class BackendDev extends GestorBase{
    // Implementacion de las funciones abstractas de la clase GestorBase
    @Override
    protected boolean canHandle(Tarea tarea){
        return "Backend".equalsIgnoreCase(tarea.getCategoria());
    }
    @Override
    protected void handle(Tarea tarea){
        System.out.println("El BackendDev esta manejando la tarea:" + tarea.getNombreTarea());
    }
    
}
