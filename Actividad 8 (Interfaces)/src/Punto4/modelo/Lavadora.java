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
public class Lavadora extends Aparato {
    
    private float alto;
    private float ancho;

    public Lavadora(float alto, float ancho, int consumo, double precio) {
        super(consumo, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
     public String apar(){
         return null;
     }
    
}

    

