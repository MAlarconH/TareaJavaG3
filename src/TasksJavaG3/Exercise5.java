package TasksJavaG3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        /* Suma de digitos
           Descripcion: Suma de todos los digitos de un numero ingresado por el usuario. No usar la conversion
           a String para resolver el problema. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero natural: ");
        int num = scan.nextInt();
        int sumaDigitos = 0;

        ArrayList<Integer> digitosArrayList = new ArrayList<>();
        while (num > 0){
            int digito = num % 10;
            digitosArrayList.add(0, digito);
            num /= 10;
        }

        // Recorriendo el ArrayList para obtener digitos
        for (int digito : digitosArrayList) {
            sumaDigitos = sumaDigitos + digito;
        }

        System.out.print("La suma de los digitos del numero ingresado es: " + sumaDigitos);
        scan.close();
    }
}
