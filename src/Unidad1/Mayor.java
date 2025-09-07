package Unidad1;

import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        int number1 = number.nextInt();

        System.out.println("ingrese el segundo numero");
        int number2 = number.nextInt();

        System.out.println("ingrese el tercer numero ");
        int number3 = number.nextInt();

        boolean rango = (number1 > number2 && number1 < number3);
        System.out.println("¿el primer numero si cumple la condición de ser mayor que el segundo y menor que el primero? " + rango);

        number.close();

    }
    
}
