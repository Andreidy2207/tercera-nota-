package Unidad1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de estudiantes
        System.out.print("Ingresa la cantidad de estudiantes: ");
        int cantidad = scanner.nextInt();

        // Crear arreglo para almacenar las notas
        double[] notas = new double[cantidad];

        // Pedir las notas de cada estudiante
        for (int i = 0; i < cantidad; i++) {
            double nota;
            do {
                System.out.print("Ingresa la nota del estudiante " + (i + 1) + " (0-10): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        // Inicializar variables para cálculo
        double suma = 0;
        double notaMax = notas[0];
        double notaMin = notas[0];
        int aprobados = 0;

        // Calcular suma, nota máxima, nota mínima y cantidad de aprobados
        for (double nota : notas) {
            suma += nota;
            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }
            if (nota >= 6) {
                aprobados++;
            }
        }

        double promedio = suma / cantidad;
        int reprobados = cantidad - aprobados;

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        scanner.close();
    }
}