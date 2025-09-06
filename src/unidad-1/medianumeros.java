package unidad1;

import java.util.Scanner;

public class medianumeros {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Ingrese el primer número");
        double num1 = number.nextDouble();

        System.out.print("ingrese el segundo numero");
        double num2 = number.nextDouble();

        System.out.print("ingrese el tercer numero");
        double num3 = number.nextDouble();
        
        double media = num1 + num2 + num3;
        double mediatwo = media / 3 ;

        System.out.println( " la suma de los tres numeros es de: " + media);
        System.out.println("y la media de los tres numeros es de: " + mediatwo);

        number.close();
    }
    
}
