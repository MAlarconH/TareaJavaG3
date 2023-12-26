package TasksJavaG3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /* Cuadrados perfectos
           Descripcion: Encuentra y muestra todos los cuadrados perfectos hasta 100 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un cuadrado perfecto cualquiera (Ejemplo 100): ");
        int num = scan.nextInt();
        int numCuadrado = 1;
        int raiz = (int) Math.sqrt(num);

        for (int i = 1; i <= raiz; i++){
            numCuadrado = (int) Math.pow(i, 2);
            System.out.println(numCuadrado);
        }

    }
}
