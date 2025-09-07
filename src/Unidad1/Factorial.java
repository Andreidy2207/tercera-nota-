package Unidad1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner factor = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = factor.nextInt();

        int factorial = 1;
        int number = 1;
        while (number <= numero) {
            factorial *= number;
            number++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        factor.close();
    }
}
