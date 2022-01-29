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
public class empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sueldoHr=30, grati, mes, año;
        int hrsMes, añosTrab;
   
        System.out.print("Ingrese las horas trabajadas al mes: ");
        hrsMes = scan.nextInt();
        System.out.print("Ingrese los años que se encuentra trabajando en la empresa: ");
        añosTrab = scan.nextInt();
        
        mes = sueldoHr * hrsMes;  
        
        if (añosTrab <= 5) {
            grati = mes * 0.6;
        } else if (añosTrab <= 10) {
            grati = mes * 0.8;
        }  else {
            grati = mes;
        }
        
        System.out.println("\n........................................");
        System.out.println("El sueldo por mes es: S/."+mes);
        System.out.println("El monto de la gratificacion es: S/."+grati);
    }
}
