package TasksJavaG3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /* Factorial de un número
           Descripcion: Calcula el factorial de un número ingresado por el usuario. El factorial de un número n (representado como)
           es el producto de todos los enteros positivos menores o iguales a n. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número natural: ");
        int num = scan.nextInt();
        int cont = 1;
        int factorial = 1;

        while (cont <= num){
            factorial = factorial * cont;
            cont++;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
        scan.close();
    }
}
