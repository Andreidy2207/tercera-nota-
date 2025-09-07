package Unidad1;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner information = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese la edad: ");
        int edad = information.nextInt();

        System.out.print("Ingrese la altura en metros: ");
        double altura = information.nextDouble();

        System.out.print("Ingrese la inicial de su nombre: ");
        char inicial = information.next().charAt(0);

        // Comprobar si es mayor de edad
        boolean mayorDeEdad = (edad >= 18);

        // Mostrar resultados
        System.out.println("\n--- Datos de la persona ---");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial del nombre: " + inicial);
        System.out.println("¿Es mayor de edad?: " + mayorDeEdad);

        information.close();

    }
    
}
