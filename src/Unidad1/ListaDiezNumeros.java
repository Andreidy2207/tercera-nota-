package Unidad1;

import java.util.Scanner;

public class ListaDiezNumeros {
    public static void main(String[] args) {
        Scanner arreglo = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        System.out.println("Ingrese 10 numeros de su preferecia");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Número " + ( i + 1) + ": ");
            numeros[i] = arreglo.nextInt();
            suma += numeros[i];
        }
        
        double prom = (double) suma / numeros.length;

        System.out.println("el total de la suma de los diez digitos es de: " + suma);
        System.out.println("el promedio de la suma de los diez digitos de la lista es de: " + prom);

        arreglo.close();
    }
    
}
