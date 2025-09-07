package Unidad1;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese el numero al que quisiera sacar su tabla de multiplicar: ");
        int factor = number.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(factor + " x " + i + " = " + (factor * i));
        }

        number.close();
    }
    
}
