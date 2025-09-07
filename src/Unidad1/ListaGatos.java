package Unidad1;

import java.util.Scanner;

public class ListaGatos { 

    public static void main(String[] args) {
        Scanner cats = new Scanner(System.in);

        System.out.println("¿Cuantas razas de gato desea ingresar? :");
        int razas = cats.nextInt();
        cats.nextLine();

        String [] razasgatos = new String[ razas ];
        
        //pedir nombres de las razas
        for (int lista = 0; lista < razas; lista++) {
            System.out.print(" Ingrese el nombre de la raza numero" + (lista + 1) + ": " );
            razasgatos [lista] = cats.nextLine();
        }

        //imprimir listado
        System.out.println(" listado de razas de gatos ");
        for (int lista = 0; lista < razas; lista++) {
            System.out.println((lista) + ". " +  razasgatos [lista]);
        }
        
        cats.close();
 
    }
}