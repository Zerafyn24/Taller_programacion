
package ejercicios_semana03_tarea;

import java.util.Scanner;


public class vehiculos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km, mFijo=100, mAdicional, mFinal;
   
        System.out.print("Ingrese los kilometros recorridos del vehiculo: ");
        km = scan.nextDouble();
        
        
        if (km <= 200) {
            mAdicional = 0;
        } else if (km <= 210) {
            mAdicional = 3 * (km - 200);
        } else if (km <= 220){
            mAdicional = 4 * (km - 200);
        } else {
            mAdicional = 5 * (km - 200);
        }
        
        mFinal = mFijo + mAdicional;
        System.out.println("\n...................................................");
        System.out.println("El monto fijo es: S/."+mFijo);
        System.out.println("El monto adicional es: S/."+mAdicional);
        System.out.println("El monto final es: S/."+mFinal);
    }
    
}
