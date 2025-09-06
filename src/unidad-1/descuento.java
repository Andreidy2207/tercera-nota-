package unidad1;

import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        Scanner tienda = new Scanner(System.in);

        //precios originales
        double precioTshirt = 25.0;
        double precioPants = 30.0;

        //descuento del 15%
        double tshirtDescuent = precioTshirt * 0.15;
        double pantsDescuent = precioPants * 0.15;

        //segunda camiseta con 5% adicional
        double secondTshirt = tshirtDescuent * 0.05;
        
        //precio total de la compra
        double total = tshirtDescuent + pantsDescuent + secondTshirt; 

        // precio de cada compra con el total
        System.out.println("el precio final de la primera camiseta con descuento es de: " + tshirtDescuent);
        System.out.println("el precio final del pantalon con el descuento es de: " + pantsDescuent);
        System.out.println("el precio final de la segunda camiseta es de: " + secondTshirt);
        System.out.println("el precio total de su compra fue de: " + total);

        tienda.close();
    
    }
    
}
