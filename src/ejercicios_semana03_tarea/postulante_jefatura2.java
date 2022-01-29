
package ejercicios_semana03_tarea;

import java.util.Scanner;


public class postulante_jefatura2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int experiencia;
        
        System.out.print("Ingrese los años de experiencia del postulante entre [0-10]: ");
        experiencia = scan.nextInt();
        
        if(experiencia >= 0 && experiencia <= 10){
            if (experiencia < 6) {
                System.out.println("su experiencia se considera SUFICIENTE");
            } else if (experiencia == 6) {
                System.out.println("su experiencia se considera BIEN");
            } else if (experiencia == 7) {
                System.out.println("su experiencia se considera NOTABLE");
            } else if (experiencia <= 9) {
                System.out.println("su experiencia se considera SOBRESALIENTE");
            } else if (experiencia == 10) {
                System.out.println("su experiencia se considera SOBRESALIENTE");
            }
        } else {
            System.out.println("su experiencia no esta dentro de lo requerido");
        }
    }
    
}
