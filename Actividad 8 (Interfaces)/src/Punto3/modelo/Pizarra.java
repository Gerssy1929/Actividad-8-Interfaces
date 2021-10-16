/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.modelo;

import java.util.ArrayList;

/**
 *
 * @author German
 */
public class Pizarra {
    
    private ArrayList<Figura> Figuras = new ArrayList<Figura>();

    public ArrayList<Figura> getListaFiguras() {
        return Figuras;
    }

    public void setListaFiguras(ArrayList<Figura> ListaFiguras) {
        this.Figuras = ListaFiguras;
    }
    
    public void mostrarFiguras(){
        System.out.println("");
        System.out.println("*****Lista de Figuras*****");
        for (int i = 0; i <Figuras.size(); i++) {
            System.out.println(""+Figuras.get(i));
        }
    }
    
    public void añadirFigura(Figura f){
                
        if (f instanceof Cuadrado) {
            System.out.println("Se ha añadido un Cuadrado a la lista ");
        }else if (f instanceof Triángulo) {
                    System.out.println("Se ha añadido un Triángulo a la lista ");
                }else{
                    System.out.println("Se ha añadido un Círculo a la lista ");
                }
       
        Figuras.add(f);
    }
    
    public void imprimirDibujar(Figura f){
        f.dibujar();
    }
    
    public void imprimirBorrar(Figura f){
        f.borrar();
    }
    
    public void dibujarFiguras(){
        System.out.println("");
        for (int i = 0; i <Figuras.size(); i++) {
            imprimirDibujar(Figuras.get(i));
        }
    }
    
    public void borrarFiguras(){
        for (int i = 0; i <Figuras.size(); i++) {
            imprimirBorrar(Figuras.get(i));
        }
        Figuras.clear();
    }
}
