/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design;

/**
 *
 * @author solan
 */
public class Permanente extends ProyectoAbs{
    private double costoAnualFijo;
    private double inflacion;
    
    public Permanente(String pCodigo, String pNombre, double pCostoInicial, double pCostoAnualFijo, double pInflacion){
        super(pCodigo, pNombre, pCostoInicial);
        costoAnualFijo = pCostoAnualFijo;
        inflacion = pInflacion;
    }
    
    @Override
    public double calcularCostoActual(){
        return (costoInicial + costoAnualFijo) * inflacion;
    }
}
