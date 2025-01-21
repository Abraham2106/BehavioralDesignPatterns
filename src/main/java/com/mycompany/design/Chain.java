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
         
        Gestor disenador =  new Disenador();
        Gestor pDataScientist = new DataScientist();
        Gestor backend = new BackendDev();
        
        disenador.setNext(pDataScientist);
        pDataScientist.setNext(backend);
        
        
        Tarea tarea1 = new Tarea("Diseñar pantalla", "interfaz");
        Tarea tarea2 = new Tarea("Configurar base de datosSQL", "BasesdeDatos");
        Tarea tarea3 = new Tarea("Implementar lógica", "Backend");
        Tarea tarea4 = new Tarea("Configurar servidor de pruebas", "PM");
        
        System.out.println("Procesando tareas:\n");
        disenador.handleRequest(tarea1);
        disenador.handleRequest(tarea2);
        disenador.handleRequest(tarea3);
        disenador.handleRequest(tarea4);
     }

    
}
