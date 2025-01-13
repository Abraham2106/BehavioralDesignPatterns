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
         // se crean las instancias de las debidas clases 
         CPaquete paquete1 = new PaquetePequeño();
         CPaquete paquete2 = new PaqueteMediano();
         CPaquete paquete3 = new PaqueteGrande();
         // se asignan los siguientes
         paquete1.setNext(paquete2);
         paquete2.setNext(paquete3);
         // se realizan las verificaciones
         paquete1.verificarPaquete("Pequeño");
         paquete1.verificarPaquete("Mediano");
         paquete1.verificarPaquete("Grande");
         paquete1.verificarPaquete("Fragil");
     }
}
