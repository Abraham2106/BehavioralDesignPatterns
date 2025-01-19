/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design.abstractEx;

/**
 *
 * @author solan
 */
public abstract class ProyectoAbs {
    public String codigo;
    public String nombre;
    public double costoInicial;
    public double ingresosAcumulados;
    
    public ProyectoAbs(String pCodigo, String pNombre, double pCostoInicial){
        codigo = pCodigo;
        nombre = pNombre;
        costoInicial = pCostoInicial;
    }
    public void setIngresosAcumulados(double pIngresosAcumulados){
        ingresosAcumulados = pIngresosAcumulados;
    }
    public abstract double calcularCostoActual();
    public double calcularBalance(){
        return ingresosAcumulados - calcularCostoActual();
    }
}
