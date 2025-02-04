/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg01;

/**
 *
 * @author migue
 */
public class Casa {
    int numeroHabitaciones;
    int numeroBaños;
    int numeroPisos;
    boolean tienePatio;
    
    public void abrirPuertaPrincipal() {
        System.out.println("Abriendo puerta");
}

    public Casa(int numeroHabitaciones, int numeroBaños, int numeroPisos, boolean tienePatio) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.numeroPisos = numeroPisos;
        this.tienePatio = tienePatio;
    }
    
}
