/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.vista;

import Punto3.modelo.*;

/**
 *
 * @author German
 */
public class TestFiguras {
    public static void main(String[] args) {
        
        Figura cu1 = new Cuadrado("Gris");
        Figura cu2 = new Cuadrado("Rosado");
        Figura tr1 = new Triángulo("Amarillo");
        Figura cir1 = new Círculo("Naranja");
        Figura cir2 = new Círculo("Café");
        
        Pizarra Piz = new Pizarra();

        cu1.cambiaColor("Blanco");
        System.out.println("Color Actual: "+cu1.queColor());
        
        cu2.cambiaColor("Lila");
        System.out.println("Color Actual: "+cu2.queColor());
        
        tr1.cambiaColor("Rojo");
        System.out.println("Color Actual: "+tr1.queColor());
       
        cir1.cambiaColor("Azul");
        System.out.println("Color Actual: "+cir1.queColor());
        
        cir2.cambiaColor("Verde menta");
        System.out.println("Color Actual: "+cir2.queColor());
        
       
        Piz.mostrarFiguras();
        
        Piz.añadirFigura(cu1);
        Piz.añadirFigura(cu2);
        Piz.añadirFigura(tr1);
        Piz.añadirFigura(cir1);
        Piz.añadirFigura(cir2);

        Piz.mostrarFiguras();
        
        Piz.dibujarFiguras();
        
        Piz.borrarFiguras();
        
        Piz.mostrarFiguras();

    }
}
