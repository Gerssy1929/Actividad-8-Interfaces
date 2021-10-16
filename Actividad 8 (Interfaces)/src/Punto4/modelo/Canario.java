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
public class Canario extends Ave {
    private String canta;

    public Canario( String sexo, long edad, String canta) {
        super(sexo, edad);
        this.canta = canta;
    }

    public String getCanta() {
        return canta;
    }

    public void setCanta(String canta) {
        this.canta = canta;
    }
    
    public String aves(){
       return null;
   }
}
