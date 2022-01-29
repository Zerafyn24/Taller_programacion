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
public class entradasCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String genero;
        int edad;
        double precio;
    
        System.out.print("Ingrese su genero [H] masculino [M] femenino: ");
        genero = scan.next();
        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();
        
        if (genero.equalsIgnoreCase("H")) {
            System.out.println("Bienvenido Sr. ");
        } else {
            System.out.println("Bienvenida Srta. ");
        }
        
        if (edad > 6 & edad <= 12) {
            precio = 10;
        } else if (edad > 12 & edad <= 60) {
            precio = 20;
        } else {
            precio = 15;
        }
        
        System.out.println("El precio de su entrada es: S/."+precio);
    }
    
}
