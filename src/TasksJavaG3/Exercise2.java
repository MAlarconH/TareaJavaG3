package TasksJavaG3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /* Suma de números impares
           Descripción: Suma todos los numeros impares del 1 al 100 (ejemplo) */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int num = scan.nextInt();
        int suma = 0;

        for (int i = 0; i <= num; i++){
            if(i % 2 != 0){
                suma = suma + i;
            }
        }

        System.out.println("La suma de los numeros impares del 1 al " + num + " es: " + suma );
        scan.close();
    }
}
