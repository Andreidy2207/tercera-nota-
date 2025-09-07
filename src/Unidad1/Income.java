package Unidad1;

public class Income {
    public static void main(String[] args) {
        //Datos del cliente

        int moneyInital = 1000;
        int weeklyRetreat = 200;
        int weeks = 4;

        // dinero a fin de mes
        int totalWithdrawn = weeklyRetreat * weeks;
        int finalMoney= moneyInital - totalWithdrawn;

        //Mostrar el dinero que nos gastamos
        System.out.println("Dinero a principio de mes: " + moneyInital);
        System.out.println("Retiro por semana: " + weeklyRetreat);
        System.out.println("Total de dinero retirado en: " + weeks + "semanas, y dinero retirado por cada semana" + totalWithdrawn);
        System.out.println("dinero restante en la cuenta: " + finalMoney);

    }
    
}

