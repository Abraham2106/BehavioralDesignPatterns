/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 */
abstract class GestorBase implements Gestor{
    private Gestor siguienteGestor;
    

    @Override
    public void setNext(Gestor siguienteGestor){
        this.siguienteGestor = siguienteGestor;
        
    }
    public void handleRequest(Tarea tarea){
        if (canHandle(tarea)){
            handle(tarea);
        }else if( siguienteGestor != null){
            System.out.println(getClass().getSimpleName() + "can't handle the request");
        }else{
            System.out.println("No one can handle the request.");
        }
    }
    protected abstract boolean canHandle(Tarea tarea);
    protected abstract void handle(Tarea tarea);
}
