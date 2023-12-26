package TasksJavaG3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /* Tabla de multiplicar
           Descripción: Genera la tabla del 5 hasta el producto de 5x10 (Ejemplo) */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero del que desee la tabla de multiplicar: ");
        int num = scan.nextInt();
        System.out.print("Ahora ingrese hasta cuanto desea el multiplicador (del 5x1 al 5x10): ");
        int multiplicador = scan.nextInt();
        int cont = 1;

        System.out.println("Tabla de multiplicar del " + num);
        while ( cont <= multiplicador) {
            int producto = num * cont;
            System.out.println(num + " x " + cont + " = " + producto);
            cont ++;
        }

        System.out.println("Fin del programa...");
        scan.close();
    }
}
