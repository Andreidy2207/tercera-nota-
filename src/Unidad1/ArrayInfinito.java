package Unidad1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInfinito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String entrada;

        System.out.println("Ingresa números (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Número: ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido o 'fin' para terminar.");
            }
        }

        // Calcular suma y promedio
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        if (numeros.size() > 0) {
            double promedio = (double) suma / numeros.size();
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}
