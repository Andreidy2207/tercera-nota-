package Unidad1;

public class EjemploArray {
    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] numeros = {10, 20, 30, 40, 50};

        // Acceder a elementos del array
        System.out.println("El cuarto número es: " + numeros[3]); 
        System.out.println("El quinto número es: " + numeros[4]); 
        System.out.println("El segundo número es: " + numeros[1]);

        // Modificar un elemento del array
        numeros[1] = 123456789;
        numeros[2] = 100;
        System.out.println("El tercer número ahora es: " + numeros[2]); 
        System.out.println("El segundo numero ahora es: " + numeros[1]);

        for (int i = 0; i < numeros.length; i++) {
          System.out.println("Número en índice " + i + ": " + numeros[i]);
        }

        for (int numero : numeros) {
          System.out.println("Número: " + numero);
        }
    }

}
