/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_semana03_clase;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class obrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int num;
         double fútbol, básquet, atletismo, Nodeporte;
        System.out.print("Ingrese el número de alumnos encuestados");
         num = scan.nextInt();
         
         fútbol = num * 0.6;
         básquet = num * 0.2;
         atletismo = num * 0.12;
         Nodeporte = num * 0.08;
         
         System.out.print(fútbol+ "prefieren jugar fútbol");
         System.out.print(básquet+ "prefieren jugar básquet");
         System.out.print(atletismo+ "prefieren jugar atletismo");
         System.out.print(Nodeporte+ "no prefieren ningún deporte");

    }
    
}
