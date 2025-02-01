/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg01;

/**
 *
 * @author migue
 */
public class Usuario {
    
    int edad;
    String nombre;
    int codigo;

    public Usuario(String nombre, int edad, int codigo) {
        this.edad = edad;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String mostrarTodo() {
        return "Usuario{" + "Nombre=" + nombre + ", Edad=" + edad + ", Codigo=" + codigo +'}';
    }
    
}
