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
public class TV extends Aparato implements Hablador {
    private String teletexto;
    private int antiguedad;

    public TV(int consumo, double precio, String teletexto, int antiguedad) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }

    public String getTeletexto() {
        return teletexto;
    }

    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy una TV y sé hablar");
    }
    
    public String toString(){
        return super.toString()+"Teletexto: "+this.teletexto+"\n"
                               +"Antiguedad: "+this.antiguedad+" años\n" ;
    }
    
    public String apar(){
         return null;
     }
}
