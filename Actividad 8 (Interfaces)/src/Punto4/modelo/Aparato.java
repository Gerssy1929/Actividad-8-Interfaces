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
public abstract class Aparato {
    private int consumo;
    private double precio;

    public Aparato(int consumo, double precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
            return "Consumo: "+this.consumo+" W/h"+
                   "\nEdad: "+this.precio+" USD\n";
    }
    
    
    public abstract String apar();
    
}
