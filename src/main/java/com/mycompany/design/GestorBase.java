/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *Esta es la clase abstracta que funciona como base de Gestor
 * 
 * @author solan
 */
abstract class GestorBase implements Gestor{
    protected Gestor siguienteGestor; // El siguiente gestor en la cadena
    
    /**
     * Implementacion de interface 
     * @param siguienteGestor 
     */
    @Override
    public void setNext(Gestor siguienteGestor){
        this.siguienteGestor = siguienteGestor;
        
    }
    /**
     * Implementacion de interface
     * @param tarea 
     */
    @Override
    public void handleRequest(Tarea tarea){
        if (canHandle(tarea)){
            handle(tarea);
        }else if( siguienteGestor != null){
            // Si el gestor actual no puede manejar la tarea sera transferido al siguiente eslabon de la cadena 
            System.out.println(getClass().getSimpleName() + " can't handle the request");
            siguienteGestor.handleRequest(tarea);
        }else{
            System.out.println("No one can handle the request.");
        }
    }
    /**
     * Funciones sin implementacion
     * Son implementadas por los clases de los objetos que manejan la tarea
     * @param tarea
     * @return 
     */
    protected abstract boolean canHandle(Tarea tarea);
    protected abstract void handle(Tarea tarea);
}
