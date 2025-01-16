package com.mycompany.design;
import java.util.ArrayList;

/**
 * This class represents the main application for managing projects.
 * It initializes and manages a list of projects, both temporary and permanent.
 * It also calculates and prints the balance for each project.
 * 
 * Fields:
 * - misProyectos: A static ArrayList that holds all the projects.
 * - proyectoTemporal: A static reference to a temporary project.
 * - proyectoPermanente: A static reference to a permanent project.
 * 
 * Methods:
 * - main(String[] args): The entry point of the application. It initializes the projects,
 *   adds them to the list, and prints their balances.
 * 
 * Usage:
 * - Run the main method to see the balance calculations for the projects.
 * 
 * Author:
 * - solan
 */
public class AplProyecto {
    /**
     * A static ArrayList that holds all the projects.
     */
    public static ArrayList<ProyectoAbs> misProyectos;

    /**
     * A static reference to a temporary project.
     */
    public static ProyectoAbs proyectoTemporal;

    /**
     * A static reference to a permanent project.
     */
    public static ProyectoAbs proyectoPermanente;

    /**
     * The entry point of the application. It initializes the projects,
     * adds them to the list, and prints their balances.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        proyectoTemporal = new Temporal("Codigo", "Nombre", 0, 500.0);
        proyectoPermanente = new Permanente("Codigo", "Nombre", 0, 1.0, 0.05);

        misProyectos = new ArrayList<ProyectoAbs>();
        misProyectos.add(proyectoTemporal);
        misProyectos.add(proyectoPermanente);

        for (ProyectoAbs proyectos : misProyectos) {
            System.out.println(proyectos.calcularBalance());
        }
    }
}
