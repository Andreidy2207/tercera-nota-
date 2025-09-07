package Unidad1;

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Dividisión");
            System.out.println("5. Salir del menú");
            System.out.print("Ingrese su opción: ");
            opcion = menu.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                int number1 = menu.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int number2 = menu.nextInt();

                int numberMax, numberMin;

                if (number1 > number2) {
                    numberMax = number1;
                    numberMin = number2;
                } else if (number2 > number1) {
                    numberMax = number2;
                    numberMin = number1;
                } else {
                    numberMax = numberMin = number1; // Ambos iguales
                }

                if (numberMax == numberMin) {
                    System.out.println("Ambos números son iguales: " + numberMax);
                } else {
                    System.out.println("El número mayor es: " + numberMax);
                    System.out.println("El número menor es: " + numberMin);
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (numberMax + numberMin));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (numberMax - numberMin));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (numberMax * numberMin));
                        break;
                    case 4:
                        if (numberMin != 0) {
                            double resultado = (double) numberMax / numberMin;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: División por cero");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        menu.close();
    }
}
