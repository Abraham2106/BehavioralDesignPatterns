/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 * Clase que maneja las tareas de Bases de Datos
 * @author solan
 */
public class DataScientist extends GestorBase{
    // Implementacion de las funciones abstractas de la clase GestorBase
    @Override
    protected boolean canHandle(Tarea tarea){
        return "BasesdeDatos".equalsIgnoreCase(tarea.getCategoria());
    }
    @Override
    protected void handle(Tarea tarea){
        System.out.println("El DataScientist esta manejando la tarea:" + tarea.getNombreTarea());
    }
    
}
