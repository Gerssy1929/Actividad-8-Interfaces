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
public class Piolin extends Canario implements Hablador{
    
    private int n_peliculas;

    public Piolin(String sexo, long edad, String canta, int n_peliculas) {
        super(sexo, edad, canta);
        this.n_peliculas = n_peliculas;
    }

    public int getN_peliculas() {
        return n_peliculas;
    }

    public void setN_peliculas(int n_peliculas) {
        this.n_peliculas = n_peliculas;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Piolín y sé hablar");
    }
    
    public String toString(){
        return super.toString()+"Canta: "+getCanta()+"\n"
                               +"Numero de Películas: "+this.n_peliculas+"\n";
    }
    
}
