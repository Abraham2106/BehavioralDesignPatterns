/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

import java.util.ArrayList;

/**
 *
 * @author solan
 */
public class AplProyecto {
    public static ArrayList<ProyectoAbs> misProyectos;
    public static ProyectoAbs proyectoTemporal;
    public static ProyectoAbs proyectoPermanente;
    
    public static void main(String[] args){
        proyectoTemporal = new Temporal("Codigo","Nombre",0,500.0);
        proyectoPermanente = new Permanente("Codigo", "Nombre",0,1.0, 0.05);
        
        misProyectos = new ArrayList<ProyectoAbs>();
        misProyectos.add(proyectoTemporal);
        misProyectos.add(proyectoPermanente);
        
        for(ProyectoAbs proyectos: misProyectos ){
            System.out.println(proyectos.calcularBalance());
    }
    }
}
