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
public class Buitre extends Ave {
    
    private int velocidad_vuelo;
    private int peso;

    public Buitre(int velocidad_vuelo, int peso, String sexo, long edad) {
        super(sexo, edad);
        this.velocidad_vuelo = velocidad_vuelo;
        this.peso = peso;
    }

    public int getVelocidad_vuelo() {
        return velocidad_vuelo;
    }

    public void setVelocidad_vuelo(int velocidad_vuelo) {
        this.velocidad_vuelo = velocidad_vuelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
   public String aves(){
       return null;
   }
}
