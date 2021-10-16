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
public class Loro extends Ave implements Hablador {
    
    private String region;
    private String color;

    public Loro(String sexo, long edad, String region, String color) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Loro y sé hablar");
    }
    
    @Override
    public String toString(){
        return super.toString()+"Región: "+this.region+"\n"
                               +"Color: "+this.color+"\n" ;
    }
    
    public String aves(){
       return null;
   }
}

