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
public class Alumno extends Persona{
    
     private String carrera;
    private String curso;

    public Alumno(String nombre, long edad, String carrera, String curso) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Alumno y sé hablar");
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nCarrera: "+this.carrera+
                                "\nCurso: "+this.curso+"\n";
    }
    
     public String info (){
        return null;
    }
}
