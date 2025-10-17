package Unidad2;

public class EjemploRetorno1 {
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    // Método que recibe dos argumentos y devuelve un valor
    public static int sumar(int a, int b) {
        return a + b;  // Retorna la suma de los argumentos
    }
    
}
