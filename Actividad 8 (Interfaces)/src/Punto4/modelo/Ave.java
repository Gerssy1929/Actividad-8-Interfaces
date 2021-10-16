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
public abstract class Ave {
    
    
    private String sexo;
    private long edad;

    public Ave(String sexo, long edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    
    public String toString(){
            return "Sexo: "+this.sexo+
                   "\nEdad: "+this.edad+"\n";
    }
    
    
    public abstract String aves();
    
}
