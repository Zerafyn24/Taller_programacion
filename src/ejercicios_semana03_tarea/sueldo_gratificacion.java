
package ejercicios_semana03_tarea;

import java.util.Scanner;


public class sueldo_gratificacion {

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
