/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.pkg01;

import java.util.Vector;

/**
 *
 * @author migue
 */
public class Poo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
     Usuario us1 = new Usuario("Miguel",18, 1001);
     Usuario us2 = new Usuario("Juan",20, 1342);
     Usuario us3 = new Usuario("Fabian",19, 1293);
    
     Vector<Usuario>coleccion = new Vector<Usuario>();
     coleccion.add(us1);
     coleccion.add(us2);
     coleccion.add(us3);
     
        for (Usuario usuario : coleccion) {
            System.out.println(usuario.mostrarTodo());
        }
    }
    
    
}
