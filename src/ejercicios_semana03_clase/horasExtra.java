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
public class horasExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hrs, tarifaExtra, salario, tarifa=0;
        int categoria;
   
        System.out.print("Ingrese las horas trabajadas a la semana: ");
        hrs = scan.nextDouble();
        System.out.print("Ingrese la tarifa por hora extra: ");
        tarifaExtra = scan.nextDouble();
        System.out.println("Ingrese la categoria del trabajador");
        categoria = scan.nextInt();
        
        
        switch(categoria) {
            case 1: tarifa = 10; break;
            case 2: tarifa = 20; break;
            case 3: tarifa = 30; break;
            case 4: tarifa = 40; break;
            default: 
                System.out.print("La categoria no existe");
        }
        
        if(hrs <= 40) {
            salario = hrs * tarifa;
        } else  {
            salario = 40 * tarifa + (hrs - 40) * tarifaExtra;
        }
        
        
        
        System.out.println("\n........................................");
        System.out.println("El salario semanal es: S/."+salario);
    }
    
}
