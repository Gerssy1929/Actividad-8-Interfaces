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
public class Radio extends Aparato implements Hablador {
    private String casette;
    private int pot;

    public Radio(int consumo, double precio, String casette, int pot) {
        super(consumo, precio);
        this.casette = casette;
        this.pot=pot;
    }

    public String getCasette() {
        return casette;
    }

    public void setCasette(String casette) {
        this.casette = casette;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy una Radio y sé hablar");
    }
    
    public String toString(){
        return super.toString()+"Casette: "+this.casette+"\n"+
                               "Potencia: "+this.pot+" W";
    }
    
    public String apar(){
         return null;
     }
}
