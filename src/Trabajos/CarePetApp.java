package Trabajos;

import java.util.Scanner;

public class CarePetApp {
    public static void main(String[] args) {
        Scanner trabajo = new Scanner(System.in);
        int perfil;
        String confirmacion;
        String nombrePerfil = "";
        

        while (true) {
            System.out.println("Bienvenido a CarePet");
            System.out.println("1. Paciente");
            System.out.println("2. Veterinario");
            System.out.println("3. Asistente");
            System.out.println("4. Gerente de Administración");
            System.out.println("5. Salir de la app");
            System.out.print("Por favor seleccione cual es su perfil: ");

            while (!trabajo.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor ingrese un número del 1 al 5.");
                trabajo.next(); 
                System.out.print("Por favor seleccione cual es su perfil: ");
            }
            perfil = trabajo.nextInt();
            trabajo.nextLine(); 

            if (perfil == 5) {
                System.out.println("Gracias por usar CarePet. ¡Hasta luego!");
                break; 
            }

            switch (perfil) {
                case 1:
                    nombrePerfil = "Paciente";
                    break;
                case 2:
                    nombrePerfil = "Veterinario";
                    break;
                case 3:
                    nombrePerfil = "Asistente";
                    break;
                case 4:
                    nombrePerfil = "Gerente de Administración";
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione un perfil válido.\n");
                    continue; 
            }

            System.out.print("Usted ha seleccionado el perfil " + nombrePerfil + ". ¿Está seguro de que ese es su perfil? (sí/no): ");
            confirmacion = trabajo.nextLine().trim().toLowerCase();

            if (confirmacion.equals("sí") || confirmacion.equals("si")) {
                System.out.println("Usted ha accedido a su cuenta con el perfil de " + nombrePerfil + ".");
                break; 
            } else {
                System.out.println("Por favor, intente seleccionar su perfil nuevamente ");
            }

            if (String nombrePerfil = "Paciente") {
                System.out.println(" Bienvenido a CarePet ");
                System.out.println("Seleccione una de las siguientes opciones ");
                System.out.println("1. Iniciar Seseion");
                System.out.println("2. Crear una cuenta");
            } else {
                
            }
        }

        trabajo.close();
    }
}
