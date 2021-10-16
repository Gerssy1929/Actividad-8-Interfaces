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
public class Bedel extends Persona {
    
    private String turno;
    private String antiguedad;

    public Bedel(String nombre, long edad, String turno, String antiguedad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Bedel y sé hablar");

    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTurno: "+this.turno+
                                "\nAntiguedad: "+this.antiguedad+"\n";
    }
    
    public String info (){
        return null;
    }

}
