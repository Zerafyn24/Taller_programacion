package ejercicios_semana03_tarea;

import javax.swing.JOptionPane;

public class cont_digitos {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y 100000"));

        if ((num / 10 >= 0) && (num / 10 < 1)) {
            JOptionPane.showMessageDialog(null, "El número tiene un dígito");
        } else if ((num / 10 >= 1) && (num / 10 < 10)) {
            JOptionPane.showMessageDialog(null, "El número tiene dos dígitos");
        } else if ((num / 10 >= 10) && (num / 10 < 100)) {
            JOptionPane.showMessageDialog(null, "El número tiene tres dígitos");
        } else if ((num / 10 >= 100) && (num / 10 < 1000)) {
            JOptionPane.showMessageDialog(null, "El número tiene cuatro dígitos");
        } else if ((num / 10 >= 1000) && (num / 10 < 10000)) {
            JOptionPane.showMessageDialog(null, "El número tiene cinco dígitos");
        } else if ((num / 10 >= 10000) && (num / 10 < 100000)) {
            JOptionPane.showMessageDialog(null, "El número tiene seis dígitos");
        } else {
            JOptionPane.showConfirmDialog(null, "Vuelva a ingresar un número entre 0 y 99999");
        }
    }
}
