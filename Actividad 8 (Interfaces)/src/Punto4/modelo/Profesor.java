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
public class Profesor extends Persona {
    
    private String despacho;
    private String email;

    public Profesor(String nombre, long edad, String despacho, String email) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Profesor y sé hablar");
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"\nDespacho: "+this.despacho+
                                "\nEmail: "+this.email+"\n";
    }
    
     public String info (){
        return null;
    }
}
