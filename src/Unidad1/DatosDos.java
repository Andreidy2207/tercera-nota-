package Unidad1;

import java.util.Scanner;

public class DatosDos {
    public static void main(String[] args) {
        Scanner information = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = information.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = information.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = information.nextDouble();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
        information.close();
    }
}
