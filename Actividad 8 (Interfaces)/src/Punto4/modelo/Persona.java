/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.modelo;

/**
 *
 * @author German
 */
public abstract class Persona implements Hablador {
    
    private String nombre;
    private long edad;

    public Persona(String nombre, long edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    
  
  
    public String toString(){
        return "Nombre: "+this.nombre+
               "\nEdad: "+this.edad;
    }
    
    public abstract String info();
}

