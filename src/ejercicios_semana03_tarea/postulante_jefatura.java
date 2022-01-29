
package ejercicios_semana03_tarea;

import java.util.Scanner;


public class postulante_jefatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int experiencia;
        
        System.out.print("Ingrese los años de experiencia del postulante entre [0-10]: ");
        experiencia = scan.nextInt();
        
        switch(experiencia) {
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("su experiencia se considera SUFICIENTE");
                break;
            case 6:
                System.out.println("su experiencia se considera SUFICIENTE");
                break;
            case 7:
                System.out.println("su experiencia se considera BIEN");
                break;
            case 8: case 9:
                System.out.println("su experiencia se considera NOTABLE");
                break;
            case 10:
                System.out.println("su experiencia se considera SOBRESALIENTE");
                break;
            default:
                System.out.println("su experiencia no esta dentro de lo requerido");
        }
    }
    
}
