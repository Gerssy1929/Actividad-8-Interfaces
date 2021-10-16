/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.vista;

import Punto4.modelo.*;

/**
 *
 * @author German
 */
public class Test {
    
    public static void main(String[] args) {
        
        Loro L = new Loro("Hembra", 3, "Amazonía", "Verde");
        Piolin P1 = new Piolin("Hombre", 6, "Si", 10);
        Alumno A = new Alumno("German Ardila", 19, "Ing de Sistemas","Programación II" );
        Profesor P2 = new  Profesor("Andrés Molina", 53, "Ingenierías y Tecnologías", "andmolina@unicesar.edu.co");
        Bedel B1 = new Bedel("Juan Nepomuceno", 45, "Día", "10 años");
        TV T1= new TV(150, 700, "Si", 100);
        Radio R1 = new Radio(25, 50, "No", 70 );
        
        Hablador Habladores[] = new Hablador[7];
        Habladores[0]=L;
        Habladores[1]=P1;
        Habladores[2]=A;
        Habladores[3]=P2;
        Habladores[4]=B1;
        Habladores[5]=T1;
        Habladores[6]=R1;
        
        Lista(Habladores);
    }
    
    public static void Lista(Hablador[] lista){
        System.out.println("*****LISTA DE LOS QUE PUEDEN HABLAR*****");
        for (int i = 0; i <lista.length; i++) {
            imprimirHabladores(lista[i]);
        }
    }
    
    public static void imprimirHabladores(Hablador e){ 
        e.hablar();
        System.out.println(e.toString());
    }
}
