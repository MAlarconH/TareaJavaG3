package TasksJavaG3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /* Contador de números pares:
           Descripción: Itera sobre los números del 1 al 50 e imprime solo los números pares */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite un número natural: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("...Fin del programa...");
        scan.close();
    }
}
