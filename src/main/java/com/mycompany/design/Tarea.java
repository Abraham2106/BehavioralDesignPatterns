/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 * Clase que representa una Tarea en un proyecto de software.
 * Cada tarea tiene un nombre y una categoría que indica quién debería manejarla.
 */
public class Tarea {
    String nombreTarea;
    String categoria; 

    /**
     * Constructor de la clase Tarea.
     * 
     * @param nombreTarea Descripción de la tarea.
     * @param categoria   Categoría de la tarea (interfaz, Base de Datos, Backend).
     */
    public Tarea(String nombreTarea, String categoria) {
        this.nombreTarea = nombreTarea;
        this.categoria = categoria;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public String getCategoria() {
        return categoria;
    }
}
