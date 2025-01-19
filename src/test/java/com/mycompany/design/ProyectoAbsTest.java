/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.design;

import abstractEx.ProyectoAbs;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author solan
 */
public class ProyectoAbsTest {
    
    public ProyectoAbsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of setIngresosAcumulados method, of class ProyectoAbs.
     */
    @Test
    public void testSetIngresosAcumulados() {
        System.out.println("setIngresosAcumulados");
        double pIngresosAcumulados = 0.0;
        ProyectoAbs instance = null;
        instance.setIngresosAcumulados(pIngresosAcumulados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoActual method, of class ProyectoAbs.
     */
    @Test
    public void testCalcularCostoActual() {
        System.out.println("calcularCostoActual");
        ProyectoAbs instance = null;
        double expResult = 0.0;
        double result = instance.calcularCostoActual();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularBalance method, of class ProyectoAbs.
     */
    @Test
    public void testCalcularBalance() {
        System.out.println("calcularBalance");
        ProyectoAbs instance = null;
        double expResult = 0.0;
        double result = instance.calcularBalance();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProyectoAbsImpl extends ProyectoAbs {

        public ProyectoAbsImpl() {
            super("", "", 0.0);
        }

        public double calcularCostoActual() {
            return 0.0;
        }
    }
    
}
