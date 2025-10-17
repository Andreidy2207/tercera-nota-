package Unidad2;

public class PasoPorValorenJava {
    public static void main(String[] args) {
        int numero = 77;
        cambiarValor(numero);
        System.out.println("Después de llamar a cambiarValor: " + numero);
    }

    public static void cambiarValor(int num) {
        num = 22;
        System.out.println("Dentro de cambiarValor: " + num);
    }
}
