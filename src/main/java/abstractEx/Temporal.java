/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractEx;

import abstractEx.ProyectoAbs;

/**
 *
 * @author solan
 */
public class Temporal extends ProyectoAbs {
    private double valorDolar;
    
    public Temporal(String pCodigo, String pNombre, double pCostoInicial, double pValorDolar){
        super(pCodigo, pNombre, pCostoInicial);
        valorDolar = pValorDolar;
        
    }
    @Override
    public double calcularCostoActual(){
        return (costoInicial * valorDolar);
    }
}
