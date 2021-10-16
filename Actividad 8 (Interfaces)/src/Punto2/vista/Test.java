/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.vista;

import Punto2.modelo.Genérico;

/**
 *
 * @author German
 */
public class Test implements Genérico {
    
    public static void main(String[] args) {
        
        String nombres[] = {"German", "Kelly","Nicole","Juan"};
        boolean b = true; //Depende de si le asignamos true o false, se ordenará ascendente o descendentemente respectivamente
        Genérico.getName(nombres, b);
    }
}